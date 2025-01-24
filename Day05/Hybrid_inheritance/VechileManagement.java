// Sample Problem 2: Vehicle Management System with Hybrid Inheritance
// Description: Model a vehicle system where Vehicle is the superclass and ElectricVehicle and PetrolVehicle are subclasses. Additionally, create a Refuelable interface implemented by PetrolVehicle.
// Tasks:
// Define a superclass Vehicle with attributes like maxSpeed and model.
// Create an interface Refuelable with a method refuel().
// Define subclasses ElectricVehicle and PetrolVehicle. PetrolVehicle should implement Refuelable, while ElectricVehicle include a charge() method.
// Goal: Use hybrid inheritance by having PetrolVehicle implement both Vehicle and Refuelable, demonstrating how Java interfaces allow adding multiple behaviors.


class Vehicle{
    int maxSpeed;
    String model;
    public Vehicle(int maxSpeed, String model){
        this.maxSpeed = maxSpeed;
        this.model = model;
    }
    public void displayInfo(){
        System.out.println("Maximum Speed can be  : "+maxSpeed);
        System.out.println("Model of vechile is : "+model);
    }
}
interface Refuelable{
    public void refuel();
}
class ElectricVehicle extends Vehicle{
    public ElectricVehicle(int maxSpeed, String model){
        super(maxSpeed, model);
    }
    public void charge(){
        System.out.println("Charging the electric vehicle");
    }
}
class PetrolVehicle extends Vehicle implements Refuelable{
    public PetrolVehicle(int maxSpeed, String model){
        super(maxSpeed, model);
    }
    public void refuel(){
        System.out.println("Refueling the petrol vehicle");
    }
}


public class VechileManagement {
    public static void main(String[] args) {
        ElectricVehicle ev = new ElectricVehicle(250, "Tata Curv");
        ev.displayInfo();
        ev.charge();
        System.out.println();
        PetrolVehicle pv = new PetrolVehicle(180, "Tata Avinya");
        pv.displayInfo();
        pv.refuel();
    }
   
}
