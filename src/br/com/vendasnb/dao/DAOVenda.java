/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.vendasnb.dao;

import br.com.vendasnb.conexoes.ConexaoMysql;
import br.com.vendasnb.model.ModelVenda;
import br.com.vendasnb.util.Datas;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Nicolas
 */
public class DAOVenda extends ConexaoMysql {
    
    /***
     * Salvar no banco de dados
     * @param pModelVenda
     * @return int
     */

    public int salvarVendasDAO(ModelVenda pModelVenda) {
        try {
            this.conectar();
            return this.insertSQL(
                    "INSERT INTO venda( "
                    + "id, "
                    + "data_venda, "
                    + "valor_liquido, "
                    + "valor_bruto, "
                    + "desconto, "
                    + "usuario_id )"
                    + " VALUES ("
                    + "'" + pModelVenda.getIdVenda() + "', "
                    + "'" + pModelVenda.getDataVenda() + "', "
                    + "'" + pModelVenda.getValorLiquido() + "', "
                    + "'" + pModelVenda.getValorBruto() + "', "
                    + "'" + pModelVenda.getDesconto() + "', "
                    + "'" + pModelVenda.getUsuarioId() + "');"
            );
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        } finally {
            this.fecharConexao();
        }
    }
    
    /***
     * Excluir venda do banco de dados
     * @param pCodigoVenda
     * @return boolean
     */

    public boolean excluirVendaDAO(int pCodigoVenda){
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL("DELETE FROM venda WHERE id = '" +pCodigoVenda + "';");
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        } finally {
            this.fecharConexao();
        }
    }
    /***
     * Alterar as vendas no banco de dados
     * @param pModelVenda
     * @return bollean
     */
    
    public boolean alterarVendaDAO(ModelVenda pModelVenda){
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL("UPDATE venda SET "
                    + "data_venda = '" + pModelVenda.getDataVenda() + "',"
                    + "valor_liquido = '" + pModelVenda.getValorLiquido() + "',"
                    + "valor_bruto = '"+ pModelVenda.getValorBruto() + "',"
                    + "desconto = '" + pModelVenda.getDesconto() + "',"
                    + "usuario_id= '" + pModelVenda.getUsuarioId() + "'"
                    + " WHERE id= '" + pModelVenda.getIdVenda() + "'");
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        } finally {
            this.fecharConexao();
        }
    }
    
    /***
     * Retornar as vendas
     * @param pCodigo
     * @return ModelVendas
     */
    
    public ModelVenda retornarVendaDAO(int pCodigo){
        ModelVenda modelVenda = new ModelVenda();
        try {
            this.conectar();
            this.executarSQL("SELECT * FROM venda WHERE id= '" + pCodigo + "'");
            while(this.getResultSet().next()){
                modelVenda.setIdVenda(this.getResultSet().getInt(1));
                modelVenda.setDataVenda(this.getResultSet().getDate(2));
                modelVenda.setValorLiquido(this.getResultSet().getDouble(3));
                modelVenda.setDesconto(this.getResultSet().getDouble(4));
                modelVenda.setUsuarioId(this.getResultSet().getInt(5));
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.fecharConexao();
        }
        return modelVenda;
    }
    
    /***
     * Retorna uma lista de venda
     * @return listaModelVenda
     */
    public ArrayList<ModelVenda> retornaListaVendas(){
        ModelVenda modelVenda = new ModelVenda();
        ArrayList<ModelVenda> listaModelVenda = new ArrayList<>();
        try {
            this.conectar();
            this.executarSQL("SELECT * FROM venda;");
            while(this.getResultSet().next()){
                modelVenda.setIdVenda(this.getResultSet().getInt(1));
                modelVenda.setDataVenda(this.getResultSet().getDate(2));
                modelVenda.setValorLiquido(this.getResultSet().getDouble(3));
                modelVenda.setValorBruto(this.getResultSet().getDouble(4));
                modelVenda.setDesconto(this.getResultSet().getDouble(5));
                modelVenda.setUsuarioId(this.getResultSet().getInt(6));
                listaModelVenda.add(modelVenda);
            }   
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.fecharConexao();
        }
        return listaModelVenda;
    } 
    
    public Double totalVendasDia(Date pDate){
        Double total = null;
        try {
            this.conectar();
            this.executarSQL("SELECT SUM(valor_liquido) FROM venda WHERE data_venda = '" + pDate +"';");
            while(this.getResultSet().next()){
                total = this.getResultSet().getDouble(1);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.fecharConexao();
        }
        return total;
    }
    
    public Double totalVendasMes(String pInicio, String pFinal){
        Double total = null;
        try {
            this.conectar();
            this.executarSQL("SELECT SUM(valor_liquido) FROM venda WHERE data_venda BETWEEN '" + pInicio +"' AND '" + pFinal + "';");
            while(this.getResultSet().next()){
                total = this.getResultSet().getDouble(1);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.fecharConexao();
        }
        return total;
    }
}
