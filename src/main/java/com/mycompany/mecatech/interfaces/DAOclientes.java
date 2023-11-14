/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.mecatech.interfaces;

import com.mycompany.mecatech.models.clientes;
import java.util.List;

/**
 *
 * @author Aldair Raymundo
 */
public interface DAOclientes {
    public void registrar (clientes cliente) throws Exception;
    public void modificar (clientes cliente)throws Exception;
    public void eliminar (clientes cliente)throws Exception;
    public List<clientes> listar() throws Exception;
}
