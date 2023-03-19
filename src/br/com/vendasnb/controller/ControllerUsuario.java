package br.com.vendasnb.controller;

import br.com.vendasnb.model.ModelUsuario;
import br.com.vendasnb.dao.DAOUsuario;
import java.util.ArrayList;

/**
*
* @author Nicolas bueno
*/
public class ControllerUsuario {

    private DAOUsuario daoUsuario = new DAOUsuario();

    /**
    * grava Usuario
    * @param pModelUsuario
    * @return int
    */
    public int salvarUsuarioController(ModelUsuario pModelUsuario){
        return this.daoUsuario.salvarUsuarioDAO(pModelUsuario);
    }

    /**
    * recupera Usuario
    * @param pIdUsuario
    * @return ModelUsuario
    */
    public ModelUsuario getUsuarioController(int pIdUsuario){
        return this.daoUsuario.getUsuarioDAO(pIdUsuario);
    }
    
    /**
    * recupera Usuario
    * @param pNomeUsuario
    * @return ModelUsuario
    */
    public ModelUsuario getUsuarioController(String pNomeUsuario){
        return this.daoUsuario.getUsuarioDAO(pNomeUsuario);
    }

    /**
    * recupera uma lista deUsuario
    * @param pIdUsuario
    * @return ArrayList
    */
    public ArrayList<ModelUsuario> getListaUsuarioController(){
        return this.daoUsuario.getListaUsuarioDAO();
    }

    /**
    * atualiza Usuario
    * @param pModelUsuario
    * @return boolean
    */
    public boolean atualizarUsuarioController(ModelUsuario pModelUsuario){
        return this.daoUsuario.atualizarUsuarioDAO(pModelUsuario);
    }

    /**
    * exclui Usuario
    * @param pIdUsuario
    * @return boolean
    */
    public boolean excluirUsuarioController(int pIdUsuario){
        return this.daoUsuario.excluirUsuarioDAO(pIdUsuario);
    }

    /***
     * Validar login e senha
     * @param pModelUsuario
     * @return 
     */
    public boolean getValidarUsuarioController(ModelUsuario pModelUsuario) {
        return this.daoUsuario.getValidarUsuarioDao(pModelUsuario);
    }

    public ModelUsuario getUsuarioLoginController(String pLogin) {
        return this.daoUsuario.getUsuarioLoginDAO(pLogin);
    }
}