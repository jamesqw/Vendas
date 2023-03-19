package br.com.vendasnb.model;
/**
*
* @author Nicolas
*/
public class ModelVendasProdutos {

    private int id;
    private int quantidade;
    private Double valorUnitario;
    private int vendaId;
    private int produtoId;

    /**
    * Construtor
    */
    public ModelVendasProdutos(){}

    /**
    * seta o valor de id
    * @param pId
    */
    public void setId(int pId){
        this.id = pId;
    }
    /**
    * @return id
    */
    public int getId(){
        return this.id;
    }

    /**
    * seta o valor de quantidade
    * @param pQuantidade
    */
    public void setQuantidade(int pQuantidade){
        this.quantidade = pQuantidade;
    }
    /**
    * @return quantidade
    */
    public int getQuantidade(){
        return this.quantidade;
    }

    /**
    * seta o valor de valorUnitario
    * @param pValorUnitario
    */
    public void setValorUnitario(Double pValorUnitario){
        this.valorUnitario = pValorUnitario;
    }
    /**
    * @return valorUnitario
    */
    public Double getValorUnitario(){
        return this.valorUnitario;
    }

    /**
    * seta o valor de vendaId
    * @param pVendaId
    */
    public void setVendaId(int pVendaId){
        this.vendaId = pVendaId;
    }
    /**
    * @return vendaId
    */
    public int getVendaId(){
        return this.vendaId;
    }

    /**
    * seta o valor de produtoId
    * @param pProdutoId
    */
    public void setProdutoId(int pProdutoId){
        this.produtoId = pProdutoId;
    }
    /**
    * @return produtoId
    */
    public int getProdutoId(){
        return this.produtoId;
    }

    @Override
    public String toString(){
        return "ModelVendasProdutos {" + "::id = " + this.id + "::quantidade = " + this.quantidade + "::valorUnitario = " + this.valorUnitario + "::vendaId = " + this.vendaId + "::produtoId = " + this.produtoId +  "}";
    }
}