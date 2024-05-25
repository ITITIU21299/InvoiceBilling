/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package invoicebilling;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.Timer;

/**
 *
 * @author huynh
 */
public class SignUpFrame extends javax.swing.JFrame {

    /**
     * Creates new form SignUpFrame
     */
    public SignUpFrame() {
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

        signUpButton = new javax.swing.JLabel();
        rePassWordField = new javax.swing.JPasswordField();
        userNameTxt = new javax.swing.JTextField();
        passWordField = new javax.swing.JPasswordField();
        backGround = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("SIGN UP");
        setMinimumSize(new java.awt.Dimension(640, 640));
        setResizable(false);
        getContentPane().setLayout(null);

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
        signUpButton.setBounds(230, 510, 180, 80);

        rePassWordField.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        rePassWordField.setForeground(new java.awt.Color(255, 255, 255));
        rePassWordField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        rePassWordField.setText("Password");
        rePassWordField.setBorder(null);
        rePassWordField.setOpaque(false);
        rePassWordField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                rePassWordFieldFocusLost(evt);
            }
        });
        rePassWordField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rePassWordFieldMouseClicked(evt);
            }
        });
        rePassWordField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rePassWordFieldActionPerformed(evt);
            }
        });
        getContentPane().add(rePassWordField);
        rePassWordField.setBounds(110, 400, 410, 70);

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
        userNameTxt.setBounds(110, 180, 410, 70);

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
        passWordField.setBounds(110, 290, 410, 70);

        backGround.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/sign-up.png"))); // NOI18N
        getContentPane().add(backGround);
        backGround.setBounds(0, 0, 640, 640);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rePassWordFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_rePassWordFieldFocusLost
        // TODO add your handling code here:
        if (rePassWordField.getText().isEmpty()){
            rePassWordField.setText("Password");
        }
    }//GEN-LAST:event_rePassWordFieldFocusLost

    private void rePassWordFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rePassWordFieldMouseClicked
        // TODO add your handling code here:
        if (rePassWordField.getText().equals("Password")){
            rePassWordField.setText("");
        }
    }//GEN-LAST:event_rePassWordFieldMouseClicked

    private void rePassWordFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rePassWordFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rePassWordFieldActionPerformed

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

    private void passWordFieldFocusLost(java.awt.event.FocusEvent evt) {                                        
        // TODO add your handling code here:
        if (passWordField.getText().isEmpty()){
            passWordField.setText("Password");
        }
    }                                        
                                        

    private void passWordFieldMouseClicked(java.awt.event.MouseEvent evt) {                                           
        // TODO add your handling code here:
        if (passWordField.getText().equals("Password")){
            passWordField.setText("");
        }
    }                                                                                 

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
        signUpButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/signup25.png")));
    }//GEN-LAST:event_signUpButtonMouseReleased

    private void signUpButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signUpButtonMouseClicked
        // TODO add your handling code here:
        String username = userNameTxt.getText();
        String password = new String(passWordField.getPassword());
        String confirmPassword = new String(rePassWordField.getPassword());

        if (!password.equals(confirmPassword)) {
            JOptionPane.showMessageDialog(this, "Passwords do not match.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (isUsernameExist(username)) {
            JOptionPane.showMessageDialog(this, "Username already exists. Please choose a different username.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (insertUserData(username, password)) {
            JOptionPane.showMessageDialog(this, "Signup successful!");

            Timer timer = new Timer(500, new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    dispose();

                    java.awt.EventQueue.invokeLater(new Runnable() {
                        public void run() {
                            new SignInFrame().setVisible(true);
                        }
                    });
                }
            });

            timer.setRepeats(false);
            timer.start();
        } else {
            JOptionPane.showMessageDialog(this, "Error occurred while signing up.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_signUpButtonMouseClicked
    
    private boolean isUsernameExist(String username) {


        try (Connection connection = DriverManager.getConnection(main.jdbcUrl, main.dbUsername, main.dbPassword)) {
            String sql = "SELECT * FROM users WHERE username = ?";
            try (PreparedStatement statement = connection.prepareStatement(sql)) {
                statement.setString(1, username);

                try (ResultSet resultSet = statement.executeQuery()) {
                    return resultSet.next(); // Returns true if the username already exists
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            return true; // Assume an error occurred, and username is treated as already exist
        }
    }
    
    private boolean insertUserData(String username, String password) {


        try (Connection connection = DriverManager.getConnection(main.jdbcUrl, main.dbUsername, main.dbPassword)) {
            String sql = "INSERT INTO users (username, password_hash) VALUES (?, ?)";
            try (PreparedStatement statement = connection.prepareStatement(sql)) {
                statement.setString(1, username);
                statement.setString(2, password);
                statement.executeUpdate();
                return true;
            }
        } catch (SQLException e) {
            e.printStackTrace();
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
            java.util.logging.Logger.getLogger(SignUpFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SignUpFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SignUpFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SignUpFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SignUpFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel backGround;
    private javax.swing.JPasswordField passWordField;
    private javax.swing.JPasswordField rePassWordField;
    private javax.swing.JLabel signUpButton;
    private javax.swing.JTextField userNameTxt;
    // End of variables declaration//GEN-END:variables
}
