package View;

public class Tela_Inicial_GUI extends javax.swing.JFrame {

    private Model.Operador operadorLogado;

    public Tela_Inicial_GUI(Model.Operador operador) {
        initComponents();

        this.operadorLogado = operador;

        jTable1.getColumnModel().getColumn(4).setMinWidth(0);
        jTable1.getColumnModel().getColumn(4).setMaxWidth(0);
        jTable1.getColumnModel().getColumn(4).setWidth(0);

        if (operador.getPerfilOperador() == null
                || !operador.getPerfilOperador().equals(Model.enums.Perfil.GERENTE)) {
            jTabbedPane1.removeTabAt(1);
        }

        jTabbedPane1.addChangeListener(e -> {
            if (jTabbedPane1.getSelectedIndex() == 1) {
                carregarHistorico();
            }
        });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        Caixa = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        btnDeletar = new javax.swing.JButton();
        btnAdicionar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jTextField3 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        btnFinalizar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        btnPesquisar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jTabbedPane1.setBackground(new java.awt.Color(0, 0, 153));
        jTabbedPane1.setForeground(new java.awt.Color(255, 255, 255));
        jTabbedPane1.setToolTipText("");
        jTabbedPane1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTabbedPane1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTabbedPane1.setOpaque(true);
        jTabbedPane1.setPreferredSize(new java.awt.Dimension(300, 300));

        Caixa.setBackground(new java.awt.Color(255, 255, 255));
        Caixa.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Caixa.setPreferredSize(new java.awt.Dimension(700, 700));
        Caixa.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Adicionar produto");
        Caixa.add(jLabel1);
        jLabel1.setBounds(0, 10, 170, 40);

        jLabel8.setText("___________________________________________________________________________________________________");
        Caixa.add(jLabel8);
        jLabel8.setBounds(0, 40, 870, 16);

        jLabel9.setText("Codigo de Barra");
        Caixa.add(jLabel9);
        jLabel9.setBounds(10, 70, 120, 16);
        Caixa.add(jTextField1);
        jTextField1.setBounds(10, 100, 340, 40);

        jLabel10.setText("Ou nome do produto");
        Caixa.add(jLabel10);
        jLabel10.setBounds(10, 160, 160, 16);
        Caixa.add(jTextField2);
        jTextField2.setBounds(10, 190, 340, 40);

        btnDeletar.setBackground(new java.awt.Color(255, 204, 0));
        btnDeletar.setForeground(new java.awt.Color(255, 255, 255));
        btnDeletar.setText("Deletar");
        btnDeletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeletarActionPerformed(evt);
            }
        });
        Caixa.add(btnDeletar);
        btnDeletar.setBounds(370, 360, 140, 40);

        btnAdicionar.setBackground(new java.awt.Color(0, 0, 255));
        btnAdicionar.setForeground(new java.awt.Color(255, 255, 255));
        btnAdicionar.setText("Adicionar");
        btnAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionarActionPerformed(evt);
            }
        });
        Caixa.add(btnAdicionar);
        btnAdicionar.setBounds(10, 360, 150, 40);

        btnCancelar.setBackground(new java.awt.Color(255, 0, 0));
        btnCancelar.setForeground(new java.awt.Color(255, 255, 255));
        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        Caixa.add(btnCancelar);
        btnCancelar.setBounds(520, 360, 150, 40);

        jLabel6.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Itens da venda");
        Caixa.add(jLabel6);
        jLabel6.setBounds(400, 10, 140, 40);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Produto", "Qtd.", "Unitário", "Subtotal", "id"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        Caixa.add(jScrollPane1);
        jScrollPane1.setBounds(380, 70, 452, 200);
        Caixa.add(jTextField3);
        jTextField3.setBounds(10, 270, 70, 40);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Qtd.");
        Caixa.add(jLabel2);
        jLabel2.setBounds(10, 250, 34, 22);

        btnFinalizar.setBackground(new java.awt.Color(0, 255, 0));
        btnFinalizar.setForeground(new java.awt.Color(255, 255, 255));
        btnFinalizar.setText("Finalizar");
        btnFinalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFinalizarActionPerformed(evt);
            }
        });
        Caixa.add(btnFinalizar);
        btnFinalizar.setBounds(680, 360, 150, 40);

        jTabbedPane1.addTab("Caixa", new javax.swing.ImageIcon(getClass().getResource("/Image/caixa.png")), Caixa, ""); // NOI18N

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Nº da venda", "Data/hora", "Total", "Forma de pagamento", "Status"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        jPanel1.add(jScrollPane2);
        jScrollPane2.setBounds(40, 80, 770, 320);

        jLabel3.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Informe a compra:");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(40, 30, 170, 40);

        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField4);
        jTextField4.setBounds(220, 30, 420, 40);

        btnPesquisar.setBackground(new java.awt.Color(0, 0, 255));
        btnPesquisar.setForeground(new java.awt.Color(255, 255, 255));
        btnPesquisar.setText("Pesquisar");
        btnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarActionPerformed(evt);
            }
        });
        jPanel1.add(btnPesquisar);
        btnPesquisar.setBounds(660, 30, 150, 40);

        jTabbedPane1.addTab("Historico", new javax.swing.ImageIcon(getClass().getResource("/Image/historia.png")), jPanel1); // NOI18N

        jTabbedPane1.setSelectedComponent(Caixa);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jTabbedPane1.getAccessibleContext().setAccessibleName("Caixa");

        setSize(new java.awt.Dimension(852, 479));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionarActionPerformed

        String codigo = jTextField1.getText().trim();
        String qtdTexto = jTextField3.getText().trim();

        if (codigo.isEmpty() || qtdTexto.isEmpty()) {
            javax.swing.JOptionPane.showMessageDialog(null, "Preencha o código de barras e a quantidade!");
            return;
        }

        int quantidade = Integer.parseInt(qtdTexto);

        Controller.ProdutoDAO dao = new Controller.ProdutoDAO();
        Model.Produto produto = dao.buscarPorCodigo(codigo);

        if (produto != null) {
            double subtotal = produto.getPreco() * quantidade;
            javax.swing.table.DefaultTableModel modelo = (javax.swing.table.DefaultTableModel) jTable1.getModel();
            modelo.addRow(new Object[]{produto.getNome(), quantidade, produto.getPreco(), subtotal, produto.getIdProduto()});
            jTextField1.setText("");
            jTextField3.setText("");
        } else {
            javax.swing.JOptionPane.showMessageDialog(null, "Produto não encontrado!");
        }
    }//GEN-LAST:event_btnAdicionarActionPerformed

    private void btnDeletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeletarActionPerformed
        int linhaSelecionada = jTable1.getSelectedRow();
        if (linhaSelecionada >= 0) {
            javax.swing.table.DefaultTableModel modelo = (javax.swing.table.DefaultTableModel) jTable1.getModel();
            modelo.removeRow(linhaSelecionada);
        } else {
            javax.swing.JOptionPane.showMessageDialog(null, "Selecione um item para deletar!");
        }
    }//GEN-LAST:event_btnDeletarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        int confirm = javax.swing.JOptionPane.showConfirmDialog(null, "Deseja cancelar a venda?", "Cancelar", javax.swing.JOptionPane.YES_NO_OPTION);
        if (confirm == javax.swing.JOptionPane.YES_OPTION) {
            javax.swing.table.DefaultTableModel modelo = (javax.swing.table.DefaultTableModel) jTable1.getModel();
            modelo.setRowCount(0);
            jTextField1.setText("");
            jTextField2.setText("");
            jTextField3.setText("");
        }
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnFinalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFinalizarActionPerformed
        javax.swing.table.DefaultTableModel modelo = (javax.swing.table.DefaultTableModel) jTable1.getModel();

        if (modelo.getRowCount() == 0) {
            javax.swing.JOptionPane.showMessageDialog(null, "Adicione pelo menos um produto!");
            return;
        }

        double total = 0;
        java.util.List<Model.ItemVenda> itens = new java.util.ArrayList<>();
        for (int i = 0; i < modelo.getRowCount(); i++) {
            Object valor = modelo.getValueAt(i, 3);
            if (valor != null) {
                Model.ItemVenda item = new Model.ItemVenda();
                item.setIdProduto((int) modelo.getValueAt(i, 4));
                item.setNomeProduto((String) modelo.getValueAt(i, 0));
                item.setQuantidade((int) modelo.getValueAt(i, 1));
                item.setPrecoUnitario((double) modelo.getValueAt(i, 2));
                item.setSubtotal((double) modelo.getValueAt(i, 3));
                itens.add(item);
                total += (double) valor;
            }
        }

        new Registro_GUI(total, itens, operadorLogado).setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnFinalizarActionPerformed

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed

    }//GEN-LAST:event_jTextField4ActionPerformed

    private void carregarHistorico() {
        String filtro = jTextField4.getText().trim();
        javax.swing.table.DefaultTableModel modelo = (javax.swing.table.DefaultTableModel) jTable2.getModel();
        modelo.setRowCount(0);

        String sql = filtro.isEmpty()
                ? "SELECT id_venda, data_hora, total, forma_pagamento, status FROM VENDAS ORDER BY data_hora DESC"
                : "SELECT id_venda, data_hora, total, forma_pagamento, status FROM VENDAS WHERE id_venda = ? ORDER BY data_hora DESC";

        try {
            java.sql.Connection conn = config.ConexaoBD.conectar();
            java.sql.PreparedStatement stmt = conn.prepareStatement(sql);
            if (!filtro.isEmpty()) {
                stmt.setString(1, filtro);
            }
            java.sql.ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                modelo.addRow(new Object[]{
                    rs.getInt("id_venda"),
                    rs.getString("data_hora"),
                    rs.getDouble("total"),
                    rs.getString("forma_pagamento"),
                    rs.getString("status")
                });
            }
        } catch (java.sql.SQLException e) {
            javax.swing.JOptionPane.showMessageDialog(null, "Erro ao carregar histórico: " + e.getMessage());
        }
    }


    private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarActionPerformed
        carregarHistorico();
    }//GEN-LAST:event_btnPesquisarActionPerformed

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
            java.util.logging.Logger.getLogger(Tela_Inicial_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tela_Inicial_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tela_Inicial_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tela_Inicial_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tela_Inicial_GUI(new Model.Operador()).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Caixa;
    private javax.swing.JButton btnAdicionar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnDeletar;
    private javax.swing.JButton btnFinalizar;
    private javax.swing.JButton btnPesquisar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    // End of variables declaration//GEN-END:variables
}
