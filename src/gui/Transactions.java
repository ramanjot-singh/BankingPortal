/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import db.DBConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

/**
 *
 * @author HOME
 */
public class Transactions extends javax.swing.JFrame {

    /**
     * Creates new form Transactions
     */
    String user;
    String fDate3;
    String toDate3;
    String accNo;
    Connection con;
    PreparedStatement psmt;
    ResultSet rs;

    public Transactions() {
        initComponents();

        jSplitPane1.setRightComponent(estatPnl);
        estatPnl.setVisible(true);
        user = "raman20";
        welcomeLbl.setText("Welcome " + user);

        try {
            con = DBConnection.getConnection();
            String query = "select account_no from user_account where user_id=?";
            psmt = con.prepareStatement(query);
            psmt.setString(1, user);
            rs = psmt.executeQuery();

            DefaultComboBoxModel model = (DefaultComboBoxModel) accnoCB1.getModel();
            while (rs.next()) {
                model.addElement(rs.getString("account_no"));
            }
            accnoCB1.setModel(model);
            accnoCB.setModel(model);
            accnoCB2.setModel(model);
            rs.close();
            psmt.close();

        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }

    public Transactions(String username) {

        initComponents();
        user = username;
        jSplitPane1.setRightComponent(estatPnl);
        estatPnl.setVisible(true);

        jSplitPane1.setRightComponent(estatPnl);
        estatPnl.setVisible(true);

        welcomeLbl.setText("Welcome " + user);

        try {
            con = DBConnection.getConnection();
            String query = "select account_no from user_account where user_id=?";
            psmt = con.prepareStatement(query);
            psmt.setString(1, user);
            rs = psmt.executeQuery();

            DefaultComboBoxModel model = (DefaultComboBoxModel) accnoCB1.getModel();
            while (rs.next()) {
                model.addElement(rs.getString("account_no"));
            }

            accnoCB1.setModel(model);
            accnoCB2.setModel(model);
            accnoCB.setModel(model);
            rs.close();
            psmt.close();

        } catch (Exception ex) {
            ex.printStackTrace();
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

        estatPnl = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        accnoCB = new javax.swing.JComboBox();
        jLabel11 = new javax.swing.JLabel();
        fdateTF = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        todateTF = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        filetypeCB = new javax.swing.JComboBox();
        generateBtn = new javax.swing.JButton();
        cancelBtn = new javax.swing.JButton();
        thistoryPnl = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        accnoCB1 = new javax.swing.JComboBox();
        jLabel15 = new javax.swing.JLabel();
        fdateTF1 = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        todateTF1 = new javax.swing.JTextField();
        generateBtn1 = new javax.swing.JButton();
        cancelBtn1 = new javax.swing.JButton();
        tReportPnl = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        accnoCB2 = new javax.swing.JComboBox();
        jLabel18 = new javax.swing.JLabel();
        fdateTF2 = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        todateTF2 = new javax.swing.JTextField();
        generateBtn2 = new javax.swing.JButton();
        cancelBtn2 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        tReportCB = new javax.swing.JComboBox();
        jPanel1 = new javax.swing.JPanel();
        jSplitPane1 = new javax.swing.JSplitPane();
        jPanel2 = new javax.swing.JPanel();
        logoutBtn = new javax.swing.JButton();
        estateBtn = new javax.swing.JButton();
        treportBtn = new javax.swing.JButton();
        thistoryBtn = new javax.swing.JButton();
        productsBtn = new javax.swing.JButton();
        helpBtn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        welcomeLbl = new javax.swing.JLabel();

        estatPnl.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setForeground(new java.awt.Color(0, 204, 153));
        jLabel1.setText("E-Statements");

        jLabel10.setText("Account Number");

        jLabel11.setText("From Date");

        jLabel12.setText("To Date");

        jLabel13.setText("Select Download File Type");

        filetypeCB.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "PDF", "EXCEL", "TEXT" }));

        generateBtn.setText("Generate");

        cancelBtn.setText("Cancel");

