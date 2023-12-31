package com.mycompany.mecatech.views;


import com.mycompany.mecatech.DAOequiposImpl;
import com.mycompany.mecatech.DAOordentrabajoImpl;
import com.mycompany.mecatech.interfaces.DAOequipos;
import com.mycompany.mecatech.interfaces.DAOordenTrabajos;
import com.mycompany.mecatech.utils.Utils;
import java.awt.Color;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;


public class ViewNewMantenimiento extends javax.swing.JPanel {
    boolean isEdition = false;
    com.mycompany.mecatech.models.OrdenTrabajos diagEdition;
    Utils combo = new Utils();
    
    public ViewNewMantenimiento() {
        initComponents();
        idEquipoTxt.setVisible(false);
        fechaEntrgTxt.setVisible(false);
        InitStyles();
        combo.RellenarComboBox("equipos", "activo", idEquipoBox);
    }
    public ViewNewMantenimiento(com.mycompany.mecatech.models.OrdenTrabajos oit) {
        initComponents();
        idEquipoTxt.setVisible(false);
        fechaEntrgTxt.setVisible(false);
        isEdition = true;
        diagEdition = oit;
        InitStyles();
        combo.RellenarComboBox("equipos", "activo", idEquipoBox);
    }
    
    private void InitStyles() {
        title.putClientProperty("FlatLaf.styleClass", "h1");
        title.setForeground(Color.black);
        fechaEntrgTxt.putClientProperty("JTextField.placeholderText", "Ingrese la orden de trabajo.");
        idEquipoTxt.putClientProperty("JTextField.placeholderText", "Ingrese el ID del equipo.");
        descripcionTxt.putClientProperty("JTextField.placeholderText", "Describe el problema del equipo.");
        idEquipoTxt.putClientProperty("JTextField.placeholderText", "Ingrese el codigo del equipo.");
        fechaEntrgTxt.putClientProperty("JTextField.placeholderText", "Asigna fecha de entrega.");
        
        if (isEdition) {
            title.setText("Editar Diagnostico");
            button.setText("Guardar");
            
            if (diagEdition != null) {
                idEquipoTxt.setText(diagEdition.getID_equipo()+"");
                fechaEntrgTxt.setText(diagEdition.getFechaEntrega()+"");
                descripcionTxt.setText(diagEdition.getDescripcion()+"");
            }
        }
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
        title = new javax.swing.JLabel();
        button = new javax.swing.JButton();
        fechaEntrgLabel = new javax.swing.JLabel();
        fechaEntrgTxt = new javax.swing.JTextField();
        descripcionTxt = new javax.swing.JTextField();
        descripcion = new javax.swing.JLabel();
        IDequipoLabel = new javax.swing.JLabel();
        idEquipoTxt = new javax.swing.JTextField();
        idEquipoBox = new javax.swing.JComboBox<>();
        jCalendar1 = new com.toedter.calendar.JCalendar();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(750, 450));

        bg.setBackground(new java.awt.Color(255, 255, 255));
        bg.setPreferredSize(new java.awt.Dimension(750, 450));

        title.setText("Diagnosticar Equipo");

