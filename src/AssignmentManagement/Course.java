package AssignmentManagement;

import java.util.ArrayList;

public class Course extends Assignment {
    private String CourseName,CourseTeacher;
    private String CourseCode;
    private int CourseCredit;
    private float CourseMarksObtained;
   private int CourseTeacherEnroll;
    
 public Course(){
 }
    public Course(String CourseName,String CourseTeacher,String CourseCode,int CourseCredit,int CourseTeacherEnroll){
    this.CourseCode=CourseCode;
    this.CourseCredit=CourseCredit;
    this.CourseMarksObtained=CourseMarksObtained;
    this.CourseName=CourseName;
    this.CourseTeacher=CourseTeacher;
    this.CourseTeacherEnroll=CourseTeacherEnroll;
    }
    
    public String getCourseName() {
        return CourseName;
    }

    public String getCourseTeacher() {
        return CourseTeacher;
    }

    public String getCourseCode() {
        return CourseCode;
    }

    public int getCourseCredit() {
        return CourseCredit;
    }

    public float getCourseMarksObtained() {
        return CourseMarksObtained;
    }

    public int getCourseTeacherEnroll() {
        return CourseTeacherEnroll;
    }

    
   
}
