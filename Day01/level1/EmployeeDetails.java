 class Employee{ 
    private String name; 
    private int id; 
    private double salary; 

   public Employee(String name,int id,double salary) 
    { 
        this.name=name; 
        this.id=id; 
        this.salary=salary; 

    } 

    public void displayDetails() 
    { 
        System.out.println("Employee name "+name+" , id is "+ id +" and salary = "+salary );

    }
} 
public class EmployeeDetails 
{ 
    public static void main(String []args)  
    { 
       Employee emp=new Employee("vikas",100,50000); 
       emp.displayDetails();
    }
}