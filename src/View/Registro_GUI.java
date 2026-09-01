package View;

public class Registro_GUI extends javax.swing.JFrame {

    private double total;
    private java.util.List<Model.ItemVenda> itens;
    private Model.Operador operadorLogado;

    public Registro_GUI(double total, java.util.List<Model.ItemVenda> itens, Model.Operador operador) {
        initComponents();
        this.total = total;
        this.itens = itens;

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        btnVoltar = new javax.swing.JButton();
        btnAvancar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/registro-online.png"))); // NOI18N
        jPanel1.add(jLabel4);
        jLabel4.setBounds(540, 60, 260, 260);

        btnVoltar.setBackground(new java.awt.Color(255, 255, 255));
        btnVoltar.setText("Voltar");
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });
        jPanel1.add(btnVoltar);
        btnVoltar.setBounds(80, 390, 300, 50);

        btnAvancar.setBackground(new java.awt.Color(51, 102, 255));
        btnAvancar.setForeground(new java.awt.Color(255, 255, 255));
        btnAvancar.setText("Avançar");
        btnAvancar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAvancarActionPerformed(evt);
            }
        });
        jPanel1.add(btnAvancar);
        btnAvancar.setBounds(460, 390, 300, 50);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.setLayout(null);
        jPanel2.add(jTextField1);
        jTextField1.setBounds(10, 230, 360, 40);
        jPanel2.add(jTextField2);
        jTextField2.setBounds(10, 50, 360, 40);
        jPanel2.add(jTextField3);
        jTextField3.setBounds(10, 140, 360, 40);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("CPF");
        jPanel2.add(jLabel1);
        jLabel1.setBounds(10, 210, 80, 20);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Nome");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(10, 30, 46, 22);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Telefone");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(10, 120, 80, 20);

        jPanel1.add(jPanel2);
        jPanel2.setBounds(40, 20, 400, 350);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 850, 480);

        setSize(new java.awt.Dimension(852, 479));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        dispose();
    }//GEN-LAST:event_btnVoltarActionPerformed

    private void btnAvancarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAvancarActionPerformed

        String nome = jTextField2.getText().trim();
        String telefone = jTextField3.getText().trim();
        String cpf = jTextField1.getText().trim();

        if (nome.isEmpty() || cpf.isEmpty()) {
            javax.swing.JOptionPane.showMessageDialog(null, "Nome e CPF são obrigatórios!");
            return;
        }

        Model.Cliente cliente = new Model.Cliente();
        cliente.setNome(nome);
        cliente.setCpf(cpf);
        cliente.setTelefone(telefone);

        Controller.ClienteDAO dao = new Controller.ClienteDAO();
        if (dao.salvarCliente(cliente)) {
            javax.swing.JOptionPane.showMessageDialog(null, "Cliente cadastrado com sucesso!");
            new Pagamento_GUI(total, itens, operadorLogado).setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_btnAvancarActionPerformed

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
            java.util.logging.Logger.getLogger(Registro_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Registro_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Registro_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Registro_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Registro_GUI(0, new java.util.ArrayList<>(), new Model.Operador()).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAvancar;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables
}
