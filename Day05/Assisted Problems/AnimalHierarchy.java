// Animal Hierarchy
// Description: Create a hierarchy where Animal is the superclass, and Dog, Cat, and Bird are subclasses. Each subclass has a unique behavior.
// Tasks:
// Define a superclass Animal with attributes name and age, and a method makeSound().
// Define subclasses Dog, Cat, and Bird, each with a unique implementation of makeSound().
// Goal: Learn basic inheritance, method overriding, and polymorphism with simple classes.

class Animal 
{ 
   String name; 
   int age; 

   public Animal(String name, int age) 
   { 
    this.name=name;
    this.age=age; 

   } 

   public void makeSound() 
   { 
     System.out.println("Animal sound"); 


   }
} 


 class Dog extends Animal
 {  
    public Dog() 
    { 
       super("Dog", 2); //calling super class constructor
    }
   
  
   @Override
   public void makeSound() 
   { 
     System.out.println("Dog is barking"); 


   }
  
} 

class Cat extends Animal
 { 

   public Cat() 
   { 
    super("Cat",1); 

   } 
   
   @Override
   public void makeSound() 
   { 
     System.out.println("Meow Meow"); 

   }
  
}  


class Bird extends Animal
 { 

   public Bird() 
   { 
    super("Bird",3); 
   }
   
   @Override
   public void makeSound() 
   { 
     System.out.println("Chirp"); 

   }
  
} 



public class AnimalHierarchy  
{ 
    public static void main(String[] args) {
       
      Animal a=new Animal("Animal", 5);
      a.makeSound();

      Dog d=new Dog(); 
      d.makeSound(); 

      Cat c=new Cat();
      c.makeSound(); 

      Bird b=new Bird(); 
      b.makeSound();
        
    }
}