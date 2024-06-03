/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package telas;

import dados.AppDao;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.sql.ResultSet;
import telas.RelatoriosEquipes.RelAGR;
import telas.RelatoriosEquipes.RelFrontEnd;
import telas.RelatoriosEquipes.RelGE;
import telas.RelatoriosEquipes.RelSQL;

/**
 *
 * @author lucas.pcaldara
 */
public class Relatorios extends javax.swing.JFrame {

    /**
     * Creates new form Relatorios
     */
    public Relatorios() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnRelatorio = new javax.swing.JToggleButton();
        txtID = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Relatórios");
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Escolher equipe por ID");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(40, 50, 130, 30);

        jLabel2.setIcon(new javax.swing.ImageIcon("D:\\imagensProjeto\\relatorio.jpg")); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(60, 160, 300, 150);

        btnRelatorio.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        btnRelatorio.setForeground(new java.awt.Color(255, 255, 255));
        btnRelatorio.setText("Gerar Relatório");
        btnRelatorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRelatorioActionPerformed(evt);
            }
        });
        getContentPane().add(btnRelatorio);
        btnRelatorio.setBounds(140, 110, 120, 30);
        getContentPane().add(txtID);
        txtID.setBounds(210, 50, 130, 30);

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setOpaque(true);
        getContentPane().add(jLabel3);
        jLabel3.setBounds(0, 0, 410, 340);

        setSize(new java.awt.Dimension(425, 349));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnRelatorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRelatorioActionPerformed
        String t;
        t = txtID.toString();
        try {
            ResultSet curso = new AppDao().idRelatorio(t);
            if (curso.equals("Gestão de Equipes")) {
                new RelGE().setVisible(true);
            } else if (curso.equals("Programação front-end")) {
                new RelFrontEnd().setVisible(true);
            } else if (curso.equals("Análise e Gerenciamento de Riscos")) {
                new RelAGR().setVisible(true);
            } else {
                new RelSQL().setVisible(true);
            }
        } catch (ClassNotFoundException | SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro: " + ex.getMessage());
        }

    }//GEN-LAST:event_btnRelatorioActionPerformed

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
            java.util.logging.Logger.getLogger(Relatorios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Relatorios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Relatorios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Relatorios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Relatorios().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton btnRelatorio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField txtID;
    // End of variables declaration//GEN-END:variables
}
