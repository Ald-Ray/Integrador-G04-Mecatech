package com.mycompany.mecatech.views;

import com.mycompany.mecatech.DAOclientesImpl;
import com.mycompany.mecatech.DAOequiposImpl;
import com.mycompany.mecatech.interfaces.DAOclientes;
import com.mycompany.mecatech.interfaces.DAOequipos;
import java.awt.Color;
import com.mycompany.mecatech.utils.Utils;
import java.util.logging.Level;
import java.util.logging.Logger;


public class ViewNewEquipo extends javax.swing.JPanel {
    
    boolean isEdition = false;
    com.mycompany.mecatech.models.equipos equipoEdition;
    Utils combo = new Utils();
    public ViewNewEquipo() {
        initComponents();
        clentIDtxt.setVisible(false);
        InitStyles();
        combo.RellenarComboBox("clientes", "nom_cliente", jComboBoxIDcliente);
    }

    public ViewNewEquipo(com.mycompany.mecatech.models.equipos equipo) {
        initComponents();
        clentIDtxt.setVisible(false);
        isEdition = true;
        equipoEdition = equipo;
        InitStyles();
        combo.RellenarComboBox("clientes", "nom_cliente", jComboBoxIDcliente);
    } 
    
    private void InitStyles() {
        title.putClientProperty("FlatLaf.styleClass", "h2");
        title.setForeground(Color.black);
        activoTxt.putClientProperty("JTextField.placeholderText", "Ingrese el nombre del Activo.");
        descripcionTxt.putClientProperty("JTextField.placeholderText", "Ingrese descripcion del equipo.");
        

        if (isEdition) {
            title.setText("Editar Equipo");
            button.setText("Guardar");
            
            if (equipoEdition != null) {
                clentIDtxt.setText(equipoEdition.getID_cliente()+"");
                activoTxt.setText(equipoEdition.getActivo());
                descripcionTxt.setText(equipoEdition.getDescripcion());
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
        IDcliente = new javax.swing.JLabel();
        activo = new javax.swing.JLabel();
        activoTxt = new javax.swing.JTextField();
        Descripción = new javax.swing.JLabel();
        descripcionTxt = new javax.swing.JTextField();
        button = new javax.swing.JButton();
        jComboBoxIDcliente = new javax.swing.JComboBox<>();
        clentIDtxt = new javax.swing.JTextField();

        setBackground(new java.awt.Color(255, 255, 255));

        bg.setBackground(new java.awt.Color(255, 255, 255));

        title.setText("Registrar Equipo Nuevo");

        IDcliente.setText("Cliente");

        activo.setText("Activo");

        Descripción.setText("Descripción");

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

        jComboBoxIDcliente.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBoxIDclienteItemStateChanged(evt);
            }
        });
        jComboBoxIDcliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxIDclienteActionPerformed(evt);
            }
        });

        clentIDtxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clentIDtxtActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout bgLayout = new javax.swing.GroupLayout(bg);
        bg.setLayout(bgLayout);
        bgLayout.setHorizontalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgLayout.createSequentialGroup()
                .addGap(252, 252, 252)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(IDcliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(activo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Descripción, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(descripcionTxt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 280, Short.MAX_VALUE)
                    .addComponent(activoTxt, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jComboBoxIDcliente, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(31, 31, 31)
                .addComponent(clentIDtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(160, 160, 160))
            .addGroup(bgLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(title, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(32, 32, 32))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bgLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(button)
                .addGap(331, 331, 331))
        );
        bgLayout.setVerticalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(title)
                .addGap(18, 18, 18)
                .addComponent(IDcliente, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(clentIDtxt, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jComboBoxIDcliente, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(activo, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(activoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Descripción, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(descripcionTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(button)
                .addGap(56, 56, 56))
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
            //String idClent = idClienteTxt.getText();
            String idClent = clentIDtxt.getText();
            String actv = activoTxt.getText();
            String dscrp = descripcionTxt.getText();
            //String comIDclent = jComboBoxIDcliente.getToolTipText();
            // Validaciones para los campos
            if (idClent.isEmpty()|| actv.isEmpty()||dscrp.isEmpty()) {
                javax.swing.JOptionPane.showMessageDialog(this, "Debe llenar todos los campos.\n", "AVISO", javax.swing.JOptionPane.ERROR_MESSAGE);
                clentIDtxt.requestFocus();
                return;
            }else if (!Utils.isNumeric(idClent)) {
                javax.swing.JOptionPane.showMessageDialog(this,"El campo ID Cliente debe ser un numero entero");
                clentIDtxt.requestFocus();
                return;
            }else if (Integer.parseInt(idClent)<=0) {
                javax.swing.JOptionPane.showMessageDialog(this, "El campo ID cliente debe ser mayor que 0. \n", "AVISO", javax.swing.JOptionPane.ERROR_MESSAGE);
            }
            // Validamos existencia del ID cliente
            DAOclientes daoClientes = new DAOclientesImpl();
            
            com.mycompany.mecatech.models.clientes currentCliente = daoClientes.getClienteID(Integer.parseInt(idClent));
            if (currentCliente == null) {
                javax.swing.JOptionPane.showMessageDialog(this, "No se encontró ningún cliente con ese ID. \n", "AVISO", javax.swing.JOptionPane.ERROR_MESSAGE);
                clentIDtxt.requestFocus();
                return;
            }
            
            com.mycompany.mecatech.models.equipos equipo = isEdition ? equipoEdition : new com.mycompany.mecatech.models.equipos();
            equipo.setID_cliente(Integer.parseInt(idClent));
            equipo.setActivo(actv);
            equipo.setDescripcion(dscrp);
            
            try {
                DAOequipos dao = new DAOequiposImpl();
                
                if (!isEdition) {
                    dao.registrar(equipo);
                } else {
                    dao.modificar(equipo);
                }
                
                String successMsg = isEdition ? "modificado" : "registrado";
                
                javax.swing.JOptionPane.showMessageDialog(this,"Equipo " + successMsg + " exitosamente.\n", "AVISO", javax.swing.JOptionPane.INFORMATION_MESSAGE );
                
                if (!isEdition) {
                    clentIDtxt.setText("");
                    activoTxt.setText("");
                    descripcionTxt.setText("");
                }
            } catch (Exception e) {
                String errorMsg = isEdition ? "modficar" : "registrar";
                javax.swing.JOptionPane.showMessageDialog(this, "Ocurrió un error al " + errorMsg + " el equipo. \n", "AVISO", javax.swing.JOptionPane.ERROR_MESSAGE);
                System.out.println(e.getMessage());
            }
        } catch (Exception ex) {
            Logger.getLogger(ViewNewEquipo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_buttonActionPerformed

    private void jComboBoxIDclienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxIDclienteActionPerformed
  
    }//GEN-LAST:event_jComboBoxIDclienteActionPerformed

    private void clentIDtxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clentIDtxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_clentIDtxtActionPerformed

    private void jComboBoxIDclienteItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBoxIDclienteItemStateChanged
        Utils getIdclient = new Utils();
        getIdclient.obtenerIDdeCombobox("clientes", "nom_cliente", "id_cliente", jComboBoxIDcliente, clentIDtxt);
    }//GEN-LAST:event_jComboBoxIDclienteItemStateChanged

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Descripción;
    private javax.swing.JLabel IDcliente;
    private javax.swing.JLabel activo;
    private javax.swing.JTextField activoTxt;
    private javax.swing.JPanel bg;
    private javax.swing.JButton button;
    private javax.swing.JTextField clentIDtxt;
    private javax.swing.JTextField descripcionTxt;
    private javax.swing.JComboBox<String> jComboBoxIDcliente;
    private javax.swing.JLabel title;
    // End of variables declaration//GEN-END:variables
}