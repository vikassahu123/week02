// . Vehicle Rental System
// Description: Design a system to manage vehicle rentals:
// Define an abstract class Vehicle with fields like vehicleNumber, type, and rentalRate.
// Add an abstract method calculateRentalCost(int days).
// Create subclasses Car, Bike, and Truck with specific implementations of calculateRentalCost().
// Use an interface Insurable with methods calculateInsurance() and getInsuranceDetails().
// Apply encapsulation to restrict access to sensitive details like insurance policy numbers.
// Demonstrate polymorphism by iterating over a list of vehicles and calculating rental and insurance costs for each.



abstract class Vehicle 
{ 
     private String vehicleNumber; 
     private String type; 
     private double rentalRate; 

     public Vehicle(String vehicleNumber,String type, double rentalRate) 
     { 
        this.vehicleNumber=vehicleNumber; 
        this.type=type; 
        this.rentalRate=rentalRate; 

     } 

      // Getter and Setter Methods (Encapsulation)
    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public void setVehicleNumber(String vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getRentalRate() {
        return rentalRate;
    }

    public void setRentalRate(double rentalRate) {
        this.rentalRate = rentalRate;
    } 

      // Abstract Method
    abstract double calculateRentalCost(int days);  // always without body.



    // Display Vehicle Details
    public void displayVehicleDetails() {
        System.out.println("Vehicle Number: " + vehicleNumber);
        System.out.println("Type: " + type);
        System.out.println("Rental Rate: " + rentalRate);
    } 


}  

// interface 
 interface Insurable { 

     double calculateInsurance(); 
     String getInsuranceDetails(); 

    
}

class Car extends Vehicle implements Insurable
{   

    private String insuranceNumber; 
    public Car(String vehicleNumber,String type, double rentalRate,String insuranceNumber) 
    {  
        super(vehicleNumber, type, rentalRate);
        
         this.insuranceNumber=insuranceNumber; 

    }  
    
    @Override
    public double calculateRentalCost(int days) 
    { 
        return getRentalRate()*days + 500 ;   // rate *days =total cost.  additional price is 500.
    } 
    
    @Override
    public double calculateInsurance() 
    {
        return 5000;      // fixed insurance amount.
    } 

    @Override
    public String getInsuranceDetails() 
    { 
        return " Insurance number is "+insuranceNumber;
    }

} 

class Bike extends Vehicle implements Insurable
{  
    String insuranceNumber;
    public Bike(String vehicleNumber,String type, double rentalRate,String insuranceNumber) 
    {  
        super(vehicleNumber, type, rentalRate);
       this.insuranceNumber=insuranceNumber;

    }  
    
    @Override
    public double calculateRentalCost(int days) 
    { 
        return getRentalRate()*days;   // rate *days =total cost.
    } 
     
    @Override
    public double calculateInsurance() 
    {
        return 2000;      // fixed insurance amount.
    } 

    @Override
    public String getInsuranceDetails() 
    { 
        return " Insurance number is "+insuranceNumber;
    }
} 


class Truck extends Vehicle implements Insurable
{  

    private String insuranceNumber; 
    public Truck(String vehicleNumber,String type, double rentalRate,String insuranceNumber) 
    {  
        super(vehicleNumber, type, rentalRate);
       
         this.insuranceNumber=insuranceNumber; 

    }  
    
    @Override
    public double calculateRentalCost(int days) 
    { 
        return (getRentalRate()*days +  200 );   // rate *days =total cost. 200 additional price.
    } 
    
    @Override
    public double calculateInsurance() 
    {
        return 8000;      // fixed insurance amount.
    } 
     
    @Override
    public String getInsuranceDetails() 
    { 
        return " Insurance number is "+insuranceNumber;
    }

}


public class VehicleRental {
    public static void main(String[] args) {
        Car car=new Car("234232", "Car", 5000,  "4444as34"); 
        Bike bike=new Bike("56354", "Bike", 2000,  "2341e42"); 
        Truck truck=new Truck("34214", "Truck", 7000, "79779nh87"); 

        Vehicle[] vehicles={car,bike,truck};
        
        for(Vehicle vehicle: vehicles) 
        { 
            vehicle.displayVehicleDetails(); 
            System.out.println("Total Rental cost is "+vehicle.calculateRentalCost(5)); 
            
            if(vehicle instanceof Insurable) 
            { 
                Insurable insurableVehicle =(Insurable) vehicle; 

              System.out.println( "insurance amount is "+ insurableVehicle.calculateInsurance()); 
                insurableVehicle.getInsuranceDetails(); 

            }
            System.out.println("...................................................................");

        }  
       


    }
}
