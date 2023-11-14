/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mecatech;

import com.mycompany.mecatech.db.DatabaseMecatech;
import com.mycompany.mecatech.interfaces.DAOclientes;
import com.mycompany.mecatech.models.clientes;
import java.sql.PreparedStatement;
import java.util.List;

/**
 *
 * @author Aldair Raymundo
 */
public class DAOclientesImpl extends DatabaseMecatech implements DAOclientes {

    @Override
    public void registrar(clientes cliente) throws Exception {
        try {
            this.Conectar();
            PreparedStatement st = this.conexion.prepareStatement("INSERT INTO clientes(Nom_cliente,Encargado,Telefono,Correo) VALUES(?,?,?,?)");
            st.setString(1, cliente.getNom_cliente());
            st.setString(2, cliente.getEncargado());
            st.setString(3, cliente.getTelefono());
            st.setString(4, cliente.getCorreo());
            st.executeUpdate();
        } catch (Exception e) {
            throw e;
        } finally {
          this.Cerrar();
        }
    }

    @Override
    public void modificar(clientes cliente) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void eliminar(clientes cliente) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<clientes> listar() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
