/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package telas;

/**
 *
 * @author lucas.pcaldara
 */
public class Menu extends javax.swing.JFrame {

    public Menu() {
        initComponents();
    }
    
    /**
     * Creates new form Menu
     */
    public Menu(String cargo) {
        initComponents();
        if (cargo.equalsIgnoreCase("administrador")) {
            itmProgress.setVisible(false);
            itmAva.setVisible(false);
        } else {
            mnuAdm.setVisible(false);
            
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        mnuCursos = new javax.swing.JMenu();
        itmLista = new javax.swing.JMenuItem();
        itmProgress = new javax.swing.JMenuItem();
        itmAva = new javax.swing.JMenuItem();
        mnuAdm = new javax.swing.JMenu();
        itmCad = new javax.swing.JMenuItem();
        itmRel = new javax.swing.JMenuItem();
        itmDelTeam = new javax.swing.JMenuItem();
        itmVerEquipes = new javax.swing.JMenuItem();
        mnuMais = new javax.swing.JMenu();
        itmSobre = new javax.swing.JMenuItem();
        itmTrabalhe = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menu");
        getContentPane().setLayout(null);

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setIcon(new javax.swing.ImageIcon("D:\\imagensProjeto\\menu.jpg")); // NOI18N
        jLabel1.setOpaque(true);
        getContentPane().add(jLabel1);
        jLabel1.setBounds(130, 110, 340, 290);

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Bookman Old Style", 2, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("                O maior software de cursos corporativos do mercado");
        jLabel2.setOpaque(true);
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 50, 600, 60);

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setFont(new java.awt.Font("Bookman Old Style", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("                           SavoirPlus");
        jLabel3.setOpaque(true);
        getContentPane().add(jLabel3);
        jLabel3.setBounds(0, 0, 600, 50);

        jLabel4.setBackground(new java.awt.Color(0, 0, 0));
        jLabel4.setOpaque(true);
        getContentPane().add(jLabel4);
        jLabel4.setBounds(0, 110, 600, 290);

        mnuCursos.setText("Cursos");

        itmLista.setText("Lista de Cursos");
        itmLista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmListaActionPerformed(evt);
            }
        });
        mnuCursos.add(itmLista);

        itmProgress.setText("Progresso");
        itmProgress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmProgressActionPerformed(evt);
            }
        });
        mnuCursos.add(itmProgress);

        itmAva.setText("Avaliações");
        itmAva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmAvaActionPerformed(evt);
            }
        });
        mnuCursos.add(itmAva);

        jMenuBar1.add(mnuCursos);

        mnuAdm.setText("Administração");

        itmCad.setText("Cadastrar Times");
        itmCad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmCadActionPerformed(evt);
            }
        });
        mnuAdm.add(itmCad);

        itmRel.setText("Relatórios");
        itmRel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmRelActionPerformed(evt);
            }
        });
        mnuAdm.add(itmRel);

        itmDelTeam.setText("Deletar Equipe");
        itmDelTeam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmDelTeamActionPerformed(evt);
            }
        });
        mnuAdm.add(itmDelTeam);

        itmVerEquipes.setText("Ver Equipes");
        itmVerEquipes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmVerEquipesActionPerformed(evt);
            }
        });
        mnuAdm.add(itmVerEquipes);

        jMenuBar1.add(mnuAdm);

        mnuMais.setText("Mais");

        itmSobre.setText("Sobre Nós");
        itmSobre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmSobreActionPerformed(evt);
            }
        });
        mnuMais.add(itmSobre);

        itmTrabalhe.setText("Trabalhe Conosco");
        itmTrabalhe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmTrabalheActionPerformed(evt);
            }
        });
        mnuMais.add(itmTrabalhe);

        jMenuBar1.add(mnuMais);

        setJMenuBar(jMenuBar1);

        setSize(new java.awt.Dimension(616, 428));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void itmListaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmListaActionPerformed
        new ListaDeCursos().setVisible(true);
    }//GEN-LAST:event_itmListaActionPerformed

    private void itmAvaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmAvaActionPerformed
        new ChecarNotas().setVisible(true);
    }//GEN-LAST:event_itmAvaActionPerformed

    private void itmSobreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmSobreActionPerformed
        new Sobre().setVisible(true);
    }//GEN-LAST:event_itmSobreActionPerformed

    private void itmTrabalheActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmTrabalheActionPerformed
        new TrabalheConosco().setVisible(true);
    }//GEN-LAST:event_itmTrabalheActionPerformed

    private void itmCadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmCadActionPerformed
        new CadastroDeTimes().setVisible(true);
    }//GEN-LAST:event_itmCadActionPerformed

    private void itmRelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmRelActionPerformed
        new Relatorios().setVisible(true);
    }//GEN-LAST:event_itmRelActionPerformed

    private void itmProgressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmProgressActionPerformed
        new Progresso().setVisible(true);
    }//GEN-LAST:event_itmProgressActionPerformed

    private void itmDelTeamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmDelTeamActionPerformed
        new DeletarEquipe().setVisible(true);
    }//GEN-LAST:event_itmDelTeamActionPerformed

    private void itmVerEquipesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmVerEquipesActionPerformed
        new VerEquipes().setVisible(true);
    }//GEN-LAST:event_itmVerEquipesActionPerformed

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem itmAva;
    private javax.swing.JMenuItem itmCad;
    private javax.swing.JMenuItem itmDelTeam;
    private javax.swing.JMenuItem itmLista;
    private javax.swing.JMenuItem itmProgress;
    private javax.swing.JMenuItem itmRel;
    private javax.swing.JMenuItem itmSobre;
    private javax.swing.JMenuItem itmTrabalhe;
    private javax.swing.JMenuItem itmVerEquipes;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu mnuAdm;
    private javax.swing.JMenu mnuCursos;
    private javax.swing.JMenu mnuMais;
    // End of variables declaration//GEN-END:variables
}
