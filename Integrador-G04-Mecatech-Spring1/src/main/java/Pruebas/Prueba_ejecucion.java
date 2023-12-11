/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Pruebas;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class Prueba_ejecucion {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            // Crear un JFrame
            JFrame frame = new JFrame("Ejecutar JPanel desde Main");

            // Crear una instancia de tu JPanel
            cuestionario panel = new cuestionario();

            // Agregar el JPanel al JFrame
            frame.add(panel);

            // Configurar el JFrame
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.pack();
            frame.setLocationRelativeTo(null); // Centrar en pantalla
            frame.setVisible(true);
        });
    }
}

