/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package gui;

/**
 *
 * @author HOME
 */
public class NewJFrame1 extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame1
     */
    public NewJFrame1() {
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

        jPanel1 = new javax.swing.JPanel();
        billBtn = new javax.swing.JButton();
        accountBtn = new javax.swing.JButton();
        fundsBtn = new javax.swing.JButton();
        accounttransBtn = new javax.swing.JButton();
        chequeBtn = new javax.swing.JButton();
        loansBtn = new javax.swing.JButton();
        fdBtn = new javax.swing.JButton();
        balanceBtn = new javax.swing.JButton();
        closeaccountBtn = new javax.swing.JButton();
        utilitiesBtn = new javax.swing.JButton();
        jRadioButton1 = new javax.swing.JRadioButton();
        profilePnl = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        nameTF = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        addressTF = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        cityTF = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        postalTF = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        countryTF = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        homephoneTF = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        workphoneTF = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        mobileTF = new javax.swing.JTextField();
        tReportPnl = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        accnoCB = new javax.swing.JComboBox();
        jLabel11 = new javax.swing.JLabel();
        fdateTF = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        todateTF = new javax.swing.JTextField();
        generateBtn = new javax.swing.JButton();
        cancelBtn = new javax.swing.JButton();

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setLayout(new java.awt.GridLayout(5, 2, 5, 5));

        billBtn.setForeground(new java.awt.Color(0, 0, 204));
        billBtn.setText("Bill Payment");
        jPanel1.add(billBtn);

        accountBtn.setForeground(new java.awt.Color(0, 0, 204));
        accountBtn.setText("Open Account");
        accountBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                accountBtnActionPerformed(evt);
            }
        });
        jPanel1.add(accountBtn);

        fundsBtn.setForeground(new java.awt.Color(0, 0, 204));
        fundsBtn.setText("Transfer Funds");
        jPanel1.add(fundsBtn);

        accounttransBtn.setForeground(new java.awt.Color(0, 0, 204));
        accounttransBtn.setText("View Account Transactions");
        jPanel1.add(accounttransBtn);

        chequeBtn.setForeground(new java.awt.Color(0, 0, 204));
        chequeBtn.setText("Cheque Services");
        jPanel1.add(chequeBtn);

        loansBtn.setForeground(new java.awt.Color(0, 0, 204));
        loansBtn.setText("Loans");
        jPanel1.add(loansBtn);

        fdBtn.setForeground(new java.awt.Color(0, 0, 204));
        fdBtn.setText("Fixed Deposits");
        jPanel1.add(fdBtn);

        balanceBtn.setForeground(new java.awt.Color(0, 0, 204));
        balanceBtn.setText("Balance Enquiry");
        jPanel1.add(balanceBtn);

        closeaccountBtn.setForeground(new java.awt.Color(0, 0, 204));
        closeaccountBtn.setText("Close Account");
        jPanel1.add(closeaccountBtn);

        utilitiesBtn.setForeground(new java.awt.Color(0, 0, 204));
        utilitiesBtn.setText("Utilities");
        jPanel1.add(utilitiesBtn);

        jRadioButton1.setText("jRadioButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        profilePnl.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        profilePnl.setLayout(new java.awt.GridLayout(8, 2, 5, 5));

        jLabel2.setText("<html><body>Name<font color=\"red\"> *</font></body></html>");
        profilePnl.add(jLabel2);
        profilePnl.add(nameTF);

        jLabel3.setText("Address");
        profilePnl.add(jLabel3);
        profilePnl.add(addressTF);

        jLabel4.setText("City");
        profilePnl.add(jLabel4);
        profilePnl.add(cityTF);

        jLabel5.setText("Postal Code");
        profilePnl.add(jLabel5);
        profilePnl.add(postalTF);

        jLabel6.setText("Country");
        profilePnl.add(jLabel6);
        profilePnl.add(countryTF);

        jLabel7.setText("Home Phone Number");
        profilePnl.add(jLabel7);
        profilePnl.add(homephoneTF);

        jLabel8.setText("Work Phone NUmber");
        profilePnl.add(jLabel8);
        profilePnl.add(workphoneTF);

        jLabel9.setText("Mobile Phone NUmber");
        profilePnl.add(jLabel9);
        profilePnl.add(mobileTF);

        tReportPnl.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setForeground(new java.awt.Color(0, 204, 153));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Transactions Report");

        jLabel10.setText("Account Number");

        jLabel11.setText("From Date");

        jLabel12.setText("To Date");

        generateBtn.setText("Generate");

        cancelBtn.setText("Cancel");

        javax.swing.GroupLayout tReportPnlLayout = new javax.swing.GroupLayout(tReportPnl);
        tReportPnl.setLayout(tReportPnlLayout);
        tReportPnlLayout.setHorizontalGroup(
            tReportPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tReportPnlLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(tReportPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(tReportPnlLayout.createSequentialGroup()
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(accnoCB, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(tReportPnlLayout.createSequentialGroup()
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(fdateTF))
                    .addGroup(tReportPnlLayout.createSequentialGroup()
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(tReportPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(tReportPnlLayout.createSequentialGroup()
                                .addComponent(generateBtn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cancelBtn)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(todateTF))))
                .addContainerGap())
            .addGroup(tReportPnlLayout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        tReportPnlLayout.setVerticalGroup(
            tReportPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tReportPnlLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(tReportPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(accnoCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(tReportPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(fdateTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(tReportPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(todateTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(tReportPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(generateBtn)
                    .addComponent(cancelBtn))
                .addContainerGap(43, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(profilePnl, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addComponent(tReportPnl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(47, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(profilePnl, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tReportPnl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(154, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void accountBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_accountBtnActionPerformed
        this.dispose();
        //new UserRegistration(this).setVisible(true);
    }//GEN-LAST:event_accountBtnActionPerformed

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
            java.util.logging.Logger.getLogger(NewJFrame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox accnoCB;
    private javax.swing.JButton accountBtn;
    private javax.swing.JButton accounttransBtn;
    private javax.swing.JTextField addressTF;
    private javax.swing.JButton balanceBtn;
    private javax.swing.JButton billBtn;
    private javax.swing.JButton cancelBtn;
    private javax.swing.JButton chequeBtn;
    private javax.swing.JTextField cityTF;
    private javax.swing.JButton closeaccountBtn;
    private javax.swing.JTextField countryTF;
    private javax.swing.JButton fdBtn;
    private javax.swing.JTextField fdateTF;
    private javax.swing.JButton fundsBtn;
    private javax.swing.JButton generateBtn;
    private javax.swing.JTextField homephoneTF;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JButton loansBtn;
    private javax.swing.JTextField mobileTF;
    private javax.swing.JTextField nameTF;
    private javax.swing.JTextField postalTF;
    private javax.swing.JPanel profilePnl;
    private javax.swing.JPanel tReportPnl;
    private javax.swing.JTextField todateTF;
    private javax.swing.JButton utilitiesBtn;
    private javax.swing.JTextField workphoneTF;
    // End of variables declaration//GEN-END:variables
}
