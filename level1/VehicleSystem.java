class Vehicle {
    static double registrationFee = 500.0;
    final String registrationNumber;
    String ownerName;
    String vehicleType;

   public Vehicle(String ownerName, String vehicleType, String registrationNumber) {
       this.ownerName = ownerName;
       this.vehicleType = vehicleType;
       this.registrationNumber = registrationNumber;
   }

   public static void updateRegistrationFee(double newFee) {
       registrationFee = newFee;
   }

   public void display() {
       System.out.println("Registration Number of vechile is : " + registrationNumber);
       System.out.println("Owner Name of vechile is : " + ownerName);
       System.out.println("Tpye of vechile is : " + vehicleType);
       System.out.println("Registration Fee is : " + registrationFee);
   }

  
}


public class VehicleSystem {
   public static void main(String[] args) {
       System.out.println("intially  registration fee is : " + Vehicle.registrationFee);   
       Vehicle.updateRegistrationFee(150.0);
       System.out.println("Updated registration fee is : " + Vehicle.registrationFee);

       Vehicle v1 = new Vehicle("Anand", "Car", "A9923");
       Vehicle v2 = new Vehicle("NIKKU", "Motorcycle", "GDR389");

       if (v1 instanceof Vehicle) {
           
           v1.display();
       }

       if (v2 instanceof Vehicle) {
          
           v2.display();
       }
   }
}


