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
    private int OIT;
    private int ID_equipo;
    private String Descripcion;
    private String fechaEntrega;
    private String Diagnostico;

    public int getOIT() {
        return OIT;
    }

    public void setOIT(int OIT) {
        this.OIT = OIT;
    }

    public int getID_equipo() {
        return ID_equipo;
    }

    public void setID_equipo(int ID_equipo) {
        this.ID_equipo = ID_equipo;
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

    public String getDiagnostico() {
        return Diagnostico;
    }

    public void setDiagnostico(String Diagnostico) {
        this.Diagnostico = Diagnostico;
    }
    
    
    
    
}
