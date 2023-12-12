/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mecatech;
import com.mycompany.mecatech.db.DatabaseMecatech;
import com.mycompany.mecatech.interfaces.DAOequipos;
import com.mycompany.mecatech.models.equipos;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Aldair Raymundo
 */
public class DAOequiposImpl extends DatabaseMecatech implements DAOequipos{

    @Override
    public void registrar(equipos equipo) throws Exception {
        try {
            this.Conectar();
            PreparedStatement st = this.conexion.prepareStatement("INSERT INTO equipos(id_cliente,activo,descripcion) VALUES(?,?,?)");
            st.setInt(1, equipo.getID_cliente());
            st.setString(2, equipo.getActivo());
            st.setString(3, equipo.getDescripcion());
            st.executeUpdate();
        } catch (Exception e) {
            throw e;
        }finally{
            this.Cerrar();
        }
    }

    @Override
    public void modificar(equipos equipo) throws Exception {
        try {
            this.Conectar();
            PreparedStatement st = this.conexion.prepareStatement("UPDATE equipos SET id_cliente = ?, activo = ?, descripcion = ? WHERE id_equipo = ?");
            st.setInt(1, equipo.getID_cliente());
            st.setString(2, equipo.getActivo());
            st.setString(3, equipo.getDescripcion());
            st.setInt(4, equipo.getID_equipo());
            st.executeUpdate();
        } catch (Exception e) {
            throw e;
        } finally {
            this.Cerrar();
        }
    }

    @Override
    public void eliminar(int equipoID) throws Exception {
        try {
            this.Conectar();
            PreparedStatement st = this.conexion.prepareStatement("DELETE FROM equipos WHERE id_equipo = ?;");
            st.setInt(1, equipoID);
            st.executeUpdate();
            st.close();
        } catch (Exception e) {
            throw e;
        } finally {
            this.Cerrar();
        }
    }

    @Override
    public List<equipos> listar(String activo) throws Exception {
        List<equipos> lista = null;
        try {
            this.Conectar();
            String Query = activo.isEmpty() ? "SELECT * FROM equipos;" : "SELECT * FROM equipos WHERE activo LIKE '%" + activo + "%';";
            PreparedStatement st = this.conexion.prepareStatement(Query);
            
            lista = new ArrayList();
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                equipos equipo = new equipos();
                equipo.setID_equipo(rs.getInt("id_equipo"));
                equipo.setID_cliente(rs.getInt("id_cliente"));
                equipo.setActivo(rs.getString("activo"));
                equipo.setDescripcion(rs.getString("descripcion"));
                lista.add(equipo);
            }
        } catch (Exception e) {
            throw e;
        } finally {
            this.Cerrar();
        }
        return lista;
    }

    @Override
    public equipos getEquiposID(int equipoID) throws Exception{
        equipos equipo = null;
        
        try {
            this.Conectar();
            PreparedStatement st = this.conexion.prepareStatement("SELECT * FROM equipos WHERE id_equipo = ? LIMIT 1;");
            st.setInt(1, equipoID);
            ResultSet rs = st.executeQuery();
            
            while (rs.next()) {
                equipo = new equipos();
                equipo.setID_equipo(rs.getInt("id_equipo"));
                equipo.setID_cliente(rs.getInt("id_cliente"));
                equipo.setActivo(rs.getString("activo"));
                equipo.setDescripcion(rs.getString("descripcion"));
            }
            rs.close();
            st.close();
        } catch (Exception e) {
            throw e;
        } finally {
            this.Cerrar();
        }
        return equipo;
    }
    
}
