/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package invoicebilling;

import java.awt.Color;
import java.util.Enumeration;
import javax.swing.AbstractButton;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author admin
 */
public class PayPanel extends javax.swing.JPanel {
    
    private int cnt;
    private int noInfo = 0;
    private int payMethod = 0;
    private String[] s;
    private JPanel[] jp;
    private JTextField[] tf;
    /**
     * Creates new form NewJPanel
     */
    public PayPanel() {
        initComponents();
        this.setBounds(12, 0, 680, 660);                
        cnt = 1;
        jp = new JPanel[10];
        jp[1] = personalInfo;
        jp[2] = paymentInfo;
        jp[3] = finalInfo;
        transInfo.removeAll();
        transInfo.add(jp[1]);
        transCtrl.removeAll();
        transCtrl.add(backBtn);        
        transCtrl.add(bottomMidPanel);        
        transCtrl.add(nextBtn);
        
        
        s = new String[10];
        s[1] = "Enter full name";
        s[2] = "Enter email address";
        s[3] = "Enter phone number";
        s[4] = "Enter city name";
        s[5] = "Enter district";
        s[6] = "Enter ward";
        s[7] = "Enter street";
        s[8] = "Enter apartment number";
        s[9] = "Enter credit card number";
        
        tf = new JTextField[10];
        tf[1] = nameTxtField;
        tf[2] = emailTxtField;
        tf[3] = phoneTxtField;
        tf[4] = cityTxtField;
        tf[5] = distTxtField;
        tf[6] = wardTxtField;
        tf[7] = streetTxtField;
        tf[8] = noTxtField;
        tf[9] = ccTxtField;        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        fnlBtn = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        transInfo = new javax.swing.JPanel();
        personalInfo = new javax.swing.JPanel();
        addParent1 = new javax.swing.JPanel();
        addTxt1 = new javax.swing.JPanel();
        addLbl1 = new javax.swing.JLabel();
        nameTxtField = new javax.swing.JTextField();
        emailTxtField = new javax.swing.JTextField();
        phoneTxtField = new javax.swing.JTextField();
        border = new javax.swing.JPanel();
        addParent = new javax.swing.JPanel();
        addTxt = new javax.swing.JPanel();
        addLbl = new javax.swing.JLabel();
        cityTxtField = new javax.swing.JTextField();
        distTxtField = new javax.swing.JTextField();
        wardTxtField = new javax.swing.JTextField();
        streetTxtField = new javax.swing.JTextField();
        noTxtField = new javax.swing.JTextField();
        paymentInfo = new javax.swing.JPanel();
        jRadioButton1 = new javax.swing.JRadioButton();
        border4 = new javax.swing.JPanel();
        jRadioButton2 = new javax.swing.JRadioButton();
        ccTxtField = new javax.swing.JTextField();
        border5 = new javax.swing.JPanel();
        jRadioButton3 = new javax.swing.JRadioButton();
        finalInfo = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        finalTxt = new javax.swing.JLabel();
        finalTxt1 = new javax.swing.JLabel();
        finalTxt2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        finalTxt3 = new javax.swing.JLabel();
        finalTxt5 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        finalTxt4 = new javax.swing.JLabel();
        finalTxt6 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        finalTxt7 = new javax.swing.JLabel();
        finalTxt8 = new javax.swing.JLabel();
        finalTxt9 = new javax.swing.JLabel();
        transCtrl = new javax.swing.JPanel();
        backBtn = new javax.swing.JButton();
        bottomMidPanel = new javax.swing.JPanel();
        transStep = new javax.swing.JLabel();
        transTxt = new javax.swing.JLabel();
        nextBtn = new javax.swing.JButton();

        fnlBtn.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        fnlBtn.setText("Finish");
        fnlBtn.setPreferredSize(new java.awt.Dimension(89, 26));
        fnlBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                fnlBtnMouseClicked(evt);
            }
        });

        jButton1.setText("Go back to home page");
        jButton1.setPreferredSize(new java.awt.Dimension(200, 35));

        setBackground(new java.awt.Color(51, 255, 51));
        setForeground(new java.awt.Color(255, 153, 0));
        setPreferredSize(new java.awt.Dimension(720, 648));
        setLayout(new javax.swing.BoxLayout(this, javax.swing.BoxLayout.Y_AXIS));

        transInfo.setBackground(new java.awt.Color(0, 0, 0));
        transInfo.setPreferredSize(new java.awt.Dimension(720, 611));
        transInfo.setLayout(new java.awt.CardLayout());

        personalInfo.setBackground(new java.awt.Color(204, 204, 204));
        personalInfo.setForeground(new java.awt.Color(0, 0, 0));
        personalInfo.setToolTipText("");
        personalInfo.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 0, 5));

        addParent1.setBackground(new java.awt.Color(204, 204, 204));
        addParent1.setPreferredSize(new java.awt.Dimension(676, 200));
        addParent1.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 0, 8));

        addTxt1.setBackground(new java.awt.Color(204, 204, 204));
        addTxt1.setPreferredSize(new java.awt.Dimension(670, 30));
        addTxt1.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));

        addLbl1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        addLbl1.setForeground(new java.awt.Color(0, 0, 0));
        addLbl1.setText("Contact:");
        addTxt1.add(addLbl1);

        addParent1.add(addTxt1);

        nameTxtField.setForeground(new java.awt.Color(153, 153, 153));
        nameTxtField.setText("Enter full name");
        nameTxtField.setPreferredSize(new java.awt.Dimension(630, 30));
        nameTxtField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                nameTxtFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                nameTxtFieldFocusLost(evt);
            }
        });
        addParent1.add(nameTxtField);

        emailTxtField.setForeground(new java.awt.Color(153, 153, 153));
        emailTxtField.setText("Enter email address");
        emailTxtField.setPreferredSize(new java.awt.Dimension(630, 30));
        emailTxtField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                emailTxtFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                emailTxtFieldFocusLost(evt);
            }
        });
        addParent1.add(emailTxtField);

        phoneTxtField.setForeground(new java.awt.Color(153, 153, 153));
        phoneTxtField.setText("Enter phone number");
        phoneTxtField.setPreferredSize(new java.awt.Dimension(630, 30));
        phoneTxtField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                phoneTxtFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                phoneTxtFieldFocusLost(evt);
            }
        });
        addParent1.add(phoneTxtField);

        personalInfo.add(addParent1);

        border.setBackground(new java.awt.Color(0, 0, 0));
        border.setPreferredSize(new java.awt.Dimension(678, 3));

        javax.swing.GroupLayout borderLayout = new javax.swing.GroupLayout(border);
        border.setLayout(borderLayout);
        borderLayout.setHorizontalGroup(
            borderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 678, Short.MAX_VALUE)
        );
        borderLayout.setVerticalGroup(
            borderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 3, Short.MAX_VALUE)
        );

        personalInfo.add(border);

        addParent.setBackground(new java.awt.Color(204, 204, 204));
        addParent.setPreferredSize(new java.awt.Dimension(676, 280));
        addParent.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 0, 8));

        addTxt.setBackground(new java.awt.Color(204, 204, 204));
        addTxt.setPreferredSize(new java.awt.Dimension(670, 30));
        addTxt.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));

        addLbl.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        addLbl.setForeground(new java.awt.Color(0, 0, 0));
        addLbl.setText("Address:");
        addTxt.add(addLbl);

        addParent.add(addTxt);

        cityTxtField.setForeground(new java.awt.Color(153, 153, 153));
        cityTxtField.setText("Enter city name");
        cityTxtField.setPreferredSize(new java.awt.Dimension(630, 30));
        cityTxtField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                cityTxtFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                cityTxtFieldFocusLost(evt);
            }
        });
        addParent.add(cityTxtField);

        distTxtField.setForeground(new java.awt.Color(153, 153, 153));
        distTxtField.setText("Enter district");
        distTxtField.setPreferredSize(new java.awt.Dimension(630, 30));
        distTxtField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                distTxtFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                distTxtFieldFocusLost(evt);
            }
        });
        addParent.add(distTxtField);

        wardTxtField.setForeground(new java.awt.Color(153, 153, 153));
        wardTxtField.setText("Enter ward");
        wardTxtField.setPreferredSize(new java.awt.Dimension(630, 30));
        wardTxtField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                wardTxtFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                wardTxtFieldFocusLost(evt);
            }
        });
        addParent.add(wardTxtField);

        streetTxtField.setForeground(new java.awt.Color(153, 153, 153));
        streetTxtField.setText("Enter street");
        streetTxtField.setPreferredSize(new java.awt.Dimension(630, 30));
        streetTxtField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                streetTxtFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                streetTxtFieldFocusLost(evt);
            }
        });
        addParent.add(streetTxtField);

        noTxtField.setForeground(new java.awt.Color(153, 153, 153));
        noTxtField.setText("Enter apartment number");
        noTxtField.setPreferredSize(new java.awt.Dimension(630, 30));
        noTxtField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                noTxtFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                noTxtFieldFocusLost(evt);
            }
        });
        addParent.add(noTxtField);

        personalInfo.add(addParent);

        transInfo.add(personalInfo, "card2");

        paymentInfo.setBackground(new java.awt.Color(204, 204, 204));

        jRadioButton1.setBackground(new java.awt.Color(204, 204, 204));
        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jRadioButton1.setForeground(new java.awt.Color(0, 0, 0));
        jRadioButton1.setText("ShopeePay (application electronic wallet)");
        jRadioButton1.setPreferredSize(new java.awt.Dimension(677, 30));
        paymentInfo.add(jRadioButton1);

        border4.setBackground(new java.awt.Color(0, 0, 0));
        border4.setPreferredSize(new java.awt.Dimension(678, 3));

        javax.swing.GroupLayout border4Layout = new javax.swing.GroupLayout(border4);
        border4.setLayout(border4Layout);
        border4Layout.setHorizontalGroup(
            border4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 678, Short.MAX_VALUE)
        );
        border4Layout.setVerticalGroup(
            border4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 3, Short.MAX_VALUE)
        );

        paymentInfo.add(border4);

        jRadioButton2.setBackground(new java.awt.Color(204, 204, 204));
        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jRadioButton2.setForeground(new java.awt.Color(0, 0, 0));
        jRadioButton2.setText("Credit card");
        jRadioButton2.setPreferredSize(new java.awt.Dimension(677, 30));
        paymentInfo.add(jRadioButton2);

        ccTxtField.setForeground(new java.awt.Color(153, 153, 153));
        ccTxtField.setText("Enter credit card number");
        ccTxtField.setPreferredSize(new java.awt.Dimension(630, 30));
        ccTxtField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                ccTxtFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                ccTxtFieldFocusLost(evt);
            }
        });
        paymentInfo.add(ccTxtField);

        border5.setBackground(new java.awt.Color(0, 0, 0));
        border5.setPreferredSize(new java.awt.Dimension(678, 3));

        javax.swing.GroupLayout border5Layout = new javax.swing.GroupLayout(border5);
        border5.setLayout(border5Layout);
        border5Layout.setHorizontalGroup(
            border5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 678, Short.MAX_VALUE)
        );
        border5Layout.setVerticalGroup(
            border5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 3, Short.MAX_VALUE)
        );

        paymentInfo.add(border5);

        jRadioButton3.setBackground(new java.awt.Color(204, 204, 204));
        buttonGroup1.add(jRadioButton3);
        jRadioButton3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jRadioButton3.setForeground(new java.awt.Color(0, 0, 0));
        jRadioButton3.setText("Cash on delivery");
        jRadioButton3.setPreferredSize(new java.awt.Dimension(677, 30));
        paymentInfo.add(jRadioButton3);

        transInfo.add(paymentInfo, "card4");

        finalInfo.setBackground(new java.awt.Color(204, 204, 204));

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setPreferredSize(new java.awt.Dimension(677, 30));
        jPanel1.setLayout(new javax.swing.BoxLayout(jPanel1, javax.swing.BoxLayout.X_AXIS));

        finalTxt.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        finalTxt.setForeground(new java.awt.Color(0, 0, 0));
        finalTxt.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        finalTxt.setText("Dear ");
        finalTxt.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        finalTxt.setPreferredSize(new java.awt.Dimension(32, 30));
        jPanel1.add(finalTxt);

        finalTxt1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        finalTxt1.setForeground(new java.awt.Color(51, 51, 255));
        finalTxt1.setText("*Name");
        finalTxt1.setPreferredSize(new java.awt.Dimension(300, 30));
        jPanel1.add(finalTxt1);

        finalInfo.add(jPanel1);

        finalTxt2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        finalTxt2.setForeground(new java.awt.Color(0, 0, 0));
        finalTxt2.setText("You are going to purchase the folloing products");
        finalTxt2.setPreferredSize(new java.awt.Dimension(677, 30));
        finalInfo.add(finalTxt2);

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.setPreferredSize(new java.awt.Dimension(677, 30));
        jPanel2.setLayout(new javax.swing.BoxLayout(jPanel2, javax.swing.BoxLayout.X_AXIS));

        finalTxt3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        finalTxt3.setForeground(new java.awt.Color(0, 0, 0));
        finalTxt3.setText("For a total of: ");
        finalTxt3.setPreferredSize(new java.awt.Dimension(0, 30));
        jPanel2.add(finalTxt3);

        finalTxt5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        finalTxt5.setForeground(new java.awt.Color(51, 51, 255));
        finalTxt5.setText("*Price");
        finalTxt5.setPreferredSize(new java.awt.Dimension(677, 30));
        jPanel2.add(finalTxt5);

        finalInfo.add(jPanel2);

        jPanel3.setBackground(new java.awt.Color(204, 204, 204));
        jPanel3.setPreferredSize(new java.awt.Dimension(677, 30));
        jPanel3.setLayout(new javax.swing.BoxLayout(jPanel3, javax.swing.BoxLayout.X_AXIS));

        finalTxt4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        finalTxt4.setForeground(new java.awt.Color(0, 0, 0));
        finalTxt4.setText("Payment method:");
        finalTxt4.setPreferredSize(new java.awt.Dimension(115, 30));
        jPanel3.add(finalTxt4);

        finalTxt6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        finalTxt6.setForeground(new java.awt.Color(51, 51, 255));
        finalTxt6.setText("*Payment method");
        finalTxt6.setPreferredSize(new java.awt.Dimension(566, 30));
        jPanel3.add(finalTxt6);

        finalInfo.add(jPanel3);

        jPanel4.setBackground(new java.awt.Color(204, 204, 204));
        jPanel4.setPreferredSize(new java.awt.Dimension(677, 30));
        jPanel4.setLayout(new javax.swing.BoxLayout(jPanel4, javax.swing.BoxLayout.X_AXIS));

        finalTxt7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        finalTxt7.setForeground(new java.awt.Color(0, 0, 0));
        finalTxt7.setText("It will be sent to: ");
        finalTxt7.setPreferredSize(new java.awt.Dimension(350, 30));
        jPanel4.add(finalTxt7);

        finalTxt8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        finalTxt8.setForeground(new java.awt.Color(51, 51, 255));
        finalTxt8.setText("*Address");
        finalTxt8.setPreferredSize(new java.awt.Dimension(300, 30));
        jPanel4.add(finalTxt8);

        finalInfo.add(jPanel4);

        finalTxt9.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        finalTxt9.setForeground(new java.awt.Color(0, 0, 0));
        finalTxt9.setText("Thank you for choosing us!");
        finalTxt9.setPreferredSize(new java.awt.Dimension(677, 30));
        finalInfo.add(finalTxt9);

        transInfo.add(finalInfo, "card3");

        add(transInfo);

        transCtrl.setBackground(new java.awt.Color(255, 255, 102));
        transCtrl.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        transCtrl.setPreferredSize(new java.awt.Dimension(720, 55));

        backBtn.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        backBtn.setText("Back");
        backBtn.setPreferredSize(new java.awt.Dimension(89, 40));
        backBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backBtnMouseClicked(evt);
            }
        });
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });
        transCtrl.add(backBtn);

        bottomMidPanel.setBackground(new java.awt.Color(255, 255, 0));
        bottomMidPanel.setPreferredSize(new java.awt.Dimension(450, 40));
        bottomMidPanel.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 100, 2));

        transStep.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        transStep.setForeground(new java.awt.Color(0, 0, 0));
        transStep.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        transStep.setText("Step 1/3");
        transStep.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        transStep.setPreferredSize(new java.awt.Dimension(250, 20));
        bottomMidPanel.add(transStep);

        transTxt.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        transTxt.setForeground(new java.awt.Color(0, 0, 0));
        transTxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        transTxt.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        transTxt.setPreferredSize(new java.awt.Dimension(250, 20));
        bottomMidPanel.add(transTxt);

        transCtrl.add(bottomMidPanel);

        nextBtn.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        nextBtn.setText("Next");
        nextBtn.setPreferredSize(new java.awt.Dimension(89, 40));
        nextBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                nextBtnMouseClicked(evt);
            }
        });
        transCtrl.add(nextBtn);

        add(transCtrl);
    }// </editor-fold>//GEN-END:initComponents

    private void backBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backBtnMouseClicked
        if (cnt == 3)
        {
            nextBtn.setText("Next");
        }
        if (cnt == 1) return;
        cnt--;
        transInfo.removeAll();
        transInfo.add(jp[cnt]);
        transInfo.repaint();
        transInfo.revalidate();
    }//GEN-LAST:event_backBtnMouseClicked

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_backBtnActionPerformed

    private void nextBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nextBtnMouseClicked
        String st;
        noInfo = 0;
        System.out.println(cnt);        
        int i = 0;
        if (cnt == 1)
        {
            System.out.println(cnt);
            for (i=1; i<=8; i++) {
                redPrompt(tf[i], i);
            }
            noInfo = 0;
            if (noInfo == 1)
            {
                transTxt.setText("Please fulfill the information");
                return;
            }
            transStep.setText("Step 2/3");
            transTxt.setText("");

        }        
        
        if (cnt == 2)
        {
            System.out.println(cnt);
            for (i=9; i<=9; i++) {
                redPrompt(tf[i], i);
            }
            noInfo = 0;
            
            for (Enumeration<AbstractButton> buttons = buttonGroup1.getElements(); buttons.hasMoreElements();) 
            {
                AbstractButton button = buttons.nextElement();
                i++;
                if (button.isSelected()) {
                    payMethod = 1;
                }
            }                 
            if (noInfo == 1)
            {
                transTxt.setText("Please fulfill the information");
                return;
            }
            
             
            if (payMethod != 1) 
                return;
            
            transStep.setText("Step 3/3");
            transTxt.setText("");
            nextBtn.setText("Finish");
        
            finalTxt1.setText(nameTxtField.getText());            
            // finalTxt5.setText(nameTxtField.getText());
            
            for (Enumeration<AbstractButton> buttons = buttonGroup1.getElements(); buttons.hasMoreElements();) 
            {
                AbstractButton button = buttons.nextElement();

                if (button.isSelected()) {
                    finalTxt6.setText(button.getText());
                }
            }            
            
            String city = tf[4].getText() + " city";
            
            String dist;
            if (isNumeric(tf[5].getText())) 
                dist = "district " + tf[5].getText();
            else
                dist = tf[5].getText() + " district";
            
            String ward;
            if (isNumeric(tf[6].getText())) 
                ward =  "ward " + tf[6].getText();
            else
                ward = tf[6].getText() + " ward";
            
            String street;
            if (isNumeric(tf[7].getText())) 
                street =  "street " + tf[6].getText();
            else
                street = tf[7].getText() + " street";
            
            String address = tf[8].getText() + " " + street + " " + ward + " " + dist + " " + city;

            finalTxt8.setText(address);
            

        }
     
        cnt++;
        transInfo.removeAll();
        transInfo.add(jp[cnt]);
        transInfo.repaint();
        transInfo.revalidate();
    }//GEN-LAST:event_nextBtnMouseClicked

    private void fnlBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fnlBtnMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_fnlBtnMouseClicked

    private void nameTxtFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_nameTxtFieldFocusGained
        if(nameTxtField.getText().equals("Enter full name"))
        {
            nameTxtField.setText("");
            nameTxtField.setForeground(new Color(30, 30, 30));
        }
    }//GEN-LAST:event_nameTxtFieldFocusGained

    private void nameTxtFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_nameTxtFieldFocusLost
        if(nameTxtField.getText().equals(""))
        {
            nameTxtField.setText("Enter full name");
            nameTxtField.setForeground(new Color(153, 153, 153));
        }
    }//GEN-LAST:event_nameTxtFieldFocusLost

    private void emailTxtFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_emailTxtFieldFocusGained
        if(emailTxtField.getText().equals("Enter email address"))
        {
            emailTxtField.setText("");
            emailTxtField.setForeground(new Color(30, 30, 30));
        }
    }//GEN-LAST:event_emailTxtFieldFocusGained

    private void emailTxtFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_emailTxtFieldFocusLost
        if(emailTxtField.getText().equals(""))
        {
            emailTxtField.setText("Enter email address");
            emailTxtField.setForeground(new Color(153, 153, 153));
        }
    }//GEN-LAST:event_emailTxtFieldFocusLost

    private void phoneTxtFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_phoneTxtFieldFocusGained
        if(phoneTxtField.getText().equals("Enter phone number"))
        {
            phoneTxtField.setText("");
            phoneTxtField.setForeground(new Color(30, 30, 30));
        }
    }//GEN-LAST:event_phoneTxtFieldFocusGained

    private void phoneTxtFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_phoneTxtFieldFocusLost
        if(phoneTxtField.getText().equals(""))
        {
            phoneTxtField.setText("Enter phone number");
            phoneTxtField.setForeground(new Color(153, 153, 153));
        }
    }//GEN-LAST:event_phoneTxtFieldFocusLost

    private void cityTxtFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cityTxtFieldFocusGained
        if(cityTxtField.getText().equals("Enter city name"))
        {
            cityTxtField.setText("");
            cityTxtField.setForeground(new Color(30, 30, 30));
        }
    }//GEN-LAST:event_cityTxtFieldFocusGained

    private void cityTxtFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cityTxtFieldFocusLost
        if(cityTxtField.getText().equals(""))
        {
            cityTxtField.setText("Enter city name");
            cityTxtField.setForeground(new Color(153, 153, 153));
        }
    }//GEN-LAST:event_cityTxtFieldFocusLost

    private void distTxtFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_distTxtFieldFocusGained
        if(distTxtField.getText().equals("Enter district"))
        {
            distTxtField.setText("");
            distTxtField.setForeground(new Color(30, 30, 30));
        }
    }//GEN-LAST:event_distTxtFieldFocusGained

    private void distTxtFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_distTxtFieldFocusLost
        if(distTxtField.getText().equals(""))
        {
            distTxtField.setText("Enter district");
            distTxtField.setForeground(new Color(153, 153, 153));
        }
    }//GEN-LAST:event_distTxtFieldFocusLost

    private void wardTxtFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_wardTxtFieldFocusGained
        if(wardTxtField.getText().equals("Enter ward"))
        {
            wardTxtField.setText("");
            wardTxtField.setForeground(new Color(30, 30, 30));
        }
    }//GEN-LAST:event_wardTxtFieldFocusGained

    private void wardTxtFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_wardTxtFieldFocusLost
        if(wardTxtField.getText().equals(""))
        {
            wardTxtField.setText("Enter ward");
            wardTxtField.setForeground(new Color(153, 153, 153));
        }
    }//GEN-LAST:event_wardTxtFieldFocusLost

    private void streetTxtFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_streetTxtFieldFocusGained
        if(streetTxtField.getText().equals("Enter street"))
        {
            streetTxtField.setText("");
            streetTxtField.setForeground(new Color(30, 30, 30));
        }
    }//GEN-LAST:event_streetTxtFieldFocusGained

    private void streetTxtFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_streetTxtFieldFocusLost
        if(streetTxtField.getText().equals(""))
        {
            streetTxtField.setText("Enter street");
            streetTxtField.setForeground(new Color(153, 153, 153));
        }
    }//GEN-LAST:event_streetTxtFieldFocusLost

    private void noTxtFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_noTxtFieldFocusGained
        if(noTxtField.getText().equals("Enter apartment number"))
        {
            noTxtField.setText("");
            noTxtField.setForeground(new Color(30, 30, 30));
        }
    }//GEN-LAST:event_noTxtFieldFocusGained

    private void noTxtFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_noTxtFieldFocusLost
        if(noTxtField.getText().equals(""))
        {
            noTxtField.setText("Enter apartment number");
            noTxtField.setForeground(new Color(153, 153, 153));
        }
    }//GEN-LAST:event_noTxtFieldFocusLost

    private void ccTxtFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_ccTxtFieldFocusGained
        if(ccTxtField.getText().equals("Enter credit card number"))
        {
            ccTxtField.setText("");
            ccTxtField.setForeground(new Color(30, 30, 30));
        }
    }//GEN-LAST:event_ccTxtFieldFocusGained

    private void ccTxtFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_ccTxtFieldFocusLost
        if(ccTxtField.getText().equals(""))
        {
            ccTxtField.setText("Enter credit card number");
            ccTxtField.setForeground(new Color(153, 153, 153));
        }
    }//GEN-LAST:event_ccTxtFieldFocusLost

    private void redPrompt(javax.swing.JTextField txt, int cnt) {
        if(txt.getText().equals("") || txt.getText().equals(s[cnt]))
        {
            txt.setForeground(new Color(255, 51, 51));
            txt.setText(s[cnt]);
            noInfo = 1;
        }        
    }
    
    public static boolean isNumeric(String strNum) {
        if (strNum == null) {
            return false;
        }
        try {
        double d = Double.parseDouble(strNum);
        } catch (NumberFormatException nfe) {
            return false;
        }
        return true;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel addLbl;
    private javax.swing.JLabel addLbl1;
    private javax.swing.JPanel addParent;
    private javax.swing.JPanel addParent1;
    private javax.swing.JPanel addTxt;
    private javax.swing.JPanel addTxt1;
    private javax.swing.JButton backBtn;
    private javax.swing.JPanel border;
    private javax.swing.JPanel border4;
    private javax.swing.JPanel border5;
    private javax.swing.JPanel bottomMidPanel;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JTextField ccTxtField;
    private javax.swing.JTextField cityTxtField;
    private javax.swing.JTextField distTxtField;
    private javax.swing.JTextField emailTxtField;
    private javax.swing.JPanel finalInfo;
    private javax.swing.JLabel finalTxt;
    private javax.swing.JLabel finalTxt1;
    private javax.swing.JLabel finalTxt2;
    private javax.swing.JLabel finalTxt3;
    private javax.swing.JLabel finalTxt4;
    private javax.swing.JLabel finalTxt5;
    private javax.swing.JLabel finalTxt6;
    private javax.swing.JLabel finalTxt7;
    private javax.swing.JLabel finalTxt8;
    private javax.swing.JLabel finalTxt9;
    private javax.swing.JButton fnlBtn;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JTextField nameTxtField;
    private javax.swing.JButton nextBtn;
    private javax.swing.JTextField noTxtField;
    private javax.swing.JPanel paymentInfo;
    private javax.swing.JPanel personalInfo;
    private javax.swing.JTextField phoneTxtField;
    private javax.swing.JTextField streetTxtField;
    private javax.swing.JPanel transCtrl;
    private javax.swing.JPanel transInfo;
    private javax.swing.JLabel transStep;
    private javax.swing.JLabel transTxt;
    private javax.swing.JTextField wardTxtField;
    // End of variables declaration//GEN-END:variables
}
