// Sample Problem 2: School System with Different Roles
// Description: Create a hierarchy for a school system where Person is the superclass, and Teacher, Student, and Staff are subclasses.
// Tasks:
// Define a superclass Person with common attributes like name and age.
// Define subclasses Teacher, Student, and Staff with specific attributes (e.g., subject for Teacher and grade for Student).
// Each subclass should have a method like displayRole() that describes the role.
// Goal: Demonstrate hierarchical inheritance by modeling different roles in a school, each with shared and unique characteristics.


class Person{
    String name;
    int age;
    String role;
    public Person(String name,int age,String role){
     this.name=name;
     this.age=age;
     this.role=role;
    }
 }
 class Teacher extends Person{
     String subject;
     public Teacher(String name,int age,String subject){
         super(name,age,"Teacher");
         this.subject=subject;
     }
     public void displayInfo(){
         System.out.println("displaying the details of: "+ role);
         System.out.println("Name of the teacher is: "+name);
         System.out.println("Age of the teacher is: "+age);
         System.out.println("teacher is teaching: "+subject);
     }
 }
 
 class Student extends Person{
    char grade;
    public Student(String name,int age,char grade){
     super(name,age,"Student");
     this.grade=grade;
    }
    public void displayInfo(){
     System.out.println("displaying the details of: "+role);
     System.out.println("Name of the Student is: "+name);
     System.out.println("Age of the Student is: "+age);
     System.out.println("grade of the Student is: "+grade);
    }
 }
 class Staff extends Person{
     int totalStaff;
     public Staff(String name,int age,int totalStaff){
         super(name,age,"Staff");
         this.totalStaff=totalStaff;
     }
     public void displayInfo(){
         System.out.println("displaying the details of: "+ role);
         System.out.println("Name of head of the staff is: "+name);
         System.out.println("Age of head of the staff is: "+age);
         System.out.println("ther are total "+" staff members");
     }
 }
 
 
 public class SchoolSystem {
     public static void main(String[] args) {
         Teacher t=new Teacher("Nishank",21,"Communication");
         t.displayInfo();
         System.out.println();
         Student s=new Student("Hemant",15,'A');
         s.displayInfo();
         System.out.println();
         Staff st=new Staff("Aaman",45,50);
         st.displayInfo();
     }
    
 }
