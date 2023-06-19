package AssignmentManagement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;


public class Menu {

 
   String studentName, studentAddress;
    int studentCnic;
    int studentEnroll=0;
    int  studentSemester=0;
    String  studentSection="";
            int studentAge;
    
    public Menu(String StudentName,int StudentAge,String StudentAddress,int StudentCnic,int StudentEnrollment,String StudentSection,int StudentSemester) {
        
        this.studentName=StudentName;
        this.studentAge=StudentAge;
        this.studentAddress=StudentAddress;
        this.studentCnic=StudentCnic;
        this.studentEnroll=StudentEnrollment;
        this.studentSection=StudentSection;
        this.studentSemester=StudentSemester;
    }


    public static void main(String[] args) {
        Student Stuobj=new Student();
        University Uniobj=new University();
        new mainmenu().setVisible(true);
    
    }
}
//try {
//            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
//            Connection con = DriverManager.getConnection("jdbc:ucanaccess://C:\\Users\\BN GAMING\\Desktop\\projekt (3)\\projekt\\studentinfo1.accdb");
//            String sql = "INSERT INTO std1( Name,Age, Address, Cnic, Enrollment, Section,Semester) VALUES (?,?,?,?,?,?,?)";
//           PreparedStatement pst = con.prepareStatement(sql);
//            pst.setString(1, Stuobj.getStudentName());
//          pst.setString(3, Stuobj.getStudentAddress());
//
//            pst.setInt(2, Stuobj.getStudentAge());
//            pst.setInt(4, Stuobj.getStudentCnic());
//
//            pst.setInt(5, Uniobj.getStudentEnroll());
//            pst.setString(6, Uniobj.getStudentSection());
//
//            pst.setInt(7, Uniobj.getStudentSemester());
//            int rowsAffected = pst.executeUpdate();
//            if (rowsAffected > 0) {
//                JOptionPane.showMessageDialog(null, " added succesfully");
//            } else {
//                JOptionPane.showMessageDialog(null, " failed");
//            }
//            pst.close();
//            con.close();
//        } catch (Exception e) {
//            System.out.println(e);
//      }  
//    }
         
       
            




