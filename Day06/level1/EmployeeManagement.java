// 1. Employee Management System
// Description: Build an employee management system with the following requirements:
// Use an abstract class Employee with fields like employeeId, name, and baseSalary.
// Provide an abstract method calculateSalary() and a concrete method displayDetails().
// Create two subclasses: FullTimeEmployee and PartTimeEmployee, implementing calculateSalary() based on work hours or fixed salary.
// Use encapsulation to restrict direct access to fields and provide getter and setter methods.
// Create an interface Department with methods like assignDepartment() and getDepartmentDetails().
// Ensure polymorphism by processing a list of employees and displaying their details using the Employee reference.

import java.util.ArrayList;
import java.util.List;

abstract class Employee 
{ 
     private int employeeId; 
    private  String name; 
     private double baseSalary; 

     public Employee(int employeeId,String name, double baseSalary) 
     { 
        this.employeeId=employeeId;
        this.name=name; 
        this.baseSalary=baseSalary; 

     } 

     public abstract double calculateSalary(); //abstract method , without body.
    
      //concrete method
     public void displayDetails() 
     { 
        System.out.println("Name of employee is "+name+" employee id "+employeeId+" current salary is "+baseSalary);
     } 
      

     // getter , setter methods 
     public double getEmployeeId() 
     { 
        return employeeId; 
     } 
 
     public void setEmployeeId(int employeeId) 
     { this.employeeId=employeeId; 
        
     } 

     public String getName() 
     { 
        return name;  
     } 
 
     public void setName(String name) 
     { 
        this.name=name; 
     }
     
     public double getBaseSalary() 
     { 
        return baseSalary; 
     } 
 
     public void setBaseSalary(double baseSalary) 
     { this.baseSalary=baseSalary; 
        
     }  

     

}   

interface Department{ 

   void assignDepartment(String departmentName);             // all methods are abstract so implementing in sub classes
   String getDepartmentDetails(); 

    
}

//sub class 1
class FullTimeEmployee extends Employee implements Department
{    
     double bonus; // for full time employee
      String department;

    public FullTimeEmployee(int employeeId,String name, double baseSalary,double bonus) 
    { 
        super(employeeId, name, baseSalary); 
        this.bonus=bonus; 

    }
     
    @Override
     public double calculateSalary()  
    { 
        return getBaseSalary()+bonus;   // getbasesalary() and add with bonus
           
     } 

     @Override
     public void assignDepartment(String department) 
     {
      this.department=department;
     } 

     @Override 
     public String getDepartmentDetails()
     { 
            return "Department : "+department;
     }    
     
     @Override 
     public void displayDetails() 
     { 
        super.displayDetails();         // by this statement we not need to rewrite this below lines.
      //  System.out.println("Employee name "+getName()+" employee id "+getEmployeeId());
      //   System.out.println("Base salary is "+getBaseSalary());
         
       System.out.println("Employee bonus is "+bonus);   //bonus is local variable.
       System.out.println(getDepartmentDetails());   // department details 

     }
} 

//sub class 2
class PartTimeEmployee extends Employee implements Department
{    
     double bonus; // for full time employee
     String department;  

    public PartTimeEmployee(int employeeId,String name, double baseSalary,double bonus) 
    { 
        super(employeeId, name, baseSalary); 
        this.bonus=bonus; 

    }
     
    @Override
     public double calculateSalary()  
    { 
        return getBaseSalary()+(bonus/2);   // getbasesalary() and add with bonus
           
     } 

     @Override 
     public void assignDepartment(String department) 
     { 
      this.department=department;

     } 

     @Override 
     public String getDepartmentDetails()
     { 
        return "Department : "+ department; 
     } 

     @Override 
     public void displayDetails() 
     { 
        super.displayDetails();         // by this statement we not need to rewrite this below lines.
      //  System.out.println("Employee name "+getName()+" employee id "+getEmployeeId());
      //   System.out.println("Base salary is "+getBaseSalary());
         
       System.out.println("Employee bonus for part time is "+bonus/2);   //bonus is local variable.
       System.out.println(getDepartmentDetails());   // department details 

     }


}

public class EmployeeManagement 
{
    public static void main(String[] args) {
         // Creating a list of employees
        List<Employee> employees = new ArrayList<>();

        // Adding FullTimeEmployee and PartTimeEmployee objects
        FullTimeEmployee fullTimeEmployee = new FullTimeEmployee(211064, "Satyam", 50000, 50000);
        fullTimeEmployee.assignDepartment("Commerce");

        PartTimeEmployee partTimeEmployee = new PartTimeEmployee(2110063, "Sumit", 20000, 20000);
        partTimeEmployee.assignDepartment("Assistant");

        employees.add(fullTimeEmployee);
        employees.add(partTimeEmployee);

        // Displaying details of all employees
        for (Employee employee : employees) {
            employee.displayDetails();
            System.out.println("Calculated Salary: " + employee.calculateSalary());
            System.out.println("-----------------------------------");
         }


    }
}