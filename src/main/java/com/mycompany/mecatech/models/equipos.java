/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mecatech.models;

/**
 *
 * @author Aldair Raymundo
 */
public class equipos {
    private String ID_equipo;
    private String ID_cliente;
    private String activo;
    private String descripcion;

    public String getID_equipo() {
        return ID_equipo;
    }

    public void setID_equipo(String ID_equipo) {
        this.ID_equipo = ID_equipo;
    }

    public String getID_cliente() {
        return ID_cliente;
    }

    public void setID_cliente(String ID_cliente) {
        this.ID_cliente = ID_cliente;
    }

    public String getActivo() {
        return activo;
    }

    public void setActivo(String activo) {
        this.activo = activo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
