package br.com.vendasnb.dao;

import br.com.vendasnb.model.ModelUsuario;
import br.com.vendasnb.conexoes.ConexaoMysql;
import br.com.vendasnb.model.ModelCargo;
import java.util.ArrayList;
/**
*
* @author Nicolas bueno
*/
public class DAOUsuario extends ConexaoMysql {
    
    /**
    * grava Usuario
    * @param pModelUsuario
    * @return int
    */
    public int salvarUsuarioDAO(ModelUsuario pModelUsuario){
        try {
            this.conectar();
            return this.insertSQL(
                "INSERT INTO usuario ("
                    + "id,"
                    + "nome,"
                    + "cpf,"
                    + "telefone,"
                    + "login,"
                    + "senha,"
                    + "cargo_id"
                + ") VALUES ("
                    + "'" + pModelUsuario.getIdUsuario() + "',"
                    + "'" + pModelUsuario.getNomeUsuario() + "',"
                    + "'" + pModelUsuario.getCpf() + "',"
                    + "'" + pModelUsuario.getTelefone() + "',"
                    + "'" + pModelUsuario.getLogin() + "',"
                    + "'" + pModelUsuario.getSenha() + "',"
                    + "'" + pModelUsuario.getCargoId() + "'"
                + ");"
            );
        }catch(Exception e){
            e.printStackTrace();
            return 0;
        }finally{
            this.fecharConexao();
        }
    }

