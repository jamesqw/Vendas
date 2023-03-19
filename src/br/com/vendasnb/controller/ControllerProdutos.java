/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.vendasnb.controller;

import br.com.vendasnb.dao.DaoProdutos;
import br.com.vendasnb.model.ModelProdutos;
import java.util.ArrayList;

/**
 *
 * @author Nicolas
 */
public class ControllerProdutos {
    

    private DaoProdutos daoProdutos = new DaoProdutos();
    
    /***
     * Salvar Produtos
     * @param pModelProdutos
     * @return int
     */
    public int salvarProdutosController(ModelProdutos pModelProdutos){
        return this.daoProdutos.salvarProdutosDAO(pModelProdutos);
    }
    
    /***
     * Excluir um produto pelo código
     * @param pCodigo
     * @return booleran
     */
    public boolean excluirProdutoController(int pCodigo) {
        return this.daoProdutos.excluirProdutoDAO(pCodigo);
    }
    
    /***
     * Alterar produto
     * @param pModelProdutos
     * @return boolean
     */
    public boolean alterarProdutoController(ModelProdutos pModelProdutos){
        return this.daoProdutos.alteraProdutoDAO(pModelProdutos);
    }
    
    /***
     * Retorna produto pelo código
     * @param pCodigo
     * @return 
     */
    
    public ModelProdutos retornaProdutoController(int pCodigo){
        return this.daoProdutos.retornarProdutoDAO(pCodigo);
    }
    
    /***
     * Retorna produto pelo código
     * @param pNome
     * @return 
     */
    
    public ModelProdutos retornaProdutoController(String pNome){
        return this.daoProdutos.retornarProdutoDAO(pNome);
    }
    
    /***
     * Retorna uma lista de produtos
     * @return ArrayListModelProdutos
     */
    public ArrayList<ModelProdutos> retornaListaProdutoController(){
        return this.daoProdutos.retornarListaProdutosDAO();
    }
    
    /***
     * altera lista de produtos no banco
     * @param plistaModelProdutos
     * @return 
     */

    public boolean alterarEstoqueProdutoController(ArrayList<ModelProdutos> plistaModelProdutos) {
        return this.daoProdutos.alterarEstoqueProdutosDAO(plistaModelProdutos);
    }
    
}
