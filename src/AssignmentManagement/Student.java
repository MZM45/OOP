package AssignmentManagement;
import java.util.ArrayList;

public class Student {
    University university;
    private String studentName, studentAddress;
    private int studentAge;
    private int studentCnic;
public Student(){

}
    public Student(String studentName, int studentAge, String studentAddress, int studentCnic) {
        this.studentName = studentName;
        this.studentAge = studentAge;
        this.studentAddress = studentAddress;
        this.studentCnic = studentCnic;
     }

    public String getStudentName() {
        return studentName;
    }

    public String getStudentAddress() {
        return studentAddress;
    }

    public int getStudentAge() {
        return studentAge;
    }

    public int getStudentCnic() {
        return studentCnic;
    }

 



} 
