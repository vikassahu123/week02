class Vehicle  {

    String ownerName;
    String vehicleType;
    static int registrationFees= 950;
      public Vehicle(String ownerName, String vehicleType){
           this.ownerName = ownerName;
           this.vehicleType = vehicleType;
      }
         public void display(){
             System.out.println("Owner Name is: "+ownerName);
             System.out.println("Vehicle Type is : "+vehicleType);
             System.out.println("Registration Fees is  "+registrationFees);
         }
}

public class VehicleDetails {
public static void main(String[] args) {
 Vehicle v1 = new Vehicle("Rahul", "Car");
 v1.display();
 Vehicle v2 = new Vehicle("Rohit", "Bike");
 v2.display();
 System.out.println("Updating the registration fees");
 Vehicle.registrationFees = 1000;
 System.out.println();
 System.out.println("Now  Registration fees for this  Vehicle is: "+v1.registrationFees);
 System.out.println();
 System.out.println("Now  Registration fees for this Vehicle is: "+v2.registrationFees);
}

}