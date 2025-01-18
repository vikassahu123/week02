
class Employee {
    public int employeeID;
    protected String department;
    private double salary;

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void increaseSalary(double amount) {
        if (amount > 0) {
            salary += amount;
            System.out.println("Salary increased by: " + amount);
        } else {
            System.out.println("Invalid increase amount.");
        }
    }
}

class Manager extends Employee {
    public void displayDetails() {
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Department: " + department);
    }
}

public class EmployeeDetail {
    
 
    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.employeeID = 101;
        emp.department = "IT";
        emp.setSalary(50000);

        System.out.println("Employee Details:");
        System.out.println("Employee ID: " + emp.employeeID);
        System.out.println("Department: " + emp.department);
        System.out.println("Salary: " + emp.getSalary());

        emp.increaseSalary(5000);
        System.out.println("Updated Salary: " + emp.getSalary());

        Manager mgr = new Manager();
        mgr.employeeID = 102;
        mgr.department = "EC";

        System.out.println("\nManager Details:");
        mgr.displayDetails();
    }
}