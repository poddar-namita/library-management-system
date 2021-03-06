package librarymanagementsystem;

public class MainLogin extends javax.swing.JFrame {

    /**
     * Creates new form MainLogin
     */
    public MainLogin() {
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

        mainLoginPanel = new javax.swing.JPanel();
        adminLoginPageButton = new javax.swing.JButton();
        librarianLoginPageButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Main Login");

        mainLoginPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2), "Login Mode", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Calibri", 0, 24))); // NOI18N

        adminLoginPageButton.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        adminLoginPageButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/admin.png"))); // NOI18N
        adminLoginPageButton.setText("Admin");
        adminLoginPageButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        adminLoginPageButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminLoginPageButtonActionPerformed(evt);
            }
        });

        librarianLoginPageButton.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        librarianLoginPageButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/librarian.png"))); // NOI18N
        librarianLoginPageButton.setText("Librarian");
        librarianLoginPageButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                librarianLoginPageButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout mainLoginPanelLayout = new javax.swing.GroupLayout(mainLoginPanel);
        mainLoginPanel.setLayout(mainLoginPanelLayout);
        mainLoginPanelLayout.setHorizontalGroup(
            mainLoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainLoginPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(adminLoginPageButton, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(librarianLoginPageButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        mainLoginPanelLayout.setVerticalGroup(
            mainLoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainLoginPanelLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(mainLoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(adminLoginPageButton)
                    .addComponent(librarianLoginPageButton))
                .addContainerGap(49, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(mainLoginPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(mainLoginPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
    //Redirects to Login Page of Librarian
    private void librarianLoginPageButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_librarianLoginPageButtonActionPerformed
        setVisible(false);
        LibrarianLogin ob = new LibrarianLogin();
        ob.setVisible(true);
    }//GEN-LAST:event_librarianLoginPageButtonActionPerformed

    //Redirects to Login Page of Admin
    private void adminLoginPageButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminLoginPageButtonActionPerformed
        setVisible(false);
        AdminLogin ob = new AdminLogin();
        ob.setVisible(true);
    }//GEN-LAST:event_adminLoginPageButtonActionPerformed

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
            java.util.logging.Logger.getLogger(MainLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton adminLoginPageButton;
    private javax.swing.JButton librarianLoginPageButton;
    private javax.swing.JPanel mainLoginPanel;
    // End of variables declaration//GEN-END:variables
}
