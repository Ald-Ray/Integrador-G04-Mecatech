/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.mecatech.interfaces;

import com.mycompany.mecatech.models.OrdenTrabajos;
import java.util.List;

/**
 *
 * @author Aldair Raymundo
 */
public interface DAOordenTrabajos {
    public void registrar (OrdenTrabajos oit) throws Exception;
    public void modificar (OrdenTrabajos oit)throws Exception;
    public  OrdenTrabajos getOIT(int oitID) throws Exception;
    public List<OrdenTrabajos> listar(String oits) throws Exception;  
}
