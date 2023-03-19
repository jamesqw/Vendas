package br.com.vendasnb.model;
/**
*
* @author Nicolas bueno
*/
public class ModelUsuario {

    private int idUsuario;
    private String nomeUsuario;
    private String cpf;
    private String telefone;
    private String login;
    private String senha;
    private int cargoId;
    private ModelCargo modelCargo;

    /**
    * Construtor
    */
    public ModelUsuario(){}

    /**
    * seta o valor de idUsuario
    * @param pIdUsuario
    */
    public void setIdUsuario(int pIdUsuario){
        this.idUsuario = pIdUsuario;
    }
    /**
    * @return idUsuario
    */
    public int getIdUsuario(){
        return this.idUsuario;
    }

    /**
    * seta o valor de nomeUsuario
    * @param pNomeUsuario
    */
    public void setNomeUsuario(String pNomeUsuario){
        this.nomeUsuario = pNomeUsuario;
    }
    /**
    * @return nomeUsuario
    */
    public String getNomeUsuario(){
        return this.nomeUsuario;
    }

    /**
    * seta o valor de cpf
    * @param pCpf
    */
    public void setCpf(String pCpf){
        this.cpf = pCpf;
    }
    /**
    * @return cpf
    */
    public String getCpf(){
        return this.cpf;
    }

    /**
    * seta o valor de telefone
    * @param pTelefone
    */
    public void setTelefone(String pTelefone){
        this.telefone = pTelefone;
    }
    /**
    * @return telefone
    */
    public String getTelefone(){
        return this.telefone;
    }

    /**
    * seta o valor de login
    * @param pLogin
    */
    public void setLogin(String pLogin){
        this.login = pLogin;
    }
    /**
    * @return login
    */
    public String getLogin(){
        return this.login;
    }

    /**
    * seta o valor de senha
    * @param pSenha
    */
    public void setSenha(String pSenha){
        this.senha = pSenha;
    }
    /**
    * @return senha
    */
    public String getSenha(){
        return this.senha;
    }

    /**
    * seta o valor de cargoId
    * @param pCargoId
    */
    public void setCargoId(int pCargoId){
        this.cargoId = pCargoId;
    }
    /**
    * @return cargoId
    */
    public int getCargoId(){
        return this.cargoId;
    }

    @Override
    public String toString(){
        return "ModelUsuario {" + "::idUsuario = " + this.getIdUsuario() + "::nomeUsuario = " + this.getNomeUsuario() + "::cpf = " + this.getCpf() + "::telefone = " + this.getTelefone() + "::login = " + this.getLogin() + "::senha = " + this.getSenha() + "::cargoId = " + this.getCargoId() +  "}";
    }

    /**
     * @return the modelCargo
     */
    public ModelCargo getModelCargo() {
        return modelCargo;
    }

    /**
     * @param modelCargo the modelCargo to set
     */
    public void setModelCargo(ModelCargo modelCargo) {
        this.modelCargo = modelCargo;
    }
}