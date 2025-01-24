// Sample Problem 1: Restaurant Management System with Hybrid Inheritance
// Description: Model a restaurant system where Person is the superclass and Chef and Waiter are subclasses. Both Chef and Waiter should implement a Worker interface that requires a performDuties() method.
// Tasks:
// Define a superclass Person with attributes like name and id.
// Create an interface Worker with a method performDuties().
// Define subclasses Chef and Waiter that inherit from Person and implement the Worker interface, each providing a unique implementation of performDuties().
// Goal: Practice hybrid inheritance by combining inheritance and interfaces, giving multiple behaviors to the same objects.

class Person{
    String name;
    int id;
    public Person(String name,int id){
        this.name=name;
        this.id=id;
    }
    public void display(){
        System.out.println("Name is : "+name);
        System.out.println("ID is : "+id);
    }
}
 interface Worker {
     public void performDuties();   
}
class Chef extends Person implements Worker{
    public Chef(String name,int id){
        super(name,id);
        super.display();
    }
    
    public void performDuties(){
        System.out.println("chefs are making food for party");
    }
}
class Waiter extends Person implements Worker{
    public Waiter(String name,int id){
        super(name,id);
        super.display();
    }
    public void performDuties(){
        System.out.println("Waiter is serving  food in party");
    }

}


public  class Restaurant{
    public static void main(String[] args) {
        Chef c = new Chef("Vikas", 87676);
        c.performDuties();
          System.out.println();
        Waiter w = new Waiter("ravan", 8656789);
        w.performDuties();
    }
    
}