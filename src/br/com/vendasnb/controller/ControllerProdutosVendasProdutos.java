/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.vendasnb.controller;

import br.com.vendasnb.dao.DAOProdutosVendasProdutos;
import br.com.vendasnb.model.ModelProdutosVendasProdutos;
import java.util.ArrayList;

/**
 *
 * @author Nicolas
 */
public class ControllerProdutosVendasProdutos {
    
    private DAOProdutosVendasProdutos  daoProdutosVendasProdutos = new DAOProdutosVendasProdutos();
    
     public ArrayList<ModelProdutosVendasProdutos> getListaProdutosVendasProdutosController(int pCodigoVenda){
        return this.daoProdutosVendasProdutos.getListaProdutosVendasProdutosDAO(pCodigoVenda);
    }
}
