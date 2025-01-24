// Sample Problem 2: Smart Home Devices
// Description: Create a hierarchy for a smart home system where Device is the superclass and Thermostat is a subclass.
// Tasks:
// Define a superclass Device with attributes like deviceId and status.
// Create a subclass Thermostat with additional attributes like temperatureSetting.
// Implement a method displayStatus() to show each device's current settings.
// Goal: Understand single inheritance by adding specific attributes to a subclass, keeping the superclass general.


class Device 
{ 
    int deviceId; 
    String status; 

   public Device(int deviceId,String status) 
    { 
       this.deviceId=deviceId; 
       this.status=status; 
       
    }
} 

class Thermostat extends Device 
{ 
    String temperatureSetting; 
    public Thermostat(int deviceId,String status,String temperatureSetting) 
    { 
        super(deviceId, status); 
        this.temperatureSetting=temperatureSetting; 
    } 

    public void displayStatus() { 
        System.out.println("device id = "+deviceId+" Status is "+"\""+status+"\""+" temperature setting is "+temperatureSetting); 
        
        
    }
}
public class SmartHome {
    public static void main(String[] args) {
        Thermostat t=new Thermostat(23, "on", "appliances");
        t.displayStatus(); 
    }
}
