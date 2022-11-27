package Telas;
import Conexoes.MySQL;
import javax.swing.JOptionPane;
import Classes.Produto;

public class TelaDeProduto extends javax.swing.JFrame {
    MySQL mySQLcon;
    Produto novoProduto;
    String tipo = null;
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
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        txtEmbalagem = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtDesc = new javax.swing.JTextPane();
        CmbProdutos = new javax.swing.JComboBox<>();
        jLabel16 = new javax.swing.JLabel();
        CmbTipos = new javax.swing.JComboBox<>();
        jLabel23 = new javax.swing.JLabel();
        txtValor = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        txtTamanho = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        txtMarca = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        butAtualizar = new javax.swing.JLabel();
        butExcluir = new javax.swing.JLabel();
        butBuscar = new javax.swing.JLabel();
        butLimpar = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        CmbTipos1 = new javax.swing.JComboBox<>();
        jLabel25 = new javax.swing.JLabel();
        CmbProdutos1 = new javax.swing.JComboBox<>();
        jLabel27 = new javax.swing.JLabel();
        txtValor1 = new javax.swing.JTextField();
        txtTamanho1 = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        txtMarca1 = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        txtEmbalagem1 = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        butFechar = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        butIncio = new javax.swing.JLabel();
        butFuncionario = new javax.swing.JLabel();
        butConfig = new javax.swing.JLabel();
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

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 51));
        jLabel13.setText("Tamanho.");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 140, 150, 70));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 0, 51));
        jLabel14.setText("Descrição.");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, 150, 70));

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 0, 51));
        jLabel15.setText("Marca.");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 20, 150, 70));

        txtEmbalagem.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        txtEmbalagem.setForeground(new java.awt.Color(0, 0, 51));
        jPanel1.add(txtEmbalagem, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 210, 290, 50));

        jScrollPane1.setViewportView(txtDesc);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 280, 270, 90));

        CmbProdutos.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        CmbProdutos.setForeground(new java.awt.Color(0, 0, 51));
        jPanel1.add(CmbProdutos, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 90, 290, 50));

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(0, 0, 51));
        jLabel16.setText("Produtos.");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 20, 150, 70));

        CmbTipos.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        CmbTipos.setForeground(new java.awt.Color(0, 0, 51));
        CmbTipos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Brinquedo", "Ração", "Acessórios" }));
        CmbTipos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CmbTiposActionPerformed(evt);
            }
        });
        jPanel1.add(CmbTipos, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 180, 50));

        jLabel23.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(0, 0, 51));
        jLabel23.setText("Valor.");
        jPanel1.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 150, 70));

        txtValor.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        txtValor.setForeground(new java.awt.Color(0, 0, 51));
        jPanel1.add(txtValor, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 180, 50));

        jLabel20.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(0, 0, 51));
        jLabel20.setText("Tipos.");
        jPanel1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 150, 70));

        txtTamanho.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        txtTamanho.setForeground(new java.awt.Color(0, 0, 51));
        jPanel1.add(txtTamanho, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 210, 180, 50));

        jLabel21.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(0, 0, 51));
        jLabel21.setText("Embalagem.");
        jPanel1.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 140, 150, 70));

        txtMarca.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        txtMarca.setForeground(new java.awt.Color(0, 0, 51));
        jPanel1.add(txtMarca, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 90, 180, 50));

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

        jLabel22.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(0, 0, 51));
        jLabel22.setText("Tipos.");
        jPanel4.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 150, 70));

        CmbTipos1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        CmbTipos1.setForeground(new java.awt.Color(0, 0, 51));
        CmbTipos1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Brinquedo", "Ração", "Acessórios" }));
        CmbTipos1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CmbTipos1ActionPerformed(evt);
            }
        });
        jPanel4.add(CmbTipos1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 180, 50));

        jLabel25.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(0, 0, 51));
        jLabel25.setText("Produtos.");
        jPanel4.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 20, 150, 70));

        CmbProdutos1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        CmbProdutos1.setForeground(new java.awt.Color(0, 0, 51));
        jPanel4.add(CmbProdutos1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 90, 290, 50));

        jLabel27.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(0, 0, 51));
        jLabel27.setText("Valor.");
        jPanel4.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 150, 70));

        txtValor1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        txtValor1.setForeground(new java.awt.Color(0, 0, 51));
        jPanel4.add(txtValor1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 180, 50));

        txtTamanho1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        txtTamanho1.setForeground(new java.awt.Color(0, 0, 51));
        jPanel4.add(txtTamanho1, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 210, 180, 50));

        jLabel29.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(0, 0, 51));
        jLabel29.setText("Tamanho.");
        jPanel4.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 140, 150, 70));

        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(0, 0, 51));
        jLabel17.setText("Marca.");
        jPanel4.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 20, 150, 70));

        txtMarca1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        txtMarca1.setForeground(new java.awt.Color(0, 0, 51));
        jPanel4.add(txtMarca1, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 90, 180, 50));

        jLabel24.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(0, 0, 51));
        jLabel24.setText("Embalagem.");
        jPanel4.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 140, 150, 70));

        txtEmbalagem1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        txtEmbalagem1.setForeground(new java.awt.Color(0, 0, 51));
        jPanel4.add(txtEmbalagem1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 210, 290, 50));

        jTabbedPane1.addTab("Busca", jPanel4);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 710, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 393, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("tab3", jPanel5);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 710, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 393, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("tab4", jPanel6);

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
        jLabel6.setText("Funções.");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 20, 170, 70));

        butFechar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/icons8-fechar-janela-48.png"))); // NOI18N
        butFechar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                butFecharMouseClicked(evt);
            }
        });
        getContentPane().add(butFechar, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 20, 50, 50));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/marca dagua (1).png"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 10, 200, -1));

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

    private void butBuscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_butBuscarMouseClicked
        mySQLcon.conectaBanco();
        novoProduto= new Produto();

        String tipos = (String)CmbTipos1.getSelectedItem();
        String produtos = (String)CmbProdutos1.getSelectedItem();
        String marca = txtMarca1.getText();
               
        try {this.mySQLcon.executarSQL(
            "SELECT "
            + "tipo,"
            + "produtos,"
            + "valor,"
            + "marca,"
            + "tamanho,"
            + "embalagem"
            + " FROM"
            + " produto"
            + " WHERE "
            + "tipo = '" + tipos + "'"
            + " AND "
            + "produtos = '" + produtos + "'"
            + " AND "
            + "marca = '" + marca + "'"
            + ";"
        );
        while(mySQLcon.getResultSet().next()){
            novoProduto.setTipo(mySQLcon.getResultSet().getString(1));
            novoProduto.setProdutos(mySQLcon.getResultSet().getString(2));
            novoProduto.setValor(mySQLcon.getResultSet().getInt(3));
            novoProduto.setMarca(mySQLcon.getResultSet().getString(4));
            novoProduto.setTamanho(mySQLcon.getResultSet().getInt(5));
            novoProduto.setEmbalagem(mySQLcon.getResultSet().getString(6));
        }
        if(novoProduto.getMarca().equals("")){
            JOptionPane.showMessageDialog(null, "Houve algum problema ao consultar produto");
        }else{
            JOptionPane.showMessageDialog(null, "Produto localizado com sucesso");
            CmbTipos1.setSelectedItem(novoProduto.getTipo());
            CmbProdutos1.setSelectedItem(novoProduto.getProdutos());
            txtMarca1.setText(novoProduto.getMarca());
            txtValor1.setText(String.valueOf(novoProduto.getValor()));
            txtTamanho1.setText(String.valueOf(novoProduto.getTamanho()));
            txtEmbalagem1.setText(novoProduto.getEmbalagem());
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

        String tipos = (String)CmbTipos1.getSelectedItem();
        String produtos = (String)CmbProdutos1.getSelectedItem();
        String marca = txtMarca1.getText();
        
        
        try {status = this.mySQLcon.updateSQL(
            "UPDATE produto SET "
            + "tipo = '" + CmbTipos1.getSelectedItem() + "',"
            + "produtos = '" + CmbProdutos1.getSelectedItem() + "',"
            + "valor = '" + txtValor1.getText() + "',"
            + "marca = '" + txtMarca1.getText() + "',"
            + "tamanho = '" + txtTamanho1.getText() + "',"
            + "embalagem = '" + txtEmbalagem1.getText() + "'"
            + " WHERE "
            + "tipo = '" + tipos + "'"
            + " AND "
            + "produtos = '" + produtos + "'"
            + " AND "
            + "marca = '" + marca + "'"
            + ";"
        );
        if(status){JOptionPane.showMessageDialog(null, "Atualização realizada com sucesso"); apagaBusca();
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

        String tipos = (String)CmbTipos1.getSelectedItem();
        String produtos = (String)CmbProdutos1.getSelectedItem();
        String marca = txtMarca1.getText();

        try {
            status = this.mySQLcon.updateSQL(
                "DELETE FROM produto "
                + " WHERE "
            + "tipo = '" + tipos + "'"
            + " AND "
            + "produtos = '" + produtos + "'"
            + " AND "
            + "marca = '" + marca + "'"
            + ";"
            );
            if(status){ JOptionPane.showMessageDialog(null, "Deletado com sucesso"); apagaBusca();
            }else{
                JOptionPane.showMessageDialog(null, "Houve um erro ao apagar");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Houve um erro ao apagar Produto");
        } finally {mySQLcon.fechaBanco();
        }
    }//GEN-LAST:event_butExcluirMouseClicked

    private void butIncioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_butIncioMouseClicked
        TelaDeInicio minhaTela = new TelaDeInicio();
        minhaTela.setVisible(true);
        dispose();
    }//GEN-LAST:event_butIncioMouseClicked

    private void butFuncionarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_butFuncionarioMouseClicked
        TelaDeFuncionario minhaTela = new TelaDeFuncionario();
        minhaTela.setVisible(true);
        dispose();
    }//GEN-LAST:event_butFuncionarioMouseClicked

    private void butConfigMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_butConfigMouseClicked
        TelaDeConfig minhaTela = new TelaDeConfig();
        minhaTela.setVisible(true);
        dispose();
    }//GEN-LAST:event_butConfigMouseClicked

    private void butProdutoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_butProdutoMouseClicked
        TelaDeProduto minhaTela = new TelaDeProduto();
        minhaTela.setVisible(true);
        dispose();
    }//GEN-LAST:event_butProdutoMouseClicked

    private void butCadastrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_butCadastrarMouseClicked
        int status=0;
        mySQLcon.conectaBanco();

        novoProduto = new Produto();
        
        novoProduto.setProdutos((String)CmbProdutos.getSelectedItem());
        novoProduto.setTipo((String)CmbTipos.getSelectedItem());
        novoProduto.setValor(Integer.parseInt(txtValor.getText()));
        novoProduto.setMarca(txtMarca.getText());
        novoProduto.setDescricao(txtDesc.getText());
        novoProduto.setTamanho(Integer.parseInt(txtTamanho.getText()));
        novoProduto.setEmbalagem(txtEmbalagem.getText());
        
        try {
            status = this.mySQLcon.insertSQL("INSERT INTO produto ("
                + "tipo,"
                + "produtos,"
                + "valor,"
                + "marca,"
                + "descricao,"
                + "tamanho,"
                + "embalagem"
                + ") VALUES ("
                + "'" + novoProduto.getTipo()+ "',"
                + "'" + novoProduto.getProdutos()+ "',"
                + "'" + novoProduto.getValor()+ "',"
                + "'" + novoProduto.getMarca()+ "',"
                + "'" + novoProduto.getDescricao()+ "',"
                + "'" + novoProduto.getTamanho()+ "',"
                + "'" + novoProduto.getEmbalagem()+ "'"
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

    private void CmbTiposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CmbTiposActionPerformed
        tipo = (String)CmbTipos.getSelectedItem();
        switch(tipo){
            case "Brinquedo":
                CmbProdutos.removeAllItems();
        this.mySQLcon.conectaBanco();
    try{
        this.mySQLcon.executarSQL(
            "SELECT "
                +"nome"
            +" FROM "
                +"brinquedo"
        );
        while(this.mySQLcon.getResultSet().next()){   
            CmbProdutos.addItem(this.mySQLcon.getResultSet().getString(1));
        }
            
            }catch (Exception e){
                System.out.println("Erro ao consultar Tipo "+ e.getMessage());
                JOptionPane.showMessageDialog(null, "Erro ao buscar Tipo!");
            }finally{
            
            this.mySQLcon.fechaBanco();
    }break;
    
            case "Acessórios":
                CmbProdutos.removeAllItems();
        this.mySQLcon.conectaBanco();
    try{
        this.mySQLcon.executarSQL(
            "SELECT "
                +"nome"
            +" FROM "
                +"acessorios"
        );
        while(this.mySQLcon.getResultSet().next()){   
            CmbProdutos.addItem(this.mySQLcon.getResultSet().getString(1));
        }
            
            }catch (Exception e){
                System.out.println("Erro ao consultar Tipo "+ e.getMessage());
                JOptionPane.showMessageDialog(null, "Erro ao buscar Tipo!");
            }finally{
            
            this.mySQLcon.fechaBanco();
    }break;
    
            case "Ração":
                CmbProdutos.removeAllItems();
        this.mySQLcon.conectaBanco();
    try{
        this.mySQLcon.executarSQL(
            "SELECT "
                +"nome"
            +" FROM "
                +"racao"
        );
        while(this.mySQLcon.getResultSet().next()){   
            CmbProdutos.addItem(this.mySQLcon.getResultSet().getString(1));
        }
            
            }catch (Exception e){
                System.out.println("Erro ao consultar Tipo "+ e.getMessage());
                JOptionPane.showMessageDialog(null, "Erro ao buscar Tipo!");
            }finally{
            
            this.mySQLcon.fechaBanco();
    }break;
        }
    }//GEN-LAST:event_CmbTiposActionPerformed

    private void CmbTipos1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CmbTipos1ActionPerformed
        tipo = (String)CmbTipos1.getSelectedItem();
        switch(tipo){
            case "Brinquedo":
                CmbProdutos1.removeAllItems();
        this.mySQLcon.conectaBanco();
    try{
        this.mySQLcon.executarSQL(
            "SELECT "
                +"nome"
            +" FROM "
                +"brinquedo"
        );
        while(this.mySQLcon.getResultSet().next()){   
            CmbProdutos1.addItem(this.mySQLcon.getResultSet().getString(1));
        }
            
            }catch (Exception e){
                System.out.println("Erro ao consultar Tipo "+ e.getMessage());
                JOptionPane.showMessageDialog(null, "Erro ao buscar Tipo!");
            }finally{
            
            this.mySQLcon.fechaBanco();
    }break;
    
            case "Acessórios":
                CmbProdutos1.removeAllItems();
        this.mySQLcon.conectaBanco();
    try{
        this.mySQLcon.executarSQL(
            "SELECT "
                +"nome"
            +" FROM "
                +"acessorios"
        );
        while(this.mySQLcon.getResultSet().next()){   
            CmbProdutos1.addItem(this.mySQLcon.getResultSet().getString(1));
        }
            
            }catch (Exception e){
                System.out.println("Erro ao consultar Tipo "+ e.getMessage());
                JOptionPane.showMessageDialog(null, "Erro ao buscar Tipo!");
            }finally{
            
            this.mySQLcon.fechaBanco();
    }break;
    
            case "Ração":
                CmbProdutos1.removeAllItems();
        this.mySQLcon.conectaBanco();
    try{
        this.mySQLcon.executarSQL(
            "SELECT "
                +"nome"
            +" FROM "
                +"racao"
        );
        while(this.mySQLcon.getResultSet().next()){   
            CmbProdutos1.addItem(this.mySQLcon.getResultSet().getString(1));
        }
            
            }catch (Exception e){
                System.out.println("Erro ao consultar Tipo "+ e.getMessage());
                JOptionPane.showMessageDialog(null, "Erro ao buscar Tipo!");
            }finally{
            
            this.mySQLcon.fechaBanco();
    }break;
        }
    }//GEN-LAST:event_CmbTipos1ActionPerformed
    public void apagaCadastro(){
        CmbProdutos.setSelectedIndex(0);
        CmbTipos.setSelectedIndex(0);
        txtDesc.setText("");
        txtEmbalagem.setText("");
        txtValor.setText("");
        txtMarca.setText("");
        txtTamanho.setText("");
    }
    public void apagaBusca(){
        CmbProdutos1.setSelectedIndex(0);
        CmbTipos1.setSelectedIndex(0);
        txtEmbalagem1.setText("");
        txtValor1.setText("");
        txtMarca1.setText("");
        txtTamanho1.setText("");
    }
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaDeProduto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> CmbProdutos;
    private javax.swing.JComboBox<String> CmbProdutos1;
    private javax.swing.JComboBox<String> CmbTipos;
    private javax.swing.JComboBox<String> CmbTipos1;
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
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextPane txtDesc;
    private javax.swing.JTextField txtEmbalagem;
    private javax.swing.JTextField txtEmbalagem1;
    private javax.swing.JTextField txtMarca;
    private javax.swing.JTextField txtMarca1;
    private javax.swing.JTextField txtTamanho;
    private javax.swing.JTextField txtTamanho1;
    private javax.swing.JTextField txtValor;
    private javax.swing.JTextField txtValor1;
    // End of variables declaration//GEN-END:variables
}
