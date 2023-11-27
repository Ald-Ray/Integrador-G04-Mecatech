package Pruebas;

import com.mycompany.mecatech.views.*;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.Color;
import java.io.FileOutputStream;
import javax.swing.JOptionPane;


public class cuestionario extends javax.swing.JPanel {

    public cuestionario() {
        initComponents();
        InitStyles();
        
    }
    
    private void InitStyles() {
        title.putClientProperty("FlatLaf.styleClass", "h1");
        title.setForeground(Color.black);
    }
   
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        dimensiones_resp = new javax.swing.JTextField();
        title = new javax.swing.JLabel();
        addButton = new javax.swing.JButton();
        Nombre = new javax.swing.JLabel();
        tipo_equipo = new javax.swing.JLabel();
        Nombre_resp = new javax.swing.JTextField();
        dimensiones = new javax.swing.JLabel();
        tipo_equipo_resp = new javax.swing.JTextField();
        consumo_resp = new javax.swing.JTextField();
        consumo = new javax.swing.JLabel();
        modelo_resp = new javax.swing.JTextField();
        modelo = new javax.swing.JLabel();
        descripcion_resp = new javax.swing.JTextField();
        descripcion = new javax.swing.JLabel();
        Nuevo = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        bg.setBackground(new java.awt.Color(255, 255, 255));

        dimensiones_resp.setToolTipText("");

        title.setText("Equipos");

        addButton.setBackground(new java.awt.Color(18, 90, 173));
        addButton.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        addButton.setForeground(new java.awt.Color(255, 255, 255));
        addButton.setText("Guardar");
        addButton.setBorderPainted(false);
        addButton.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });

        Nombre.setText("Nombre");

        tipo_equipo.setText("Tipo de equipo");

        Nombre_resp.setToolTipText("");

        dimensiones.setText("Dimensiones");

        tipo_equipo_resp.setToolTipText("");

        consumo_resp.setToolTipText("");

        consumo.setText("Consumo");

        modelo_resp.setToolTipText("");

        modelo.setText("Modelo");

        descripcion_resp.setToolTipText("");

        descripcion.setText("descripcion del fallo");

        Nuevo.setBackground(new java.awt.Color(18, 90, 173));
        Nuevo.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Nuevo.setForeground(new java.awt.Color(255, 255, 255));
        Nuevo.setText("Nuevo");
        Nuevo.setBorderPainted(false);
        Nuevo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Nuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NuevoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout bgLayout = new javax.swing.GroupLayout(bg);
        bg.setLayout(bgLayout);
        bgLayout.setHorizontalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(title, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(699, 699, 699))
            .addGroup(bgLayout.createSequentialGroup()
                .addGap(85, 85, 85)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dimensiones)
                    .addComponent(dimensiones_resp, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(consumo)
                    .addComponent(consumo_resp, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(modelo)
                    .addComponent(modelo_resp, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(descripcion)
                    .addComponent(descripcion_resp, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bgLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Nuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(71, 71, 71)
                .addComponent(addButton, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(223, 223, 223))
            .addGroup(bgLayout.createSequentialGroup()
                .addGap(85, 85, 85)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Nombre)
                    .addComponent(Nombre_resp, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tipo_equipo)
                    .addComponent(tipo_equipo_resp, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        bgLayout.setVerticalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(title, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(Nombre)
                .addGap(18, 18, 18)
                .addComponent(Nombre_resp, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tipo_equipo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tipo_equipo_resp, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(dimensiones)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(dimensiones_resp, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(consumo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(consumo_resp, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(modelo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(modelo_resp, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(descripcion)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(descripcion_resp, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addButton)
                    .addComponent(Nuevo))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(bg, javax.swing.GroupLayout.PREFERRED_SIZE, 595, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed

        generarPDF();
        
    }//GEN-LAST:event_addButtonActionPerformed

    private void NuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NuevoActionPerformed
        limpiarCampos();
    }//GEN-LAST:event_NuevoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Nombre;
    private javax.swing.JTextField Nombre_resp;
    private javax.swing.JButton Nuevo;
    private javax.swing.JButton addButton;
    private javax.swing.JPanel bg;
    private javax.swing.JLabel consumo;
    private javax.swing.JTextField consumo_resp;
    private javax.swing.JLabel descripcion;
    private javax.swing.JTextField descripcion_resp;
    private javax.swing.JLabel dimensiones;
    private javax.swing.JTextField dimensiones_resp;
    private javax.swing.JLabel modelo;
    private javax.swing.JTextField modelo_resp;
    private javax.swing.JLabel tipo_equipo;
    private javax.swing.JTextField tipo_equipo_resp;
    private javax.swing.JLabel title;
    // End of variables declaration//GEN-END:variables


    // Función para generar el PDF con los datos del formulario

private void generarPDF() {
    String rutaArchivo = "C:\\Users\\mafyi\\OneDrive\\Escritorio\\prueba\\DatosEquipo.pdf"; // Ruta y nombre del archivo PDF

    Document documento = new Document(PageSize.A4);

    try {
        PdfWriter.getInstance(documento, new FileOutputStream(rutaArchivo));
        documento.open();

        PdfPTable tabla = new PdfPTable(6); // Seis columnas para cada campo

        // Encabezados
        tabla.addCell("Nombre del Equipo");
        tabla.addCell("Tipo de Equipo");
        tabla.addCell("Dimensiones");
        tabla.addCell("Consumo");
        tabla.addCell("Modelo");
        tabla.addCell("Descripción del fallo");

        // Obtener datos del formulario
        String nombreEquipo = Nombre_resp.getText();
        String tipoEquipo = tipo_equipo_resp.getText();
        String descripcionFallo = descripcion_resp.getText();
        String dimensionesEquipo = dimensiones_resp.getText(); // Campo de dimensiones
        String consumoEquipo = consumo_resp.getText(); // Campo de consumo
        String modeloEquipo = modelo_resp.getText(); // Campo de modelo

        // Agregar datos al PDF
        tabla.addCell(nombreEquipo);
        tabla.addCell(tipoEquipo);
        tabla.addCell(dimensionesEquipo);
        tabla.addCell(consumoEquipo);
        tabla.addCell(modeloEquipo);
        tabla.addCell(descripcionFallo);

        documento.add(tabla);
        documento.close();

        JOptionPane.showMessageDialog(this, "PDF creado correctamente.", "PDF Generado", JOptionPane.INFORMATION_MESSAGE);

    } catch (DocumentException | java.io.IOException e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(this, "Error al crear el PDF.", "Error", JOptionPane.ERROR_MESSAGE);
    }
}


private void limpiarCampos() {
    // Limpiar los campos del formulario
    Nombre_resp.setText("");
    tipo_equipo_resp.setText("");
    dimensiones_resp.setText("");
    consumo_resp.setText("");
    modelo_resp.setText("");
    descripcion_resp.setText("");
}


}