    /**
    * recupera Usuario
    * @param pIdUsuario
    * @return ModelUsuario
    */
    public ModelUsuario getUsuarioDAO(int pIdUsuario){
        ModelUsuario modelUsuario = new ModelUsuario();
        try {
            this.conectar();
            this.executarSQL(
                "SELECT "
                    + "id,"
                    + "nome,"
                    + "cpf,"
                    + "telefone,"
                    + "login,"
                    + "senha,"
                    + "cargo_id"
                 + " FROM"
                     + " usuario"
                 + " WHERE"
                     + " id = '" + pIdUsuario + "'"
                + ";"
            );

            while(this.getResultSet().next()){
                modelUsuario.setIdUsuario(this.getResultSet().getInt(1));
                modelUsuario.setNomeUsuario(this.getResultSet().getString(2));
                modelUsuario.setCpf(this.getResultSet().getString(3));
                modelUsuario.setTelefone(this.getResultSet().getString(4));
                modelUsuario.setLogin(this.getResultSet().getString(5));
                modelUsuario.setSenha(this.getResultSet().getString(6));
                modelUsuario.setCargoId(this.getResultSet().getInt(7));
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            this.fecharConexao();
        }
        return modelUsuario;
    }
    
    /**
    * recupera login
    * @param pLogin
    * @return ModelUsuario
    */
    public ModelUsuario getUsuarioLoginDAO(String pLogin){
        ModelUsuario modelUsuario = new ModelUsuario();
        try {
            this.conectar();
            this.executarSQL(
                "SELECT "
                    + "id,"
                    + "nome,"
                    + "cpf,"
                    + "telefone,"
                    + "login,"
                    + "senha,"
                    + "cargo_id"
                 + " FROM"
                     + " usuario"
                 + " WHERE"
                     + " login = '" + pLogin + "'"
                + ";"
            );

            while(this.getResultSet().next()){
                modelUsuario.setIdUsuario(this.getResultSet().getInt(1));
                modelUsuario.setNomeUsuario(this.getResultSet().getString(2));
                modelUsuario.setCpf(this.getResultSet().getString(3));
                modelUsuario.setTelefone(this.getResultSet().getString(4));
                modelUsuario.setLogin(this.getResultSet().getString(5));
                modelUsuario.setSenha(this.getResultSet().getString(6));
                modelUsuario.setCargoId(this.getResultSet().getInt(7));
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            this.fecharConexao();
        }
        return modelUsuario;
    }
    
    /**
    * recupera Usuario
    * @param pNomeUsuario
    * @return ModelUsuario
    */
    public ModelUsuario getUsuarioDAO(String pNomeUsuario){
        ModelUsuario modelUsuario = new ModelUsuario();
        try {
            this.conectar();
            this.executarSQL(
                "SELECT *"
                 + " FROM"
                     + " usuario"
                 + " WHERE"
                     + " nome = '" + pNomeUsuario + "';"
            );

            while(this.getResultSet().next()){
                modelUsuario.setIdUsuario(this.getResultSet().getInt(1));
                modelUsuario.setNomeUsuario(this.getResultSet().getString(2));
                modelUsuario.setCpf(this.getResultSet().getString(3));
                modelUsuario.setTelefone(this.getResultSet().getString(4));
                modelUsuario.setLogin(this.getResultSet().getString(5));
                modelUsuario.setSenha(this.getResultSet().getString(6));
                modelUsuario.setCargoId(this.getResultSet().getInt(7));
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            this.fecharConexao();
        }
        return modelUsuario;
    }

    /**
    * recupera uma lista de Usuario
        * @return ArrayList
    */
    public ArrayList<ModelUsuario> getListaUsuarioDAO(){
        ArrayList<ModelUsuario> listamodelUsuario = new ArrayList();
        ModelUsuario modelUsuario = new ModelUsuario();
        ModelCargo modelCargo = new ModelCargo();
        try {
            this.conectar();
            this.executarSQL(
                "SELECT "
                    + "U.id,"
                    + "U.nome,"
                    + "U.cpf,"
                    + "U.telefone,"
                    + "U.login,"
                    + "U.senha,"
                   // + "U.cargo_id,"
                        + "cargo.descricao"
                 + " FROM"
                     + " cargo JOIN usuario U ON(cargo.id = U.cargo_id)"
                + ";"
            );

            while(this.getResultSet().next()){
                modelUsuario = new ModelUsuario();
                modelCargo = new ModelCargo();
                modelUsuario.setIdUsuario(this.getResultSet().getInt(1));
                modelUsuario.setNomeUsuario(this.getResultSet().getString(2));
                modelUsuario.setCpf(this.getResultSet().getString(3));
                modelUsuario.setTelefone(this.getResultSet().getString(4));
                modelUsuario.setLogin(this.getResultSet().getString(5));
                modelUsuario.setSenha(this.getResultSet().getString(6));
                //modelUsuario.setCargoId(this.getResultSet().getInt(7));
                modelCargo.setDescricao(this.getResultSet().getString(7));
                
                modelUsuario.setModelCargo(modelCargo);
                listamodelUsuario.add(modelUsuario);
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            this.fecharConexao();
        }
        return listamodelUsuario;
    }

    /**
    * atualiza Usuario
    * @param pModelUsuario
    * @return boolean
    */
    public boolean atualizarUsuarioDAO(ModelUsuario pModelUsuario){
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                "UPDATE usuario SET "
                    + "id = '" + pModelUsuario.getIdUsuario() + "',"
                    + "nome = '" + pModelUsuario.getNomeUsuario() + "',"
                    + "cpf = '" + pModelUsuario.getCpf() + "',"
                    + "telefone = '" + pModelUsuario.getTelefone() + "',"
                    + "login = '" + pModelUsuario.getLogin() + "',"
                    + "senha = '" + pModelUsuario.getSenha() + "',"
                    + "cargo_id = '" + pModelUsuario.getCargoId() + "'"
                + " WHERE "
                    + "id = '" + pModelUsuario.getIdUsuario() + "'"
                + ";"
            );
        }catch(Exception e){
            e.printStackTrace();
            return false;
        }finally{
            this.fecharConexao();
        }
    }

    /**
    * exclui Usuario
    * @param pIdUsuario
    * @return boolean
    */
    public boolean excluirUsuarioDAO(int pIdUsuario){
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                "DELETE FROM usuario "
                + " WHERE "
                    + "id= '" + pIdUsuario + "'"
                + ";"
            );
        }catch(Exception e){
            e.printStackTrace();
            return false;
        }finally{
            this.fecharConexao();
        }
    }
    
    /***
     * Validar usuario
     * @param pModelUsuario
     * @return 
     */

    public boolean getValidarUsuarioDao(ModelUsuario pModelUsuario) {
        try {
            this.conectar();
            this.executarSQL(
                "SELECT "
                    + "id,"
                    + "nome,"
                    + "cpf,"
                    + "telefone,"
                    + "login,"
                    + "senha,"
                    + "cargo_id"
                 + " FROM"
                     + " usuario"
                 + " WHERE"
                     + " login = '" + pModelUsuario.getLogin() + "' AND senha = '" + pModelUsuario.getSenha() + "'"
                + ";"
            );
            
            if (getResultSet().next()) {
                return true;
            } else {
                return false;
            }
        }catch(Exception e){
            e.printStackTrace();
            return false;
        }finally{
            this.fecharConexao();
        }
    }
}