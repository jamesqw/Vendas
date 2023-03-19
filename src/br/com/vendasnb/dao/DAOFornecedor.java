package br.com.vendasnb.dao;

import br.com.vendasnb.model.ModelFornecedor;
import br.com.vendasnb.conexoes.ConexaoMysql;
import java.util.ArrayList;
/**
*
* @author nicolas bueno
*/
public class DAOFornecedor extends ConexaoMysql {

    /**
    * grava Fornecedor
    * @param pModelFornecedor
    * @return int
    */
    public int salvarFornecedorDAO(ModelFornecedor pModelFornecedor){
        try {
            this.conectar();
            return this.insertSQL(
                "INSERT INTO fornecedor ("
                    + "id,"
                    + "nome,"
                    + "fone"
                + ") VALUES ("
                    + "'" + pModelFornecedor.getId() + "',"
                    + "'" + pModelFornecedor.getNome() + "',"
                    + "'" + pModelFornecedor.getFone() + "'"
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
    * recupera Fornecedor
    * @param pId
    * @return ModelFornecedor
    */
    public ModelFornecedor getFornecedorDAO(int pId){
        ModelFornecedor modelFornecedor = new ModelFornecedor();
        try {
            this.conectar();
            this.executarSQL(
                "SELECT "
                    + "id,"
                    + "nome,"
                    + "fone"
                 + " FROM"
                     + " fornecedor"
                 + " WHERE"
                     + " id = '" + pId + "'"
                + ";"
            );

            while(this.getResultSet().next()){
                modelFornecedor.setId(this.getResultSet().getInt(1));
                modelFornecedor.setNome(this.getResultSet().getString(2));
                modelFornecedor.setFone(this.getResultSet().getString(3));
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            this.fecharConexao();
        }
        return modelFornecedor;
    }

    /**
    * recupera uma lista de Fornecedor
        * @return ArrayList
    */
    public ArrayList<ModelFornecedor> getListaFornecedorDAO(){
        ArrayList<ModelFornecedor> listamodelFornecedor = new ArrayList();
        ModelFornecedor modelFornecedor = new ModelFornecedor();
        try {
            this.conectar();
            this.executarSQL(
                "SELECT "
                    + "id,"
                    + "nome,"
                    + "fone"
                    + " FROM"
                    + " fornecedor"
                + ";"
            );

            while(this.getResultSet().next()){
                modelFornecedor = new ModelFornecedor();
                modelFornecedor.setId(this.getResultSet().getInt(1));
                modelFornecedor.setNome(this.getResultSet().getString(2));
                modelFornecedor.setFone(this.getResultSet().getString(3));
                listamodelFornecedor.add(modelFornecedor);
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            this.fecharConexao();
        }
        return listamodelFornecedor;
    }

    /**
    * atualiza Fornecedor
    * @param pModelFornecedor
    * @return boolean
    */
    public boolean atualizarFornecedorDAO(ModelFornecedor pModelFornecedor){
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                "UPDATE fornecedor SET "
                    + "id = '" + pModelFornecedor.getId() + "',"
                    + "nome = '" + pModelFornecedor.getNome() + "',"
                    + "fone = '" + pModelFornecedor.getFone() + "'"
                + " WHERE "
                    + "id = '" + pModelFornecedor.getId() + "'"
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
    * exclui Fornecedor
    * @param pId
    * @return boolean
    */
    public boolean excluirFornecedorDAO(int pId){
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                "DELETE FROM fornecedor "
                + " WHERE "
                    + "id = '" + pId + "'"
                + ";"
            );
        }catch(Exception e){
            e.printStackTrace();
            return false;
        }finally{
            this.fecharConexao();
        }
    }
}