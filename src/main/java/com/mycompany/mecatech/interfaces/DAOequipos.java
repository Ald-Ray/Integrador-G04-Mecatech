/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.mecatech.interfaces;

import com.mycompany.mecatech.models.equipos;
import java.util.List;

/**
 *
 * @author Aldair Raymundo
 */
public interface DAOequipos {
    public void registrar (equipos equipo) throws Exception;
    public void modificar (equipos equipo)throws Exception;
    public void eliminar (int equipo)throws Exception;
    public List<equipos> listar(String activo) throws Exception;
    public equipos getEquiposID(int equipoID) throws Exception;
}
