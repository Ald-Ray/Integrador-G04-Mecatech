/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mecatech.models;

/**
 *
 * @author Aldair Raymundo
 */
public class OrdenTrabajos {
    private String OIT;
    private int ID_equipo;
    private String Descripcion;
    private String fechaEntrega;
    private String fecha_inicio;
    private String fecha_final;

    public String getOIT() {
        return OIT;
    }

    public void setOIT(String OIT) {
        this.OIT = OIT;
    }

    public int getID_equipo() {
        return ID_equipo;
    }

    public void setID_equipo(int ID_equipo) {
        this.ID_equipo = ID_equipo;
    }

    public String getFecha_inicio() {
        return fecha_inicio;
    }

    public void setFecha_inicio(String fecha_inicio) {
        this.fecha_inicio = fecha_inicio;
    }

    public String getFecha_final() {
        return fecha_final;
    }

    public void setFecha_final(String fecha_final) {
        this.fecha_final = fecha_final;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    public String getFechaEntrega() {
        return fechaEntrega;
    }

    public void setFechaEntrega(String fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
    }
    
    
}
