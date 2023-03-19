/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.vendasnb.model;


/**
 *
 * @author Nicolas
 */
public class ModelProdutos {
    
    private int idProduto;
    private String nome;
    private int estoque;
    private Double valorVenda;
    private Double valorCompra;
    private int fornecedor;

    /**
     * @return the idProduto
     */
    public int getIdProduto() {
        return idProduto;
    }

    /**
     * @param idProduto the idProduto to set
     */
    public void setIdProduto(int idProduto) {
        this.idProduto = idProduto;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the estoque
     */
    public int getEstoque() {
        return estoque;
    }

    /**
     * @param estoque the estoque to set
     */
    public void setEstoque(int estoque) {
        this.estoque = estoque;
    }

    /**
     * @return the valorVenda
     */
    public Double getValor() {
        return getValorVenda();
    }

    /**
     * @param valor the valorVenda to set
     */
    public void setValor(Double valor) {
        this.setValorVenda(valor);
    }

    /**
     * @return the valorCompra
     */
    public Double getValorCompra() {
        return valorCompra;
    }

    /**
     * @param valorCompra the valorCompra to set
     */
    public void setValorCompra(Double valorCompra) {
        this.valorCompra = valorCompra;
    }

    /**
     * @return the fornecedor
     */
    public int getFornecedor() {
        return fornecedor;
    }

    /**
     * @param fornecedor the fornecedor to set
     */
    public void setFornecedor(int fornecedor) {
        this.fornecedor = fornecedor;
    }

    /**
     * @return the valorVenda
     */
    public Double getValorVenda() {
        return valorVenda;
    }

    /**
     * @param valorVenda the valorVenda to set
     */
    public void setValorVenda(Double valorVenda) {
        this.valorVenda = valorVenda;
    }
}
