/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.vendasnb.controller;

import br.com.vendasnb.dao.DAOVendasUsuario;
import br.com.vendasnb.model.ModelVendasUsuario;
import java.util.ArrayList;

/**
 *
 * @author Nicolas
 */
public class ControllerVendasUsuario {
    
    private DAOVendasUsuario daoVendasUsuario = new DAOVendasUsuario();

    public ArrayList<ModelVendasUsuario> getListaVendasUsuarioController() {
        return this.daoVendasUsuario.getListaVendasUsuarioDAO();
    }
    
}
