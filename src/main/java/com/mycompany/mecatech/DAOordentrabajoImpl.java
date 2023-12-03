/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mecatech;

import com.mycompany.mecatech.db.DatabaseMecatech;
import com.mycompany.mecatech.interfaces.DAOordenTrabajos;
import com.mycompany.mecatech.models.OrdenTrabajos;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Aldair Raymundo
 */
public class DAOordentrabajoImpl extends DatabaseMecatech implements DAOordenTrabajos{

    @Override
    public void registrar(OrdenTrabajos oit) throws Exception {
        try {
            this.Conectar();
            PreparedStatement st = this.conexion.prepareCall("INSERT INTO ordentrabajos(oit,id_equipo,descripcion,fecha_entrega,fecha_inicio,fecha_fin) VALUES(?,?,?,?,?,?)");
            st.setString(1,oit.getOIT());
            st.setInt(2, oit.getID_equipo());
            st.setString(3, oit.getDescripcion());
            st.setString(4, oit.getFechaEntrega());
            st.setString(5, oit.getFecha_inicio());
            st.setString(6, oit.getFecha_final());
            st.executeUpdate();
            st.close();
        } catch (Exception e) {
            throw e;
        } finally{
            this.Cerrar();
        }
    }

    @Override
    public void modificar(OrdenTrabajos oit) throws Exception {
        try {
            this.Conectar();
            PreparedStatement st = this.conexion.prepareStatement("UPDATE ordentrabajos SET oit = ?, id_equipo = ?, descripcion = ?, fecha_entrega = ?, fecha_inicio = ?, fecha_fin = ?");
            st.setString(1, oit.getOIT());
            st.setInt(2, oit.getID_equipo());
            st.setString(3, oit.getDescripcion());
            st.setString(4, oit.getFechaEntrega());
            st.setString(5,oit.getFecha_inicio());
            st.setString(6, oit.getFecha_final());
            st.executeUpdate();
            st.close();
        } catch (Exception e) {
            throw e;
        } finally {
            this.Cerrar();
        }
    }



    @Override
    public List<OrdenTrabajos> listar(String oits) throws Exception {
        List<OrdenTrabajos> lista = null;
        try {
            this.Conectar();
            String Query = oits.isEmpty() ? "SELECT * FROM ordentrabajos;" : "SELECT * FROM ordentrabajos WHERE oit LIKE '%"+ oits + "%';";
            PreparedStatement st = this.conexion.prepareStatement(Query);
            
            lista = new ArrayList();
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
               OrdenTrabajos oit = new OrdenTrabajos();
               oit.setOIT(rs.getString("oit"));
               oit.setID_equipo(rs.getInt("id_equipo"));
               oit.setDescripcion(rs.getString("descripcion"));
               oit.setFechaEntrega(rs.getString("fecha_entrega"));
               oit.setFecha_inicio(rs.getString("fecha_inicio"));
               oit.setFecha_final(rs.getString("fecha_fin"));
               lista.add(oit);
            }
        } catch (Exception e) {
            throw e;
        } finally {
            this.Cerrar();
        }
        return lista;
    }

    @Override
    public OrdenTrabajos getOIT(String oitID) throws Exception {
        OrdenTrabajos oit = null;
        
        try {
            this.Conectar();
            PreparedStatement st = this.conexion.prepareStatement("SELECT * FROM ordentrabajos WHERE oit = ? LIMIT 1;");
            st.setString(1, oitID);
            ResultSet rs = st.executeQuery();
            
            while (rs.next()) {                
                oit = new OrdenTrabajos();
                oit.setOIT(rs.getString("oit"));
                oit.setID_equipo(rs.getInt("id_equipo"));
                oit.setDescripcion(rs.getString("descripcion"));
                oit.setFechaEntrega(rs.getString("fecha_entrega"));
                oit.setFecha_inicio(rs.getString("fecha_inicio"));
                oit.setFecha_final(rs.getString("fecha_fin"));
            }
            rs.close();
            st.close();
        } catch (Exception e) {
            throw e;
        } finally {
            this.Cerrar();
        }
        return oit;
    }
    
}
