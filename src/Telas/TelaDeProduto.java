package Telas;
import Conexoes.MySQL;
import javax.swing.JOptionPane;
import Classes.Produto;

public class TelaDeProduto extends javax.swing.JFrame {
    MySQL mySQLcon;
    Produto novoProduto;
    
    public TelaDeProduto() {
        initComponents();
        mySQLcon = new MySQL();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        butCadastrar = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtTamanho = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtIcms = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtFornecedor = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        txtProduto = new javax.swing.JTextField();
        txtCusto = new javax.swing.JTextField();
        txtValor = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtDesc = new javax.swing.JTextPane();
        jPanel4 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        txtProduto1 = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        txtFornecedor1 = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        txtTamanho1 = new javax.swing.JTextField();
        txtCusto1 = new javax.swing.JTextField();
        txtValor1 = new javax.swing.JTextField();
        txtIcms1 = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        butAtualizar = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        butExcluir = new javax.swing.JLabel();
        butBuscar = new javax.swing.JLabel();
        butLimpar = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        butInicio = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        butFechar = new javax.swing.JLabel();
        butProduto = new javax.swing.JLabel();
        butConfig = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

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

        butCadastrar.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        butCadastrar.setForeground(new java.awt.Color(0, 0, 51));
        butCadastrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/icons8-login-arredondado-à-direita-60.png"))); // NOI18N
        butCadastrar.setText("Cadastrar");
        butCadastrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                butCadastrarMouseClicked(evt);
            }
        });
        jPanel1.add(butCadastrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 280, 240, 90));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 51));
        jLabel7.setText("Fornecedor.");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 20, 150, 70));

        txtTamanho.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        txtTamanho.setForeground(new java.awt.Color(0, 0, 51));
        jPanel1.add(txtTamanho, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 90, 200, 50));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 51));
        jLabel11.setText("Tamanho.");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 20, 150, 70));

        txtIcms.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        txtIcms.setForeground(new java.awt.Color(0, 0, 51));
        jPanel1.add(txtIcms, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 210, 200, 50));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 51));
        jLabel12.setText("ICMS.");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 140, 150, 70));

        txtFornecedor.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        txtFornecedor.setForeground(new java.awt.Color(0, 0, 51));
        jPanel1.add(txtFornecedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 90, 200, 50));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 51));
        jLabel13.setText("Produto.");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 150, 70));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 0, 51));
        jLabel14.setText("Descrição.");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, 150, 70));

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 0, 51));
        jLabel15.setText("Valor.");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 140, 150, 70));

        txtProduto.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        txtProduto.setForeground(new java.awt.Color(0, 0, 51));
        jPanel1.add(txtProduto, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 200, 50));

        txtCusto.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        txtCusto.setForeground(new java.awt.Color(0, 0, 51));
        jPanel1.add(txtCusto, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 200, 50));

        txtValor.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        txtValor.setForeground(new java.awt.Color(0, 0, 51));
        jPanel1.add(txtValor, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 210, 200, 50));

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(0, 0, 51));
        jLabel16.setText("Custo.");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 150, 70));

        jScrollPane1.setViewportView(txtDesc);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 280, 270, 90));

        jTabbedPane1.addTab("Cadastro", jPanel1);

        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(0, 0, 51));
        jLabel17.setText("Produto.");
        jPanel4.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 150, 70));

        txtProduto1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        txtProduto1.setForeground(new java.awt.Color(0, 0, 51));
        jPanel4.add(txtProduto1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 200, 50));

        jLabel18.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(0, 0, 51));
        jLabel18.setText("Fornecedor.");
        jPanel4.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 20, 150, 70));

        txtFornecedor1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        txtFornecedor1.setForeground(new java.awt.Color(0, 0, 51));
        jPanel4.add(txtFornecedor1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 90, 200, 50));

        jLabel19.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(0, 0, 51));
        jLabel19.setText("Tamanho.");
        jPanel4.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 20, 150, 70));

        txtTamanho1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        txtTamanho1.setForeground(new java.awt.Color(0, 0, 51));
        jPanel4.add(txtTamanho1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 90, 200, 50));

        txtCusto1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        txtCusto1.setForeground(new java.awt.Color(0, 0, 51));
        jPanel4.add(txtCusto1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 200, 50));

        txtValor1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        txtValor1.setForeground(new java.awt.Color(0, 0, 51));
        jPanel4.add(txtValor1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 210, 200, 50));

        txtIcms1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        txtIcms1.setForeground(new java.awt.Color(0, 0, 51));
        jPanel4.add(txtIcms1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 210, 200, 50));

        jLabel20.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(0, 0, 51));
        jLabel20.setText("ICMS.");
        jPanel4.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 140, 150, 70));

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

        jLabel21.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(0, 0, 51));
        jLabel21.setText("Valor.");
        jPanel4.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 140, 150, 70));

        jLabel22.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(0, 0, 51));
        jLabel22.setText("Custo.");
        jPanel4.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 150, 70));

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
        jPanel4.add(butBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, 125, 40));

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
        jPanel4.add(butLimpar, new org.netbeans.lib.awtextra.AbsoluteConstraints(195, 310, 125, 40));

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

        butInicio.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        butInicio.setForeground(new java.awt.Color(0, 0, 51));
        butInicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/icons8-home-page-40.png"))); // NOI18N
        butInicio.setText("Início");
        butInicio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                butInicioMouseClicked(evt);
            }
        });
        getContentPane().add(butInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 170, 70));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 51));
        jLabel6.setText("Produto.");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 20, 170, 70));

        butFechar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/icons8-fechar-janela-48.png"))); // NOI18N
        butFechar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                butFecharMouseClicked(evt);
            }
        });
        getContentPane().add(butFechar, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 20, 50, 50));

        butProduto.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        butProduto.setForeground(new java.awt.Color(0, 0, 51));
        butProduto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/icons8-product-30.png"))); // NOI18N
        butProduto.setText("Produto.");
        butProduto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                butProdutoMouseClicked(evt);
            }
        });
        getContentPane().add(butProduto, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, 160, 70));

        butConfig.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        butConfig.setForeground(new java.awt.Color(0, 0, 51));
        butConfig.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/icons8-services-40.png"))); // NOI18N
        butConfig.setText("Config");
        butConfig.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                butConfigMouseClicked(evt);
            }
        });
        getContentPane().add(butConfig, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 370, 150, 100));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/marca dagua (1).png"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 0, 200, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void butInicioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_butInicioMouseClicked
        TelaDeInicio minhaTela = new TelaDeInicio();
        minhaTela.setVisible(true);
        dispose();
    }//GEN-LAST:event_butInicioMouseClicked

    private void butFecharMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_butFecharMouseClicked
        dispose();
    }//GEN-LAST:event_butFecharMouseClicked

    private void butProdutoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_butProdutoMouseClicked
        TelaDeProduto minhaTela = new TelaDeProduto();
        minhaTela.setVisible(true);
        dispose();
    }//GEN-LAST:event_butProdutoMouseClicked

    private void butConfigMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_butConfigMouseClicked
        TelaDeConfig minhaTela = new TelaDeConfig();
        minhaTela.setVisible(true);
        dispose();
    }//GEN-LAST:event_butConfigMouseClicked

    private void butBuscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_butBuscarMouseClicked
        mySQLcon.conectaBanco();
        novoProduto= new Produto();

        String produto = txtProduto1.getText();
        String fornecedor = txtFornecedor1.getText();
        try {this.mySQLcon.executarSQL(
                   "SELECT "
                    + "produto,"
                    + "fornecedor,"
                    + "tamanho,"
                    + "descricao,"
                    + "custo,"
                    + "venda,"
                    + "icms"
                 + " FROM"
                     + " cadastroproduto"
                 + " WHERE"
                     + " produto = '" + produto + "'"
                 + " AND"
                     + " fornecedor = '" + fornecedor + "'"
                + ";"
            );
        while(mySQLcon.getResultSet().next()){
            novoProduto.setProduto(mySQLcon.getResultSet().getString(1));
            novoProduto.setFornecedor(mySQLcon.getResultSet().getString(2));
            novoProduto.setTamanho(mySQLcon.getResultSet().getInt(3));
            novoProduto.setCusto(mySQLcon.getResultSet().getInt(5));
            novoProduto.setVenda(mySQLcon.getResultSet().getInt(6));
            novoProduto.setICMS(mySQLcon.getResultSet().getInt(7));
        }
        if(novoProduto.getProduto().equals("")){
            JOptionPane.showMessageDialog(null, "Houve algum problema ao consultar cadastro");
        }else{
        txtProduto1.setText(novoProduto.getProduto());
        txtFornecedor1.setText(novoProduto.getFornecedor());
        txtTamanho1.setText(String.valueOf(novoProduto.getTamanho()));
        txtCusto1.setText(String.valueOf(novoProduto.getCusto()));
        txtValor1.setText(String.valueOf(novoProduto.getVenda()));
        txtIcms1.setText(String.valueOf(novoProduto.getICMS()));
        
        }
        } catch (Exception e) { 
          JOptionPane.showMessageDialog(null, "Houve algum problema com a conexão do servidor");
        } finally {  mySQLcon.fechaBanco();
        }
    }//GEN-LAST:event_butBuscarMouseClicked

    private void butLimparMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_butLimparMouseClicked
        apagaBusca();
    }//GEN-LAST:event_butLimparMouseClicked

    private void butAtualizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_butAtualizarMouseClicked
        mySQLcon.conectaBanco();
        boolean status = false;

        String produto = txtProduto1.getText();
        String fornecedor = txtFornecedor1.getText();
        try {status = this.mySQLcon.updateSQL(
                "UPDATE cadastroproduto SET "
                    + "produto = '" + txtProduto1.getText() + "',"
                    + "fornecedor = '" + txtFornecedor1.getText() + "',"
                    + "tamanho = '" + txtTamanho1.getText() + "',"
                    + "custo = '" + txtCusto1.getText() + "',"
                    + "venda = '" + txtValor1.getText() + "',"
                    + "icms = '" + txtIcms1.getText() + "'"
                + " WHERE "
                    + "produto = '" + produto + "'"
                + " AND"
                     + " fornecedor = '" + fornecedor + "'"
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

        String produto = txtProduto1.getText();
        String fornecedor = txtFornecedor1.getText();
        
        try {
             status = this.mySQLcon.updateSQL(
                "DELETE FROM cadastroproduto "
                + " WHERE "
                    + "produto = '" + produto + "'"
                + " AND"
                     + " fornecedor = '" + fornecedor + "'"
                + ";"
             );
             if(status){ JOptionPane.showMessageDialog(null, "Deletado com sucesso");
             }else{
                JOptionPane.showMessageDialog(null, "Houve um erro ao apagar");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Houve um erro ao apagar Cliente");
        } finally {mySQLcon.fechaBanco();
        }
    }//GEN-LAST:event_butExcluirMouseClicked

    private void butCadastrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_butCadastrarMouseClicked
        int status=0;
        mySQLcon.conectaBanco();

        novoProduto = new Produto();
        novoProduto.setProduto(txtProduto.getText());
        novoProduto.setFornecedor(txtFornecedor.getText());
        novoProduto.setTamanho(Integer.parseInt(txtTamanho.getText()));
        novoProduto.setDescricao(txtDesc.getText());
        novoProduto.setCusto(Integer.parseInt(txtCusto.getText()));
        novoProduto.setVenda(Integer.parseInt(txtValor.getText()));
        novoProduto.setICMS(Integer.parseInt(txtIcms.getText()));
        try {
            status = this.mySQLcon.insertSQL("INSERT INTO cadastroproduto ("
                + "produto,"
                + "fornecedor,"
                + "tamanho,"
                + "descricao,"
                + "custo,"
                + "venda,"
                + "icms"
                + ") VALUES ("
                + "'" + novoProduto.getProduto() + "',"
                + "'" + novoProduto.getFornecedor() + "',"
                + "'" + novoProduto.getTamanho() + "',"
                + "'" + novoProduto.getDescricao() + "',"
                + "'" + novoProduto.getCusto() + "',"
                + "'" + novoProduto.getVenda() + "',"
                + "'" + novoProduto.getICMS() + "'"
                + ");");
            if(status == 1){
                JOptionPane.showMessageDialog(null, "Produto cadastrado com sucesso");
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
    public void apagaCadastro(){
        txtProduto.setText("");
        txtTamanho.setText("");
        txtFornecedor.setText("");
        txtCusto.setText("");
        txtValor.setText("");
        txtIcms.setText("");
        txtDesc.setText("");
    }
    public void apagaBusca(){
        txtProduto1.setText("");
        txtTamanho1.setText("");
        txtFornecedor1.setText("");
        txtCusto1.setText("");
        txtValor1.setText("");
        txtIcms1.setText("");
    }
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaDeProduto().setVisible(true);
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
    private javax.swing.JLabel butInicio;
    private javax.swing.JLabel butLimpar;
    private javax.swing.JLabel butProduto;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField txtCusto;
    private javax.swing.JTextField txtCusto1;
    private javax.swing.JTextPane txtDesc;
    private javax.swing.JTextField txtFornecedor;
    private javax.swing.JTextField txtFornecedor1;
    private javax.swing.JTextField txtIcms;
    private javax.swing.JTextField txtIcms1;
    private javax.swing.JTextField txtProduto;
    private javax.swing.JTextField txtProduto1;
    private javax.swing.JTextField txtTamanho;
    private javax.swing.JTextField txtTamanho1;
    private javax.swing.JTextField txtValor;
    private javax.swing.JTextField txtValor1;
    // End of variables declaration//GEN-END:variables
}
