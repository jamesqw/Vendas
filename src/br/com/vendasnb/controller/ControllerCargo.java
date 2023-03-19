/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.vendasnb.controller;

import br.com.vendasnb.dao.DaoCargo;
import br.com.vendasnb.model.ModelCargo;
import java.util.ArrayList;

/**
 *
 * @author Nicolas
 */
public class ControllerCargo {
    
    private DaoCargo daoCargo = new DaoCargo();
    
    /***
     * Salvar cargo
     * @param pmodelCargo
     * @return int
     */
    
    public int salvarCargoController(ModelCargo pModelCargo){
       return this.daoCargo.salvarCargoDAO(pModelCargo);
    }
    
    /***
     * Excluir cargo 
     * @param pCodigo
     * @return boolean
     */    
    public boolean excluirCargoController(int pCodigo){
        return this.daoCargo.excluirCargoDAO(pCodigo);
    }
    
    /***
     * altera cargo 
     * @param pCodigo
     * @return boolean
     */
    
    public boolean alteraCargoController(ModelCargo pModelCargo){
        return this.daoCargo.alterarCargoDAO(pModelCargo);
    }
    
    /***
     * retorna um cargo
     * @param pCodigo
     * @return ModelCargo
     */
    
    public ModelCargo retornaCargoController(int pCodigo){
        return this.daoCargo.retornaCargoDAO(pCodigo);
    }
    
    /**
     * retorna uma lista de cargos
     * @return 
     */
    
    public ArrayList<ModelCargo> retornaListaCargoController(){
        return this.daoCargo.retonarListaCargo();
    }
    
}
