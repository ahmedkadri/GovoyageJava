/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentation;

/**
 *
 * @author ahmed
 */
public class ferst extends javax.swing.JFrame {

    /**
     * Creates new form ferst
     */
    public ferst() {
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

        Client1 = new javax.swing.JButton();
        Offrant = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Client1.setFont(new java.awt.Font("Serif", 3, 18)); // NOI18N
        Client1.setForeground(new java.awt.Color(51, 51, 255));
        Client1.setText("Client");
        Client1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Client1ActionPerformed(evt);
            }
        });
        getContentPane().add(Client1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 180, 310, 80));

        Offrant.setFont(new java.awt.Font("Serif", 3, 18)); // NOI18N
        Offrant.setForeground(new java.awt.Color(51, 0, 255));
        Offrant.setText("Offrant");
        Offrant.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OffrantActionPerformed(evt);
            }
        });
        getContentPane().add(Offrant, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 350, 310, 70));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/hom.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 730, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void OffrantActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OffrantActionPerformed
        Authentification ac = new Authentification();
        ac.setVisible(true);
        this.hide();
    }//GEN-LAST:event_OffrantActionPerformed

    private void Client1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Client1ActionPerformed
         AuthClient  ac = new AuthClient();
        ac.setVisible(true);
        this.hide();
    }//GEN-LAST:event_Client1ActionPerformed

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
            java.util.logging.Logger.getLogger(ferst.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ferst.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ferst.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ferst.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ferst().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Client1;
    private javax.swing.JButton Offrant;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}