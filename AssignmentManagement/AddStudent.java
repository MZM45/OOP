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

/**
 *
 * @author BN GAMING
 */
public class AddStudent extends javax.swing.JFrame {

    /**
     * Creates new form AddStudent
     */
    public AddStudent() {
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

        jButton13 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        jLabel10 = new javax.swing.JLabel();
        txtTeacherPassword = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        t1 = new javax.swing.JTextField();
        t2 = new javax.swing.JTextField();
        t3 = new javax.swing.JTextField();
        t4 = new javax.swing.JTextField();
        t5 = new javax.swing.JTextField();
        t6 = new javax.swing.JTextField();
        t7 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        txtStudentPassword = new javax.swing.JPasswordField();
        jLabel12 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        jButton13.setFont(new java.awt.Font("Arial Black", 3, 14)); // NOI18N
        jButton13.setText("Main Menu");
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });

        jScrollPane2.setViewportView(jTextPane1);

        jLabel10.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel10.setText("Password");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AssignmentManagement/cropadmin-removebg3003030.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 274));

        jLabel3.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel3.setText("Name:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(318, 29, 90, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel4.setText("Age:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(318, 67, 43, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel5.setText("Address");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(318, 105, 90, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel6.setText("CNIC:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(318, 143, 90, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel7.setText("Enrollment:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(318, 181, 90, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel8.setText("Semester:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(318, 257, 90, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel9.setText("Section:");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(318, 219, 90, -1));

        t1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t1ActionPerformed(evt);
            }
        });
        getContentPane().add(t1, new org.netbeans.lib.awtextra.AbsoluteConstraints(412, 29, 305, -1));

        t2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t2ActionPerformed(evt);
            }
        });
        getContentPane().add(t2, new org.netbeans.lib.awtextra.AbsoluteConstraints(412, 67, 305, -1));

        t3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t3ActionPerformed(evt);
            }
        });
        getContentPane().add(t3, new org.netbeans.lib.awtextra.AbsoluteConstraints(412, 105, 305, -1));

        t4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t4ActionPerformed(evt);
            }
        });
        getContentPane().add(t4, new org.netbeans.lib.awtextra.AbsoluteConstraints(412, 143, 305, -1));

        t5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t5ActionPerformed(evt);
            }
        });
        getContentPane().add(t5, new org.netbeans.lib.awtextra.AbsoluteConstraints(412, 181, 305, -1));

        t6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t6ActionPerformed(evt);
            }
        });
        getContentPane().add(t6, new org.netbeans.lib.awtextra.AbsoluteConstraints(412, 219, 305, -1));

        t7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t7ActionPerformed(evt);
            }
        });
        getContentPane().add(t7, new org.netbeans.lib.awtextra.AbsoluteConstraints(412, 257, 305, -1));

        jButton1.setBackground(new java.awt.Color(51, 0, 153));
        jButton1.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(204, 204, 255));
        jButton1.setText("Admin Option Menu");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(71, 292, 200, 49));

        jButton14.setBackground(new java.awt.Color(51, 0, 153));
        jButton14.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jButton14.setForeground(new java.awt.Color(204, 204, 255));
        jButton14.setText("Main Menu");
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton14, new org.netbeans.lib.awtextra.AbsoluteConstraints(71, 359, 200, 40));

        jButton2.setBackground(new java.awt.Color(51, 0, 153));
        jButton2.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(204, 204, 255));
        jButton2.setText("Add Student");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(544, 337, -1, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 291, 90, -1));
        getContentPane().add(txtStudentPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(412, 291, 305, -1));

        jLabel12.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel12.setText("Password");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(318, 291, 90, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AssignmentManagement/blubgfull.jpg"))); // NOI18N
        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-6, 4, 840, 410));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void t1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t1ActionPerformed

    private void t2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t2ActionPerformed

    private void t3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t3ActionPerformed

    private void t4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t4ActionPerformed

    private void t5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t5ActionPerformed

    private void t6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t6ActionPerformed

    private void t7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t7ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        mainmenu mainmenuobj = new mainmenu();
        mainmenuobj.setVisible(true);
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        mainmenu mainmenuobj = new mainmenu();
        mainmenuobj.setVisible(true);
    }//GEN-LAST:event_jButton14ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        AdminOptions AO = new AdminOptions();
        AO.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        String StudentName = t1.getText();
        String StudentAddress = t3.getText();
        int StudentAge = Integer.parseInt(t2.getText());
        int StudentCnic = Integer.parseInt(t4.getText());
        int StudentEnrollment = Integer.parseInt(t5.getText());
        int StudentSemester = Integer.parseInt(t7.getText());
       String StudentPassword = txtStudentPassword.getText();
        String StudentSection = t6.getText();

//        sMenu menuobj = new Menu(StudentName, StudentAge, StudentAddress, StudentCnic, StudentEnrollment, StudentSection, StudentSemester);
        Student Stuobj=new Student(StudentName,StudentAge,StudentAddress,StudentCnic);
        University Uniobj = new University(StudentEnrollment,StudentSemester,StudentSection);
        int c = Uniobj.getStudentEnroll();
        
      
//            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
//            Connection con = DriverManager.getConnection("jdbc:ucanaccess://studentinfo1.accdb");

  dbconnection db = new dbconnection();
String sq1 = "INSERT INTO std1(Name, Age, Address, Cnic, Enrollment, Section, Semester, Password) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";

try {
    PreparedStatement pst = db.getCon().prepareStatement(sq1);
    pst.setString(1, Stuobj.getStudentName());
    pst.setInt(2, Stuobj.getStudentAge());
    pst.setString(3, Stuobj.getStudentAddress());
    pst.setInt(4, Stuobj.getStudentCnic());
    pst.setInt(5, Uniobj.getStudentEnroll());
    pst.setString(6, Uniobj.getStudentSection());
    pst.setInt(7, Uniobj.getStudentSemester());
    pst.setString(8, StudentPassword);

    int rowsAffected = pst.executeUpdate();
    if (rowsAffected > 0) {
        JOptionPane.showMessageDialog(null, "Record added successfully");
    } else {
        JOptionPane.showMessageDialog(null, "Failed to add record");
    }
    pst.close();
} catch (Exception e) {
    System.out.println(e);
}


    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(AddStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddStudent().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton2;
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
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextPane jTextPane1;
    private javax.swing.JTextField t1;
    private javax.swing.JTextField t2;
    private javax.swing.JTextField t3;
    private javax.swing.JTextField t4;
    private javax.swing.JTextField t5;
    private javax.swing.JTextField t6;
    private javax.swing.JTextField t7;
    private javax.swing.JPasswordField txtStudentPassword;
    private javax.swing.JPasswordField txtTeacherPassword;
    // End of variables declaration//GEN-END:variables
}
