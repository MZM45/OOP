package AssignmentManagement;
abstract class Staff {
   int enrollment;
    String department;

    public Staff(int enrollment, String department) {
        this.enrollment = enrollment;
        this.department = department;
    }
    public Staff(){
    
    }

    public int getEnrollment() {
        return enrollment;
    }

    public String getDepartment() {
        return department;
    }

    public abstract String performJob(); // Abstract method for performing job
}

