/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mecatech;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author mafyi
 */
public class DAOdiagnosticosImpl {
    
    public List<String> obtenerDiagnosticosPorDescripcion(String descripcion) throws SQLException {
        List<String> diagnosticos = new ArrayList<>();
        
        String jdbcURL = "jdbc:postgresql://ep-square-fog-26815683.us-east-2.aws.neon.tech/Mecatech?user=Jesus1594&password=fc8oxkXmbS5J&sslmode=require";

        try (Connection connection = DriverManager.getConnection(jdbcURL)) {
            // Crear la consulta preparada
            String sql = "SELECT diagnostico FROM ordenTrabajos WHERE descripcion LIKE ?";
            try (PreparedStatement statement = connection.prepareStatement(sql)) {
                statement.setString(1, "%" + descripcion + "%");

                // Ejecutar la consulta
                try (ResultSet resultSet = statement.executeQuery()) {
                    // Obtener los resultados
                    while (resultSet.next()) {
                        String diagnostico = resultSet.getString("diagnostico");
                        diagnosticos.add(diagnostico);
                    }
                }
            }
        }

        return diagnosticos;
    }
    
}
