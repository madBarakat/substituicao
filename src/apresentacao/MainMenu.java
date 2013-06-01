package apresentacao;

import java.awt.Toolkit;
import auxiliar.Perfil;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Thiago Lima
 */
public class MainMenu extends javax.swing.JFrame {

    /**
     * Creates new form MainMenu
     */
    public MainMenu(int perfil) {
        initComponents();
        btnGroup_Opcoes.add(rbtn_AlocacoesConfirmadas);
        btnGroup_Opcoes.add(rbtn_AlocacoesPendentes);
        btnGroup_Opcoes.add(rbtn_CriarUsuarios);
        btnGroup_Opcoes.add(rbtn_EmitirRelatorios);
        btnGroup_Opcoes.add(rbtn_NovaNotificacaoAusencia);
        resolverTelasVisiveisPorPerfil(perfil);
        
        this.setLocationRelativeTo(null);
        this.setIconImage(Toolkit.getDefaultToolkit().getImage("C:/Users/Thiago/Documents/NetBeansProjects/ProSub/mack_icon.jpg"));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnGroup_Opcoes = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        rbtn_NovaNotificacaoAusencia = new javax.swing.JRadioButton();
        rbtn_AlocacoesPendentes = new javax.swing.JRadioButton();
        rbtn_AlocacoesConfirmadas = new javax.swing.JRadioButton();
        rbtn_EmitirRelatorios = new javax.swing.JRadioButton();
        rbtn_CriarUsuarios = new javax.swing.JRadioButton();
        btn_Sair = new javax.swing.JButton();
        btn_Confirmar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menu Principal");
        setName("frm_MainMenu"); // NOI18N
        setResizable(false);

        jLabel1.setText("Opções:");

        rbtn_NovaNotificacaoAusencia.setSelected(true);
        rbtn_NovaNotificacaoAusencia.setText("Nova Notificação de Ausência");

        rbtn_AlocacoesPendentes.setText("Alocações Pendentes");
        rbtn_AlocacoesPendentes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtn_AlocacoesPendentesActionPerformed(evt);
            }
        });

        rbtn_AlocacoesConfirmadas.setText("Alocações Confirmadas");

        rbtn_EmitirRelatorios.setText("Emitir Relatórios");

        rbtn_CriarUsuarios.setText("Administrar Usuários");

        btn_Sair.setText("Sair");
        btn_Sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_SairActionPerformed(evt);
            }
        });

        btn_Confirmar.setText("Confirmar");
        btn_Confirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ConfirmarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(rbtn_AlocacoesPendentes)
                                    .addComponent(rbtn_NovaNotificacaoAusencia)
                                    .addComponent(rbtn_AlocacoesConfirmadas)
                                    .addComponent(rbtn_EmitirRelatorios)
                                    .addComponent(rbtn_CriarUsuarios))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btn_Sair)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_Confirmar)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rbtn_NovaNotificacaoAusencia)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rbtn_AlocacoesPendentes)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rbtn_AlocacoesConfirmadas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rbtn_EmitirRelatorios)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rbtn_CriarUsuarios)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_Sair)
                    .addComponent(btn_Confirmar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rbtn_AlocacoesPendentesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtn_AlocacoesPendentesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbtn_AlocacoesPendentesActionPerformed

    private void btn_SairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_SairActionPerformed
        try {
            System.exit(0);
    	} catch (Exception e) {
            System.out.println("Erro ao encerrar aplicação!");
    	}
    }//GEN-LAST:event_btn_SairActionPerformed

    private void btn_ConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ConfirmarActionPerformed
        if (rbtn_AlocacoesConfirmadas.isSelected()) {
            this.setVisible(false);
            AlocacoesPendentes alocacoesPendentes = new AlocacoesPendentes(this, false);
            alocacoesPendentes.setVisible(true);
        } else if (rbtn_AlocacoesPendentes.isSelected()) {
            this.setVisible(false);
            AlocacoesPendentes alocacoesPendentes = new AlocacoesPendentes(this, true);
            alocacoesPendentes.setVisible(true);
        } else if (rbtn_CriarUsuarios.isSelected()){
            this.setVisible(false);
            AdministrarUsuarios adminsitrarUsuarios = new AdministrarUsuarios(this);
            adminsitrarUsuarios.setVisible(true);
        } else if (rbtn_EmitirRelatorios.isSelected()) {
            this.setVisible(false);
            MenuRelatorios menuRelatorios = new MenuRelatorios(this);
            menuRelatorios.setVisible(true);
        } else if (rbtn_NovaNotificacaoAusencia.isSelected()) {
            this.setVisible(false);
            NotificarAusencia notificarAusencia = new NotificarAusencia(this);
            notificarAusencia.setVisible(true);
        }
    }//GEN-LAST:event_btn_ConfirmarActionPerformed

    private void resolverTelasVisiveisPorPerfil(int perfil){
        
        if(perfil == 1){ //admin

        }
        else if (perfil == 2){ //Funcionário
            
            rbtn_AlocacoesConfirmadas.setVisible(false);
            rbtn_CriarUsuarios.setVisible(false);
            rbtn_EmitirRelatorios.setVisible(false);
            
        }else if(perfil == 3){ //Professor
            
            rbtn_AlocacoesConfirmadas.setVisible(false);
            rbtn_CriarUsuarios.setVisible(false);
            rbtn_EmitirRelatorios.setVisible(false);
            
        }else{
            //Mensagem de erro
        }
        
    }
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
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                int perfilAdmin = 1;
                new MainMenu(perfilAdmin).setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup btnGroup_Opcoes;
    private javax.swing.JButton btn_Confirmar;
    private javax.swing.JButton btn_Sair;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JRadioButton rbtn_AlocacoesConfirmadas;
    private javax.swing.JRadioButton rbtn_AlocacoesPendentes;
    private javax.swing.JRadioButton rbtn_CriarUsuarios;
    private javax.swing.JRadioButton rbtn_EmitirRelatorios;
    private javax.swing.JRadioButton rbtn_NovaNotificacaoAusencia;
    // End of variables declaration//GEN-END:variables
}
