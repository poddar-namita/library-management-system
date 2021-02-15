package librarymanagementsystem;

import java.sql.*;
import javax.swing.JOptionPane;

public class NewStudent extends javax.swing.JFrame {
    
    Connection con;
    PreparedStatement pst;  
    ResultSet rs;
    
    public NewStudent() {
        initComponents();
        con = JavaConnect.ConnecrDb();
        Increment in = new Increment();
        int id = in.StudentIncrement();
        studentIDTextField.setText(""+id);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        newStudentPanel = new javax.swing.JPanel();
        studentSemesterLabel = new javax.swing.JLabel();
        studentNameTextField = new javax.swing.JTextField();
        studentSemesterComboBox = new javax.swing.JComboBox<>();
        studentNameLabel = new javax.swing.JLabel();
        addStudentButton = new javax.swing.JButton();
        studentCourseComboBox = new javax.swing.JComboBox<>();
        studentIDTextField = new javax.swing.JTextField();
        backToLibrarianLoginButton = new javax.swing.JButton();
        studentYearComboBox = new javax.swing.JComboBox<>();
        studentYearLabel = new javax.swing.JLabel();
        studentIDLabel = new javax.swing.JLabel();
        studentCourseLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("New Student");

        newStudentPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2), "New Student", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Calibri", 0, 24))); // NOI18N

        studentSemesterLabel.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        studentSemesterLabel.setText("Semester");

        studentNameTextField.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N

        studentSemesterComboBox.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        studentSemesterComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6" }));

        studentNameLabel.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        studentNameLabel.setText("Name");

        addStudentButton.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        addStudentButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/addStudent.png"))); // NOI18N
        addStudentButton.setText("Add");
        addStudentButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addStudentButtonActionPerformed(evt);
            }
        });

        studentCourseComboBox.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        studentCourseComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "MCA", "M.Tech", "MSC", "MBA" }));

        studentIDTextField.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N

        backToLibrarianLoginButton.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        backToLibrarianLoginButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/back.png"))); // NOI18N
        backToLibrarianLoginButton.setText("Back");
        backToLibrarianLoginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backToLibrarianLoginButtonActionPerformed(evt);
            }
        });

        studentYearComboBox.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        studentYearComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", " " }));

        studentYearLabel.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        studentYearLabel.setText("Year");

        studentIDLabel.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        studentIDLabel.setText("Student ID");

        studentCourseLabel.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        studentCourseLabel.setText("Course");

        javax.swing.GroupLayout newStudentPanelLayout = new javax.swing.GroupLayout(newStudentPanel);
        newStudentPanel.setLayout(newStudentPanelLayout);
        newStudentPanelLayout.setHorizontalGroup(
            newStudentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(newStudentPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(newStudentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(newStudentPanelLayout.createSequentialGroup()
                        .addComponent(studentIDLabel)
                        .addGap(18, 18, 18)
                        .addComponent(studentIDTextField))
                    .addGroup(newStudentPanelLayout.createSequentialGroup()
                        .addGroup(newStudentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(studentCourseLabel)
                            .addComponent(studentYearLabel)
                            .addComponent(studentSemesterLabel)
                            .addComponent(studentNameLabel))
                        .addGap(23, 23, 23)
                        .addGroup(newStudentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(studentNameTextField)
                            .addComponent(studentCourseComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(studentYearComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(studentSemesterComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(newStudentPanelLayout.createSequentialGroup()
                                .addComponent(addStudentButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(backToLibrarianLoginButton)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        newStudentPanelLayout.setVerticalGroup(
            newStudentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(newStudentPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(newStudentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(studentIDLabel)
                    .addComponent(studentIDTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(newStudentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(studentNameLabel)
                    .addComponent(studentNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(newStudentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(studentCourseLabel)
                    .addComponent(studentCourseComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(newStudentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(studentYearLabel)
                    .addComponent(studentYearComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(newStudentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(studentSemesterLabel)
                    .addComponent(studentSemesterComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(newStudentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addStudentButton)
                    .addComponent(backToLibrarianLoginButton))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(newStudentPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(newStudentPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void backToLibrarianLoginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backToLibrarianLoginButtonActionPerformed
        setVisible(false);
        Home ob = new Home();
        ob.setVisible(true);
    }//GEN-LAST:event_backToLibrarianLoginButtonActionPerformed

    private void addStudentButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addStudentButtonActionPerformed
        try{
            pst = con.prepareStatement("insert into student values (?,?,?,?,?)");
            pst.setString(1, studentIDTextField.getText());
            pst.setString(2, studentNameTextField.getText());
            pst.setString(3, (String) studentCourseComboBox.getSelectedItem());
            pst.setString(4, (String) studentYearComboBox.getSelectedItem());
            pst.setString(5, (String) studentSemesterComboBox.getSelectedItem());
            int result = pst.executeUpdate();
            if(result==1){
                JOptionPane.showMessageDialog(null,"New Student Added");     
            }
            else{
                 JOptionPane.showMessageDialog(null,"Failed...");
            }
            //close Connection
            pst.close();
            con.close();;
            
        }catch(SQLException e){
             JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_addStudentButtonActionPerformed

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
            java.util.logging.Logger.getLogger(NewStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewStudent().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addStudentButton;
    private javax.swing.JButton backToLibrarianLoginButton;
    private javax.swing.JPanel newStudentPanel;
    private javax.swing.JComboBox<String> studentCourseComboBox;
    private javax.swing.JLabel studentCourseLabel;
    private javax.swing.JLabel studentIDLabel;
    private javax.swing.JTextField studentIDTextField;
    private javax.swing.JLabel studentNameLabel;
    private javax.swing.JTextField studentNameTextField;
    private javax.swing.JComboBox<String> studentSemesterComboBox;
    private javax.swing.JLabel studentSemesterLabel;
    private javax.swing.JComboBox<String> studentYearComboBox;
    private javax.swing.JLabel studentYearLabel;
    // End of variables declaration//GEN-END:variables
}
