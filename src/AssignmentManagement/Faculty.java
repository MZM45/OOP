package AssignmentManagement;
public class Faculty extends Staff {
    private String specialization;
    private int yearsOfExperience;
    private String Name;
    private String TeacherCourseCode;

    public Faculty(String Name,String TeacherCourseCode,int enrollment, String department, String specialization, int yearsOfExperience) {
        super(enrollment, department);
        this.specialization = specialization;
        this.yearsOfExperience = yearsOfExperience;
        this.Name=Name;
        this.TeacherCourseCode=TeacherCourseCode;
    }


    public String getTeacherCourseCode() {
        return TeacherCourseCode;
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
    public void performJob() {
        // Implement the job functionality for the Faculty
        System.out.println("Faculty teaching classes and conducting research.");
    }
}

//public class FacultyMain {
//    public static void main(String[] args) {
//        // Creating an instance of Admin
//        Admin admin = new Admin(123456, "Administration", "Manager", 5000.0);
//        System.out.println("Enrollment: " + admin.getEnrollment());
//        System.out.println("Department: " + admin.getDepartment());
//        System.out.println("Role: " + admin.getRole());E
//        System.out.println("Salary: $" + admin.getSalary());
//        admin.performJob(); // Polymorphic method call
//
//        System.out.println();
//
//        // Creating an instance of Faculty
//        Faculty faculty = new Faculty(789012, "Computer Science", "Artificial Intelligence", 5);
//        System.out.println("Enrollment: " + faculty.getEnrollment());
//        System.out.println("Department: " + faculty.getDepartment());
//        System.out.println("Specialization: " + faculty.getSpecialization());
//        System.out.println("Years of Experience: " + faculty.getYearsOfExperience());
//        faculty.performJob(); // Polymorphic method call
//    }
