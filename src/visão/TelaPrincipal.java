
package visão;

import modeloConection.ConexaoBD;




public class TelaPrincipal extends javax.swing.JFrame {
// aqui a TelPrincipal está instanciando o BD e o nomeando de conecta,depois ele chama o método de conexão com o BD chamado "conexao".
    ConexaoBD conecta=new ConexaoBD();
    
    public TelaPrincipal() {
        initComponents();
        //método de conexãao com o bd, este método está na os scrypt ConexaoBD.
        conecta.conexao();
        
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jInternalFrameBemVindo = new javax.swing.JInternalFrame();
        jPanelInternal = new javax.swing.JPanel();
        jButtonCadMedico = new javax.swing.JButton();
        jButtonCadPacientes = new javax.swing.JButton();
        jButtonCadEnfermeiras = new javax.swing.JButton();
        jButtonAgenda = new javax.swing.JButton();
        jButtonFecharBemvindo = new javax.swing.JButton();
        jLabelPainelFundo = new javax.swing.JLabel();
        jLabelFundoPrincipal = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItemCadMedico = new javax.swing.JMenuItem();
        jMenuItemCadPaciente = new javax.swing.JMenuItem();
        jMenuItemCadEnfermeira = new javax.swing.JMenuItem();
        jMenuItemCadUsuarios = new javax.swing.JMenuItem();
        jMenuRelatórios = new javax.swing.JMenu();
        jMenuFerramentas = new javax.swing.JMenu();
        jMenuItemTelaBenvindo = new javax.swing.JMenuItem();
        jMenuSair = new javax.swing.JMenu();
        jMenuItemSair = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 204, 255));
        getContentPane().setLayout(null);

        jInternalFrameBemVindo.setTitle("Gerenciamento de cadastros");
        jInternalFrameBemVindo.setVisible(true);
        jInternalFrameBemVindo.getContentPane().setLayout(null);

        jPanelInternal.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanelInternal.setLayout(null);

        jButtonCadMedico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/CadMedicos.png"))); // NOI18N
        jButtonCadMedico.setToolTipText("cadastro de médicos");
        jButtonCadMedico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCadMedicoActionPerformed(evt);
            }
        });
        jPanelInternal.add(jButtonCadMedico);
        jButtonCadMedico.setBounds(30, 30, 100, 120);

        jButtonCadPacientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/cadPacientes.png"))); // NOI18N
        jButtonCadPacientes.setToolTipText("cadastro de pacientes");
        jPanelInternal.add(jButtonCadPacientes);
        jButtonCadPacientes.setBounds(270, 30, 100, 120);

        jButtonCadEnfermeiras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icon-infermeira.png"))); // NOI18N
        jButtonCadEnfermeiras.setToolTipText("cadastro de enfermeiras");
        jPanelInternal.add(jButtonCadEnfermeiras);
        jButtonCadEnfermeiras.setBounds(150, 30, 100, 120);

        jButtonAgenda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Agenda.png"))); // NOI18N
        jButtonAgenda.setToolTipText("agendamentos");
        jPanelInternal.add(jButtonAgenda);
        jButtonAgenda.setBounds(390, 30, 90, 120);

        jButtonFecharBemvindo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/exit.png"))); // NOI18N
        jButtonFecharBemvindo.setToolTipText("sair da página");
        jButtonFecharBemvindo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFecharBemvindoActionPerformed(evt);
            }
        });
        jPanelInternal.add(jButtonFecharBemvindo);
        jButtonFecharBemvindo.setBounds(830, 0, 50, 50);

        jLabelPainelFundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/internalframe.png"))); // NOI18N
        jPanelInternal.add(jLabelPainelFundo);
        jLabelPainelFundo.setBounds(0, 0, 880, 250);

        jInternalFrameBemVindo.getContentPane().add(jPanelInternal);
        jPanelInternal.setBounds(0, 40, 880, 250);

        getContentPane().add(jInternalFrameBemVindo);
        jInternalFrameBemVindo.setBounds(10, 60, 900, 330);

        jLabelFundoPrincipal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/fundo_telaprincipal.jpg"))); // NOI18N
        getContentPane().add(jLabelFundoPrincipal);
        jLabelFundoPrincipal.setBounds(0, 0, 920, 390);

        jMenuBar1.setBackground(new java.awt.Color(204, 204, 255));

        jMenu1.setText("Cadastros");

        jMenuItemCadMedico.setText("Médicos");
        jMenuItemCadMedico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCadMedicoActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItemCadMedico);

        jMenuItemCadPaciente.setText("Pacientes");
        jMenu1.add(jMenuItemCadPaciente);

        jMenuItemCadEnfermeira.setText("Enfermeiras");
        jMenu1.add(jMenuItemCadEnfermeira);

        jMenuItemCadUsuarios.setText("Usuários");
        jMenuItemCadUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCadUsuariosActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItemCadUsuarios);

        jMenuBar1.add(jMenu1);

        jMenuRelatórios.setText("Relatórios");
        jMenuBar1.add(jMenuRelatórios);

        jMenuFerramentas.setText("Ferramentas");

        jMenuItemTelaBenvindo.setText("Gerenciar cadastros");
        jMenuItemTelaBenvindo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemTelaBenvindoActionPerformed(evt);
            }
        });
        jMenuFerramentas.add(jMenuItemTelaBenvindo);

        jMenuBar1.add(jMenuFerramentas);

        jMenuSair.setText("Sair");

        jMenuItemSair.setText("Sair");
        jMenuItemSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemSairActionPerformed(evt);
            }
        });
        jMenuSair.add(jMenuItemSair);

        jMenuBar1.add(jMenuSair);

        setJMenuBar(jMenuBar1);

        setSize(new java.awt.Dimension(934, 455));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonFecharBemvindoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFecharBemvindoActionPerformed
        //Código que  fecha a tela internal frame BemVindo
        jInternalFrameBemVindo.dispose();
        
    }//GEN-LAST:event_jButtonFecharBemvindoActionPerformed

    private void jMenuItemSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemSairActionPerformed
        // Código do fechamento de todo o sistema
        
        System.exit(0);
    }//GEN-LAST:event_jMenuItemSairActionPerformed

    private void jMenuItemTelaBenvindoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemTelaBenvindoActionPerformed
        // Abre a tela de gerencimaneto de cadastros
        jInternalFrameBemVindo.setVisible(true);
        //TelaPrincipal tela= new TelaPrincipal();
        //tela.setVisible(true);
        //dispose();
    }//GEN-LAST:event_jMenuItemTelaBenvindoActionPerformed

    private void jButtonCadMedicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCadMedicoActionPerformed
        // código que chama a tabelade de cadastro de médicos
        FormMedico tela=new FormMedico();
        tela.setVisible(true);
        
    }//GEN-LAST:event_jButtonCadMedicoActionPerformed

    private void jMenuItemCadMedicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCadMedicoActionPerformed
        // código que chama a tela de tabela de casdastro do médico
        FormMedico tela= new FormMedico();
        tela.setVisible(true);
    }//GEN-LAST:event_jMenuItemCadMedicoActionPerformed

    private void jMenuItemCadUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCadUsuariosActionPerformed
        // TODO add your handling code here:
        FormUsuario tela= new FormUsuario();
        tela.setVisible(true);
    
    }//GEN-LAST:event_jMenuItemCadUsuariosActionPerformed

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
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAgenda;
    private javax.swing.JButton jButtonCadEnfermeiras;
    private javax.swing.JButton jButtonCadMedico;
    private javax.swing.JButton jButtonCadPacientes;
    private javax.swing.JButton jButtonFecharBemvindo;
    private javax.swing.JInternalFrame jInternalFrameBemVindo;
    private javax.swing.JLabel jLabelFundoPrincipal;
    private javax.swing.JLabel jLabelPainelFundo;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jMenuFerramentas;
    private javax.swing.JMenuItem jMenuItemCadEnfermeira;
    private javax.swing.JMenuItem jMenuItemCadMedico;
    private javax.swing.JMenuItem jMenuItemCadPaciente;
    private javax.swing.JMenuItem jMenuItemCadUsuarios;
    private javax.swing.JMenuItem jMenuItemSair;
    private javax.swing.JMenuItem jMenuItemTelaBenvindo;
    private javax.swing.JMenu jMenuRelatórios;
    private javax.swing.JMenu jMenuSair;
    private javax.swing.JPanel jPanelInternal;
    // End of variables declaration//GEN-END:variables

}
