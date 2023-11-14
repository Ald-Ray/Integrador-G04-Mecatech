/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mecatech.models;

/**
 *
 * @author Aldair Raymundo
 */
public class mantenimientos {
    private String OIT;
    private String ID_equipo;
    private String fecha_inicio;
    private String fecha_final;

    public String getOIT() {
        return OIT;
    }

    public void setOIT(String OIT) {
        this.OIT = OIT;
    }

    public String getID_equipo() {
        return ID_equipo;
    }

    public void setID_equipo(String ID_equipo) {
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
    
}
