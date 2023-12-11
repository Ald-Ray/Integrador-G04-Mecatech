/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mecatech;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DAOdiagnosticos {

    private final String jdbcURL = "jdbc:postgresql://ep-square-fog-26815683.us-east-2.aws.neon.tech/Mecatech?user=Jesus1594&password=fc8oxkXmbS5J&sslmode=require";

    public List<String> obtenerDiagnosticosPorDescripcion(String descripcion) throws SQLException {
        List<String> diagnosticos = new ArrayList<>();

        try (Connection connection = DriverManager.getConnection(jdbcURL)) {
            String sql = "SELECT diagnostico FROM ordenTrabajos WHERE descripcion LIKE ?";
            try (PreparedStatement statement = connection.prepareStatement(sql)) {
                statement.setString(1, "%" + descripcion + "%");

                try (ResultSet resultSet = statement.executeQuery()) {
                    while (resultSet.next()) {
                        String diagnostico = resultSet.getString("diagnostico");
                        diagnosticos.add(diagnostico);
                    }
                }
            }
        }

        return diagnosticos;
    }

    // Otros métodos para realizar operaciones CRUD si son necesarios
}
