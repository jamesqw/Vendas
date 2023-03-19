/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.vendasnb.dao;

import br.com.vendasnb.conexoes.ConexaoMysql;
import br.com.vendasnb.model.ModelUsuario;
import br.com.vendasnb.model.ModelVenda;
import br.com.vendasnb.model.ModelVendasUsuario;
import java.util.ArrayList;

/**
 *
 * @author Nicolas
 */
public class DAOVendasUsuario extends ConexaoMysql{
    
    public ArrayList<ModelVendasUsuario> getListaVendasUsuarioDAO(){
        ArrayList<ModelVendasUsuario> listaModelVendasUsuario = new ArrayList<>();
        ModelVenda modelVenda = new ModelVenda();
        ModelUsuario modelUsuario = new ModelUsuario();
        ModelVendasUsuario modelVendasUsuario = new ModelVendasUsuario();
        try {
            this.conectar();
            this.executarSQL("SELECT "
                    + "venda.id,"
                    + "venda.data_venda,"
                    + "venda.valor_liquido,"
                    + "venda.valor_bruto,"
                    + "venda.desconto,"
                    + "venda.usuario_id,"
                    + "usuario.id,"
                    + "usuario.nome,"
                    + "usuario.cpf,"
                    + "usuario.telefone,"
                    + "usuario.login,"
                    + "usuario.senha,"
                    + "usuario.cargo_id"
                +" FROM "
                    + "venda JOIN usuario "
                    + "ON (usuario.id=venda.usuario_id);");
            
            while(this.getResultSet().next()){
                modelVenda = new ModelVenda();
                modelUsuario = new ModelUsuario();
                modelVendasUsuario = new ModelVendasUsuario();
                modelVenda.setIdVenda(this.getResultSet().getInt(1));
                modelVenda.setDataVenda(this.getResultSet().getDate(2));
                modelVenda.setValorLiquido(this.getResultSet().getDouble(3));
                modelVenda.setValorBruto(this.getResultSet().getDouble(4));
                modelVenda.setDesconto(this.getResultSet().getDouble(5));
                modelVenda.setUsuarioId(this.getResultSet().getInt(6));
                
                // começa os sets Usuario
                modelUsuario.setIdUsuario(this.getResultSet().getInt(7));
                modelUsuario.setNomeUsuario(this.getResultSet().getString(8));
                modelUsuario.setCpf(this.getResultSet().getString(9));
                modelUsuario.setTelefone(this.getResultSet().getString(10));
                modelUsuario.setLogin(this.getResultSet().getString(11));
                modelUsuario.setSenha(this.getResultSet().getString(12));
                modelUsuario.setCargoId(this.getResultSet().getInt(13));
                
                modelVendasUsuario.setModelVenda(modelVenda);
                modelVendasUsuario.setModelUsuario(modelUsuario);
                
                listaModelVendasUsuario.add(modelVendasUsuario);
                
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.fecharConexao();
        }
        return listaModelVendasUsuario;
    }
}
