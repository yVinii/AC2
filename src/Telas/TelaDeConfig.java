package Telas;
import Classes.Login;
import Conexoes.MySQL;
import javax.swing.JOptionPane;

public class TelaDeConfig extends javax.swing.JFrame {
    MySQL mySQLcon;
    Login novoLogin;
    public TelaDeConfig() {
        initComponents();
        mySQLcon = new MySQL();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        txtSenha = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        butCadastrar = new javax.swing.JLabel();
        Mostrar2 = new javax.swing.JLabel();
        Esconder = new javax.swing.JLabel();
        Mostrar = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        txtSenha1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtNome1 = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        butBuscar = new javax.swing.JLabel();
        butLimpar = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        butAtualizar = new javax.swing.JLabel();
        butExcluir = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        butIncio = new javax.swing.JLabel();
        butConfig = new javax.swing.JLabel();
        butFechar = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        butFuncionario = new javax.swing.JLabel();
        butProduto = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        jTabbedPane1.setBackground(new java.awt.Color(0, 0, 51));
        jTabbedPane1.setForeground(new java.awt.Color(255, 255, 255));
        jTabbedPane1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 51));
        jLabel7.setText("Usuário.");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 150, 70));

        txtNome.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        txtNome.setForeground(new java.awt.Color(0, 0, 51));
        jPanel1.add(txtNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 250, 70));

        txtSenha.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        txtSenha.setForeground(new java.awt.Color(0, 0, 51));
        jPanel1.add(txtSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 250, 70));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 51));
        jLabel1.setText("Senha.");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 150, 70));

        butCadastrar.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        butCadastrar.setForeground(new java.awt.Color(0, 0, 51));
        butCadastrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/icons8-login-arredondado-à-direita-60.png"))); // NOI18N
        butCadastrar.setText("Cadastrar");
        butCadastrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                butCadastrarMouseClicked(evt);
            }
        });
        jPanel1.add(butCadastrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 230, 240, 90));

        Mostrar2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/icons8-usuário-60.png"))); // NOI18N
        jPanel1.add(Mostrar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 90, 70, 70));

        Esconder.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/icons8-visível-60.png"))); // NOI18N
        Esconder.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EsconderMouseClicked(evt);
            }
        });
        jPanel1.add(Esconder, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 240, 70, 70));

        Mostrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/icons8-ocultar-60.png"))); // NOI18N
        Mostrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MostrarMouseClicked(evt);
            }
        });
        jPanel1.add(Mostrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 240, 70, 70));

        jTabbedPane1.addTab("Cadastro", jPanel1);

        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 51));
        jLabel8.setText("Usuário.");
        jPanel4.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 150, 70));

        txtSenha1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        txtSenha1.setForeground(new java.awt.Color(0, 0, 51));
        jPanel4.add(txtSenha1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 200, 50));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 51));
        jLabel3.setText("Senha.");
        jPanel4.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 150, 70));

        txtNome1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        txtNome1.setForeground(new java.awt.Color(0, 0, 51));
        jPanel4.add(txtNome1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 200, 50));

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

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(29, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(butBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(butLimpar, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(butBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addComponent(butLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel4.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 200, 160, 160));

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

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(29, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(butExcluir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(butAtualizar, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(butAtualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addComponent(butExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel4.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 200, 160, 160));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/icons8-person-100.png"))); // NOI18N
        jPanel4.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 30, -1, 120));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/icons8-summary-list-100.png"))); // NOI18N
        jPanel4.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 30, -1, 120));

        jTabbedPane1.addTab("Busca", jPanel4);

        getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 100, 710, 450));

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
        jLabel6.setText("Usuário.");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 20, 220, 70));

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

        butFechar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/icons8-fechar-janela-48.png"))); // NOI18N
        butFechar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                butFecharMouseClicked(evt);
            }
        });
        getContentPane().add(butFechar, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 20, 50, 50));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/marca dagua (1).png"))); // NOI18N
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 10, 200, -1));

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

    private void butIncioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_butIncioMouseClicked
        TelaDeInicio minhaTela = new TelaDeInicio();
        minhaTela.setVisible(true);
        dispose();
    }//GEN-LAST:event_butIncioMouseClicked

    private void butConfigMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_butConfigMouseClicked
        TelaDeConfig minhaTela = new TelaDeConfig();
        minhaTela.setVisible(true);
        dispose();
    }//GEN-LAST:event_butConfigMouseClicked

    private void butFecharMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_butFecharMouseClicked
        dispose();
    }//GEN-LAST:event_butFecharMouseClicked

    private void butCadastrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_butCadastrarMouseClicked
        int status=0;
        mySQLcon.conectaBanco();

        novoLogin = new Login();
        novoLogin.setUsuario(txtNome.getText());
        novoLogin.setSenha(txtSenha.getText());

        try {
            status = this.mySQLcon.insertSQL("INSERT INTO login ("
                + "usuario,"
                + "senha"
                + ") VALUES ("
                + "'" + novoLogin.getUsuario()+ "',"
                + "'" + novoLogin.getSenha() + "'"
                + ");");
            if(status == 1){
                JOptionPane.showMessageDialog(null, "Usuário cadastrado com sucesso");
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

    private void EsconderMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EsconderMouseClicked
        txtSenha.setEchoChar((char)(8226));
        Mostrar.setVisible(true);
        Mostrar.setEnabled(true);
        Esconder.setVisible(false);
        Esconder.setEnabled(false);
    }//GEN-LAST:event_EsconderMouseClicked

    private void MostrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MostrarMouseClicked
        txtSenha.setEchoChar((char)(0));
        Mostrar.setVisible(false);
        Mostrar.setEnabled(false);
        Esconder.setVisible(true);
        Esconder.setEnabled(true);
    }//GEN-LAST:event_MostrarMouseClicked

    private void butAtualizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_butAtualizarMouseClicked
        mySQLcon.conectaBanco();
        boolean status = false;

         String usuario = txtNome1.getText();

        try {status = this.mySQLcon.updateSQL(
                "UPDATE login SET "
                    + "usuario = '" + txtNome1.getText() + "',"
                    + "senha = '" + txtSenha1.getText() + "'"
                + " WHERE "
                    + "usuario = '" + usuario + "'"
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

    private void butBuscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_butBuscarMouseClicked
        mySQLcon.conectaBanco();
        novoLogin= new Login();

        String usuario = txtNome1.getText();
        try {this.mySQLcon.executarSQL(
                   "SELECT "
                    + "usuario,"
                    + "senha"
                 + " FROM"
                     + " login"
                 + " WHERE"
                     + " usuario = '" + usuario + "'"
                + ";"
            );
        while(mySQLcon.getResultSet().next()){
            novoLogin.setUsuario(mySQLcon.getResultSet().getString(1));
            novoLogin.setSenha(mySQLcon.getResultSet().getString(2));
        }
        if(novoLogin.getUsuario().equals("")){
            JOptionPane.showMessageDialog(null, "Houve algum problema ao consultar cadastro");
        }else{
        JOptionPane.showMessageDialog(null, "Usuário encontrado");
        txtNome1.setText(novoLogin.getUsuario());
        txtSenha1.setText(novoLogin.getSenha());
        }
        } catch (Exception e) { 
          JOptionPane.showMessageDialog(null, "Houve algum problema com a conexão do servidor");
        } finally {  mySQLcon.fechaBanco();
        }
    }//GEN-LAST:event_butBuscarMouseClicked

    private void butLimparMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_butLimparMouseClicked
        apagaBusca();
    }//GEN-LAST:event_butLimparMouseClicked

    private void butExcluirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_butExcluirMouseClicked
        mySQLcon.conectaBanco();
        boolean status = false;

        String usuario = txtNome1.getText();
        try {
             status = this.mySQLcon.updateSQL(
                "DELETE FROM login "
                + " WHERE "
                    + "usuario = '" + usuario + "'"
                + ";"
             );
             if(status){ JOptionPane.showMessageDialog(null, "Deletado com sucesso");
             }else{
                JOptionPane.showMessageDialog(null, "Houve um erro ao apagar");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Houve um erro ao apagar usuário");
        } finally {mySQLcon.fechaBanco();
        }
    }//GEN-LAST:event_butExcluirMouseClicked

    private void butFuncionarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_butFuncionarioMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_butFuncionarioMouseClicked

    private void butProdutoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_butProdutoMouseClicked
        TelaDeProduto minhaTela = new TelaDeProduto();
        minhaTela.setVisible(true);
        dispose();
    }//GEN-LAST:event_butProdutoMouseClicked
    public void apagaCadastro(){
        txtNome.setText("");
        txtSenha.setText("");
    }
    public void apagaBusca(){
        txtNome1.setText("");
        txtSenha1.setText("");
    }
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaDeConfig().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Esconder;
    private javax.swing.JLabel Mostrar;
    private javax.swing.JLabel Mostrar2;
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
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtNome1;
    private javax.swing.JPasswordField txtSenha;
    private javax.swing.JTextField txtSenha1;
    // End of variables declaration//GEN-END:variables
}