        javax.swing.GroupLayout estatPnlLayout = new javax.swing.GroupLayout(estatPnl);
        estatPnl.setLayout(estatPnlLayout);
        estatPnlLayout.setHorizontalGroup(
            estatPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(estatPnlLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(estatPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(estatPnlLayout.createSequentialGroup()
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(accnoCB, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(estatPnlLayout.createSequentialGroup()
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(fdateTF))
                    .addGroup(estatPnlLayout.createSequentialGroup()
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(todateTF))
                    .addGroup(estatPnlLayout.createSequentialGroup()
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(filetypeCB, 0, 148, Short.MAX_VALUE))
                    .addGroup(estatPnlLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(generateBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cancelBtn)
                        .addGap(8, 8, 8)))
                .addContainerGap())
            .addGroup(estatPnlLayout.createSequentialGroup()
                .addGap(104, 104, 104)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        estatPnlLayout.setVerticalGroup(
            estatPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(estatPnlLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(estatPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(accnoCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(estatPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(fdateTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(estatPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(todateTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(estatPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(filetypeCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(estatPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(generateBtn)
                    .addComponent(cancelBtn))
                .addContainerGap(36, Short.MAX_VALUE))
        );

        thistoryPnl.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 204, 153));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Transactions History");

        jLabel14.setText("Account Number");

        accnoCB1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                accnoCB1ActionPerformed(evt);
            }
        });

        jLabel15.setText("From Date");

        jLabel16.setText("To Date");

        generateBtn1.setText("Generate");
        generateBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generateBtn1ActionPerformed(evt);
            }
        });

        cancelBtn1.setText("Cancel");

        javax.swing.GroupLayout thistoryPnlLayout = new javax.swing.GroupLayout(thistoryPnl);
        thistoryPnl.setLayout(thistoryPnlLayout);
        thistoryPnlLayout.setHorizontalGroup(
            thistoryPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(thistoryPnlLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(thistoryPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(thistoryPnlLayout.createSequentialGroup()
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(accnoCB1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(thistoryPnlLayout.createSequentialGroup()
                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(fdateTF1))
                    .addGroup(thistoryPnlLayout.createSequentialGroup()
                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(todateTF1))
                    .addGroup(thistoryPnlLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(generateBtn1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cancelBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, thistoryPnlLayout.createSequentialGroup()
                .addContainerGap(86, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(71, 71, 71))
        );
        thistoryPnlLayout.setVerticalGroup(
            thistoryPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(thistoryPnlLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addGroup(thistoryPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(accnoCB1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(thistoryPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(fdateTF1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(thistoryPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(todateTF1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(thistoryPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cancelBtn1)
                    .addComponent(generateBtn1))
                .addContainerGap(40, Short.MAX_VALUE))
        );

        tReportPnl.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel4.setForeground(new java.awt.Color(0, 204, 153));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Transactions Report");

        jLabel17.setText("Account Number");

        jLabel18.setText("From Date");

        jLabel19.setText("To Date");

        generateBtn2.setText("Generate");
        generateBtn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generateBtn2ActionPerformed(evt);
            }
        });

        cancelBtn2.setText("Cancel");

        jLabel5.setText("Select File Type");

        tReportCB.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "PDF", "EXCEL", "TEXT" }));
        tReportCB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tReportCBActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout tReportPnlLayout = new javax.swing.GroupLayout(tReportPnl);
        tReportPnl.setLayout(tReportPnlLayout);
        tReportPnlLayout.setHorizontalGroup(
            tReportPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tReportPnlLayout.createSequentialGroup()
                .addGroup(tReportPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(tReportPnlLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(tReportPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(tReportPnlLayout.createSequentialGroup()
                                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(accnoCB2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(tReportPnlLayout.createSequentialGroup()
                                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(fdateTF2))
                            .addGroup(tReportPnlLayout.createSequentialGroup()
                                .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(tReportPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(todateTF2)
                                    .addGroup(tReportPnlLayout.createSequentialGroup()
                                        .addComponent(generateBtn2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(cancelBtn2))))))
                    .addGroup(tReportPnlLayout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(tReportPnlLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tReportCB, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        tReportPnlLayout.setVerticalGroup(
            tReportPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tReportPnlLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addGroup(tReportPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(accnoCB2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(tReportPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(fdateTF2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(tReportPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(todateTF2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(tReportPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(tReportCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addGroup(tReportPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(generateBtn2)
                    .addComponent(cancelBtn2))
                .addContainerGap())
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jSplitPane1.setDividerLocation(140);

        logoutBtn.setText("Logout");
        logoutBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutBtnActionPerformed(evt);
            }
        });

        estateBtn.setText("E-Statements");
        estateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                estateBtnActionPerformed(evt);
            }
        });

        treportBtn.setText("Transactions Report");
        treportBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                treportBtnActionPerformed(evt);
            }
        });

        thistoryBtn.setText("Transactions History");
        thistoryBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                thistoryBtnActionPerformed(evt);
            }
        });

        productsBtn.setText("Products And Services");
        productsBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                productsBtnActionPerformed(evt);
            }
        });

        helpBtn.setText("Help");
        helpBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                helpBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(estateBtn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(treportBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(thistoryBtn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(helpBtn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(logoutBtn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(productsBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(estateBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(treportBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(thistoryBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                .addComponent(helpBtn)
                .addGap(9, 9, 9)
                .addComponent(logoutBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(productsBtn)
                .addGap(16, 16, 16))
        );

        jSplitPane1.setLeftComponent(jPanel2);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSplitPane1)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSplitPane1)
                .addContainerGap())
        );

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 204, 153));
        jLabel2.setText("View Account Transactions");

        welcomeLbl.setText("ggg");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(welcomeLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 112, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(welcomeLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void estateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_estateBtnActionPerformed
        jSplitPane1.setRightComponent(estatPnl);
        estatPnl.setVisible(true);


    }//GEN-LAST:event_estateBtnActionPerformed

    private void productsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_productsBtnActionPerformed
        this.dispose();
        new ProductList(user).setVisible(true);
    }//GEN-LAST:event_productsBtnActionPerformed

    private void thistoryBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_thistoryBtnActionPerformed
        jSplitPane1.setRightComponent(thistoryPnl);
        thistoryPnl.setVisible(true);
    }//GEN-LAST:event_thistoryBtnActionPerformed

    private void generateBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generateBtn1ActionPerformed
        accNo = accnoCB1.getSelectedItem().toString();
        toDate3 = todateTF1.getText();
        fDate3 = fdateTF1.getText();
        new TransHistory(this).setVisible(true);
    }//GEN-LAST:event_generateBtn1ActionPerformed

    private void accnoCB1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_accnoCB1ActionPerformed

    }//GEN-LAST:event_accnoCB1ActionPerformed

    private void helpBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_helpBtnActionPerformed
        this.dispose();
        new Help(this, user).setVisible(true);
    }//GEN-LAST:event_helpBtnActionPerformed

    private void treportBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_treportBtnActionPerformed
        jSplitPane1.setRightComponent(tReportPnl);
        tReportPnl.setVisible(true);
    }//GEN-LAST:event_treportBtnActionPerformed

    private void logoutBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutBtnActionPerformed
        try {
            Connection c1 = DBConnection.getConnection();
            String query = "update user_session set logout=sysdate where user_id=? and logout is null ";
            PreparedStatement psmt1 = c1.prepareStatement(query);

            psmt1.setString(1, user);

            psmt1.executeUpdate();
            JOptionPane.showMessageDialog(this, "Successfully logout", "About logout", JOptionPane.INFORMATION_MESSAGE);

        } catch (Exception ex) {
            ex.printStackTrace();
        }
        this.dispose();
        new CoverFrame().setVisible(true);
    }//GEN-LAST:event_logoutBtnActionPerformed

    private void tReportCBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tReportCBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tReportCBActionPerformed

    private void generateBtn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generateBtn2ActionPerformed
        accNo = accnoCB2.getSelectedItem().toString();
        toDate3 = todateTF2.getText();
        fDate3 = fdateTF2.getText();
        try {
            new TransHistory(this, tReportCB.getSelectedItem().toString());
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_generateBtn2ActionPerformed

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Transactions.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Transactions.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Transactions.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Transactions.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Transactions().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox accnoCB;
    private javax.swing.JComboBox accnoCB1;
    private javax.swing.JComboBox accnoCB2;
    private javax.swing.JButton cancelBtn;
    private javax.swing.JButton cancelBtn1;
    private javax.swing.JButton cancelBtn2;
    private javax.swing.JPanel estatPnl;
    private javax.swing.JButton estateBtn;
    private javax.swing.JTextField fdateTF;
    private javax.swing.JTextField fdateTF1;
    private javax.swing.JTextField fdateTF2;
    private javax.swing.JComboBox filetypeCB;
    private javax.swing.JButton generateBtn;
    private javax.swing.JButton generateBtn1;
    private javax.swing.JButton generateBtn2;
    private javax.swing.JButton helpBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JButton logoutBtn;
    private javax.swing.JButton productsBtn;
    private javax.swing.JComboBox tReportCB;
    private javax.swing.JPanel tReportPnl;
    private javax.swing.JButton thistoryBtn;
    private javax.swing.JPanel thistoryPnl;
    private javax.swing.JTextField todateTF;
    private javax.swing.JTextField todateTF1;
    private javax.swing.JTextField todateTF2;
    private javax.swing.JButton treportBtn;
    private javax.swing.JLabel welcomeLbl;
    // End of variables declaration//GEN-END:variables
}
