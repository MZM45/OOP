package AssignmentManagement;
public class Admin extends Staff {
    private String role;
    private double salary;

    public Admin(int enrollment, String department, String role, double salary) {
        super(enrollment, department);
        this.role = role;
        this.salary = salary;
    }

    public String getRole() {
        return role;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public void performJob() {
        // Implement the job functionality for the Admin
        System.out.println("Admin performing administrative tasks.");
    }
}


