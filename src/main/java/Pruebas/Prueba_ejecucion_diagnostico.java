/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Pruebas;


import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class Prueba_ejecucion_diagnostico {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            mostrarPantalla();
        });
    }

    public static void mostrarPantalla() {
        fallos pantalla = new fallos();
        
        JFrame frame = new JFrame("Detalles del Equipo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(pantalla);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
