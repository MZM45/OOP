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
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author BN GAMING
 */
public class TeacherLogin extends javax.swing.JFrame {

    /**
     * Creates new form login
     */
    public TeacherLogin() {
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

        jComboBox1 = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtTeacherEnrollment = new javax.swing.JTextField();
        txtTeacherPassword = new javax.swing.JPasswordField();
        txtLogin = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AssignmentManagement/transparentpng.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 620, 460));

        jLabel2.setFont(new java.awt.Font("Cambria", 3, 24)); // NOI18N
        jLabel2.setText("Teacher Portal");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(737, 71, -1, 41));

        jLabel3.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel3.setText("Enrollment:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(665, 181, 90, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel4.setText("Password:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(665, 224, 80, -1));

        txtTeacherEnrollment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTeacherEnrollmentActionPerformed(evt);
            }
        });
        getContentPane().add(txtTeacherEnrollment, new org.netbeans.lib.awtextra.AbsoluteConstraints(773, 181, 173, -1));
        getContentPane().add(txtTeacherPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(773, 224, 173, -1));

        txtLogin.setBackground(new java.awt.Color(0, 51, 102));
        txtLogin.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txtLogin.setForeground(new java.awt.Color(204, 204, 255));
        txtLogin.setText("Login");
        txtLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLoginActionPerformed(evt);
            }
        });
        getContentPane().add(txtLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 270, 92, -1));

        jButton1.setBackground(new java.awt.Color(0, 51, 102));
        jButton1.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(204, 204, 255));
        jButton1.setText("Main Menu");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(657, 565, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AssignmentManagement/blubgfull.jpg"))); // NOI18N
        jLabel5.setText("jLabel5");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 1020, 640));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLoginActionPerformed
       
int enrollment;
String password = String.valueOf(txtTeacherPassword.getText());
String TeacherName;  // Initialize studentName as null

try {
    enrollment = Integer.parseInt(txtTeacherEnrollment.getText());
    dbconnection db = new dbconnection();
    String sql = "SELECT * FROM TD WHERE Enrollment = ? AND Password = ?";
    PreparedStatement pst = db.getCon().prepareStatement(sql);
    pst.setInt(1, enrollment);
    pst.setString(2, password);
    ResultSet rs = pst.executeQuery();

    if (rs.next()) {
        // Login successful, retrieve teacher name from the database
        TeacherName = rs.getString("Name");
        // Open teacher options window
        Faculty Fobj = new Faculty();
        JOptionPane.showMessageDialog(null, Fobj.performJob());

        TeacherOption so = new TeacherOption(enrollment, TeacherName);
        so.setVisible(true);
    } else {
        JOptionPane.showMessageDialog(null, "Invalid username or password");
    }

    rs.close();
    pst.close();
} catch (SQLException ex) {
    JOptionPane.showMessageDialog(null, "An error occurred while accessing the database. Please try again later.");
} catch (NumberFormatException ex) {
    JOptionPane.showMessageDialog(null, "Invalid number format. Please enter a valid number.");
} catch (Exception ex) {
    JOptionPane.showMessageDialog(null, "An unexpected error occurred. Please contact the system administrator.");
    ex.printStackTrace();
}




    }//GEN-LAST:event_txtLoginActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        mainmenu mainmenuobj=new mainmenu();
        mainmenuobj.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtTeacherEnrollmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTeacherEnrollmentActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTeacherEnrollmentActionPerformed

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
            java.util.logging.Logger.getLogger(TeacherLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TeacherLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TeacherLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TeacherLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TeacherLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JButton txtLogin;
    private javax.swing.JTextField txtTeacherEnrollment;
    private javax.swing.JPasswordField txtTeacherPassword;
    // End of variables declaration//GEN-END:variables
}
