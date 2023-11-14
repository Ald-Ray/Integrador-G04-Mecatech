/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.mecatech.interfaces;

import com.mycompany.mecatech.models.mantenimientos;
import java.util.List;

/**
 *
 * @author Aldair Raymundo
 */
public interface DAOmantenimientos {
    public void registrar (mantenimientos mantenimiento) throws Exception;
    public void modificar (mantenimientos mantenimiento)throws Exception;
    public void eliminar (mantenimientos mantenimiento)throws Exception;
    public List<mantenimientos> listar() throws Exception;  
}