        button.setBackground(new java.awt.Color(18, 90, 173));
        button.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        button.setForeground(new java.awt.Color(255, 255, 255));
        button.setText("Registrar");
        button.setBorderPainted(false);
        button.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonActionPerformed(evt);
            }
        });

        fechaEntrgLabel.setText("Fecha Entrega");

        fechaEntrgTxt.setToolTipText("");

        descripcionTxt.setToolTipText("");

        descripcion.setText("Descripcion del Fallo ");

        IDequipoLabel.setText("Equipo");

        idEquipoBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                idEquipoBoxItemStateChanged(evt);
            }
        });
        idEquipoBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idEquipoBoxActionPerformed(evt);
            }
        });

        jCalendar1.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jCalendar1PropertyChange(evt);
            }
        });

        javax.swing.GroupLayout bgLayout = new javax.swing.GroupLayout(bg);
        bg.setLayout(bgLayout);
        bgLayout.setHorizontalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(title, javax.swing.GroupLayout.DEFAULT_SIZE, 126, Short.MAX_VALUE)
                .addGap(618, 618, 618))
            .addGroup(bgLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bgLayout.createSequentialGroup()
                        .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(idEquipoBox, 0, 160, Short.MAX_VALUE)
                            .addComponent(IDequipoLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(idEquipoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(bgLayout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jCalendar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(bgLayout.createSequentialGroup()
                                .addComponent(fechaEntrgLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(fechaEntrgTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(34, 34, 34)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(button, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(descripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(descripcionTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        bgLayout.setVerticalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(title, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bgLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(IDequipoLabel)
                        .addGap(18, 18, 18)
                        .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(idEquipoBox, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(idEquipoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())
                    .addGroup(bgLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(descripcion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(bgLayout.createSequentialGroup()
                                .addGap(65, 65, 65)
                                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(fechaEntrgLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(fechaEntrgTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(jCalendar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(206, 206, 206))
                            .addGroup(bgLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(descripcionTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(button)
                                .addGap(150, 150, 150))))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonActionPerformed
        try {
            String idEqp = idEquipoTxt.getText();
            String fEntrg = fechaEntrgTxt.getText();
            String descripcionTexto = descripcionTxt.getText().toLowerCase();
            
            // Validaciones para los campos
            if (idEqp.isEmpty()|| descripcionTexto.isEmpty()||fEntrg.isEmpty()) {
                javax.swing.JOptionPane.showMessageDialog(this, "Debe llenar todos los campos.\n", "AVISO", javax.swing.JOptionPane.ERROR_MESSAGE);
                fechaEntrgTxt.requestFocus();
                return;
            }else if (!Utils.isNumeric(idEqp)) {
                javax.swing.JOptionPane.showMessageDialog(this,"El campo OIT debe ser un numero entero");
                fechaEntrgTxt.requestFocus();
                return;
            }else if (Integer.parseInt(idEqp)<=0) {
                javax.swing.JOptionPane.showMessageDialog(this, "El campo OIT debe ser mayor que 0. \n", "AVISO", javax.swing.JOptionPane.ERROR_MESSAGE);
            }
            //valida si el ID equipo es existente
            DAOequipos daoEquipos = new DAOequiposImpl();
       
            com.mycompany.mecatech.models.equipos currentEquipo = daoEquipos.getEquiposID(Integer.parseInt(idEqp));
            if (currentEquipo == null) {
                javax.swing.JOptionPane.showMessageDialog(this, "No se encontró ningún equipo con ese ID. \n", "AVISO", javax.swing.JOptionPane.ERROR_MESSAGE);
                idEquipoTxt.requestFocus();
                return;
            }
            //Realizar el posible diagnostico
            List<String> problemas = new ArrayList<>();
            
            if (descripcionTexto.contains("presion") && descripcionTexto.contains("bomba")) {
                Pattern patronNumero = Pattern.compile("\\d+");
                Matcher matcherNumero = patronNumero.matcher(descripcionTexto);
                
                if (matcherNumero.find()) {
                    int valorPresion = Integer.parseInt(matcherNumero.group());
                    
                    if (valorPresion < 50) {
                        problemas.add("Posible problema de baja presión en la bomba. Verificar tuberías y válvulas.");
                    } else if (valorPresion > 100) {
                        problemas.add("Posible problema de alta presión en la bomba. Verificar sistema de regulación.");
                    }
                }
            }
            
            if (descripcionTexto.contains("sobrecalentamiento")) {
                problemas.add("Posible problema de sobrecalentamiento en la bomba. Verificar sistema de enfriamiento.");
            }
            
            if (descripcionTexto.contains("flujo") && descripcionTexto.contains("inestable")) {
                problemas.add("Posible problema de flujo inestable en la bomba. Verificar posibles obstrucciones o fugas.");
            }
            
            if (!problemas.isEmpty()) {
                String mensaje = "Problemas detectados en la bomba:\n";

                for (String problema : problemas) {
                    mensaje += problema + "\n";
                }
                JOptionPane.showMessageDialog(this, mensaje);
            } else {
                JOptionPane.showMessageDialog(this, "No se encontraron problemas relacionados con la descripción proporcionada.");
            }
            String listPrblm = String.join("\n", problemas);
            
            
            com.mycompany.mecatech.models.OrdenTrabajos diag = isEdition ? diagEdition : new  com.mycompany.mecatech.models.OrdenTrabajos();
            diag.setID_equipo(Integer.parseInt(idEqp));
            diag.setFechaEntrega(fEntrg);
            diag.setDescripcion(descripcionTexto);
            diag.setDiagnostico(listPrblm);
            try {
                DAOordenTrabajos dao = new DAOordentrabajoImpl();
                
                if (!isEdition) {
                    dao.registrar(diag);
                }else{
                    dao.modificar(diag);
                }
                
                String successMsg = isEdition ? "modificado" : "registrado";
                
                javax.swing.JOptionPane.showMessageDialog(this,"OIT " + successMsg + " exitosamente.\n", "AVISO", javax.swing.JOptionPane.INFORMATION_MESSAGE );
                
                if (!isEdition) {
                    fechaEntrgTxt.setText("");
                    descripcionTxt.setText("");
                }
            } catch (Exception e) {
                String errorMsg = isEdition ? "modficar" : "registrar";
                javax.swing.JOptionPane.showMessageDialog(this, "Ocurrió un error al " + errorMsg + " el diagnostico. \n", "AVISO", javax.swing.JOptionPane.ERROR_MESSAGE);
                System.out.println(e.getMessage());
            }
            
            
        } catch (Exception ex) {
            Logger.getLogger(ViewNewMantenimiento.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }//GEN-LAST:event_buttonActionPerformed

    private void idEquipoBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idEquipoBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idEquipoBoxActionPerformed

    private void idEquipoBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_idEquipoBoxItemStateChanged
        Utils getIdclient = new Utils();
        getIdclient.obtenerIDdeCombobox("equipos", "activo", "id_equipo", idEquipoBox, idEquipoTxt);
    }//GEN-LAST:event_idEquipoBoxItemStateChanged

    private void jCalendar1PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jCalendar1PropertyChange
        if(evt.getOldValue()!=null){
            SimpleDateFormat ff = new SimpleDateFormat("dd/MM/yyyy");
            fechaEntrgTxt.setText(ff.format(jCalendar1.getCalendar().getTime()));
        }
    }//GEN-LAST:event_jCalendar1PropertyChange


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel IDequipoLabel;
    private javax.swing.JPanel bg;
    private javax.swing.JButton button;
    private javax.swing.JLabel descripcion;
    private javax.swing.JTextField descripcionTxt;
    private javax.swing.JLabel fechaEntrgLabel;
    private javax.swing.JTextField fechaEntrgTxt;
    private javax.swing.JComboBox<String> idEquipoBox;
    private javax.swing.JTextField idEquipoTxt;
    private com.toedter.calendar.JCalendar jCalendar1;
    private javax.swing.JLabel title;
    // End of variables declaration//GEN-END:variables



}



