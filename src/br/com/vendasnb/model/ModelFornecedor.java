package br.com.vendasnb.model;
/**
*
* @author nicolas bueno
*/
public class ModelFornecedor {

    private int id;
    private String nome;
    private String fone;

    /**
    * Construtor
    */
    public ModelFornecedor(){}

    /**
    * seta o valor de id
    * @param pId
    */
    public void setId(int pId){
        this.id = pId;
    }
    /**
    * @return pk_id
    */
    public int getId(){
        return this.id;
    }

    /**
    * seta o valor de nome
    * @param pNome
    */
    public void setNome(String pNome){
        this.nome = pNome;
    }
    /**
    * @return nome
    */
    public String getNome(){
        return this.nome;
    }

    /**
    * seta o valor de fone
    * @param pFone
    */
    public void setFone(String pFone){
        this.fone = pFone;
    }
    /**
    * @return fone
    */
    public String getFone(){
        return this.fone;
    }

    @Override
    public String toString(){
        return "ModelFornecedor {" + "::id = " + this.id + "::nome = " + this.nome + "::fone = " + this.fone +  "}";
    }
}