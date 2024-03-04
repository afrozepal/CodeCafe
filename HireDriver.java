/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.guimod1.guiclasses;

import com.mycompany.guimod1.businesslayer.ConnectionClass;
import com.mycompany.guimod1.system.SystemLayer;
import javax.swing.table.TableModel; // Add this line

import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author afroz
 */
public class HireDriver extends javax.swing.JFrame {

    /**    
     * Creates new form hiredriver
     */
    public HireDriver() {
        initComponents();
      //  addTableListener(); // Add this line to set up the listener
    }
class GPanel extends JPanel {

    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        int width=getWidth();
        int height=getHeight();
        
        Color color1 = new Color(52,143,80);
        Color color2 = new Color(86,180,211);

        GradientPaint gradient = new GradientPaint(
                0, 0, color1,
                width, height, color2);

        g2d.setPaint(gradient);
        g2d.fillRect(0, 0, width, height);
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

        jPanel1 = new GPanel();
        kGradientPanel1 = new keeptoo.KGradientPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        id = new javax.swing.JLabel();
        Reject = new javax.swing.JButton();
        Accept = new javax.swing.JButton();
        status = new javax.swing.JLabel();
        name = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        Hiringtable = new javax.swing.JTable();
        Showpending = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        details = new javax.swing.JLabel();
        Showrejected = new javax.swing.JButton();
        Showaccepted = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Waste Management Application - Hire Drivers");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        kGradientPanel1.setEndColor(new java.awt.Color(86, 180, 211));
        kGradientPanel1.setStartColor(new java.awt.Color(52, 143, 80));

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));

        jLabel1.setBackground(new java.awt.Color(51, 51, 51));
        jLabel1.setFont(new java.awt.Font("Microsoft PhagsPa", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("LIST OF APPLICANTS");

        id.setForeground(new java.awt.Color(255, 255, 255));
        id.setText("Applicant id");
        id.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        Reject.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Reject.setText("REJECT");
        Reject.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RejectActionPerformed(evt);
            }
        });

        Accept.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Accept.setText("ACCEPT");
        Accept.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AcceptActionPerformed(evt);
            }
        });

        status.setForeground(new java.awt.Color(255, 255, 255));
        status.setText("Status");

        name.setForeground(new java.awt.Color(255, 255, 255));
        name.setText("Name");

        Hiringtable.setBackground(new java.awt.Color(102, 102, 102));
        Hiringtable.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        Hiringtable.setForeground(new java.awt.Color(255, 255, 255));
        Hiringtable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Applicant ID", "Applicant Name", "Status", "Details"
            }
        ));
        Hiringtable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                HiringtableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(Hiringtable);

        Showpending.setText("SHOW PENDING APPLICANTIONS");
        Showpending.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ShowpendingActionPerformed(evt);
            }
        });

        details.setBackground(new java.awt.Color(102, 102, 102));
        details.setFont(new java.awt.Font("Gill Sans MT", 0, 18)); // NOI18N
        details.setText("DETAILS");
        jScrollPane3.setViewportView(details);

        Showrejected.setText("SHOW REJECTED APPLICANTIONS");
        Showrejected.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ShowrejectedActionPerformed(evt);
            }
        });

        Showaccepted.setText("SHOW ACCEPTED APPLICANTIONS");
        Showaccepted.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ShowacceptedActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(414, 414, 414)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(Accept)
                                .addGap(129, 129, 129)
                                .addComponent(Reject))
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(118, 118, 118)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(57, 57, 57)
                                .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(35, 35, 35)
                                .addComponent(status, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(Showpending)
                                .addGap(88, 88, 88)
                                .addComponent(Showrejected)
                                .addGap(43, 43, 43)
                                .addComponent(Showaccepted)))))
                .addGap(0, 144, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(212, 212, 212)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 652, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Showpending)
                        .addGap(47, 47, 47)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(status, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Showaccepted)
                            .addComponent(Showrejected))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(27, 27, 27)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Reject, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Accept, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 457, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jScrollPane1.setViewportView(jPanel2);

        kGradientPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(280, 150, 1060, 630);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1695, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(kGradientPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 913, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
SystemLayer hs=new SystemLayer();
int applicant_id;
    private void RejectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RejectActionPerformed
        // TODO add your handling code here:
        hs.applicationrejection(applicant_id);
    }//GEN-LAST:event_RejectActionPerformed

    private void AcceptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AcceptActionPerformed
        // TODO add your handling code here:
        hs.applicationapproval(applicant_id);
    }//GEN-LAST:event_AcceptActionPerformed

    private void ShowpendingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ShowpendingActionPerformed
        // TODO add your handling code here:
    //    hs.populateHiringtable();
    
      try {
            // Establish database connection
            ConnectionClass conn=new ConnectionClass();
            Connection connection = conn.getConnectionString();

            Statement st = connection.createStatement();
            String sql = "SELECT * FROM Hiring Where astatus = 'Pending'";

            ResultSet rs = st.executeQuery(sql);

            // Clear existing data in the table model
            DefaultTableModel tb1Model = (DefaultTableModel) Hiringtable.getModel();
            tb1Model.setRowCount(0);

            while (rs.next()) {
                String id = String.valueOf(rs.getInt("applicantID"));
                String name = rs.getString("applicantName");
                String status = rs.getString("astatus");
                String details = rs.getString("details");

                // Add data to the table model
                String[] tbData = {id, name, status, details};
                tb1Model.addRow(tbData);
            }
// Add an empty row for each iteration
    for (int i=0 ; i<20 ; i++)
    {
        String[] emptyRow = {"", "", ""}; 
    tb1Model.addRow(emptyRow);
    }
            // Close resources
            rs.close();
            st.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
     
    }//GEN-LAST:event_ShowpendingActionPerformed

    private void HiringtableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HiringtableMouseClicked
        // TODO add your handling code here:
        int i=Hiringtable.getSelectedRow();
        TableModel model=Hiringtable.getModel();
        String idText = model.getValueAt(i, 0).toString();
        applicant_id = Integer.parseInt(idText);
        id.setText(idText);
        name.setText(model.getValueAt(i,1).toString());
        status.setText(model.getValueAt(i,2).toString());
        details.setText(model.getValueAt(i,3).toString());

    }//GEN-LAST:event_HiringtableMouseClicked

    private void ShowrejectedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ShowrejectedActionPerformed
        // TODO add your handling code here:
        try {
            // Establish database connection
            ConnectionClass conn=new ConnectionClass();
            Connection connection = conn.getConnectionString();

            Statement st = connection.createStatement();
            String sql = "SELECT * FROM Hiring Where astatus = 'Rejected'";

            ResultSet rs = st.executeQuery(sql);

            // Clear existing data in the table model
            DefaultTableModel tb1Model = (DefaultTableModel) Hiringtable.getModel();
            tb1Model.setRowCount(0);

            while (rs.next()) {
                String id = String.valueOf(rs.getInt("applicantID"));
                String name = rs.getString("applicantName");
                String status = rs.getString("astatus");
                String details = rs.getString("details");

                // Add data to the table model
                String[] tbData = {id, name, status, details};
                tb1Model.addRow(tbData);
            }
// Add an empty row for each iteration
    for (int i=0 ; i<20 ; i++)
    {
        String[] emptyRow = {"", "", ""}; 
    tb1Model.addRow(emptyRow);
    }
            // Close resources
            rs.close();
            st.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_ShowrejectedActionPerformed

    private void ShowacceptedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ShowacceptedActionPerformed
        // TODO add your handling code here:
        try {
            // Establish database connection
            ConnectionClass conn=new ConnectionClass();
            Connection connection = conn.getConnectionString();

            Statement st = connection.createStatement();
            String sql = "SELECT * FROM Hiring Where astatus = 'Accepted'";

            ResultSet rs = st.executeQuery(sql);

            // Clear existing data in the table model
            DefaultTableModel tb1Model = (DefaultTableModel) Hiringtable.getModel();
            tb1Model.setRowCount(0);

            while (rs.next()) {
                String id = String.valueOf(rs.getInt("applicantID"));
                String name = rs.getString("applicantName");
                String status = rs.getString("astatus");
                String details = rs.getString("details");

                // Add data to the table model
                String[] tbData = {id, name, status, details};
                tb1Model.addRow(tbData);
            }
// Add an empty row for each iteration
    for (int i=0 ; i<20 ; i++)
    {
        String[] emptyRow = {"", "", ""}; 
    tb1Model.addRow(emptyRow);
    }
            // Close resources
            rs.close();
            st.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_ShowacceptedActionPerformed

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
            java.util.logging.Logger.getLogger(HireDriver.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HireDriver.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HireDriver.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HireDriver.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HireDriver().setVisible(true);
            }
        });
    }
///self functions:
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Accept;
    private javax.swing.JTable Hiringtable;
    private javax.swing.JButton Reject;
    private javax.swing.JButton Showaccepted;
    private javax.swing.JButton Showpending;
    private javax.swing.JButton Showrejected;
    private javax.swing.JLabel details;
    private javax.swing.JLabel id;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private keeptoo.KGradientPanel kGradientPanel1;
    private javax.swing.JLabel name;
    private javax.swing.JLabel status;
    // End of variables declaration//GEN-END:variables
}