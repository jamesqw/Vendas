/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package br.com.vendasnb.view;

import br.com.vendasnb.controller.ControllerProdutos;
import br.com.vendasnb.model.ModelProdutos;
import br.com.vendasnb.util.Formatador;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author Nicolas
 */
public class ViewProduto extends javax.swing.JFrame {

    ArrayList<ModelProdutos> listaModelProdutos = new ArrayList<>();
    ControllerProdutos controllerProdutos = new ControllerProdutos();
    ModelProdutos modelProdutos = new ModelProdutos();
    Formatador formatador = new Formatador();
    String salvarAlterar;

    /**
     * Creates new form ViewProduto
     */
    public ViewProduto() {
        initComponents();
        carregarProdutos();
        setLocationRelativeTo(null);
        habilitarDesabilitarCampos(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtProCod = new javax.swing.JTextField();
        txtProNome = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableProdutos = new javax.swing.JTable();
        txtProPesquisa = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        btnProCancelar = new javax.swing.JButton();
        btnProNew = new javax.swing.JButton();
        btnProAlter = new javax.swing.JButton();
        btnProDelete = new javax.swing.JButton();
        btnProSave = new javax.swing.JButton();
        btnProPesquisa = new javax.swing.JButton();
        txtProEst = new javax.swing.JFormattedTextField();
        txtProCodFor = new javax.swing.JFormattedTextField();
        txtProValorVen = new javax.swing.JTextField();
        txtProValorCom = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Produtos");
        setResizable(false);

        jPanel1.setToolTipText("");

        jLabel1.setText("Código:");

        jLabel2.setText("Nome:");

        jLabel3.setText("Estoque:");

        jLabel4.setText("Valor Compra:");

        jLabel5.setText("Valor Venda: ");

        jLabel6.setText("Codigo Fornecedor: ");

        txtProCod.setEditable(false);
        txtProCod.setEnabled(false);

        tableProdutos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Código", "Nome", "Quantidade", "Valor Venda", "Valor Compra", "Fornecedor"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.Double.class, java.lang.Double.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tableProdutos);
        if (tableProdutos.getColumnModel().getColumnCount() > 0) {
            tableProdutos.getColumnModel().getColumn(1).setMinWidth(100);
            tableProdutos.getColumnModel().getColumn(1).setPreferredWidth(200);
            tableProdutos.getColumnModel().getColumn(1).setMaxWidth(200);
        }

        jLabel7.setText("Pesquisar:");

        btnProCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/vendasnb/imagens/cancelar.png"))); // NOI18N
        btnProCancelar.setToolTipText("Cancelar");
        btnProCancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnProCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProCancelarActionPerformed(evt);
            }
        });

        btnProNew.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/vendasnb/imagens/novo.png"))); // NOI18N
        btnProNew.setToolTipText("Novo");
        btnProNew.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnProNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProNewActionPerformed(evt);
            }
        });

        btnProAlter.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/vendasnb/imagens/editar.png"))); // NOI18N
        btnProAlter.setToolTipText("Alterar");
        btnProAlter.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnProAlter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProAlterActionPerformed(evt);
            }
        });

        btnProDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/vendasnb/imagens/deletar.png"))); // NOI18N
        btnProDelete.setToolTipText("Excluir");
        btnProDelete.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnProDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProDeleteActionPerformed(evt);
            }
        });

        btnProSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/vendasnb/imagens/salvar.png"))); // NOI18N
        btnProSave.setToolTipText("Salvar");
        btnProSave.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnProSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProSaveActionPerformed(evt);
            }
        });

        btnProPesquisa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/vendasnb/imagens/pesquisar.png"))); // NOI18N
        btnProPesquisa.setToolTipText("Pesquisar");
        btnProPesquisa.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnProPesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProPesquisaActionPerformed(evt);
            }
        });

        txtProEst.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));

        txtProCodFor.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addComponent(btnProCancelar)
                                .addGap(32, 32, 32)
                                .addComponent(btnProAlter)
                                .addGap(34, 34, 34)
                                .addComponent(btnProNew)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnProDelete)
                                .addGap(18, 18, 18)
                                .addComponent(btnProSave)
                                .addGap(26, 26, 26))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(94, 94, 94)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(txtProEst, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel7))
                            .addComponent(txtProCod, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(82, 82, 82)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtProPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 398, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnProPesquisa))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtProValorCom))
                                    .addGap(69, 69, 69)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel5)
                                        .addComponent(txtProValorVen, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(96, 96, 96)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel6)
                                        .addComponent(txtProCodFor, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(0, 0, Short.MAX_VALUE))
                                .addComponent(txtProNome, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 95, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtProCod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtProNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtProEst, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtProCodFor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtProValorVen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtProValorCom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtProPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(btnProPesquisa))
                .addGap(39, 39, 39)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnProDelete)
                    .addComponent(btnProSave)
                    .addComponent(btnProAlter)
                    .addComponent(btnProNew)
                    .addComponent(btnProCancelar))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(34, 34, 34))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnProSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProSaveActionPerformed
        // Salva um novo produto no banco    
        if(salvarAlterar.equals("salvar")){
           this.salvarProduto(); 
        }else if (salvarAlterar.equals("alterar")){
            this.alterarProduto();
        }
    }//GEN-LAST:event_btnProSaveActionPerformed

    private void btnProDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProDeleteActionPerformed
        // Exclui um produto no banco
        int linha = tableProdutos.getSelectedRow();
        int codigoProduto = (int) tableProdutos.getValueAt(linha, 0);

        if (controllerProdutos.excluirProdutoController(codigoProduto)) {
            JOptionPane.showMessageDialog(this, "Produto excluído com sucesso!", "ATENÇÃO", JOptionPane.WARNING_MESSAGE);
            this.carregarProdutos();
            this.habilitarDesabilitarCampos(false);
        } else {
            JOptionPane.showMessageDialog(this, "Erro ao excluir o produto!", "ERRO", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnProDeleteActionPerformed

    private void btnProNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProNewActionPerformed
        // novo pra habilitar campos
        habilitarDesabilitarCampos(true);
        salvarAlterar = "salvar";

    }//GEN-LAST:event_btnProNewActionPerformed

    private void btnProCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProCancelarActionPerformed
        // cancelar para desabilitar e limpar campos
        habilitarDesabilitarCampos(false);
        limparCampo();
    }//GEN-LAST:event_btnProCancelarActionPerformed

    private void btnProAlterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProAlterActionPerformed
        // Alterar registro no banco
        salvarAlterar = "alterar";
        habilitarDesabilitarCampos(true);
        int linha = tableProdutos.getSelectedRow();
        try {
            int codigoProduto = (int) tableProdutos.getValueAt(linha, 0);
            // recuperar os dados do banco
            modelProdutos = controllerProdutos.retornaProdutoController(codigoProduto);
            // setar na interface
            this.txtProCod.setText(String.valueOf(modelProdutos.getIdProduto()));
            this.txtProNome.setText(modelProdutos.getNome());
            this.txtProEst.setText(String.valueOf(modelProdutos.getEstoque()));
            this.txtProValorCom.setText(String.valueOf(modelProdutos.getValorCompra()));
            this.txtProValorVen.setText(String.valueOf(modelProdutos.getValor()));
            this.txtProCodFor.setText(String.valueOf(modelProdutos.getFornecedor()));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Código inválido ou nenhum registro selecionado!", "AVISO", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnProAlterActionPerformed

    private void btnProPesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProPesquisaActionPerformed
        // PESQUISAR
        DefaultTableModel modelo = (DefaultTableModel) this.tableProdutos.getModel();
        final TableRowSorter<TableModel> classificador = new TableRowSorter<>(modelo);
        this.tableProdutos.setRowSorter(classificador);
        
        String texto = txtProPesquisa.getText();
        classificador.setRowFilter(RowFilter.regexFilter(texto, 1));
    }//GEN-LAST:event_btnProPesquisaActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ViewProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewProduto().setVisible(true);
            }
        });
    }

    /**
     * *
     * Preenche a tabela de produtos com os produtos cadastrados no banco
     */
    private void carregarProdutos() {
        listaModelProdutos = controllerProdutos.retornaListaProdutoController();
        DefaultTableModel modelo = (DefaultTableModel) tableProdutos.getModel();
        modelo.setNumRows(0);
        // inserir produtos na tabela
        for (int i = 0; i < listaModelProdutos.size(); i++) {
            modelo.addRow(new Object[]{
                listaModelProdutos.get(i).getIdProduto(),
                listaModelProdutos.get(i).getNome(),
                listaModelProdutos.get(i).getEstoque(),
                listaModelProdutos.get(i).getValor(),
                listaModelProdutos.get(i).getValorCompra(),
                listaModelProdutos.get(i).getFornecedor()
            });
        }
    }

    /**
     * *
     * Habilitar e desabilitar os campos do formulario
     *
     * @param condicao
     */
    private void habilitarDesabilitarCampos(boolean condicao) {
        txtProNome.setEnabled(condicao);
        txtProEst.setEnabled(condicao);
        txtProValorCom.setEnabled(condicao);
        txtProValorVen.setEnabled(condicao);
        txtProCodFor.setEnabled(condicao);
    }

    /**
     * *
     * Limpar os campos do formulario
     *
     * @param condicao
     */
    private void limparCampo() {
        txtProCod.setText("");
        txtProNome.setText("");
        txtProEst.setText("");
        txtProValorCom.setText("");
        txtProValorVen.setText("");
        txtProCodFor.setText("");
        txtProPesquisa.setText("");
    }

    private void salvarProduto() {
        try {
            modelProdutos.setNome(this.txtProNome.getText());
            modelProdutos.setEstoque(Integer.parseInt(this.txtProEst.getText()));
            modelProdutos.setValor((formatador.converterVirgulaParaPonto(this.txtProValorVen.getText())));
            modelProdutos.setValorCompra(formatador.converterVirgulaParaPonto(this.txtProValorCom.getText()));
            modelProdutos.setFornecedor(Integer.parseInt(this.txtProCodFor.getText()));

            if (controllerProdutos.salvarProdutosController(modelProdutos) > 0) {
                JOptionPane.showMessageDialog(this, "Produto cadastrado com sucesso!", "ATENÇÃO", JOptionPane.WARNING_MESSAGE);
                this.carregarProdutos();
                this.limparCampo();
                habilitarDesabilitarCampos(false);
            } else {
                JOptionPane.showMessageDialog(this, "Erro ao cadastrar o produto!", "ERRO", JOptionPane.ERROR_MESSAGE);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Erro ao cadastrar o produto!", "ERRO", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void alterarProduto() {
        try {
            modelProdutos.setNome(this.txtProNome.getText());
            modelProdutos.setEstoque(Integer.parseInt(this.txtProEst.getText()));
            modelProdutos.setValor(formatador.converterVirgulaParaPonto(this.txtProValorVen.getText()));
            modelProdutos.setValorCompra(formatador.converterVirgulaParaPonto(this.txtProValorCom.getText()));
            modelProdutos.setFornecedor(Integer.parseInt(this.txtProCodFor.getText()));

            if (controllerProdutos.alterarProdutoController(modelProdutos)) {
                JOptionPane.showMessageDialog(this, "Produto alterado com sucesso!", "ATENÇÃO", JOptionPane.WARNING_MESSAGE);
                this.carregarProdutos();
                this.limparCampo();
                habilitarDesabilitarCampos(false);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Erro ao alterar o produto!", "ERRO", JOptionPane.ERROR_MESSAGE);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnProAlter;
    private javax.swing.JButton btnProCancelar;
    private javax.swing.JButton btnProDelete;
    private javax.swing.JButton btnProNew;
    private javax.swing.JButton btnProPesquisa;
    private javax.swing.JButton btnProSave;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableProdutos;
    private javax.swing.JTextField txtProCod;
    private javax.swing.JFormattedTextField txtProCodFor;
    private javax.swing.JFormattedTextField txtProEst;
    private javax.swing.JTextField txtProNome;
    private javax.swing.JTextField txtProPesquisa;
    private javax.swing.JTextField txtProValorCom;
    private javax.swing.JTextField txtProValorVen;
    // End of variables declaration//GEN-END:variables
}
