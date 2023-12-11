package com.mycompany.mecatech.utils;

import com.mycompany.mecatech.db.DatabaseMecatech;
import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Utils extends DatabaseMecatech{
    
    public static boolean isNumeric(String strNum) {
        if (strNum == null) {
            return false;
        }
        try {
            double d = Integer.parseInt(strNum);
        } catch (NumberFormatException nfe) {
            return false;
        }
        return true;
    }
    
    public static String getFechaActual() {
        Date ahora = new Date();
        SimpleDateFormat formateador = new SimpleDateFormat("dd-MM-yyyy");
        return formateador.format(ahora);
    }

    //Devuele un java.util.Date desde un String en formato dd-MM-yyyy
    //@param La fecha a convertir a formato date
    //@return Retorna la fecha en formato Date
    public static synchronized java.util.Date stringToDate(String fecha) {
        SimpleDateFormat formatoDelTexto = new SimpleDateFormat("dd-MM-yyyy");
        Date fechaEnviar = null;
        try {
            fechaEnviar = formatoDelTexto.parse(fecha);
            return fechaEnviar;
        } catch (ParseException ex) {
            ex.printStackTrace();
            return null;
        }
    }
    
    public void RellenarComboBox(String tabla, String valor, JComboBox combo){
        String sql="SELECT * FROM "+ tabla;
        Statement st;
        try {
            this.Conectar();
            st = conexion.createStatement();
            ResultSet rs = st.executeQuery(sql);
            combo.removeAllItems();
            
            while (rs.next()){
                combo.addItem(rs.getString(valor));
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERROR" + e.toString());
        }
         
    }
    
   public void obtenerIDdeCombobox(  String tabla, String valor,String valorId,JComboBox combo, JTextField idTxt){
       String consulta = "SELECT "+tabla+"."+valorId+" from "+tabla+" where "+tabla+"."+valor+" = ?";
       
       try {
           this.Conectar();
           CallableStatement cs = conexion.prepareCall(consulta);
           cs.setString(1, combo.getSelectedItem().toString());
           cs.execute();
           ResultSet rs = cs.executeQuery();
           
           if (rs.next()) {
               idTxt.setText(rs.getString(valorId));
           }
       } catch (Exception e) {
           JOptionPane.showMessageDialog(null, "ERROR" + e.toString());
       }
   }
}