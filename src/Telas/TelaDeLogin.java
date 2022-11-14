package Telas;

import Classes.Funcionario;
import Conexoes.MySQL;
import javax.swing.JOptionPane;

public class TelaDeLogin extends javax.swing.JFrame {
    MySQL mySQLcon;
    Funcionario novoFuncionario;
    public TelaDeLogin() {
        initComponents();
        mySQLcon = new MySQL();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        butFechar = new javax.swing.JLabel();
        butMenuCad = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        TxtSenha = new javax.swing.JPasswordField();
        txtUsuario = new javax.swing.JTextField();
        butEntrar = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        butMenuLog = new javax.swing.JLabel();
        Esconder = new javax.swing.JLabel();
        Mostrar = new javax.swing.JLabel();
        Mostrar2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

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

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 51));
        jLabel1.setText("Senha.");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 350, 150, 70));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 51));
        jLabel2.setText("Menu.");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 110, 70));

        butFechar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/icons8-fechar-janela-48.png"))); // NOI18N
        butFechar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                butFecharMouseClicked(evt);
            }
        });
        getContentPane().add(butFechar, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 20, 50, 50));

        butMenuCad.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        butMenuCad.setForeground(new java.awt.Color(0, 0, 51));
        butMenuCad.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/icons8-add-user-male-30.png"))); // NOI18N
        butMenuCad.setText("Cadastro");
        butMenuCad.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                butMenuCadMouseClicked(evt);
            }
        });
        getContentPane().add(butMenuCad, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, -1, 70));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 51));
        jLabel4.setText("Usuário.");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 180, 150, 70));

        TxtSenha.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        TxtSenha.setForeground(new java.awt.Color(0, 0, 51));
        getContentPane().add(TxtSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 430, 250, 70));

        txtUsuario.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        txtUsuario.setForeground(new java.awt.Color(0, 0, 51));
        getContentPane().add(txtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 250, 250, 70));

        butEntrar.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        butEntrar.setForeground(new java.awt.Color(0, 0, 51));
        butEntrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/icons8-login-arredondado-à-direita-60.png"))); // NOI18N
        butEntrar.setText("Entrar");
        butEntrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                butEntrarMouseClicked(evt);
            }
        });
        getContentPane().add(butEntrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 420, 200, 90));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 51));
        jLabel5.setText("Login.");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 20, 110, 70));

        butMenuLog.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        butMenuLog.setForeground(new java.awt.Color(0, 0, 51));
        butMenuLog.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/icons8-login-rounded-40.png"))); // NOI18N
        butMenuLog.setText("Login");
        butMenuLog.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                butMenuLogMouseClicked(evt);
            }
        });
        getContentPane().add(butMenuLog, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 110, 70));

        Esconder.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/icons8-visível-60.png"))); // NOI18N
        Esconder.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EsconderMouseClicked(evt);
            }
        });
        getContentPane().add(Esconder, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 430, 70, 70));

        Mostrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/icons8-ocultar-60.png"))); // NOI18N
        Mostrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MostrarMouseClicked(evt);
            }
        });
        getContentPane().add(Mostrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 430, 70, 70));

        Mostrar2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/icons8-usuário-60.png"))); // NOI18N
        getContentPane().add(Mostrar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 250, 70, 70));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/marca dagua (1).png"))); // NOI18N
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 0, 200, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void butFecharMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_butFecharMouseClicked
        dispose();
    }//GEN-LAST:event_butFecharMouseClicked

    private void butEntrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_butEntrarMouseClicked
        mySQLcon.conectaBanco();
        novoFuncionario= new Funcionario();

        String usuario = txtUsuario.getText();
        try {this.mySQLcon.executarSQL(
                   "SELECT "
                    + "nome,"
                    + "cpf,"
                    + "senha"
                 + " FROM"
                     + " cadastroclientes"
                 + " WHERE"
                     + " nome = '" + usuario + "'"
                + ";"
            );
        while(mySQLcon.getResultSet().next()){
            novoFuncionario.setNome(mySQLcon.getResultSet().getString(1));
            novoFuncionario.setCpf(mySQLcon.getResultSet().getString(2));
            novoFuncionario.setSenha(mySQLcon.getResultSet().getString(3));
        }
        if(novoFuncionario.getNome().equals("")){
            JOptionPane.showMessageDialog(null, "Houve algum problema ao consultar cadastro");
        }else{
            JOptionPane.showMessageDialog(null, "Bem Vindo");
            TelaDeInicio minhaTela = new TelaDeInicio();
            minhaTela.setVisible(true);
            dispose();
        }
        } catch (Exception e) { 
          JOptionPane.showMessageDialog(null, "Houve algum problema com a conexão do servidor");
        } finally {  mySQLcon.fechaBanco();
        }
    
    }//GEN-LAST:event_butEntrarMouseClicked

    private void butMenuLogMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_butMenuLogMouseClicked
        TelaDeLogin minhaTela = new TelaDeLogin();
        minhaTela.setVisible(true);
        dispose();
    }//GEN-LAST:event_butMenuLogMouseClicked

    private void EsconderMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EsconderMouseClicked
        TxtSenha.setEchoChar((char)(8226));
        Mostrar.setVisible(true);
        Mostrar.setEnabled(true);
        Esconder.setVisible(false);
        Esconder.setEnabled(false);
    }//GEN-LAST:event_EsconderMouseClicked

    private void MostrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MostrarMouseClicked
        TxtSenha.setEchoChar((char)(0));
        Mostrar.setVisible(false);
        Mostrar.setEnabled(false);
        Esconder.setVisible(true);
        Esconder.setEnabled(true);
    }//GEN-LAST:event_MostrarMouseClicked

    private void butMenuCadMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_butMenuCadMouseClicked
        TelaDeCadastro minhaTela = new TelaDeCadastro();
        minhaTela.setVisible(true);
        dispose();
    }//GEN-LAST:event_butMenuCadMouseClicked
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaDeLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Esconder;
    private javax.swing.JLabel Mostrar;
    private javax.swing.JLabel Mostrar2;
    private javax.swing.JPasswordField TxtSenha;
    private javax.swing.JLabel butEntrar;
    private javax.swing.JLabel butFechar;
    private javax.swing.JLabel butMenuCad;
    private javax.swing.JLabel butMenuLog;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
