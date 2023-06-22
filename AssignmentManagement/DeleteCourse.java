/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AssignmentManagement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author ABC
 */
public class DeleteCourse extends javax.swing.JFrame {

   
    public DeleteCourse() {
        initComponents();
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        delettxt = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtCourseOutput = new javax.swing.JTextArea();
        deletebutton = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 255));
        jLabel1.setText("Delete Course");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 27, 171, 38));

        jLabel2.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 204, 255));
        jLabel2.setText("Enter Course Code:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, -1, -1));

        delettxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delettxtActionPerformed(evt);
            }
        });
        getContentPane().add(delettxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(203, 103, 150, 18));

        txtCourseOutput.setColumns(20);
        txtCourseOutput.setRows(5);
        jScrollPane1.setViewportView(txtCourseOutput);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 246, 534, 237));

        deletebutton.setBackground(new java.awt.Color(51, 0, 153));
        deletebutton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        deletebutton.setForeground(new java.awt.Color(204, 204, 255));
        deletebutton.setText("search for delete");
        deletebutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletebuttonActionPerformed(evt);
            }
        });
        getContentPane().add(deletebutton, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, -1, 41));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AssignmentManagement/red3601908.jpg"))); // NOI18N
        jLabel3.setText("jLabel3");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 520));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void deletebuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletebuttonActionPerformed
     
String searchCourseCode = delettxt.getText();
        try {
                     dbconnection db = new dbconnection();

    String selectQuery = "SELECT CourseName, CourseTeacher, CourseCode, CourseCredit, CourseMarks FROM CD1 WHERE CourseCode = ?";
    PreparedStatement selectPst = db.getCon().prepareStatement(selectQuery);
    selectPst.setString(1, searchCourseCode);
    ResultSet rs = selectPst.executeQuery();

    if (rs.next()) {
        String courseName = rs.getString("CourseName");
        String courseTeacher = rs.getString("CourseTeacher");
        String courseCode = rs.getString("CourseCode");
        int courseCredit = rs.getInt("CourseCredit");
        int courseMarks = rs.getInt("CourseMarks");

        txtCourseOutput.setText("Course Name: " + courseName + "\n" +
                                "Course Teacher: " + courseTeacher + "\n" +
                                "Course Code: " + courseCode + "\n" +
                                "Course Credit: " + courseCredit + "\n" +
                                "Course Marks: " + courseMarks);

        // Ask for confirmation before deleting the course
        int confirmDelete = JOptionPane.showConfirmDialog(this, "Do you want to delete this course?", "Confirm Deletion", JOptionPane.YES_NO_OPTION);
        if (confirmDelete == JOptionPane.YES_OPTION) {
            String deleteQuery = "DELETE FROM CD1 WHERE CourseCode = ?";
            PreparedStatement deletePst = db.getCon().prepareStatement(deleteQuery);
            deletePst.setString(1, courseCode);
            int rowsAffected = deletePst.executeUpdate();
            if (rowsAffected > 0) {
                txtCourseOutput.setText("Course with ID " + courseCode + " deleted successfully.");
            } else {
                txtCourseOutput.setText("Course ID not found. No course deleted.");
            }
            deletePst.close();
        }
    } else {
        txtCourseOutput.setText("No record found for the given Course Code.");
    }

    rs.close();
    selectPst.close();
    db.closeConnection();

} catch (Exception e) {
    System.out.println(e);
    }

        
    }//GEN-LAST:event_deletebuttonActionPerformed

    private void delettxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delettxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_delettxtActionPerformed

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
            java.util.logging.Logger.getLogger(DeleteCourse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DeleteCourse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DeleteCourse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DeleteCourse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DeleteCourse().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton deletebutton;
    private javax.swing.JTextField delettxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txtCourseOutput;
    // End of variables declaration//GEN-END:variables
}
