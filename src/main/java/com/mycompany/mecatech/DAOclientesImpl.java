/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mecatech;

import com.mycompany.mecatech.db.DatabaseMecatech;
import com.mycompany.mecatech.interfaces.DAOclientes;
import com.mycompany.mecatech.models.clientes;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
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
        try {
            this.Conectar();
            PreparedStatement st = this.conexion.prepareStatement("UPDATE clientes SET nom_cliente = ?, encargado = ?, telefono = ?, correo = ? WHERE id_cliente = ?");
            st.setString(1, cliente.getNom_cliente());
            st.setString(2, cliente.getEncargado());
            st.setString(3, cliente.getTelefono());
            st.setString(4, cliente.getCorreo());
            st.setInt(5, cliente.getID_cliente());
            st.executeUpdate();
            st.close();
        } catch (Exception e) {
            throw e;
        }finally{
            this.Cerrar();
        }
    }
    
    @Override
    public void eliminar(int clientID) throws Exception {
        try {
            this.Conectar();
            PreparedStatement st = this.conexion.prepareStatement("DELETE FROM clientes WHERE id_cliente = ?;");
            st.setInt(1, clientID);
            st.executeUpdate();
            st.close();
        } catch (Exception e) {
            throw e;
        }finally{
            this.Cerrar();
        }
    }
    
    @Override
    public List<clientes> listar(String Nom_clientes) throws Exception {
         List<clientes> lista = null;
        try {
            this.Conectar();
            String Query = Nom_clientes.isEmpty() ? "SELECT * FROM clientes;" : "SELECT * FROM clientes WHERE nom_cliente LIKE '%" + Nom_clientes + "%';";
            PreparedStatement st = this.conexion.prepareStatement(Query);
            
            lista = new ArrayList();
            ResultSet rs = st.executeQuery();
            while(rs.next()) {
                clientes cliente = new clientes();
                cliente.setID_cliente(rs.getInt("id_cliente"));
                cliente.setNom_cliente(rs.getString("nom_cliente"));
                cliente.setEncargado(rs.getString("encargado"));
                cliente.setTelefono(rs.getString("telefono"));
                cliente.setCorreo(rs.getString("correo"));
                lista.add(cliente);
            }
            rs.close();
            st.close();
        } catch(Exception e) {
            throw e;
        } finally {
            this.Cerrar();
        }
        return lista;
    }
   
    @Override
    public clientes getClienteID(int clienteId) throws Exception{
        clientes cliente = null;
        
        try {
            this.Conectar();
            PreparedStatement st =  this.conexion.prepareStatement("SELECT * FROM clientes WHERE id_cliente = ? LIMIT 1;");
            st.setInt(1, clienteId);
            ResultSet rs = st.executeQuery();
            
             while(rs.next()) {
                cliente = new clientes();
                cliente.setID_cliente(rs.getInt("id_cliente"));
                cliente.setNom_cliente(rs.getString("nom_cliente"));
                cliente.setEncargado(rs.getString("encargado"));
                cliente.setTelefono(rs.getString("telefono"));
                cliente.setCorreo(rs.getString("correo"));
            }
            rs.close();
            st.close();
        } catch (Exception e) {
            throw e;
        } finally{
            this.Cerrar();
        }
        return cliente;
    }
    
}
