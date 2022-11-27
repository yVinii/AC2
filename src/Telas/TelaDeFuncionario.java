package Telas;

import Conexoes.MySQL;
import javax.swing.JOptionPane;
import Classes.Funcionario;

public class TelaDeFuncionario extends javax.swing.JFrame {
    MySQL mySQLcon;
    Funcionario novoFuncionario;
    public TelaDeFuncionario() {
        initComponents();
        mySQLcon = new MySQL();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        butCadastrar = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtCPF = new javax.swing.JFormattedTextField();
        jPanel4 = new javax.swing.JPanel();
        butAtualizar = new javax.swing.JLabel();
        butExcluir = new javax.swing.JLabel();
        butBuscar = new javax.swing.JLabel();
        butLimpar = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtNome1 = new javax.swing.JTextField();
        txtCPF1 = new javax.swing.JFormattedTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtEmail1 = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        butFechar = new javax.swing.JLabel();
        butConfig = new javax.swing.JLabel();
        butFuncionario = new javax.swing.JLabel();
        butIncio = new javax.swing.JLabel();
        butProduto = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTabbedPane1.setBackground(new java.awt.Color(0, 0, 51));
        jTabbedPane1.setForeground(new java.awt.Color(255, 255, 255));
        jTabbedPane1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        butCadastrar.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        butCadastrar.setForeground(new java.awt.Color(0, 0, 51));
        butCadastrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/icons8-login-arredondado-à-direita-60.png"))); // NOI18N
        butCadastrar.setText("Cadastrar");
        butCadastrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                butCadastrarMouseClicked(evt);
            }
        });
        jPanel1.add(butCadastrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 230, 240, 90));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 51));
        jLabel7.setText("Email.");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 20, 150, 70));

        txtEmail.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        txtEmail.setForeground(new java.awt.Color(0, 0, 51));
        jPanel1.add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 90, 360, 70));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 51));
        jLabel1.setText("CPF.");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 150, 70));

        txtNome.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        txtNome.setForeground(new java.awt.Color(0, 0, 51));
        jPanel1.add(txtNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 250, 70));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 51));
        jLabel8.setText("Nome.");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 150, 70));

        txtCPF.setForeground(new java.awt.Color(0, 0, 51));
        try {
            txtCPF.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtCPF.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        jPanel1.add(txtCPF, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 250, 70));

        jTabbedPane1.addTab("Cadastro", jPanel1);

        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        butAtualizar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        butAtualizar.setForeground(new java.awt.Color(0, 0, 51));
        butAtualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/icons8-refresh-30.png"))); // NOI18N
        butAtualizar.setText("Atualizar");
        butAtualizar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 51)));
        butAtualizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                butAtualizarMouseClicked(evt);
            }
        });
        jPanel4.add(butAtualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 310, 125, 40));

        butExcluir.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        butExcluir.setForeground(new java.awt.Color(0, 0, 51));
        butExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/icons8-trash-can-30.png"))); // NOI18N
        butExcluir.setText("Excluir");
        butExcluir.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 51)));
        butExcluir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                butExcluirMouseClicked(evt);
            }
        });
        jPanel4.add(butExcluir, new org.netbeans.lib.awtextra.AbsoluteConstraints(555, 310, 125, 40));

        butBuscar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        butBuscar.setForeground(new java.awt.Color(0, 0, 51));
        butBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/icons8-search-30.png"))); // NOI18N
        butBuscar.setText("Buscar");
        butBuscar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 51)));
        butBuscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                butBuscarMouseClicked(evt);
            }
        });
        jPanel4.add(butBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 210, 125, 40));

        butLimpar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        butLimpar.setForeground(new java.awt.Color(0, 0, 51));
        butLimpar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/icons8-housekeeping-30.png"))); // NOI18N
        butLimpar.setText("Limpar");
        butLimpar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 51)));
        butLimpar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                butLimparMouseClicked(evt);
            }
        });
        jPanel4.add(butLimpar, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 210, 125, 40));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 51));
        jLabel9.setText("Nome.");
        jPanel4.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 150, 70));

        txtNome1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        txtNome1.setForeground(new java.awt.Color(0, 0, 51));
        jPanel4.add(txtNome1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, 250, 70));

        txtCPF1.setForeground(new java.awt.Color(0, 0, 51));
        try {
            txtCPF1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtCPF1.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        jPanel4.add(txtCPF1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 250, 70));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 51));
        jLabel3.setText("CPF.");
        jPanel4.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 150, 70));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 51));
        jLabel10.setText("Email.");
        jPanel4.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 20, 150, 70));

        txtEmail1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        txtEmail1.setForeground(new java.awt.Color(0, 0, 51));
        jPanel4.add(txtEmail1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 90, 360, 70));

        jTabbedPane1.addTab("Busca", jPanel4);

        getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 100, 710, 450));

        jPanel2.setBackground(new java.awt.Color(0, 0, 51));
        jPanel2.setPreferredSize(new java.awt.Dimension(60, 550));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 550, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 0, 70, 550));

        jPanel3.setBackground(new java.awt.Color(0, 0, 51));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 910, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 910, 60));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 51));
        jLabel2.setText("Menu.");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 110, 70));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 51));
        jLabel6.setText("Funcionário.");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 20, 210, 70));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/marca dagua (1).png"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 10, 200, -1));

        butFechar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/icons8-fechar-janela-48.png"))); // NOI18N
        butFechar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                butFecharMouseClicked(evt);
            }
        });
        getContentPane().add(butFechar, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 20, 50, 50));

        butConfig.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        butConfig.setForeground(new java.awt.Color(0, 0, 51));
        butConfig.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/icons8-services-40.png"))); // NOI18N
        butConfig.setText("Config");
        butConfig.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                butConfigMouseClicked(evt);
            }
        });
        getContentPane().add(butConfig, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 440, 150, 100));

        butFuncionario.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        butFuncionario.setForeground(new java.awt.Color(0, 0, 51));
        butFuncionario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/icons8-add-user-male-30.png"))); // NOI18N
        butFuncionario.setText("Funcionário");
        butFuncionario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                butFuncionarioMouseClicked(evt);
            }
        });
        getContentPane().add(butFuncionario, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 370, 170, 70));

        butIncio.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        butIncio.setForeground(new java.awt.Color(0, 0, 51));
        butIncio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/icons8-home-page-40.png"))); // NOI18N
        butIncio.setText("Início");
        butIncio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                butIncioMouseClicked(evt);
            }
        });
        getContentPane().add(butIncio, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 170, 70));

        butProduto.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        butProduto.setForeground(new java.awt.Color(0, 0, 51));
        butProduto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/icons8-pets-30.png"))); // NOI18N
        butProduto.setText("Funções");
        butProduto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                butProdutoMouseClicked(evt);
            }
        });
        getContentPane().add(butProduto, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, 160, 70));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void butFecharMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_butFecharMouseClicked
        dispose();
    }//GEN-LAST:event_butFecharMouseClicked

    private void butConfigMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_butConfigMouseClicked
        TelaDeConfig minhaTela = new TelaDeConfig();
        minhaTela.setVisible(true);
        dispose();
    }//GEN-LAST:event_butConfigMouseClicked

    private void butFuncionarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_butFuncionarioMouseClicked
        TelaDeFuncionario minhaTela = new TelaDeFuncionario();
        minhaTela.setVisible(true);
        dispose();
    }//GEN-LAST:event_butFuncionarioMouseClicked

    private void butIncioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_butIncioMouseClicked
        TelaDeInicio minhaTela = new TelaDeInicio();
        minhaTela.setVisible(true);
        dispose();
    }//GEN-LAST:event_butIncioMouseClicked

    private void butCadastrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_butCadastrarMouseClicked
        int status=0;
        mySQLcon.conectaBanco();

        novoFuncionario = new Funcionario();
        novoFuncionario.setNome(txtNome.getText());
        novoFuncionario.setCpf(txtCPF.getText());;
        novoFuncionario.setEmail(txtEmail.getText());
        try {
            status = this.mySQLcon.insertSQL("INSERT INTO funcionario ("
                + "nome,"
                + "cpf,"
                + "email"
                + ") VALUES ("
                + "'" + novoFuncionario.getNome() + "',"
                + "'" + novoFuncionario.getCpf() + "',"
                + "'" + novoFuncionario.getEmail() + "'"
                + ");");
            if(status == 1){
                JOptionPane.showMessageDialog(null, "Funcionário cadastrado com sucesso");
                apagaCadastro();
            }else{JOptionPane.showMessageDialog(null, "Houve algum problema de cadastro");
            }
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, "Houve algum problema com a conexão do servidor");
        }
        finally {
        }
        mySQLcon.fechaBanco();
    }//GEN-LAST:event_butCadastrarMouseClicked

    private void butAtualizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_butAtualizarMouseClicked
        mySQLcon.conectaBanco();
        boolean status = false;

        String cpf = txtCPF1.getText();
        
        try {status = this.mySQLcon.updateSQL(
            "UPDATE funcionario SET "
            + "nome = '" + txtNome1.getText() + "',"
            + "cpf = '" + txtCPF1.getText() + "',"
            + "email = '" + txtEmail1.getText() + "'"
            + " WHERE "
            + "cpf = '" + cpf + "'"
            + ";"
        );
        if(status){JOptionPane.showMessageDialog(null, "Atualização realizada com sucesso");
        }else{ JOptionPane.showMessageDialog(null, "Houve um erro na atualização, tente novamente");
        }
        } catch (Exception e) {
            e.getMessage();
            JOptionPane.showMessageDialog(null, "Houve um erro na atualização");
        } finally {mySQLcon.fechaBanco();
        }
    }//GEN-LAST:event_butAtualizarMouseClicked

    private void butExcluirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_butExcluirMouseClicked
        mySQLcon.conectaBanco();
        boolean status = false;

        String cpf = txtCPF1.getText();

        try {
            status = this.mySQLcon.updateSQL(
                "DELETE FROM funcionario "
                + " WHERE "
                + "cpf = '" + cpf + "'"
                + ";"
            );
            if(status){ JOptionPane.showMessageDialog(null, "Deletado com sucesso");
            }else{
                JOptionPane.showMessageDialog(null, "Houve um erro ao apagar");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Houve um erro ao apagar Funcionário");
        } finally {mySQLcon.fechaBanco();
        }
    }//GEN-LAST:event_butExcluirMouseClicked

    private void butBuscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_butBuscarMouseClicked
        mySQLcon.conectaBanco();
        novoFuncionario= new Funcionario();

        String cpf = txtCPF1.getText();
        try {this.mySQLcon.executarSQL(
            "SELECT "
            + "nome,"
            + "cpf,"
            + "email"
            + " FROM"
            + " funcionario"
            + " WHERE"
            + " cpf = '" + cpf + "'"
            + ";"
        );
        while(mySQLcon.getResultSet().next()){
            novoFuncionario.setNome(mySQLcon.getResultSet().getString(1));
            novoFuncionario.setCpf(mySQLcon.getResultSet().getString(2));
            novoFuncionario.setEmail(mySQLcon.getResultSet().getString(3));
        }
        if(novoFuncionario.getNome().equals("")){
            JOptionPane.showMessageDialog(null, "Houve algum problema ao consultar cadastro");
        }else{
            txtNome1.setText(novoFuncionario.getNome());
            txtCPF1.setText(novoFuncionario.getCpf());
            txtEmail1.setText(novoFuncionario.getEmail());

        }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Houve algum problema com a conexão do servidor");
        } finally {  mySQLcon.fechaBanco();
        }
    }//GEN-LAST:event_butBuscarMouseClicked

    private void butLimparMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_butLimparMouseClicked
        apagaBusca();
    }//GEN-LAST:event_butLimparMouseClicked

    private void butProdutoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_butProdutoMouseClicked
        TelaDeProduto minhaTela = new TelaDeProduto();
        minhaTela.setVisible(true);
        dispose();
    }//GEN-LAST:event_butProdutoMouseClicked
    public void apagaCadastro(){
        txtNome.setText("");
        txtCPF.setText("");
        txtEmail.setText("");
    }
    public void apagaBusca(){
        txtNome1.setText("");
        txtCPF1.setText("");
        txtEmail1.setText("");
    }
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
            java.util.logging.Logger.getLogger(TelaDeFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaDeFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaDeFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaDeFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaDeFuncionario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel butAtualizar;
    private javax.swing.JLabel butBuscar;
    private javax.swing.JLabel butCadastrar;
    private javax.swing.JLabel butConfig;
    private javax.swing.JLabel butExcluir;
    private javax.swing.JLabel butFechar;
    private javax.swing.JLabel butFuncionario;
    private javax.swing.JLabel butIncio;
    private javax.swing.JLabel butLimpar;
    private javax.swing.JLabel butProduto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JFormattedTextField txtCPF;
    private javax.swing.JFormattedTextField txtCPF1;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtEmail1;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtNome1;
    // End of variables declaration//GEN-END:variables
}
