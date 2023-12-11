/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Pruebas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Prueba_diagnostico {

    // Método para analizar los problemas y mostrar resultados
    public static String analizarProblemas(String texto) {
        List<String> problemas = new ArrayList<>();

        // Expresiones regulares para buscar palabras clave y un número
        Pattern patronPresion = Pattern.compile("\\bpresion\\b");
        Pattern patronBomba = Pattern.compile("\\bbomba\\b");
        Pattern patronSobrecalentamiento = Pattern.compile("\\bsobrecalentamiento\\b");
        Pattern patronFlujo = Pattern.compile("\\bflujo\\b");
        Pattern patronInestable = Pattern.compile("\\binestable\\b");

        Matcher matcherPresion = patronPresion.matcher(texto.toLowerCase());
        Matcher matcherBomba = patronBomba.matcher(texto.toLowerCase());
        Matcher matcherSobrecalentamiento = patronSobrecalentamiento.matcher(texto.toLowerCase());
        Matcher matcherFlujo = patronFlujo.matcher(texto.toLowerCase());
        Matcher matcherInestable = patronInestable.matcher(texto.toLowerCase());

        if (matcherPresion.find() && matcherBomba.find()) {
            // Si se encontraron ambas palabras, buscamos un número asociado
            Pattern patronNumero = Pattern.compile("(\\d+)");
            Matcher matcherNumero = patronNumero.matcher(texto);

            if (matcherNumero.find()) {
                int valorPresion = Integer.parseInt(matcherNumero.group(1));
                if (valorPresion < 50) {
                    problemas.add("Baja presión en la bomba. Verificar tuberías y válvulas.");
                } else if (valorPresion > 100) {
                    problemas.add("Alta presión en la bomba. Verificar sistema de regulación.");
                }
            }
        }

        if (matcherSobrecalentamiento.find()) {
            problemas.add("Sobrecalentamiento en la bomba. Verificar sistema de enfriamiento.");
        }

        if (matcherFlujo.find() && matcherInestable.find()) {
            problemas.add("Flujo inestable en la bomba. Verificar posibles obstrucciones o fugas.");
        }

        if (!problemas.isEmpty()) {
            return "Problemas detectados en la bomba:\n" + String.join("\n", problemas);
        } else {
            return "No se encontraron problemas significativos relacionados con la presión, temperatura o flujo de la bomba.";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario ingresar un texto
        System.out.println("Ingrese información sobre el equipo de bombeo:");
        String textoUsuario = scanner.nextLine();

        // Analizar el texto ingresado
        String resultadoAnalisis = analizarProblemas(textoUsuario);
        System.out.println(resultadoAnalisis);

        scanner.close();
    }
}





