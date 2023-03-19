/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.vendasnb.dao;

import br.com.vendasnb.conexoes.ConexaoMysql;
import br.com.vendasnb.model.ModelProdutos;
import java.util.ArrayList;

/**
 *
 * @author Nicolas
 */
public class DaoProdutos extends ConexaoMysql {

    /**
     * Cadastrar produto no banco
     *
     * @param pModelProdutos
     * @return int
     */
    public int salvarProdutosDAO(ModelProdutos pModelProdutos) {
        try {
            this.conectar();
            return this.insertSQL("INSERT INTO produto( nome, estoque, valor, valor_compra, fornecedor_id)"
                    + "VALUES ("
                    + "'" + pModelProdutos.getNome() + "',"
                    + "'" + pModelProdutos.getEstoque() + "',"
                    + "'" + pModelProdutos.getValor() + "',"
                    + "'" + pModelProdutos.getValorCompra() + "',"
                    + "'" + pModelProdutos.getFornecedor() + "');"
            );
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        } finally {
            this.fecharConexao();
        }
    }

    /**
     * excluir produto do banco
     *
     * @param pIdProduto
     * @return boolean
     */
    public boolean excluirProdutoDAO(int pIdProduto) {
        try {
            this.conectar();
            this.executarUpdateDeleteSQL(
                    "SET FOREIGN_KEY_CHECKS=0;");
            return this.executarUpdateDeleteSQL("DELETE FROM produto WHERE id=" + pIdProduto
            );
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        } finally {
            this.fecharConexao();
        }
    }

    /**
     * Alterar dados do produto
     *
     * @param pModelProdutos
     * @return boolean
     */
    public boolean alteraProdutoDAO(ModelProdutos pModelProdutos) {
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                    "UPDATE produto SET "
                     + "id = '" + pModelProdutos.getIdProduto() + "',"
                    + "nome = '" + pModelProdutos.getNome() + "',"
                    + " estoque = '" + pModelProdutos.getEstoque() + "',"
                    + " valor = '" + pModelProdutos.getValor() + "',"
                    + " valor_compra = '" + pModelProdutos.getValorCompra() + "',"
                    + " fornecedor_id = '" + pModelProdutos.getFornecedor() + "'"
                    + " WHERE "
                    + "id = '" + pModelProdutos.getIdProduto() + "';"
            );
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        } finally {
            this.fecharConexao();
        }
    }

    /**
     * Retornar um produto pelo codigo
     *
     * @param pIdProduto
     * @return ModelProdutos
     */
    public ModelProdutos retornarProdutoDAO(int pIdProduto) {
        ModelProdutos modelProdutos = new ModelProdutos();
        try {
            this.conectar();
            this.executarSQL("SELECT id, nome,estoque,valor,valor_compra, fornecedor_id FROM produto WHERE id = '" + pIdProduto + "';");
            while (this.getResultSet().next()) {
                modelProdutos.setIdProduto(this.getResultSet().getInt(1));
                modelProdutos.setNome(this.getResultSet().getString(2));
                modelProdutos.setEstoque(this.getResultSet().getInt(3));
                modelProdutos.setValor(this.getResultSet().getDouble(4));
                modelProdutos.setValorCompra(this.getResultSet().getDouble(5));
                modelProdutos.setFornecedor(this.getResultSet().getInt(6));

            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.fecharConexao();
        }
        return modelProdutos;
    }

    /**
     * Retornar um produto pelo codigo
     *
     * @param pNomeProduto
     * @return ModelProdutos
     */
    public ModelProdutos retornarProdutoDAO(String pNomeProduto) {
        ModelProdutos modelProdutos = new ModelProdutos();
        try {
            this.conectar();
            this.executarSQL("SELECT id, nome,estoque,valor,valor_compra, fornecedor_id FROM produto WHERE nome = '" + pNomeProduto + "';");
            while (this.getResultSet().next()) {
                modelProdutos.setIdProduto(this.getResultSet().getInt(1));
                modelProdutos.setNome(this.getResultSet().getString(2));
                modelProdutos.setEstoque(this.getResultSet().getInt(3));
                modelProdutos.setValor(this.getResultSet().getDouble(4));
                modelProdutos.setValorCompra(this.getResultSet().getDouble(5));
                modelProdutos.setFornecedor(this.getResultSet().getInt(6));

            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.fecharConexao();
        }
        return modelProdutos;
    }

    /**
     * *
     * Retornar uma lista de completa produtos
     *
     * @return listaModelProdutos
     */
    public ArrayList<ModelProdutos> retornarListaProdutosDAO() {
        ArrayList<ModelProdutos> listaModelProdutos = new ArrayList<>();
        ModelProdutos modelProdutos = new ModelProdutos();

        try {
            this.conectar();
            this.executarSQL("SELECT * FROM produto;");
            while (this.getResultSet().next()) {
                modelProdutos = new ModelProdutos();
                modelProdutos.setIdProduto(this.getResultSet().getInt(1));
                modelProdutos.setNome(this.getResultSet().getString(2));
                modelProdutos.setEstoque(this.getResultSet().getInt(3));
                modelProdutos.setValor(this.getResultSet().getDouble(4));
                modelProdutos.setValorCompra(this.getResultSet().getDouble(5));
                modelProdutos.setFornecedor(this.getResultSet().getInt(6));
                listaModelProdutos.add(modelProdutos);
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.fecharConexao();
        }
        return listaModelProdutos;
    }

    /**
     * *
     * altera lista de produtos no banco
     *
     * @param plistaModelProdutos
     * @return
     */
    public boolean alterarEstoqueProdutosDAO(ArrayList<ModelProdutos> plistaModelProdutos) {
        try {
            this.conectar();
            for (int i = 0; i < plistaModelProdutos.size(); i++) {
                this.executarUpdateDeleteSQL(
                        "UPDATE produto SET "
                        + "estoque ='" + plistaModelProdutos.get(i).getEstoque() + "'"
                        + " WHERE id = '" + plistaModelProdutos.get(i).getIdProduto() + "'"
                );
            }
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        } finally {
            this.fecharConexao();
        }
    }
}
