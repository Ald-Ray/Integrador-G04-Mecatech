package com.mycompany.mecatech.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DatabaseMecatech {

    protected Connection conexion;
    private final String JDBC_DRIVER = "org.postgresql.Driver";
    private final String DB_URL = "jdbc:postgresql://ep-square-fog-26815683.us-east-2.aws.neon.tech/Mecatech?user=Jesus1594&password=fc8oxkXmbS5J&sslmode=require"; // Ajusta la URL según tu configuración.

    private final String USER = "Jesus1594"; // Reemplaza con tu nombre de usuario.
    private final String PASS = "fc8oxkXmbS5J"; // Reemplaza con tu contraseña.

    public void Conectar() throws ClassNotFoundException {
        try {
            Class.forName(JDBC_DRIVER);
            conexion = DriverManager.getConnection(DB_URL, USER, PASS);
            if (conexion != null && !conexion.isClosed()) {
                System.out.println("¡Conexión exitosa a la base de datos!");
            } else {
                System.out.println("No se pudo establecer la conexión.");
            }
        } catch (SQLException ex) {
            Logger.getLogger(DatabaseMecatech.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void Cerrar() throws SQLException {
        if (conexion != null) {
            if (!conexion.isClosed()) {
                conexion.close();
            }
        }
    }
}