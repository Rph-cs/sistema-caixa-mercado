package View;

public class Pagamento_GUI extends javax.swing.JFrame {

    private double total;
    private String formaPagamento = "";
    private boolean trocoCalculado = false;
    private java.util.List<Model.ItemVenda> itens;
    private Model.Operador operadorLogado;

    public Pagamento_GUI(double total, java.util.List<Model.ItemVenda> itens, Model.Operador operador) {
        initComponents();

        this.total = total;
        this.itens = itens;
        this.operadorLogado = operador;
        jLabel1.setText("Total da Compra: R$ " + String.format("%.2f", total));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        btnPix = new javax.swing.JButton();
        btnDinheiro = new javax.swing.JButton();
        btnDébito = new javax.swing.JButton();
        btnCrédito = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        btnVoltar = new javax.swing.JButton();
        btnConfirmarPagamento = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 29)); // NOI18N
        jLabel1.setText("Total da Compra");
        jPanel2.add(jLabel1);
        jLabel1.setBounds(17, 18, 360, 70);

        jPanel1.add(jPanel2);
        jPanel2.setBounds(10, 20, 400, 120);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel3.setLayout(null);

        btnPix.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Pix.png"))); // NOI18N
        btnPix.setText("Pix");
        btnPix.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        btnPix.setIconTextGap(80);
        btnPix.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPixActionPerformed(evt);
            }
        });
        jPanel3.add(btnPix);
        btnPix.setBounds(40, 250, 290, 40);

        btnDinheiro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/cifrao.png"))); // NOI18N
        btnDinheiro.setText("Dinheiro");
        btnDinheiro.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        btnDinheiro.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnDinheiro.setIconTextGap(70);
        btnDinheiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDinheiroActionPerformed(evt);
            }
        });
        jPanel3.add(btnDinheiro);
        btnDinheiro.setBounds(40, 70, 290, 40);

        btnDébito.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/cartao-do-banco.png"))); // NOI18N
        btnDébito.setText("Débito");
        btnDébito.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnDébito.setIconTextGap(70);
        btnDébito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDébitoActionPerformed(evt);
            }
        });
        jPanel3.add(btnDébito);
        btnDébito.setBounds(40, 130, 290, 40);

        btnCrédito.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/cartao-do-banco.png"))); // NOI18N
        btnCrédito.setText("Crédito");
        btnCrédito.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        btnCrédito.setIconTextGap(70);
        btnCrédito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCréditoActionPerformed(evt);
            }
        });
        jPanel3.add(btnCrédito);
        btnCrédito.setBounds(40, 190, 290, 40);

        jLabel2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel2.setText("Forma de Pagamento");
        jPanel3.add(jLabel2);
        jLabel2.setBounds(30, 10, 190, 22);

        jPanel1.add(jPanel3);
        jPanel3.setBounds(460, 20, 370, 350);

        btnVoltar.setBackground(new java.awt.Color(255, 255, 255));
        btnVoltar.setText("VOLTAR");
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });
        jPanel1.add(btnVoltar);
        btnVoltar.setBounds(90, 400, 240, 50);

        btnConfirmarPagamento.setBackground(new java.awt.Color(0, 255, 0));
        btnConfirmarPagamento.setForeground(new java.awt.Color(255, 255, 255));
        btnConfirmarPagamento.setText("CONFIRMAR PAGAMENTO");
        btnConfirmarPagamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmarPagamentoActionPerformed(evt);
            }
        });
        jPanel1.add(btnConfirmarPagamento);
        btnConfirmarPagamento.setBounds(460, 400, 360, 50);

        jLabel3.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel3.setText("Valor entregue");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(20, 170, 120, 20);
        jPanel1.add(jTextField1);
        jTextField1.setBounds(20, 190, 120, 30);

        jLabel4.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel4.setText("Troco");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(250, 170, 60, 22);
        jPanel1.add(jLabel5);
        jLabel5.setBounds(180, 190, 220, 30);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 852, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(852, 479));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        new Tela_Inicial_GUI(operadorLogado).setVisible(true);
        dispose();
    }//GEN-LAST:event_btnVoltarActionPerformed

    private void btnConfirmarPagamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmarPagamentoActionPerformed
        if (formaPagamento.isEmpty()) {
            javax.swing.JOptionPane.showMessageDialog(null, "Selecione uma forma de pagamento!");
            return;
        }

        if (operadorLogado == null) {
            javax.swing.JOptionPane.showMessageDialog(null, "Erro: Nenhum operador logado encontrado!");
            return;
        }

        double troco = 0;

        if (formaPagamento.equals("DINHEIRO")) {
            String valorTexto = jTextField1.getText().trim();
            if (valorTexto.isEmpty()) {
                javax.swing.JOptionPane.showMessageDialog(null, "Informe o valor entregue!");
                return;
            }
            try {
                double valorEntregue = Double.parseDouble(valorTexto.replace(",", "."));
                troco = valorEntregue - total;
                if (troco < 0) {
                    javax.swing.JOptionPane.showMessageDialog(null, "Valor insuficiente!");
                    return;
                }
                jLabel5.setText("R$ " + String.format("%.2f", troco));
            } catch (NumberFormatException e) {
                javax.swing.JOptionPane.showMessageDialog(null, "Digite um valor numérico válido!");
                return;
            }
        }

        Model.Venda venda = new Model.Venda();
        venda.setIdOperador(operadorLogado.getIdOperador());
        venda.setTotal(total);
        venda.setFormaPagamento(formaPagamento);
        venda.setTroco(troco);
        venda.setItens(itens);

        Controller.VendaDAO dao = new Controller.VendaDAO();

        if (dao.salvarVenda(venda)) {
            Model.GeradorNota.gerar(venda.getIdVenda(), venda.getTotal(), venda.getFormaPagamento(), venda.getTroco(), venda.getItens());

            javax.swing.JOptionPane.showMessageDialog(null, "Pagamento confirmado! A Nota Fiscal foi gerada com sucesso.");

            new View.Tela_Inicial_GUI(operadorLogado).setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_btnConfirmarPagamentoActionPerformed

    private void btnDinheiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDinheiroActionPerformed
        formaPagamento = "DINHEIRO";
        btnDinheiro.setBackground(java.awt.Color.CYAN);
        btnDébito.setBackground(null);
        btnCrédito.setBackground(null);
        btnPix.setBackground(null);
    }//GEN-LAST:event_btnDinheiroActionPerformed

    private void btnDébitoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDébitoActionPerformed
        formaPagamento = "DEBITO";
        btnDébito.setBackground(java.awt.Color.CYAN);
        btnDinheiro.setBackground(null);
        btnCrédito.setBackground(null);
        btnPix.setBackground(null);
    }//GEN-LAST:event_btnDébitoActionPerformed

    private void btnPixActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPixActionPerformed
        formaPagamento = "PIX";
        btnPix.setBackground(java.awt.Color.CYAN);
        btnDinheiro.setBackground(null);
        btnDébito.setBackground(null);
        btnCrédito.setBackground(null);
    }//GEN-LAST:event_btnPixActionPerformed

    private void btnCréditoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCréditoActionPerformed
        formaPagamento = "CREDITO";
        btnCrédito.setBackground(java.awt.Color.CYAN);
        btnDinheiro.setBackground(null);
        btnDébito.setBackground(null);
        btnPix.setBackground(null);
    }//GEN-LAST:event_btnCréditoActionPerformed

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
            java.util.logging.Logger.getLogger(Pagamento_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Pagamento_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Pagamento_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pagamento_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Pagamento_GUI(0, new java.util.ArrayList<>(), new Model.Operador()).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConfirmarPagamento;
    private javax.swing.JButton btnCrédito;
    private javax.swing.JButton btnDinheiro;
    private javax.swing.JButton btnDébito;
    private javax.swing.JButton btnPix;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
