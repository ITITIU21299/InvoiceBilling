/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package invoicebilling;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author nguye
 */
public class SignInFrame extends javax.swing.JFrame {

    /**
     * Creates new form loginFrame
     */
    public SignInFrame() {
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

        loginButton = new javax.swing.JLabel();
        signUpButton = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        userNameTxt = new javax.swing.JTextField();
        passWordField = new javax.swing.JPasswordField();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("SIGN IN");
        setMinimumSize(new java.awt.Dimension(640, 640));
        setPreferredSize(new java.awt.Dimension(640, 680));
        setResizable(false);
        setSize(new java.awt.Dimension(640, 1000));
        getContentPane().setLayout(null);

        loginButton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        loginButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/signin23.png"))); // NOI18N
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
        });
        getContentPane().add(loginButton);
        loginButton.setBounds(240, 390, 170, 90);

        signUpButton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        signUpButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/signup23.png"))); // NOI18N
        signUpButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                signUpButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                signUpButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                signUpButtonMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                signUpButtonMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                signUpButtonMouseReleased(evt);
            }
        });
        getContentPane().add(signUpButton);
        signUpButton.setBounds(220, 530, 210, 90);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Don't have an account? Sign up now:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(120, 480, 470, 50);

        userNameTxt.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        userNameTxt.setForeground(new java.awt.Color(255, 255, 255));
        userNameTxt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        userNameTxt.setText("Username");
        userNameTxt.setBorder(null);
        userNameTxt.setMinimumSize(new java.awt.Dimension(67, 25));
        userNameTxt.setOpaque(false);
        userNameTxt.setPreferredSize(new java.awt.Dimension(90, 26));
        userNameTxt.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                userNameTxtFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                userNameTxtFocusLost(evt);
            }
        });
        userNameTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                userNameTxtMouseClicked(evt);
            }
        });
        userNameTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userNameTxtActionPerformed(evt);
            }
        });
        getContentPane().add(userNameTxt);
        userNameTxt.setBounds(110, 200, 410, 70);

        passWordField.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        passWordField.setForeground(new java.awt.Color(255, 255, 255));
        passWordField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        passWordField.setText("Password");
        passWordField.setBorder(null);
        passWordField.setOpaque(false);
        passWordField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                passWordFieldFocusLost(evt);
            }
        });
        passWordField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                passWordFieldMouseClicked(evt);
            }
        });
        passWordField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passWordFieldActionPerformed(evt);
            }
        });
        getContentPane().add(passWordField);
        passWordField.setBounds(110, 310, 410, 70);

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/sign-in.png"))); // NOI18N
        getContentPane().add(background);
        background.setBounds(0, 0, 640, 640);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void userNameTxtFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_userNameTxtFocusGained

    }//GEN-LAST:event_userNameTxtFocusGained

    private void userNameTxtFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_userNameTxtFocusLost
        // TODO add your handling code here:
        if (userNameTxt.getText().isEmpty()){
            userNameTxt.setText("Username");
        }
    }//GEN-LAST:event_userNameTxtFocusLost

    private void userNameTxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_userNameTxtMouseClicked
        // TODO add your handling code here:
        if (userNameTxt.getText().equals("Username")){
            userNameTxt.setText("");
        }
    }//GEN-LAST:event_userNameTxtMouseClicked

    private void userNameTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userNameTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userNameTxtActionPerformed

    private void passWordFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_passWordFieldFocusLost
        // TODO add your handling code here:
        if (passWordField.getText().isEmpty()){
            passWordField.setText("Password");
        }
    }//GEN-LAST:event_passWordFieldFocusLost

    private void passWordFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_passWordFieldMouseClicked
        // TODO add your handling code here:
        if (passWordField.getText().equals("Password")){
            passWordField.setText("");
        }
    }//GEN-LAST:event_passWordFieldMouseClicked

    private void passWordFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passWordFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passWordFieldActionPerformed

    private void signUpButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signUpButtonMouseEntered
        // TODO add your handling code here:
        signUpButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/signup25.png")));
    }//GEN-LAST:event_signUpButtonMouseEntered

    private void signUpButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signUpButtonMouseExited
        // TODO add your handling code here:
        signUpButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/signup23.png")));
    }//GEN-LAST:event_signUpButtonMouseExited

    private void signUpButtonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signUpButtonMousePressed
        // TODO add your handling code here:
        signUpButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/signup23.png")));
    }//GEN-LAST:event_signUpButtonMousePressed

    private void signUpButtonMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signUpButtonMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_signUpButtonMouseReleased

    private void signUpButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signUpButtonMouseClicked
        // TODO add your handling code here:
        SignUpFrame signUpFrame = new SignUpFrame();
        signUpFrame.setVisible(true);
    }//GEN-LAST:event_signUpButtonMouseClicked

    private void loginButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginButtonMouseEntered
        // TODO add your handling code here:
        loginButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/signin25.png")));
    }//GEN-LAST:event_loginButtonMouseEntered

    private void loginButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginButtonMouseExited
        // TODO add your handling code here:
        loginButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/signin23.png")));
    }//GEN-LAST:event_loginButtonMouseExited

    private void loginButtonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginButtonMousePressed
        // TODO add your handling code here:
        loginButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/signin23.png")));
    }//GEN-LAST:event_loginButtonMousePressed

    private void loginButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginButtonMouseClicked
        // TODO add your handling code here:
        String enteredUsername = userNameTxt.getText();
        String enteredPassword = new String(passWordField.getPassword());

        // Check if the username and password are correct
        if (isLoginValid(enteredUsername, enteredPassword)) {
            JOptionPane.showMessageDialog(this, "Login successful!");

            // Close the current LoginFrame
            dispose();

            // Open the MainFrame or whatever frame you want to show after login
            java.awt.EventQueue.invokeLater(new Runnable() {
                public void run() {
                    //checking
//                    new MainFrame(enteredUsername).setVisible(true);
                }
            });
        } else {
            JOptionPane.showMessageDialog(this, "Invalid username or password.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_loginButtonMouseClicked

    private boolean isLoginValid(String username, String password) {

        try {
            Connection con = Connection.getInstance();
            ResultSet resultSet = con.sqlcode("SELECT * FROM users WHERE userID = '"+username+"' AND password = '"+password+"'");

            return resultSet.next();

        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error connecting to the database.", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
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
            java.util.logging.Logger.getLogger(SignInFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SignInFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SignInFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SignInFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SignInFrame().setVisible(true);
            }
        });
    }
    private boolean authenticateUser(String username, String password) throws SQLException {
        Connection con = Connection.getInstance();
        ResultSet resultSet = con.sqlcode("Select * FROM authors WHERE firstName = 'Tem'");
            if (resultSet.next()) {
            con.close();
            return true;
            }
        return false;
    }
    
    public boolean checkValidInput(){
        char[] passwordChars = passWordField.getPassword();
        return !(userNameTxt.getText().equalsIgnoreCase("username")
                || passwordChars.length == 0);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel background;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel loginButton;
    private javax.swing.JPasswordField passWordField;
    private javax.swing.JLabel signUpButton;
    private javax.swing.JTextField userNameTxt;
    // End of variables declaration//GEN-END:variables
}
