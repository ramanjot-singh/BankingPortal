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
import java.sql.ResultSetMetaData;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author HOME
 */
public class Ad_CloseAcc extends javax.swing.JFrame {

    /**
     * Creates new form Ad_CloseAcc
     */
    Connection con;
    String query;
    PreparedStatement psmt;
    ResultSet rs;
    ResultSetMetaData rsmd;

    public Ad_CloseAcc() {
        initComponents();

        con = DBConnection.getConnection();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ViewDetailsPnl = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        ViewAppPnl = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jSplitPane2 = new javax.swing.JSplitPane();
        viewBtnPnl = new javax.swing.JPanel();
        processBtn = new javax.swing.JButton();
        detailsverifBtn = new javax.swing.JButton();
        backBtn = new javax.swing.JButton();
        deleteBtn = new javax.swing.JButton();
        displayAppPnl = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        viewAppTA = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jSplitPane1 = new javax.swing.JSplitPane();
        jPanel2 = new javax.swing.JPanel();
        ViewAppBtn = new javax.swing.JButton();
        userLbl = new javax.swing.JLabel();
        accnoLbl = new javax.swing.JLabel();
        onlyaccLbl = new javax.swing.JLabel();

        ViewDetailsPnl.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "User ID", "Account No.", "Application", "Status", "Details Verified"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTable1MousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 204, 153));
        jLabel2.setText("View Requests");

        javax.swing.GroupLayout ViewDetailsPnlLayout = new javax.swing.GroupLayout(ViewDetailsPnl);
        ViewDetailsPnl.setLayout(ViewDetailsPnlLayout);
        ViewDetailsPnlLayout.setHorizontalGroup(
            ViewDetailsPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ViewDetailsPnlLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(ViewDetailsPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ViewDetailsPnlLayout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(192, 192, 192))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ViewDetailsPnlLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 458, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        ViewDetailsPnlLayout.setVerticalGroup(
            ViewDetailsPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ViewDetailsPnlLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(26, 26, 26)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        ViewAppPnl.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 204, 153));
        jLabel3.setText("View Application");

        jSplitPane2.setDividerLocation(120);

        processBtn.setText("Process");
        processBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                processBtnActionPerformed(evt);
            }
        });

        detailsverifBtn.setText("Details Verified");
        detailsverifBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                detailsverifBtnActionPerformed(evt);
            }
        });

        backBtn.setText("Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        deleteBtn.setText("Confirm Delete");
        deleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout viewBtnPnlLayout = new javax.swing.GroupLayout(viewBtnPnl);
        viewBtnPnl.setLayout(viewBtnPnlLayout);
        viewBtnPnlLayout.setHorizontalGroup(
            viewBtnPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(viewBtnPnlLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(viewBtnPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(detailsverifBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(processBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(backBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(deleteBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        viewBtnPnlLayout.setVerticalGroup(
            viewBtnPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(viewBtnPnlLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(processBtn)
                .addGap(4, 4, 4)
                .addComponent(detailsverifBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(deleteBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 98, Short.MAX_VALUE)
                .addComponent(backBtn)
                .addContainerGap())
        );

        jSplitPane2.setLeftComponent(viewBtnPnl);

        viewAppTA.setColumns(20);
        viewAppTA.setRows(5);
        jScrollPane2.setViewportView(viewAppTA);

        javax.swing.GroupLayout displayAppPnlLayout = new javax.swing.GroupLayout(displayAppPnl);
        displayAppPnl.setLayout(displayAppPnlLayout);
        displayAppPnlLayout.setHorizontalGroup(
            displayAppPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(displayAppPnlLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 386, Short.MAX_VALUE)
                .addContainerGap())
        );
        displayAppPnlLayout.setVerticalGroup(
            displayAppPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, displayAppPnlLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 209, Short.MAX_VALUE)
                .addContainerGap())
        );

        jSplitPane2.setRightComponent(displayAppPnl);

        javax.swing.GroupLayout ViewAppPnlLayout = new javax.swing.GroupLayout(ViewAppPnl);
        ViewAppPnl.setLayout(ViewAppPnlLayout);
        ViewAppPnlLayout.setHorizontalGroup(
            ViewAppPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ViewAppPnlLayout.createSequentialGroup()
                .addGap(201, 201, 201)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(ViewAppPnlLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSplitPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 532, Short.MAX_VALUE)
                .addContainerGap())
        );
        ViewAppPnlLayout.setVerticalGroup(
            ViewAppPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ViewAppPnlLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSplitPane2)
                .addContainerGap())
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 204, 153));
        jLabel1.setText("Close Account");

        jSplitPane1.setDividerLocation(120);

        ViewAppBtn.setText("View");
        ViewAppBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewAppBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ViewAppBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 99, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(ViewAppBtn)
                .addContainerGap(210, Short.MAX_VALUE))
        );

        jSplitPane1.setLeftComponent(jPanel2);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSplitPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 571, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSplitPane1)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(149, 149, 149)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(userLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(onlyaccLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(accnoLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(userLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(accnoLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(onlyaccLbl, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ViewAppBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewAppBtnActionPerformed
        jSplitPane1.setRightComponent(ViewDetailsPnl);
        ViewDetailsPnl.setVisible(true);

        try {

            query = "select * from user_closeacc";
            psmt = con.prepareStatement(query);
            rs = psmt.executeQuery();
            rsmd = rs.getMetaData();
            Vector coloumn = new Vector();
            int count = rsmd.getColumnCount();
            DefaultTableModel dtm = new DefaultTableModel();
            for (int ii = 1; ii <= count; ii++) {
                coloumn.addElement(rsmd.getColumnName(ii));
            }
            dtm.setColumnIdentifiers(coloumn);
            while (rs.next()) {
                Vector row = new Vector();
                for (int i = 1; i <= count; i++) {
                    row.addElement(rs.getString(i));
                }
                dtm.addRow(row);
            }
            jTable1.setModel(dtm);

        } catch (Exception e) {
            e.printStackTrace();

        }

    }//GEN-LAST:event_ViewAppBtnActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        if (evt.getClickCount() == 1) {

            {

                int row = jTable1.rowAtPoint(evt.getPoint());
                String user = (String) jTable1.getValueAt(row, 0);
                String acc = (String) jTable1.getValueAt(row, 1);
                String app = (String) jTable1.getValueAt(row, 2);
                userLbl.setText("user ID: " + user);
                onlyaccLbl.setText("Account No: ");
                accnoLbl.setText(acc);
                jSplitPane1.setRightComponent(ViewAppPnl);
                ViewAppPnl.setVisible(true);
                viewAppTA.setText(app);
                viewAppTA.setCaretPosition(0);

            }
        }
    }//GEN-LAST:event_jTable1MouseClicked

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        jSplitPane1.setRightComponent(ViewDetailsPnl);
        ViewDetailsPnl.setVisible(true);
        try {

            query = "select * from user_closeacc";
            psmt = con.prepareStatement(query);
            rs = psmt.executeQuery();
            rsmd = rs.getMetaData();
            Vector coloumn = new Vector();
            int count = rsmd.getColumnCount();
            DefaultTableModel dtm = new DefaultTableModel();
            for (int ii = 1; ii <= count; ii++) {
                coloumn.addElement(rsmd.getColumnName(ii));
            }
            dtm.setColumnIdentifiers(coloumn);
            while (rs.next()) {
                Vector row = new Vector();
                for (int i = 1; i <= count; i++) {
                    row.addElement(rs.getString(i));
                }
                dtm.addRow(row);
            }
            jTable1.setModel(dtm);

        } catch (Exception e) {
            e.printStackTrace();

        }
    }//GEN-LAST:event_backBtnActionPerformed

    private void jTable1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MousePressed

    }//GEN-LAST:event_jTable1MousePressed

    private void processBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_processBtnActionPerformed
        try {

            query = "update user_closeacc  set status=? where acc_no=?";
            psmt = con.prepareStatement(query);

            psmt.setString(1, "app in process");
            psmt.setString(2, accnoLbl.getText());
            System.out.println(accnoLbl.getText());
            psmt.executeUpdate();
            System.out.println("updated");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_processBtnActionPerformed

    private void detailsverifBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_detailsverifBtnActionPerformed
        try {

            query = "update user_closeacc  set details_verified=? where acc_no=?";
            psmt = con.prepareStatement(query);

            psmt.setString(1, "Details are verified");
            psmt.setString(2, accnoLbl.getText());
            System.out.println(accnoLbl.getText());
            psmt.executeUpdate();
            System.out.println("verified");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_detailsverifBtnActionPerformed

    private void deleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBtnActionPerformed
     int i=  JOptionPane.showConfirmDialog(this,"Do you want to delete Account", "About deletion",JOptionPane.YES_NO_CANCEL_OPTION);
     if(i==0){
           try {
               JOptionPane.showMessageDialog(this,"Successfully Deleted","About Deletion",JOptionPane.INFORMATION_MESSAGE);
            query = "update user_closeacc  set status=? where acc_no=?";
            psmt = con.prepareStatement(query);

            psmt.setString(1, " Approved Application");
            psmt.setString(2, accnoLbl.getText());
            System.out.println(accnoLbl.getText());
            psmt.executeUpdate();
            System.out.println("verified");
        } catch (Exception e) {
            e.printStackTrace();
        }
     }
    }//GEN-LAST:event_deleteBtnActionPerformed

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
            java.util.logging.Logger.getLogger(Ad_CloseAcc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ad_CloseAcc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ad_CloseAcc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ad_CloseAcc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ad_CloseAcc().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ViewAppBtn;
    private javax.swing.JPanel ViewAppPnl;
    private javax.swing.JPanel ViewDetailsPnl;
    private javax.swing.JLabel accnoLbl;
    private javax.swing.JButton backBtn;
    private javax.swing.JButton deleteBtn;
    private javax.swing.JButton detailsverifBtn;
    private javax.swing.JPanel displayAppPnl;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JSplitPane jSplitPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel onlyaccLbl;
    private javax.swing.JButton processBtn;
    private javax.swing.JLabel userLbl;
    private javax.swing.JTextArea viewAppTA;
    private javax.swing.JPanel viewBtnPnl;
    // End of variables declaration//GEN-END:variables
}