// Sample Program 5: University Student Management
// Create a Student class to manage student data with the following features:
// Static:
// A static variable universityName shared across all students.
// A static method displayTotalStudents() to show the number of students enrolled.
// This:
// Use this in the constructor to initialize name, rollNumber, and grade.
// Final:
// Use a final variable rollNumber for each student that cannot be changed.
// Instanceof:
// Check if a given object is an instance of the Student class before performing operations like displaying or updating grades.

class Student 
{  
    static String universityName;  
    static int count=0; 

    String name; 
    final int rollNumber; 
    char grade;

    public static void displayTotalStudents()
    { 
       System.out.println("Total students enrolled "+count);
    } 

    public Student(String name, int rollNumber, char grade) 
    { 
        this.name=name;
        this.rollNumber=rollNumber; 
        this.grade=grade; 
        count++;
    }  

    public void display() 
    { 
        System.out.println(" name is "+name+" , roll number is "+rollNumber+" grade obtained "+grade);
    }


}


public class UniversitySystem {
    public static void main(String[] args) {
         Student s1=new Student("VIKAS", 242, 'A'); 
         Student s2=new Student("GAGAN", 5445, 'B'); 
         
         Student.displayTotalStudents();
         if(s1 instanceof Student) 
         { 
            s1.display();
         } 
         if(s2 instanceof Student) 
         { 
            s2.display();
         }
    }
}
