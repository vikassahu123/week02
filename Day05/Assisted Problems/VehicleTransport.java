// Vehicle and Transport System
// Description: Design a vehicle hierarchy where Vehicle is the superclass, and Car, Truck, and Motorcycle are subclasses with unique attributes.
// Tasks:
// Define a superclass Vehicle with maxSpeed and fuelType attributes and a method displayInfo().
// Define subclasses Car, Truck, and Motorcycle, each with additional attributes, such as seatCapacity for Car.
// Demonstrate polymorphism by storing objects of different subclasses in an array of Vehicle type and calling displayInfo() on each.
// Goal: Understand how inheritance helps in organizing shared and unique features across subclasses and use polymorphism for dynamic method calls.



class Vehicle { 
    int maxSpeed; 
    String fuelType; 
    String name;
    public Vehicle(int maxSpeed,String fuelType,String name) 
    { 
        this.maxSpeed=maxSpeed; 
        this.fuelType=fuelType;
        this.name=name; 

    } 

    public void displayInfo() 
    { 
        System.out.println(name+" maximum speed is "+maxSpeed+" and fuel Type is "+fuelType); 

    }
 
} 



class Car extends Vehicle { 
     
    int seatCapacity; 
    

    public Car(int maxSpeed,String fuelType,int seatCapacity) 
    { 
        super(maxSpeed, fuelType,"Car");
        this.seatCapacity=seatCapacity; 

    } 
    
    @Override
    public void displayInfo() 
    {  
        super.displayInfo();
        System.out.println(name+ " seating capacity is "+seatCapacity); 

    }
 
} 


class Truck extends Vehicle { 
     
    int weigthCap; 
    

    public Truck(int maxSpeed,String fuelType,int weigthCap) 
    { 
        super(maxSpeed, fuelType,"Truck"); 
        this.weigthCap=weigthCap; 

    } 

    @Override
    public void displayInfo() 
    {  super.displayInfo();
        System.out.println(name+ " Weigth of carry "+weigthCap+" kg."); 

    }
 
} 



class Motorcycle extends Vehicle { 
     
    int capacity; 
    

    public Motorcycle(int maxSpeed,String fuelType,int capacity) 
    { 
        super(maxSpeed, fuelType,"MotorCycle"); 
        this.capacity=capacity; 

    } 

    @Override
    public void displayInfo() 
    {  super.displayInfo();
        System.out.println(name+ " Seating capacity is "+capacity); 

    }
 
} 
public class VehicleTransport {
    public static void main(String[] args) {
     
 
       Vehicle vehicles[]=new Vehicle[3]; 
       vehicles[0]=new Car(300, "Ev", 4); 
       vehicles[1]=new Truck(250, "Diesel", 10000); 
       vehicles[2]=new Motorcycle(150, "petrol", 2); 
      

       for(Vehicle i:vehicles) 
       {
           i.displayInfo();
       } 


    }
}
