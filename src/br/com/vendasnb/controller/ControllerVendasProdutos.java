package br.com.vendasnb.controller;

import br.com.vendasnb.model.ModelVendasProdutos;
import br.com.vendasnb.dao.DAOVendasProdutos;
import java.util.ArrayList;

/**
*
* @author Nicolas
*/
public class ControllerVendasProdutos {

    private DAOVendasProdutos daoVendasProdutos = new DAOVendasProdutos();

    /**
    * grava VendasProdutos
    * @param pModelVendasProdutos
    * @return int
    */
    public int salvarVendasProdutosController(ModelVendasProdutos pModelVendasProdutos){
        return this.daoVendasProdutos.salvarVendasProdutosDAO(pModelVendasProdutos);
    }

    /**
    * recupera VendasProdutos
    * @param pId
    * @return ModelVendasProdutos
    */
    public ModelVendasProdutos getVendasProdutosController(int pId){
        return this.daoVendasProdutos.getVendasProdutosDAO(pId);
    }

    /**
    * recupera uma lista deVendasProdutos
    * @param pId
    * @return ArrayList
    */
    public ArrayList<ModelVendasProdutos> getListaVendasProdutosController(){
        return this.daoVendasProdutos.getListaVendasProdutosDAO();
    }

    /**
    * atualiza VendasProdutos
    * @param pModelVendasProdutos
    * @return boolean
    */
    public boolean atualizarVendasProdutosController(ModelVendasProdutos pModelVendasProdutos){
        return this.daoVendasProdutos.atualizarVendasProdutosDAO(pModelVendasProdutos);
    }

    /**
    * exclui VendasProdutos
    * @param pId
    * @return boolean
    */
    public boolean excluirVendasProdutosController(int pId){
        return this.daoVendasProdutos.excluirVendasProdutosDAO(pId);
    }

    /***
     * Salva lista de produtos da venda
     * @param plistaModelVendasProdutos
     * @return 
     */
    public boolean salvarVendasProdutosController(ArrayList<ModelVendasProdutos> plistaModelVendasProdutos) {
       return this.daoVendasProdutos.salvarVendasProdutosDAO(plistaModelVendasProdutos);
    }
}