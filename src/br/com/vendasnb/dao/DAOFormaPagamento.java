package br.com.vendasnb.dao;

import br.com.vendasnb.conexoes.ConexaoMysql;
import br.com.vendasnb.model.ModelFormaPagamento;
import java.util.ArrayList;
/**
*
* @author Nicolas
*/
public class DAOFormaPagamento extends ConexaoMysql {

    /**
    * grava FormaPagamento
    * @param pModelFormaPagamento
    * @return int
    */
    public int salvarFormaPagamentoDAO(ModelFormaPagamento pModelFormaPagamento){
        try {
            this.conectar();
            return this.insertSQL(
                "INSERT INTO forma_pagamentos ("
                    + "id,"
                    + "descricao,"
                    + "desconto,"
                    + "parcelas,"
                    + "situacao"
                + ") VALUES ("
                    + "'" + pModelFormaPagamento.getIdForPag() + "',"
                    + "'" + pModelFormaPagamento.getDescricaoForPag() + "',"
                    + "'" + pModelFormaPagamento.getDescontoForPag() + "',"
                    + "'" + pModelFormaPagamento.getParcelasForPag() + "',"
                    + "'" + pModelFormaPagamento.getSituacaoForPag() + "'"
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
    * recupera FormaPagamento
    * @param pIdForPag
    * @return ModelFormaPagamento
    */
    public ModelFormaPagamento getFormaPagamentoDAO(int pIdForPag){
        ModelFormaPagamento modelFormaPagamento = new ModelFormaPagamento();
        try {
            this.conectar();
            this.executarSQL(
                "SELECT "
                    + "id,"
                    + "descricao,"
                    + "desconto,"
                    + "parcelas,"
                    + "situacao"
                 + " FROM"
                     + " forma_pagamentos"
                 + " WHERE"
                     + " id = '" + pIdForPag + "'"
                + ";"
            );

            while(this.getResultSet().next()){
                modelFormaPagamento.setIdForPag(this.getResultSet().getInt(1));
                modelFormaPagamento.setDescricaoForPag(this.getResultSet().getString(2));
                modelFormaPagamento.setDescontoForPag(this.getResultSet().getFloat(3));
                modelFormaPagamento.setParcelasForPag(this.getResultSet().getInt(4));
                modelFormaPagamento.setSituacaoForPag(this.getResultSet().getInt(5));
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            this.fecharConexao();
        }
        return modelFormaPagamento;
    }

    /**
    * recupera uma lista de FormaPagamento
        * @return ArrayList
    */
    public ArrayList<ModelFormaPagamento> getListaFormaPagamentoDAO(){
        ArrayList<ModelFormaPagamento> listamodelFormaPagamento = new ArrayList();
        ModelFormaPagamento modelFormaPagamento = new ModelFormaPagamento();
        try {
            this.conectar();
            this.executarSQL(
                "SELECT "
                    + "id,"
                    + "descricao,"
                    + "desconto,"
                    + "parcelas,"
                    + "situacao"
                 + " FROM"
                     + " forma_pagamentos"
                + ";"
            );

            while(this.getResultSet().next()){
                modelFormaPagamento = new ModelFormaPagamento();
                modelFormaPagamento.setIdForPag(this.getResultSet().getInt(1));
                modelFormaPagamento.setDescricaoForPag(this.getResultSet().getString(2));
                modelFormaPagamento.setDescontoForPag(this.getResultSet().getFloat(3));
                modelFormaPagamento.setParcelasForPag(this.getResultSet().getInt(4));
                modelFormaPagamento.setSituacaoForPag(this.getResultSet().getInt(5));
                listamodelFormaPagamento.add(modelFormaPagamento);
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            this.fecharConexao();
        }
        return listamodelFormaPagamento;
    }

    /**
    * atualiza FormaPagamento
    * @param pModelFormaPagamento
    * @return boolean
    */
    public boolean atualizarFormaPagamentoDAO(ModelFormaPagamento pModelFormaPagamento){
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                "UPDATE forma_pagamentos SET "
                    + "id = '" + pModelFormaPagamento.getIdForPag() + "',"
                    + "descricao = '" + pModelFormaPagamento.getDescricaoForPag() + "',"
                    + "desconto = '" + pModelFormaPagamento.getDescontoForPag() + "',"
                    + "parcelas = '" + pModelFormaPagamento.getParcelasForPag() + "',"
                    + "situacao = '" + pModelFormaPagamento.getSituacaoForPag() + "'"
                + " WHERE "
                    + "id = '" + pModelFormaPagamento.getIdForPag() + "'"
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
    * exclui FormaPagamento
    * @param pIdForPag
    * @return boolean
    */
    public boolean excluirFormaPagamentoDAO(int pIdForPag){
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                "DELETE FROM forma_pagamentos "
                + " WHERE "
                    + "id = '" + pIdForPag + "'"
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