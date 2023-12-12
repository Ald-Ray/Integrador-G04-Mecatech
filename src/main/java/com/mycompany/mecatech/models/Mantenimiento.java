/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mecatech.models;

/**
 *
 * @author mafyi
 */
public class Mantenimiento {
    
        private int OIT;
    private int ID_equipo;
    private String Descripcion;
    private String fechaEntrega;
    private String Diagnostico;
    private String Mantenimiento;

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

    public String getFechaEntrega() {
        return fechaEntrega;
    }

    public void setFechaEntrega(String fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
    }

    public String getDiagnostico() {
        return Diagnostico;
    }
    
    public String getMantenimiento(){
        return Mantenimiento;
    }

    public void setDiagnostico(String Diagnostico) {
        this.Diagnostico = Diagnostico;
    }
    
    public void setMantenimiento(String Mantenimiento){
        this.Mantenimiento = Mantenimiento;
    }
    
}
