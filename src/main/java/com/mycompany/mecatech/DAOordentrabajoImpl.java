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
            PreparedStatement st = this.conexion.prepareCall("INSERT INTO ordentrabajos(id_equipo,descripcion,fecha_entrega,diagnostico) VALUES(?,?,?,?)");
            st.setInt(1, oit.getID_equipo());
            st.setString(2, oit.getDescripcion());
            st.setString(3, oit.getFechaEntrega());
            st.setString(4, oit.getDiagnostico());
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
            PreparedStatement st = this.conexion.prepareStatement("UPDATE ordentrabajos SET id_equipo = ?, descripcion = ?, fecha_entrega = ?, diagnostico = ? where oit = ?");
            st.setInt(1, oit.getID_equipo());
            st.setString(2, oit.getDescripcion());
            st.setString(3, oit.getFechaEntrega());
            st.setString(4,oit.getDiagnostico());
            st.setInt(5, oit.getOIT());
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
               oit.setOIT(rs.getInt("oit"));
               oit.setID_equipo(rs.getInt("id_equipo"));
               oit.setDescripcion(rs.getString("descripcion"));
               oit.setFechaEntrega(rs.getString("fecha_entrega"));
               oit.setDiagnostico(rs.getString("diagnostico"));
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
    public OrdenTrabajos getOIT(int oitID) throws Exception {
        OrdenTrabajos oit = null;
        
        try {
            this.Conectar();
            PreparedStatement st = this.conexion.prepareStatement("SELECT * FROM ordentrabajos WHERE oit = ? LIMIT 1;");
            st.setInt(1, oitID);
            ResultSet rs = st.executeQuery();
            
            while (rs.next()) {                
                oit = new OrdenTrabajos();
                oit.setOIT(rs.getInt("oit"));
                oit.setID_equipo(rs.getInt("id_equipo"));
                oit.setDescripcion(rs.getString("descripcion"));
                oit.setFechaEntrega(rs.getString("fecha_entrega"));
                oit.setDiagnostico(rs.getString("diagnostico"));;
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
