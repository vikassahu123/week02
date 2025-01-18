class Person 
{ 
    private String name; 
    private int age;  
      

     
    // parameterized constructor
    public Person(String name,int age) 
    { 
        this.name=name; 
        this.age=age; 

    } 
    
    // copy constructor this is always take obj as parameter
    public Person(Person obj) 
    { 
        name=obj.name;  

        age=obj.age;
    } 
    
    public void details() 
    { 
        System.out.println("Name of person is= "+name + " and age is = "+age); 
    }


}

public class PersonDetails {
    public static void main(String[] args) {
         Person p=new Person("vikas",23); 
         p.details();
         Person p1=new Person(p); // p is first obj of a class for the copy constructor 
        p1.details();
    }
}
