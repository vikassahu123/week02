// Sample Program 3: Employee Management System
// Design an Employee class with the following features:
// Static:
// A static variable companyName shared by all employees.
// A static method displayTotalEmployees() to show the total number of employees.
// This:
// Use this to initialize name, id, and designation in the constructor.
// Final:
// Use a final variable id for the employee ID, which cannot be modified after assignment.
// Instanceof:
// Check if a given object is an instance of the Employee class before printing the employee details.


class Employee {

    static String companyName="Squid private limited";  
    static int count=0;  

    private String name; 
    final int id; 
    private String designation; 



    public static void displayTotalEmployees() 
    { 
        System.out.println("total employees are : "+count);
    } 
    
    public Employee(String name,int id,String designation) 
    { 
        this.name=name; 
        this.id=id; 
        this.designation=designation; 
        count++; 
    }  

    public void display() 
    { 
        System.out.println("Employee name : "+name+" , id is "+id+" and designation "+designation);

    }




    
}
public class EmployeeSystem {
    public static void main(String[] args) {
         
        Employee e1=new Employee("gagan", 678, "Accounter");
        Employee e2=new Employee("sumit ", 786, "Manager"); 
         

        Employee.displayTotalEmployees();

        if(e1 instanceof Employee) 
        { 
            e1.display();
        } 
        if(e2 instanceof Employee) 
        {
          e2.display();
        } 

        
    }
}
