package br.com.vendasnb.dao;

import br.com.vendasnb.model.ModelVendasProdutos;
import br.com.vendasnb.conexoes.ConexaoMysql;
import java.util.ArrayList;

/**
 *
 * @author Nicolas
 */
public class DAOVendasProdutos extends ConexaoMysql {

    /**
     * grava VendasProdutos
     *
     * @param pModelVendasProdutos
     * @return int
     */
    public int salvarVendasProdutosDAO(ModelVendasProdutos pModelVendasProdutos) {
        try {
            this.conectar();
            return this.insertSQL(
                    "INSERT INTO vendas_produtos ("
                    + "id,"
                    + "quantidade,"
                    + "valor_unitario,"
                    + "venda_id,"
                    + "produto_id"
                    + ") VALUES ("
                    + "'" + pModelVendasProdutos.getId() + "',"
                    + "'" + pModelVendasProdutos.getQuantidade() + "',"
                    + "'" + pModelVendasProdutos.getValorUnitario() + "',"
                    + "'" + pModelVendasProdutos.getVendaId() + "',"
                    + "'" + pModelVendasProdutos.getProdutoId() + "'"
                    + ");"
            );
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        } finally {
            this.fecharConexao();
        }
    }

    /**
     * recupera VendasProdutos
     *
     * @param pId
     * @return ModelVendasProdutos
     */
    public ModelVendasProdutos getVendasProdutosDAO(int pId) {
        ModelVendasProdutos modelVendasProdutos = new ModelVendasProdutos();
        try {
            this.conectar();
            this.executarSQL(
                    "SELECT "
                    + "id,"
                    + "quantidade,"
                    + "valor_unitario,"
                    + "venda_id,"
                    + "produto_id"
                    + " FROM"
                    + " vendas_produtos"
                    + " WHERE"
                    + " id = '" + pId + "'"
                    + ";"
            );

            while (this.getResultSet().next()) {
                modelVendasProdutos.setId(this.getResultSet().getInt(1));
                modelVendasProdutos.setQuantidade(this.getResultSet().getInt(2));
                modelVendasProdutos.setValorUnitario(this.getResultSet().getDouble(3));
                modelVendasProdutos.setVendaId(this.getResultSet().getInt(4));
                modelVendasProdutos.setProdutoId(this.getResultSet().getInt(5));
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.fecharConexao();
        }
        return modelVendasProdutos;
    }

    /**
     * recupera uma lista de VendasProdutos
     *
     * @return ArrayList
     */
    public ArrayList<ModelVendasProdutos> getListaVendasProdutosDAO() {
        ArrayList<ModelVendasProdutos> listamodelVendasProdutos = new ArrayList();
        ModelVendasProdutos modelVendasProdutos = new ModelVendasProdutos();
        try {
            this.conectar();
            this.executarSQL(
                    "SELECT "
                    + "id,"
                    + "quantidade,"
                    + "valor_unitario,"
                    + "venda_id,"
                    + "produto_id"
                    + " FROM"
                    + " vendas_produtos"
                    + ";"
            );

            while (this.getResultSet().next()) {
                modelVendasProdutos = new ModelVendasProdutos();
                modelVendasProdutos.setId(this.getResultSet().getInt(1));
                modelVendasProdutos.setQuantidade(this.getResultSet().getInt(2));
                modelVendasProdutos.setValorUnitario(this.getResultSet().getDouble(3));
                modelVendasProdutos.setVendaId(this.getResultSet().getInt(4));
                modelVendasProdutos.setProdutoId(this.getResultSet().getInt(5));
                listamodelVendasProdutos.add(modelVendasProdutos);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.fecharConexao();
        }
        return listamodelVendasProdutos;
    }

    /**
     * atualiza VendasProdutos
     *
     * @param pModelVendasProdutos
     * @return boolean
     */
    public boolean atualizarVendasProdutosDAO(ModelVendasProdutos pModelVendasProdutos) {
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                    "UPDATE vendas_produtos SET "
                    + "id = '" + pModelVendasProdutos.getId() + "',"
                    + "quantidade = '" + pModelVendasProdutos.getQuantidade() + "',"
                    + "valor_unitario = '" + pModelVendasProdutos.getValorUnitario() + "',"
                    + "venda_id = '" + pModelVendasProdutos.getVendaId() + "',"
                    + "produto_id = '" + pModelVendasProdutos.getProdutoId() + "'"
                    + " WHERE "
                    + "id = '" + pModelVendasProdutos.getId() + "'"
                    + ";"
            );
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        } finally {
            this.fecharConexao();
        }
    }

    /**
     * exclui VendasProdutos
     *
     * @param pId
     * @return boolean
     */
    public boolean excluirVendasProdutosDAO(int pId) {
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                    "DELETE FROM vendas_produtos "
                    + " WHERE "
                    + "venda_id = '" + pId + "'"
                    + ";"
            );
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        } finally {
            this.fecharConexao();
        }
    }

    /**
     * *
     * Salva lista de produtos da venda
     *
     * @param plistaModelVendasProdutos
     * @return
     */
    public boolean salvarVendasProdutosDAO(ArrayList<ModelVendasProdutos> plistaModelVendasProdutos) {
        try {
            this.conectar();
            int cont = plistaModelVendasProdutos.size();
            for (int i = 0; i < cont; i++) {

                this.insertSQL(
                        "INSERT INTO vendas_produtos ("
                        + "id, "
                        + "quantidade, "
                        + "valor_unitario, "
                        + "venda_id, "
                        + "produto_id "
                        + ") VALUES ("
                        + "'" + plistaModelVendasProdutos.get(i).getId() + "',"
                        + "'" + plistaModelVendasProdutos.get(i).getQuantidade() + "',"
                        + "'" + plistaModelVendasProdutos.get(i).getValorUnitario() + "',"
                        + "'" + plistaModelVendasProdutos.get(i).getVendaId() + "',"
                        + "'" + plistaModelVendasProdutos.get(i).getProdutoId() + "'"
                        + ");"
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
