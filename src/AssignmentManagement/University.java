package AssignmentManagement;
public class University {
 private String studentSection;
 private int studentSemester,studentEnroll;
 public University(){
 
 }
 public University(int studentEnroll, int studentSemester,String studentSection) {
 this.studentEnroll=studentEnroll;
 this.studentSemester=studentSemester;
 this.studentSection=studentSection;
 }

    University(int StudentEnrollment, String StudentSection, int StudentSemester) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int getStudentEnroll() {
        return studentEnroll;
    }

    public String getStudentSection() {
        return studentSection;
    }

    public int getStudentSemester() {
        return studentSemester;
    }

 

}
