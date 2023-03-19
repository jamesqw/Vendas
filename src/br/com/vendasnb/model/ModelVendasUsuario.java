/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.vendasnb.model;

import java.util.ArrayList;

/**
 *
 * @author Nicolas
 */
public class ModelVendasUsuario {
    
    private ModelVenda modelVenda;
    private ModelUsuario modelUsuario;
    private ArrayList<ModelVendasUsuario> listaModelVendasUsuario;

    /**
     * @return the modelVenda
     */
    public ModelVenda getModelVenda() {
        return modelVenda;
    }

    /**
     * @param modelVenda the modelVenda to set
     */
    public void setModelVenda(ModelVenda modelVenda) {
        this.modelVenda = modelVenda;
    }

    /**
     * @return the modelUsuario
     */
    public ModelUsuario getModelUsuario() {
        return modelUsuario;
    }

    /**
     * @param modelUsuario the modelUsuario to set
     */
    public void setModelUsuario(ModelUsuario modelUsuario) {
        this.modelUsuario = modelUsuario;
    }

    /**
     * @return the listaModelVendasUsuario
     */
    public ArrayList<ModelVendasUsuario> getListaModelVendasUsuario() {
        return listaModelVendasUsuario;
    }

    /**
     * @param listaModelVendasUsuario the listaModelVendasUsuario to set
     */
    public void setListaModelVendasUsuario(ArrayList<ModelVendasUsuario> listaModelVendasUsuario) {
        this.listaModelVendasUsuario = listaModelVendasUsuario;
    }
}
