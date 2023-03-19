/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.vendasnb.dao;

import br.com.vendasnb.conexoes.ConexaoMysql;
import br.com.vendasnb.model.ModelProdutos;
import br.com.vendasnb.model.ModelProdutosVendasProdutos;
import br.com.vendasnb.model.ModelVenda;
import br.com.vendasnb.model.ModelVendasProdutos;
import com.mysql.cj.protocol.Resultset;
import java.util.ArrayList;

/**
 *
 * @author Nicolas
 */
public class DAOProdutosVendasProdutos extends ConexaoMysql {

    public ArrayList<ModelProdutosVendasProdutos> getListaProdutosVendasProdutosDAO(int pCodigoVenda) {
        ArrayList<ModelProdutosVendasProdutos> listaModelProdutosVendasProdutos = new ArrayList<>();
        ModelProdutos modelProdutos = new ModelProdutos();
        ModelVenda modelVendas = new ModelVenda();
        ModelVendasProdutos modelVendasProdutos = new ModelVendasProdutos();
        ModelProdutosVendasProdutos modelProdutosVendasProdutos = new ModelProdutosVendasProdutos();
        try {
            this.conectar();
            this.executarSQL("SELECT "
                    + "P.id, P.nome, P.estoque, P.valor, P.valor_compra, " //Tabela Produtos
                    + "VP.id, VP.quantidade, VP.valor_unitario, VP.venda_id, VP.produto_id " // Tabela VendasProdutos
                    + "FROM produto P JOIN vendas_produtos VP ON(P.id=VP.produto_id) WHERE VP.venda_id = '" + pCodigoVenda + "'");
            while (this.getResultSet().next()) {
                modelProdutos = new ModelProdutos();
                modelVendasProdutos = new ModelVendasProdutos();
                modelProdutosVendasProdutos = new ModelProdutosVendasProdutos();
                // inicio modelPordutos
                modelProdutos.setIdProduto(this.getResultSet().getInt(1));
                modelProdutos.setNome(this.getResultSet().getString(2));
                modelProdutos.setEstoque(this.getResultSet().getInt(3));
                modelProdutos.setValor(this.getResultSet().getDouble(4));                
                modelProdutos.setValorCompra(this.getResultSet().getDouble(5));
                // fim modelProdutos
                //inicio venda_produto
                modelVendasProdutos.setId(this.getResultSet().getInt(6));
                modelVendasProdutos.setQuantidade(this.getResultSet().getInt(7));
                modelVendasProdutos.setValorUnitario(this.getResultSet().getDouble(8));
                modelVendasProdutos.setVendaId(this.getResultSet().getInt(9));
                modelVendasProdutos.setProdutoId(this.getResultSet().getInt(10));
                // fim modelVendasProdutos
                modelProdutosVendasProdutos.setModelProdutos(modelProdutos);
                modelProdutosVendasProdutos.setModelVenda(modelVendasProdutos);
                listaModelProdutosVendasProdutos.add(modelProdutosVendasProdutos);
                
            } 
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.fecharConexao();
        }
        return listaModelProdutosVendasProdutos;
    }
}
