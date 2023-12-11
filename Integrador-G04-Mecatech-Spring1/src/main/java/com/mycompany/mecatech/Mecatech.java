/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mecatech;
import com.mycompany.mecatech.db.DatabaseMecatech;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Aldair Raymundo
 */
public class Mecatech {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        DatabaseMecatech database = new DatabaseMecatech();
        try {
            database.Conectar();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Mecatech.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
