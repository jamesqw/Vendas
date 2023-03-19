/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.vendasnb.model;

import java.util.Date;


/**
 *
 * @author Nicolas
 */
public class ModelVenda {
    
    private int idVenda;
    private Date dataVenda;
    private Double valorLiquido;
    private Double valorBruto;
    private Double desconto;
    private int usuarioId;

    /**
     * @return the idVenda
     */
    public int getIdVenda() {
        return idVenda;
    }

    /**
     * @param idVenda the idVenda to set
     */
    public void setIdVenda(int idVenda) {
        this.idVenda = idVenda;
    }

    /**
     * @return the dataVenda
     */
    public Date getDataVenda() {
        return dataVenda;
    }

    /**
     * @param dataVenda the dataVenda to set
     */
    public void setDataVenda(Date dataVenda) {
        this.dataVenda = dataVenda;
    }

    /**
     * @return the valorLiquido
     */
    public Double getValorLiquido() {
        return valorLiquido;
    }

    /**
     * @param valorLiquido the valorLiquido to set
     */
    public void setValorLiquido(Double valorLiquido) {
        this.valorLiquido = valorLiquido;
    }

    /**
     * @return the valorBruto
     */
    public Double getValorBruto() {
        return valorBruto;
    }

    /**
     * @param valorBruto the valorBruto to set
     */
    public void setValorBruto(Double valorBruto) {
        this.valorBruto = valorBruto;
    }

    /**
     * @return the desconto
     */
    public Double getDesconto() {
        return desconto;
    }

    /**
     * @param desconto the desconto to set
     */
    public void setDesconto(Double desconto) {
        this.desconto = desconto;
    }

    /**
     * @return the usuarioId
     */
    public int getUsuarioId() {
        return usuarioId;
    }

    /**
     * @param usuarioId the usuarioId to set
     */
    public void setUsuarioId(int usuarioId) {
        this.usuarioId = usuarioId;
    }
    
    
    
    
}
