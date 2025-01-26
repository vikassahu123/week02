// Ride-Hailing Application
// Description: Develop a ride-hailing application:
// Define an abstract class Vehicle with fields like vehicleId, driverName, and ratePerKm.
// Add abstract methods calculateFare(double distance) and a concrete method getVehicleDetails().
// Create subclasses Car, Bike, and Auto, overriding calculateFare() based on type-specific rates.
// Use an interface GPS with methods getCurrentLocation() and updateLocation().
// Secure driver and vehicle details using encapsulation.
// Demonstrate polymorphism by creating a method to calculate fares for different vehicle types dynamically.

interface GPS {
    void getCurrentLocation();
    void updateLocation();
}
abstract class Vehicle implements GPS {
    int vehicleId;
    String driverName;
    double ratePerKm;
    Vehicle(int vehicleId, String driverName, double ratePerKm) {
        this.vehicleId = vehicleId;
        this.driverName = driverName;
        this.ratePerKm = ratePerKm;
    }
    void getVehicleDetails() {
        System.out.println("Vehicle ID: " + vehicleId);
        System.out.println("Driver Name: " + driverName);
        System.out.println("Rate per km: " + ratePerKm);
    }
    public abstract void calculateFare(double distance);
}
class Car extends Vehicle implements GPS {
    Car(int vehicleId, String driverName, double ratePerKm) {
        super(vehicleId, driverName, ratePerKm);
    }
    @Override
    public void calculateFare(double distance) {
        System.out.println("Fare for Car: Rs. " + ratePerKm * distance);
    }
    @Override
    public void getCurrentLocation() {
        System.out.println("Current Location: Car");
    }
    @Override
    public void updateLocation() {
        System.out.println("Location Updated: Car");
    }
}
class Bike extends Vehicle implements GPS {
    Bike(int vehicleId, String driverName, double ratePerKm) {
        super(vehicleId, driverName, ratePerKm);
    }
    @Override
    public void calculateFare(double distance) {
        System.out.println("Fare for Bike: Rs. " + ratePerKm * distance);
    }
    @Override
    public void getCurrentLocation() {
        System.out.println("Current Location: Bike");
    }
    @Override
    public void updateLocation() {
        System.out.println("Location Updated: Bike");
    }
}
class Auto extends Vehicle implements GPS {
    Auto(int vehicleId, String driverName, double ratePerKm) {
        super(vehicleId, driverName, ratePerKm);
    }
    @Override
    public void calculateFare(double distance) {
        System.out.println("Fare for Auto: Rs. " + ratePerKm * distance);
    }
    @Override
    public void getCurrentLocation() {
        System.out.println("Current Location: Auto");
    }
    @Override
    public void updateLocation() {
        System.out.println("Location Updated: Auto");
    }
}
public class RideHailing  {
    public static void main(String[] args) {
        Vehicle[] vehicles = new Vehicle[3];
        vehicles[0] = new Car(100, "Joy", 9);
        
        vehicles[1] = new Bike(101, "Mohan", 5);
        
        vehicles[2] = new Auto(102, "Surendra", 8);
        for(Vehicle vehicle : vehicles) {
            vehicle.getVehicleDetails();
            vehicle.calculateFare(10);
            vehicle.getCurrentLocation();
            vehicle.updateLocation();
            System.out.println();
        }
        
    }
}

