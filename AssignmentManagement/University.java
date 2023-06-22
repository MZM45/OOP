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
