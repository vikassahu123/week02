
    
class Student {
    public int rollNumber = 101;
    protected String name = "Abhay";
    private int CGPA = 9;

    public void display() {
        System.out.println("Roll Number is: " + rollNumber);
        System.out.println("Name is: " + name);
        System.out.println("CGPA is: " + CGPA);
    }

    public void showCgpa() {
        System.out.println("CGPA is: " + CGPA);
    }

    public void changeCgpa(int newCgpa) {
        CGPA = newCgpa;
    }
}

class PostgraduateStudent extends Student {
    public void displayName() {
        System.out.println("Postgraduate Student Name is: " + name);
    }
}

public class StudentDetails {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.display();
        s1.showCgpa();
        System.out.println("Updating the CGPA");
        s1.changeCgpa(10);
        System.out.println("Updated CGPA is:");
        s1.showCgpa();

        PostgraduateStudent pg = new PostgraduateStudent();
        pg.name = "Gagan";
        System.out.println("Accessing protected member in subclass:");
        pg.displayName();
    }
}
