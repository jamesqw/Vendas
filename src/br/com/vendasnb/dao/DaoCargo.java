/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.vendasnb.dao;

import br.com.vendasnb.conexoes.ConexaoMysql;
import br.com.vendasnb.model.ModelCargo;
import java.util.ArrayList;

/**
 *
 * @author Nicolas
 */
public class DaoCargo extends ConexaoMysql {
    
    /***
     * Salvar cargo na tabela
     * @param pModelCargo
     * @return int
     */

    public int salvarCargoDAO(ModelCargo pModelCargo) {
        try {
            this.conectar();
            return this.insertSQL(
                "INSERT INTO cargo ("
                    + "id,"
                    + "descricao,"
                    + "salario"
                + ") VALUES ("
                    + "'" + pModelCargo.getIdCargo()+ "',"
                    + "'" + pModelCargo.getDescricao()+ "',"
                    + "'" + pModelCargo.getSalario()+ "'"
                + ");"
            );
        }catch (Exception e) {
            e.printStackTrace();
            return 0;
        } finally {
            this.fecharConexao();
        }
    }
    
    /***
     * Apagando cargo do banco
     * @param pIdCargo
     * @return boolean
     */
    
    public boolean excluirCargoDAO(int pIdCargo){
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL("DELETE FROM cargo WHERE id= '" + pIdCargo + "';");
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        } finally {
            this.fecharConexao();
        }
    }
    
    /***
     * Alterando cargo no banco 
     * @param pModelCargo
     * @return 
     */
    
    public boolean alterarCargoDAO(ModelCargo pModelCargo){
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL("UPDATE cargo SET "
                    + "descricao ='" + pModelCargo.getDescricao() + "',"
                    + "salario ='" + pModelCargo.getSalario() + "'"
                    + " WHERE id= '" + pModelCargo.getIdCargo() + "'");
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        } finally {
            this.fecharConexao();
        }
    }
    /***
     * Retornar um produto pelo codigo
     * @param pIdCargo
     * @return ModelCargo
     */
    
    public ModelCargo retornaCargoDAO(int pIdCargo){
        ModelCargo modelCargo = new ModelCargo();
        try {
            this.conectar();
            this.executarSQL("SELECT * FROM cargo WHERE id ='" + pIdCargo + "';");
            
            while(this.getResultSet().next()){
                modelCargo.setIdCargo(this.getResultSet().getInt(1));
                modelCargo.setDescricao(this.getResultSet().getString(2));
                modelCargo.setSalario(this.getResultSet().getDouble(3));
            }
        } catch (Exception e) {
        e.printStackTrace();
        } finally {
            this.fecharConexao();
        }
        return modelCargo;
    }
    
    public ArrayList<ModelCargo> retonarListaCargo(){
        ArrayList<ModelCargo> listaModelCargo = new ArrayList<>();
        ModelCargo modelCargo = new ModelCargo();
        
        try {
            this.conectar();
            this.executarSQL("SELECT * FROM cargo;");
            while(this.getResultSet().next()){
                modelCargo = new ModelCargo();
                modelCargo.setIdCargo(this.getResultSet().getInt(1));
                modelCargo.setDescricao(this.getResultSet().getString(2));
                modelCargo.setSalario(this.getResultSet().getDouble(3));
                listaModelCargo.add(modelCargo);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.fecharConexao();
        }
        return listaModelCargo;
    }
    
    

}
