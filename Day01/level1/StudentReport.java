class Student{ 
    private String name; 
    private double rollNumber;
    private double marks; 
    
    public Student(String name,double roll,double marks) 
    { 
        this.name=name; 
      this.rollNumber=roll; 
        this.marks=marks; 

    }  

    public char calculateGrade() 
    { 
        if(marks<=100 && marks>=90 ) 
        { 
            return 'A'; 

        } 
        else if(marks< 90 && marks >=75) 
        { 
            return 'B'; 
        } 
        else if(marks< 75 && marks >=33) 
        { 
            return 'C'; 

        } 
        else 
        {
            return 'F';
        }
    }


    public void displayDetails() 
    {
        System.out.println(" name is =  "+ name+ ",  roll number= "+rollNumber+" , marks is= "+marks+ " Grade = "+ calculateGrade());

    }

}
public class StudentReport {
    public static void main(String[] args) {
        Student s=new Student("vikas",56, 82); 
        s.displayDetails(); 
    }
    
}
