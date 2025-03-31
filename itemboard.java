/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package item;

import com.mysql.cj.jdbc.result.ResultSetImpl;
import java.sql.*;

import javax.swing.JOptionPane;

/**
 *
 * @author User
 * 
 */

public class itemboard extends javax.swing.JFrame {
    
    
    
    public itemboard() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtsearch = new javax.swing.JTextField();
        btnsearch = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtname = new javax.swing.JTextField();
        txtunit = new javax.swing.JTextField();
        txtdes = new javax.swing.JTextField();
        txtqut = new javax.swing.JTextField();
        txtprice = new javax.swing.JTextField();
        txtitemno = new javax.swing.JLabel();
        btnDelete = new javax.swing.JButton();
        btnadd = new javax.swing.JButton();
        btnupdate = new javax.swing.JButton();
        btnclear = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Store Manegment");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 20, -1, -1));

        txtsearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtsearchActionPerformed(evt);
            }
        });
        jPanel1.add(txtsearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 60, 200, -1));

        btnsearch.setBackground(new java.awt.Color(0, 204, 204));
        btnsearch.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnsearch.setText("Search ");
        btnsearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsearchActionPerformed(evt);
            }
        });
        jPanel1.add(btnsearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(265, 60, 170, -1));

        jPanel2.setBackground(new java.awt.Color(204, 204, 255));

        jLabel2.setText("Item No :");

        jLabel3.setText("Unit :");

        jLabel4.setText("Name :");

        jLabel5.setText("Description :");

        jLabel6.setText("Price :");

        jLabel7.setText("Quantity :");

        txtname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnameActionPerformed(evt);
            }
        });

        txtitemno.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(29, 29, 29))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 109, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtname, javax.swing.GroupLayout.DEFAULT_SIZE, 232, Short.MAX_VALUE)
                    .addComponent(txtunit)
                    .addComponent(txtdes)
                    .addComponent(txtqut)
                    .addComponent(txtprice)
                    .addComponent(txtitemno, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(txtitemno, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtunit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtdes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtqut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtprice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(61, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, 380, 290));

        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        jPanel1.add(btnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 250, 130, 40));

        btnadd.setText("Add");
        btnadd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaddActionPerformed(evt);
            }
        });
        jPanel1.add(btnadd, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 110, 130, 40));

        btnupdate.setText("Update");
        btnupdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnupdateActionPerformed(evt);
            }
        });
        jPanel1.add(btnupdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 180, 130, 40));

        btnclear.setText("Clear");
        btnclear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnclearActionPerformed(evt);
            }
        });
        jPanel1.add(btnclear, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 320, 130, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 431, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void txtsearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtsearchActionPerformed
        
    }//GEN-LAST:event_txtsearchActionPerformed

    private void formload(){
        int lastItemNo = 0; // Default value if no records exist

    String sql = "SELECT MAX(itemno) AS lastItem FROM item";

    try (java.sql.Connection conn = Connection.getConnection();
         PreparedStatement stmt = conn.prepareStatement(sql);
         ResultSet rs = stmt.executeQuery()) {
        
        if (rs.next()) {
            lastItemNo = rs.getInt("lastItem");
        }

        int newitemno = lastItemNo + 1; // Increment for new entry
        txtitemno.setText(String.valueOf(newitemno)); // Convert int to String

    } catch (SQLException e) {
        System.err.println("Error fetching last itemno: " + e.getMessage());
        JOptionPane.showMessageDialog(null, "Database error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    }
    
    }
    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
       try {
        // Get item number to delete
        int itemno = Integer.parseInt(txtitemno.getText()); // Get the item number from the text field

        // SQL query to delete the item
        String sql = "DELETE FROM item WHERE itemno = ?";

        try (java.sql.Connection conn = Connection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setInt(1, itemno); // Set the item number to delete

            int rowsAffected = stmt.executeUpdate();

            if (rowsAffected > 0) {
                JOptionPane.showMessageDialog(null, "Item deleted successfully!");
                // Optionally, clear all the fields after deleting the item
                txtsearch.setText("");
                txtitemno.setText("");
                txtname.setText("");
                txtunit.setText("");
                txtdes.setText("");
                txtqut.setText("");
                txtprice.setText("");
                
                formload();
            } else {
                JOptionPane.showMessageDialog(null, "Delete failed! Item not found.");
            }
        }
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(null, "Invalid item number! Please enter a valid number.", "Error", JOptionPane.ERROR_MESSAGE);
    } catch (SQLException e) {
        System.err.println("Error deleting item: " + e.getMessage());
        JOptionPane.showMessageDialog(null, "Database error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnaddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaddActionPerformed
        if (txtitemno.getText().isEmpty() || txtname.getText().isEmpty() || txtunit.getText().isEmpty() || 
        txtdes.getText().isEmpty() || txtqut.getText().isEmpty() || txtprice.getText().isEmpty()) {
        JOptionPane.showMessageDialog(null, "Please fill in all fields before adding the item.", "Error", JOptionPane.ERROR_MESSAGE);
        return; // Exit the method if any field is empty
    }

    try {
        // Get values from the text fields
        int itemno = Integer.parseInt(txtitemno.getText());
        String name = txtname.getText();
        int unit = Integer.parseInt(txtunit.getText());
        String des = txtdes.getText();
        int qut = Integer.parseInt(txtqut.getText());
        double price = Double.parseDouble(txtprice.getText());

        // SQL query to insert the new item
        String sql = "INSERT INTO item (itemno, name, unit, description, qut, price) VALUES (?, ?, ?, ?, ?, ?)";

        try (java.sql.Connection conn = Connection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setInt(1, itemno);
            stmt.setString(2, name);
            stmt.setInt(3, unit);
            stmt.setString(4, des);
            stmt.setInt(5, qut);
            stmt.setDouble(6, price);

            // Execute the query
            int rowsAffected = stmt.executeUpdate();
            if (rowsAffected > 0) {
                JOptionPane.showMessageDialog(null, "Item added successfully!");
                
                // Clear all fields after successful insertion
                txtsearch.setText("");
                txtitemno.setText("");
                txtname.setText("");
                txtunit.setText("");
                txtdes.setText("");
                txtqut.setText("");
                txtprice.setText("");
                
                formload();
            } else {
                JOptionPane.showMessageDialog(null, "Failed to add item!");
            }

        } catch (SQLException e) {
            System.err.println("Error adding item: " + e.getMessage());
            JOptionPane.showMessageDialog(null, "Database error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }

    } catch (NumberFormatException e) {
        // Handle incorrect number format (e.g., if the user enters non-numeric values)
        JOptionPane.showMessageDialog(null, "Invalid number format! Please enter valid numbers for Item No, Unit, Quantity, and Price.", "Error", JOptionPane.ERROR_MESSAGE);
    }
    }//GEN-LAST:event_btnaddActionPerformed

    private void btnupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnupdateActionPerformed
        if (txtitemno.getText().isEmpty() || txtname.getText().isEmpty() || txtunit.getText().isEmpty() || 
        txtdes.getText().isEmpty() || txtqut.getText().isEmpty() || txtprice.getText().isEmpty()) {
        JOptionPane.showMessageDialog(null, "Please fill in all fields before adding the item.", "Error", JOptionPane.ERROR_MESSAGE);
        return; // Exit the method if any field is empty
    } 
        
        try {
        // Get values from text fields
        int itemno = Integer.parseInt(txtitemno.getText()); // Get item number to update
        String name = txtname.getText();
        int unit = Integer.parseInt(txtunit.getText());
        String des = txtdes.getText();
        int qut = Integer.parseInt(txtqut.getText());
        double price = Double.parseDouble(txtprice.getText());

        // SQL query to update an existing record
        String sql = "UPDATE item SET name = ?, unit = ?, description = ?, qut = ?, price = ? WHERE itemno = ?";

        try (java.sql.Connection conn = Connection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, name);
            stmt.setInt(2, unit);
            stmt.setString(3, des);
            stmt.setInt(4, qut);
            stmt.setDouble(5, price);
            stmt.setInt(6, itemno); // WHERE condition to find the correct record
            
            int rowsAffected = stmt.executeUpdate();

            if (rowsAffected > 0) {
                JOptionPane.showMessageDialog(null, "Item updated successfully!");
                txtsearch.setText("");
                txtitemno.setText("");
                txtname.setText("");
                txtunit.setText("");
                txtdes.setText("");
                txtqut.setText("");
                txtprice.setText("");
                
                formload();
            } else {
                JOptionPane.showMessageDialog(null, "Update failed! Item not found.");
            }
        }
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(null, "Invalid input! Please enter valid numbers for Item No, Unit, Quantity, and Price.", "Error", JOptionPane.ERROR_MESSAGE);
    } catch (SQLException e) {
        System.err.println("Error updating item: " + e.getMessage());
        JOptionPane.showMessageDialog(null, "Database error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    }
    }//GEN-LAST:event_btnupdateActionPerformed

    private void btnsearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsearchActionPerformed
     try {
        // Get item number from the search field
        int itemno = Integer.parseInt(txtsearch.getText());

        // SQL query to find the item
        String sql = "SELECT * FROM item WHERE itemno = ?";

        try (java.sql.Connection conn = Connection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            
            stmt.setInt(1, itemno);
            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                // Set values to text fields
                txtitemno.setText(String.valueOf(rs.getInt("itemno")));
                txtname.setText(rs.getString("name"));
                txtunit.setText(String.valueOf(rs.getInt("unit")));
                txtdes.setText(rs.getString("description"));
                txtqut.setText(String.valueOf(rs.getInt("qut")));
                txtprice.setText(String.valueOf(rs.getDouble("price")));
            } else {
                JOptionPane.showMessageDialog(null, "Item not found!", "Error", JOptionPane.ERROR_MESSAGE);
            }
            
            // Close ResultSet
            rs.close();
        }
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(null, "Invalid item number! Please enter a valid number.", "Error", JOptionPane.ERROR_MESSAGE);
    } catch (SQLException e) {
        System.err.println("Error searching item: " + e.getMessage());
        JOptionPane.showMessageDialog(null, "Database error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    }
    }//GEN-LAST:event_btnsearchActionPerformed

    private void txtnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnameActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
       int lastItemNo = 0; // Default value if no records exist

    String sql = "SELECT MAX(itemno) AS lastItem FROM item";

    try (java.sql.Connection conn = Connection.getConnection();
         PreparedStatement stmt = conn.prepareStatement(sql);
         ResultSet rs = stmt.executeQuery()) {
        
        if (rs.next()) {
            lastItemNo = rs.getInt("lastItem");
        }

        int newitemno = lastItemNo + 1; // Increment for new entry
        txtitemno.setText(String.valueOf(newitemno)); // Convert int to String

    } catch (SQLException e) {
        System.err.println("Error fetching last itemno: " + e.getMessage());
        JOptionPane.showMessageDialog(null, "Database error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    }
    }//GEN-LAST:event_formWindowOpened

    private void btnclearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnclearActionPerformed
             txtsearch.setText("");
                
                txtname.setText("");
                txtunit.setText("");
                txtdes.setText("");
                txtqut.setText("");
                txtprice.setText("");
                formload();
    }//GEN-LAST:event_btnclearActionPerformed

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
            java.util.logging.Logger.getLogger(itemboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(itemboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(itemboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(itemboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new itemboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnadd;
    private javax.swing.JButton btnclear;
    private javax.swing.JButton btnsearch;
    private javax.swing.JButton btnupdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField txtdes;
    private javax.swing.JLabel txtitemno;
    private javax.swing.JTextField txtname;
    private javax.swing.JTextField txtprice;
    private javax.swing.JTextField txtqut;
    private javax.swing.JTextField txtsearch;
    private javax.swing.JTextField txtunit;
    // End of variables declaration//GEN-END:variables
}
