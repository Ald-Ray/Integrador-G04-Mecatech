package Pruebas;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */


import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;

import java.io.FileOutputStream;
import java.util.Scanner;

public class InspeccionMaquinas {

    public static void main(String[] args) {
        // Nombre del archivo PDF a generar
        String nombreArchivo = "InspeccionMaquinas.pdf";

        // Crear documento
        Document documento = new Document(PageSize.A4);

        try {
            // Crear un escritor para el documento PDF
            PdfWriter.getInstance(documento, new FileOutputStream(nombreArchivo));

            // Abrir el documento
            documento.open();

            // Crear una tabla con 3 columnas
            PdfPTable tabla = new PdfPTable(3);

            // Agregar encabezados de columna
            tabla.addCell("Requisito");
            tabla.addCell("Descripción");
            tabla.addCell("Estado");

            Scanner scanner = new Scanner(System.in);

            // Solicitar y agregar los datos de inspección a la tabla
            for (int i = 0; i < 2; i++) { // Hacemos dos iteraciones para agregar dos conjuntos de datos
                System.out.println("Ingrese el requisito:");
                String requisito = scanner.nextLine();

                System.out.println("Ingrese la descripción:");
                String descripcion = scanner.nextLine();

                System.out.println("Ingrese el estado:");
                String estado = scanner.nextLine();

                // Agregar los datos ingresados a la tabla
                tabla.addCell(requisito);
                tabla.addCell(descripcion);
                tabla.addCell(estado);
            }

            // Agregar la tabla al documento
            documento.add(tabla);

            // Cerrar el documento
            documento.close();

            System.out.println("El archivo PDF ha sido creado correctamente.");

        } catch (DocumentException | java.io.IOException e) {
            e.printStackTrace();
        }
    }
}
