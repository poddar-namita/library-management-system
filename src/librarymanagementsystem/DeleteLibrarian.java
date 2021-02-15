package librarymanagementsystem;

import java.sql.*;
import javax.swing.JOptionPane;

public class DeleteLibrarian extends javax.swing.JFrame {
    
    Connection con;
    PreparedStatement pst;
    ResultSet rs;
    
    public DeleteLibrarian() {
        initComponents();
        con = JavaConnect.ConnecrDb();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        deleteLibrarianPanel = new javax.swing.JPanel();
        librarianIDLabel = new javax.swing.JLabel();
        deleteLibrarianButton = new javax.swing.JButton();
        backToAdminHomeButton = new javax.swing.JButton();
        librarianNameTextField = new javax.swing.JTextField();
        librarianNameLabel = new javax.swing.JLabel();
        librarianIDTextField = new javax.swing.JTextField();
        searchLibrarianButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Delete Librarian");

        deleteLibrarianPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2), "Delete Librarian", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri", 0, 24))); // NOI18N

        librarianIDLabel.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        librarianIDLabel.setText("Librarian ID");

        deleteLibrarianButton.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        deleteLibrarianButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/delete.png"))); // NOI18N
        deleteLibrarianButton.setText("Delete");
        deleteLibrarianButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteLibrarianButtonActionPerformed(evt);
            }
        });

        backToAdminHomeButton.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        backToAdminHomeButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/back.png"))); // NOI18N
        backToAdminHomeButton.setText("Back");
        backToAdminHomeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backToAdminHomeButtonActionPerformed(evt);
            }
        });

        librarianNameTextField.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N

        librarianNameLabel.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        librarianNameLabel.setText("Name");

        librarianIDTextField.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N

        searchLibrarianButton.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        searchLibrarianButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/search.png"))); // NOI18N
        searchLibrarianButton.setText("Search");
        searchLibrarianButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchLibrarianButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout deleteLibrarianPanelLayout = new javax.swing.GroupLayout(deleteLibrarianPanel);
        deleteLibrarianPanel.setLayout(deleteLibrarianPanelLayout);
        deleteLibrarianPanelLayout.setHorizontalGroup(
            deleteLibrarianPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(deleteLibrarianPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(deleteLibrarianPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(librarianIDLabel)
                    .addComponent(librarianNameLabel))
                .addGap(18, 18, 18)
                .addGroup(deleteLibrarianPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(deleteLibrarianPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(librarianIDTextField)
                        .addComponent(librarianNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(deleteLibrarianButton))
                .addGap(18, 18, 18)
                .addGroup(deleteLibrarianPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(searchLibrarianButton)
                    .addComponent(backToAdminHomeButton))
                .addContainerGap())
        );
        deleteLibrarianPanelLayout.setVerticalGroup(
            deleteLibrarianPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(deleteLibrarianPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(deleteLibrarianPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(librarianIDLabel)
                    .addComponent(searchLibrarianButton)
                    .addComponent(librarianIDTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(deleteLibrarianPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(librarianNameLabel)
                    .addComponent(librarianNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(deleteLibrarianPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(deleteLibrarianButton)
                    .addComponent(backToAdminHomeButton))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(deleteLibrarianPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(deleteLibrarianPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void searchLibrarianButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchLibrarianButtonActionPerformed
        try{
            pst = con.prepareStatement("select * from librarian where user_id = ?");
            pst.setString(1, librarianIDTextField.getText());
            rs = pst.executeQuery();
            if(rs.next()){
                librarianNameTextField.setText(rs.getString(2));
                rs.close();
                pst.close();  
            }
            else{
                JOptionPane.showMessageDialog(null, "Invalid ID");
            }
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e);
        }
        finally{
            try{
                rs.close();
                pst.close();
                
            }catch(SQLException e){
                JOptionPane.showMessageDialog(null, e);
            }
        }
    }//GEN-LAST:event_searchLibrarianButtonActionPerformed

    private void deleteLibrarianButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteLibrarianButtonActionPerformed
        try{
            pst = con.prepareStatement("delete from librarian where user_id = ?");
            pst.setString(1, librarianIDTextField.getText());
            int result = pst.executeUpdate();
            if(result==1){
                JOptionPane.showMessageDialog(null, "Librarian Deleted");
            }
            else{
                JOptionPane.showMessageDialog(null, "Something went wrong");
            }
            
            rs.close();
            pst.close();
            
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e);
        }
        finally{
            try{
                rs.close();
                pst.close();
                
            }catch(SQLException e){
                JOptionPane.showMessageDialog(null, e);
            }
        }
    }//GEN-LAST:event_deleteLibrarianButtonActionPerformed

    private void backToAdminHomeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backToAdminHomeButtonActionPerformed
        setVisible(false);
        AdminHome ob = new AdminHome();
        ob.setVisible(true);
    }//GEN-LAST:event_backToAdminHomeButtonActionPerformed

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
            java.util.logging.Logger.getLogger(DeleteLibrarian.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DeleteLibrarian.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DeleteLibrarian.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DeleteLibrarian.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DeleteLibrarian().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backToAdminHomeButton;
    private javax.swing.JButton deleteLibrarianButton;
    private javax.swing.JPanel deleteLibrarianPanel;
    private javax.swing.JLabel librarianIDLabel;
    private javax.swing.JTextField librarianIDTextField;
    private javax.swing.JLabel librarianNameLabel;
    private javax.swing.JTextField librarianNameTextField;
    private javax.swing.JButton searchLibrarianButton;
    // End of variables declaration//GEN-END:variables
}
