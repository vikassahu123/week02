// Sample Program 7: Hospital Management System
// Create a Patient class with the following features:
// Static:
// A static variable hospitalName shared among all patients.
// A static method getTotalPatients() to count the total patients admitted.
// This:
// Use this to initialize name, age, and ailment in the constructor.
// Final:
// Use a final variable patientID to uniquely identify each patient.
// Instanceof:
// Check if an object is an instance of the Patient class before displaying its details.


class Patient {
    static String hospitalName = "Rathi Hospital";
    static int totalPatients = 0;
    final int patientID;
    String name;
    int age;
    String ailment;

   public Patient(String name, int age, String ailment, int patientID) {
       this.name = name;
       this.age = age;
       this.ailment = ailment;
       this.patientID = patientID;
       totalPatients++;
   }

   public static int getTotalPatients() {
       return totalPatients;
   }

   public void display() {
       System.out.println("Patient ID is: " + patientID);
       System.out.println("Name of the patient: " + name);
       System.out.println("Ageof the patient is: " + age);
       System.out.println("Ailment: " + ailment);
       System.out.println("Hospital Name: " + hospitalName);
   }

   
}

public class HospitalSystem  {
   public static void main(String[] args) {
       Patient patient1 = new Patient("Rina", 30, "Feaver", 101);
       Patient patient2 = new Patient("sundar", 45, "leg Fracture", 102);

       System.out.println("Our Hospital Name is : " + Patient.hospitalName);
       System.out.println("Total Patients Admitted: " + Patient.getTotalPatients());
       System.out.println();

       if (patient1 instanceof Patient) {
           
           patient1.display();
       }

       if (patient2 instanceof Patient) {
           
           patient2.display();
       }
   }
}


