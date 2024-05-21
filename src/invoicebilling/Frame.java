/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package invoicebilling;

/**
 *
 * @author nguye
 */
public class Frame extends javax.swing.JFrame {

    /**
     * Creates new form LoginFrame
     */
    public Frame() {
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

        loginButton1 = new javax.swing.JLabel();
        loginButton = new javax.swing.JLabel();
        backGround = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Invoice Billing System");
        setMinimumSize(new java.awt.Dimension(725, 735));
        setResizable(false);
        setSize(new java.awt.Dimension(0, 0));
        getContentPane().setLayout(null);

        loginButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/signInButton.png"))); // NOI18N
        loginButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                loginButton1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                loginButton1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                loginButton1MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                loginButton1MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                loginButton1MouseReleased(evt);
            }
        });
        getContentPane().add(loginButton1);
        loginButton1.setBounds(400, 630, 200, 53);

        loginButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/signInButton.png"))); // NOI18N
        loginButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                loginButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                loginButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                loginButtonMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                loginButtonMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                loginButtonMouseReleased(evt);
            }
        });
        getContentPane().add(loginButton);
        loginButton.setBounds(120, 630, 200, 53);

        backGround.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/BG.png"))); // NOI18N
        getContentPane().add(backGround);
        backGround.setBounds(0, 0, 720, 720);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void loginButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginButtonMouseEntered
        // TODO add your handling code here:
        loginButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/signInHover.png")));
    }//GEN-LAST:event_loginButtonMouseEntered

    private void loginButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginButtonMouseExited
        // TODO add your handling code here:
        loginButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/signInButton.png")));
    }//GEN-LAST:event_loginButtonMouseExited

    private void loginButtonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginButtonMousePressed
        // TODO add your handling code here:
        loginButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/signInClick.png")));
    }//GEN-LAST:event_loginButtonMousePressed

    private void loginButtonMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginButtonMouseReleased
        // TODO add your handling code here:
        loginButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/signInButton.png")));
    }//GEN-LAST:event_loginButtonMouseReleased

    private void loginButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginButtonMouseClicked
        // TODO add your handling code here:
        loginFrame loginFrame = new loginFrame();
        loginFrame.setVisible(true);
    }//GEN-LAST:event_loginButtonMouseClicked

    private void loginButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginButton1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_loginButton1MouseClicked

    private void loginButton1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginButton1MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_loginButton1MouseEntered

    private void loginButton1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginButton1MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_loginButton1MouseExited

    private void loginButton1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginButton1MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_loginButton1MousePressed

    private void loginButton1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginButton1MouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_loginButton1MouseReleased

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
            java.util.logging.Logger.getLogger(Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel backGround;
    private javax.swing.JLabel loginButton;
    private javax.swing.JLabel loginButton1;
    // End of variables declaration//GEN-END:variables
}
