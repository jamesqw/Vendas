package br.com.vendasnb.controller;

import br.com.vendasnb.model.ModelFornecedor;
import br.com.vendasnb.dao.DAOFornecedor;
import java.util.ArrayList;

/**
*
* @author nicolas bueno
*/
public class ControllerFornecedor {

    private DAOFornecedor daoFornecedor = new DAOFornecedor();

    /**
    * grava Fornecedor
    * @param pModelFornecedor
    * @return int
    */
    public int salvarFornecedorController(ModelFornecedor pModelFornecedor){
        return this.daoFornecedor.salvarFornecedorDAO(pModelFornecedor);
    }

    /**
    * recupera Fornecedor
    * @param pId
    * @return ModelFornecedor
    */
    public ModelFornecedor getFornecedorController(int pId){
        return this.daoFornecedor.getFornecedorDAO(pId);
    }

    /**
    * recupera uma lista deFornecedor
    * @param pId
    * @return ArrayList
    */
    public ArrayList<ModelFornecedor> getListaFornecedorController(){
        return this.daoFornecedor.getListaFornecedorDAO();
    }

    /**
    * atualiza Fornecedor
    * @param pModelFornecedor
    * @return boolean
    */
    public boolean atualizarFornecedorController(ModelFornecedor pModelFornecedor){
        return this.daoFornecedor.atualizarFornecedorDAO(pModelFornecedor);
    }

    /**
    * exclui Fornecedor
    * @param pId
    * @return boolean
    */
    public boolean excluirFornecedorController(int pId){
        return this.daoFornecedor.excluirFornecedorDAO(pId);
    }
}