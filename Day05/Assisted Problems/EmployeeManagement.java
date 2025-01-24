// Employee Management System
// Description: Create an Employee hierarchy for different employee types such as Manager, Developer, and Intern.
// Tasks:
// Define a base class Employee with attributes like name, id, and salary, and a method displayDetails().
// Define subclasses Manager, Developer, and Intern with unique attributes for each, like teamSize for Manager and programmingLanguage for Developer.
// Goal: Practice inheritance by creating subclasses with specific attributes and overriding superclass methods.

class Employee 
{ 
    String name; 
    int id; 
    int salary; 

    public Employee(String name,int id,int salary)
    {
       this.name=name; 
       this.id=id; 
       this.salary=salary; 
       
    } 

    public void displayDetails() 
    { 
        System.out.println(" Employee Name is "+name+" , id "+id+" , salary = "+salary); 
    } 
} 

class Manager extends Employee
{  
    int teamSize;
    public Manager( String name,int id,int salary,int teamSize) 
    {  
        super(name,id,salary);// for initialization of name, id ,salary. 
        this.teamSize=teamSize;
    }   

    @Override  
    public void displayDetails() 
    {  super.displayDetails(); // accessing name id and salary.
        System.out.println(" and team size of manager is "+teamSize); 
    }  
}  


class Developer extends Employee
{  
    String programmingLanguage;
    public Developer( String name,int id,int salary,String programmingLanguage) 
    {  
        super(name,id,salary);// for initialization of name, id ,salary. 
        this.programmingLanguage=programmingLanguage;
    }   

    @Override  
    public void displayDetails() 
    { 
        System.out.println(" Developer Name is "+name+" \n id "+id+"\n salary = "+salary+" \n programming language is "+programmingLanguage); 
    }  
} 

class Intern extends Employee{ 

    int trannningTime; 
    public Intern( String name,int id,int salary,int trannningTime) 
    {  
        super(name,id,salary);// for initialization of name, id ,salary. 
        this.trannningTime=trannningTime;
    }   

    @Override  
    public void displayDetails() 
    { 
        System.out.println(" Intern Name is "+name+" \n id "+id+"\n salary = "+salary+" \n tranning months is "+trannningTime); 
    }

    
}


public class EmployeeManagement {
    public static void main(String[] args) {
        

        Employee e=new Employee("karan", 34, 2422); 
        e.displayDetails(); 

        Manager m=new Manager("Vikas", 23, 50000, 5); 
        m.displayDetails(); 

        Developer d=new Developer("shivam", 34, 30000, "java"); 
        d.displayDetails(); 

        Intern i=new Intern("shyam", 33, 20000, 6); 
        i.displayDetails(); 

    }
}
