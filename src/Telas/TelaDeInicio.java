/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Telas;

/**
 *
 * @author aluno
 */
public class TelaDeInicio extends javax.swing.JFrame {

    /**
     * Creates new form TelaDeInicio
     */
    public TelaDeInicio() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        butFechar = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        butProduto = new javax.swing.JLabel();
        butConfig = new javax.swing.JLabel();
        butInicio = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

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

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 51));
        jLabel2.setText("Menu.");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 110, 70));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 51));
        jLabel5.setText("Clique Aqui");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 280, 200, 70));

        butFechar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/icons8-fechar-janela-48.png"))); // NOI18N
        butFechar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                butFecharMouseClicked(evt);
            }
        });
        getContentPane().add(butFechar, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 20, 50, 50));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 51));
        jLabel1.setText("               GIF");
        jLabel1.setPreferredSize(new java.awt.Dimension(455, 225));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 270, 455, 255));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 51));
        jLabel3.setText("Cadastre os nossos produtos");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 180, 510, 70));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 51));
        jLabel6.setText("Início.");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 20, 170, 70));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/icons8-abaixo-à-direita-dentro-de-um-círculo-60.png"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 350, 60, 70));

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

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/marca dagua (1).png"))); // NOI18N
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 0, 200, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

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

    private void butInicioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_butInicioMouseClicked
        TelaDeInicio minhaTela = new TelaDeInicio();
        minhaTela.setVisible(true);
        dispose();
    }//GEN-LAST:event_butInicioMouseClicked

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
            java.util.logging.Logger.getLogger(TelaDeInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaDeInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaDeInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaDeInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaDeInicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel butConfig;
    private javax.swing.JLabel butFechar;
    private javax.swing.JLabel butInicio;
    private javax.swing.JLabel butProduto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}