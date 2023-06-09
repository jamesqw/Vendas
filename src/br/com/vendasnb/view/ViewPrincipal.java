/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package br.com.vendasnb.view;

import br.com.vendasnb.controller.ControllerUsuario;
import br.com.vendasnb.model.ModelSessaoUsuario;
import br.com.vendasnb.model.ModelUsuario;
import javax.swing.JFrame;
import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import javax.swing.JComponent;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPopupMenu;
import javax.swing.MenuElement;
import javax.swing.plaf.basic.BasicMenuBarUI;

/**
 *
 * @author Nicolas
 */
public class ViewPrincipal extends javax.swing.JFrame {
    
    ControllerUsuario controllerUsuario = new ControllerUsuario();
    ModelUsuario modelUsuario = new ModelUsuario();
    ModelSessaoUsuario modelSessaoUsuario = new ModelSessaoUsuario();
    /**
     * Creates new form ViewPrincipal
     */
    public ViewPrincipal() {
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        initComponents();
        this.customizeMenuBar(jMenuBar1);
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        uJPanelImagem1 = new componentes.UJPanelImagem();
        jPanel1 = new javax.swing.JPanel();
        btnUsu = new javax.swing.JButton();
        btnPro = new javax.swing.JButton();
        btnCar = new javax.swing.JButton();
        btnVenda = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnFor = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btnPDV = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        btnPDV1 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        menuSair = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        MenuUsu = new javax.swing.JMenuItem();
        menuCargo = new javax.swing.JMenuItem();
        menuForne = new javax.swing.JMenuItem();
        menuProdutos = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("NB TechSoft - Sistema de Vendas");
        setResizable(false);

        uJPanelImagem1.setImagem(new java.io.File("C:\\Users\\Nicolas\\Documents\\NetBeansProjects\\VendasNB\\src\\br\\com\\vendasnb\\imagens\\Background.png"));

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

        btnUsu.setBackground(new java.awt.Color(102, 102, 255));
        btnUsu.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnUsu.setForeground(new java.awt.Color(255, 255, 255));
        btnUsu.setText(" Usuários");
        btnUsu.setToolTipText("Usuarios");
        btnUsu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnUsu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUsuActionPerformed(evt);
            }
        });

        btnPro.setBackground(new java.awt.Color(102, 102, 255));
        btnPro.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnPro.setForeground(new java.awt.Color(255, 255, 255));
        btnPro.setText(" Produtos");
        btnPro.setToolTipText("Produtos");
        btnPro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProActionPerformed(evt);
            }
        });

        btnCar.setBackground(new java.awt.Color(102, 102, 255));
        btnCar.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnCar.setForeground(new java.awt.Color(255, 255, 255));
        btnCar.setText(" Cargos");
        btnCar.setToolTipText("Cargos");
        btnCar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCarActionPerformed(evt);
            }
        });

        btnVenda.setBackground(new java.awt.Color(102, 102, 255));
        btnVenda.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnVenda.setForeground(new java.awt.Color(255, 255, 255));
        btnVenda.setText(" Vendas");
        btnVenda.setToolTipText("Vendas");
        btnVenda.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVendaActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/vendasnb/imagens/truck_icon32px.png"))); // NOI18N

        btnFor.setBackground(new java.awt.Color(102, 102, 255));
        btnFor.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnFor.setForeground(new java.awt.Color(255, 255, 255));
        btnFor.setText(" Fornecedores");
        btnFor.setToolTipText("Fornecedores");
        btnFor.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnFor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnForActionPerformed(evt);
            }
        });

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/vendasnb/imagens/bag_icon32px.png"))); // NOI18N

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/vendasnb/imagens/shopping_basket_icon32px.png"))); // NOI18N

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/vendasnb/imagens/users_icon32px.png"))); // NOI18N

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/vendasnb/imagens/cart_shop_shopping_icon32px.png"))); // NOI18N

        btnPDV.setBackground(new java.awt.Color(102, 102, 255));
        btnPDV.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnPDV.setForeground(new java.awt.Color(255, 255, 255));
        btnPDV.setText("PDV");
        btnPDV.setToolTipText("PDV");
        btnPDV.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPDV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPDVActionPerformed(evt);
            }
        });

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/vendasnb/imagens/online_icon 32px.png"))); // NOI18N
        jLabel7.setToolTipText("PDV");

        btnPDV1.setBackground(new java.awt.Color(102, 102, 255));
        btnPDV1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnPDV1.setForeground(new java.awt.Color(255, 255, 255));
        btnPDV1.setText("Relatório");
        btnPDV1.setToolTipText("Relatorio");
        btnPDV1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPDV1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPDV1ActionPerformed(evt);
            }
        });

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/vendasnb/imagens/dashboard_graphic_icon 32px.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel4)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnPDV, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnPro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnUsu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnFor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnVenda, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnPDV1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(202, 202, 202)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnFor)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnCar)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnUsu)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnPro)
                    .addComponent(jLabel4))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnVenda)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel7)
                    .addComponent(btnPDV))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnPDV1)
                    .addComponent(jLabel8))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/vendasnb/imagens/undrawpequeno.png"))); // NOI18N

        javax.swing.GroupLayout uJPanelImagem1Layout = new javax.swing.GroupLayout(uJPanelImagem1);
        uJPanelImagem1.setLayout(uJPanelImagem1Layout);
        uJPanelImagem1Layout.setHorizontalGroup(
            uJPanelImagem1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(uJPanelImagem1Layout.createSequentialGroup()
                .addGap(129, 129, 129)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 332, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 537, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        uJPanelImagem1Layout.setVerticalGroup(
            uJPanelImagem1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(uJPanelImagem1Layout.createSequentialGroup()
                .addGap(0, 222, Short.MAX_VALUE)
                .addComponent(jLabel2))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, uJPanelImagem1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jMenuBar1.setBackground(new java.awt.Color(0, 0, 0));
        jMenuBar1.setForeground(new java.awt.Color(0, 0, 0));
        jMenuBar1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N

        jMenu1.setBackground(new java.awt.Color(0, 0, 0));
        jMenu1.setText("Arquivos");

        menuSair.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.ALT_DOWN_MASK));
        menuSair.setBackground(new java.awt.Color(51, 51, 51));
        menuSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/vendasnb/imagens/exit_icon24px.png"))); // NOI18N
        menuSair.setText("Sair");
        menuSair.setToolTipText("sair");
        menuSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuSairActionPerformed(evt);
            }
        });
        jMenu1.add(menuSair);

        jMenuBar1.add(jMenu1);

        jMenu2.setBackground(new java.awt.Color(0, 0, 0));
        jMenu2.setText("Cadastros");

        MenuUsu.setBackground(new java.awt.Color(51, 51, 51));
        MenuUsu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/vendasnb/imagens/users_icon24px.png"))); // NOI18N
        MenuUsu.setText("Usuários");
        MenuUsu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuUsuActionPerformed(evt);
            }
        });
        jMenu2.add(MenuUsu);

        menuCargo.setBackground(new java.awt.Color(51, 51, 51));
        menuCargo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/vendasnb/imagens/bag_icon24px.png"))); // NOI18N
        menuCargo.setText("Cargos");
        menuCargo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuCargoActionPerformed(evt);
            }
        });
        jMenu2.add(menuCargo);

        menuForne.setBackground(new java.awt.Color(51, 51, 51));
        menuForne.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/vendasnb/imagens/fornecedores_icon24px.png"))); // NOI18N
        menuForne.setText("Fornecedores");
        menuForne.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuForneActionPerformed(evt);
            }
        });
        jMenu2.add(menuForne);

        menuProdutos.setBackground(new java.awt.Color(51, 51, 51));
        menuProdutos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/vendasnb/imagens/shopping_basket_icon24px.png"))); // NOI18N
        menuProdutos.setText("Produtos");
        menuProdutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuProdutosActionPerformed(evt);
            }
        });
        jMenu2.add(menuProdutos);

        jMenuBar1.add(jMenu2);

        jMenu3.setBackground(new java.awt.Color(0, 0, 0));
        jMenu3.setText("Vendas");

        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/vendasnb/imagens/cart_shop_shopping_icon24px.png"))); // NOI18N
        jMenuItem1.setText("Vendas");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem1);

        jMenuItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/vendasnb/imagens/online_icon 24px.png"))); // NOI18N
        jMenuItem2.setText("PDV");
        jMenu3.add(jMenuItem2);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(uJPanelImagem1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(uJPanelImagem1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuSairActionPerformed
        // Sair
        int sair = JOptionPane.showConfirmDialog(this, "Tem certeza que deseja sair ?","Atenção",JOptionPane.YES_NO_OPTION);
        if(sair == JOptionPane.YES_OPTION){
            System.exit(0);
        }
        
    }//GEN-LAST:event_menuSairActionPerformed

    private void MenuUsuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuUsuActionPerformed
        // View Usuarios
        try {
            if(ModelSessaoUsuario.login.equals("admin")){
            btnUsu.setEnabled(true);
            new ViewUsuario().setVisible(true);
        }   
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Usuário não é um ADMINISTRADOR!", "AVISO", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_MenuUsuActionPerformed

    private void menuCargoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuCargoActionPerformed
        // View Cargo
        new ViewCargo().setVisible(true);
    }//GEN-LAST:event_menuCargoActionPerformed

    private void menuForneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuForneActionPerformed
        // View Fornecedores
        new ViewFornecedor().setVisible(true);
    }//GEN-LAST:event_menuForneActionPerformed

    private void menuProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuProdutosActionPerformed
        // View Produtos
        new ViewProduto().setVisible(true);
    }//GEN-LAST:event_menuProdutosActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        new ViewVendas().setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    /***
     * chamando as views para os botoes 
     * @param evt 
     */
    private void btnForActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnForActionPerformed
        // TODO add your handling code here:
        new ViewFornecedor().setVisible(true);
    }//GEN-LAST:event_btnForActionPerformed

    private void btnCarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCarActionPerformed
        // TODO add your handling code here:
        new ViewCargo().setVisible(true);
    }//GEN-LAST:event_btnCarActionPerformed

    private void btnUsuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUsuActionPerformed
        // TODO add your handling code here:
        try {
            if(ModelSessaoUsuario.login.equals("admin")){
            btnUsu.setEnabled(true);
            new ViewUsuario().setVisible(true);
        }   
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Usuário não é um ADMINISTRADOR!", "AVISO", JOptionPane.WARNING_MESSAGE);
        }
        
        
    }//GEN-LAST:event_btnUsuActionPerformed

    private void btnProActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProActionPerformed
        // TODO add your handling code here:
        new ViewProduto().setVisible(true);
    }//GEN-LAST:event_btnProActionPerformed

    private void btnVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVendaActionPerformed
        // TODO add your handling code here:
        new ViewVendas().setVisible(true);
    }//GEN-LAST:event_btnVendaActionPerformed

    private void btnPDVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPDVActionPerformed
        // TODO add your handling code here:
        new ViewPDV().setVisible(true);
    }//GEN-LAST:event_btnPDVActionPerformed

    private void btnPDV1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPDV1ActionPerformed
        // TODO add your handling code here:
        new ViewDashboard().setVisible(true);
    }//GEN-LAST:event_btnPDV1ActionPerformed

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
            java.util.logging.Logger.getLogger(ViewPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewPrincipal().setVisible(true);
            }
        });
    }

    private void customizeMenuBar(JMenuBar menuBar) {

        menuBar.setUI(new BasicMenuBarUI() {

            @Override
            public void paint(Graphics g, JComponent c) {
                g.setColor(Color.black);
                g.fillRect(0, 0, c.getWidth(), c.getHeight());
            }

        });

        MenuElement[] menus = menuBar.getSubElements();

        for (MenuElement menuElement : menus) {

            JMenu menu = (JMenu) menuElement.getComponent();
            changeComponentColors(menu);
            menu.setOpaque(true);

            MenuElement[] menuElements = menu.getSubElements();

            for (MenuElement popupMenuElement : menuElements) {

                JPopupMenu popupMenu = (JPopupMenu) popupMenuElement.getComponent();
                popupMenu.setBorder(null);

                MenuElement[] menuItens = popupMenuElement.getSubElements();

                for (MenuElement menuItemElement : menuItens) {

                    JMenuItem menuItem = (JMenuItem) menuItemElement.getComponent();
                    changeComponentColors(menuItem);
                    menuItem.setOpaque(true);

                }
            }
        }
    }

    private void changeComponentColors(Component comp) {
        comp.setBackground(Color.black);
        comp.setForeground(Color.white);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem MenuUsu;
    private javax.swing.JButton btnCar;
    private javax.swing.JButton btnFor;
    private javax.swing.JButton btnPDV;
    private javax.swing.JButton btnPDV1;
    private javax.swing.JButton btnPro;
    public javax.swing.JButton btnUsu;
    private javax.swing.JButton btnVenda;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JMenuItem menuCargo;
    private javax.swing.JMenuItem menuForne;
    private javax.swing.JMenuItem menuProdutos;
    private javax.swing.JMenuItem menuSair;
    private componentes.UJPanelImagem uJPanelImagem1;
    // End of variables declaration//GEN-END:variables
}
