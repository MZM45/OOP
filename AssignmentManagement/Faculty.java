package AssignmentManagement;
public class Faculty extends Staff {
    private String specialization;
    private int yearsOfExperience;
    private String Name;

public Faculty(){}
  public Faculty(String TeacherName,int TeacherEnrollment, String TeacherDepartment, String TeacherSpecialization, int TeacherExperience) {
    super(TeacherEnrollment, TeacherDepartment);
    this.Name = TeacherName;
    this.specialization = TeacherSpecialization;
    this.yearsOfExperience = TeacherExperience;
}


  


  

    public String getName() {
        return Name;
    }

    public String getSpecialization() {
        return specialization;
    }

    public int getYearsOfExperience() {
        return yearsOfExperience;
    }

    @Override
    public String performJob() {
        // Implement the job functionality for the Faculty
        String s=("Faculty Logined");
        return s;
    }
}

