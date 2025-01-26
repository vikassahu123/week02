 // 7. Hospital Patient Management
// Description: Design a system to manage patients in a hospital:
// Create an abstract class Patient with fields like patientId, name, and age.
// Add an abstract method calculateBill() and a concrete method getPatientDetails().
// Extend it into subclasses InPatient and OutPatient, implementing calculateBill() with different billing logic.
// Implement an interface MedicalRecord with methods addRecord() and viewRecords().
// Use encapsulation to protect sensitive patient data like diagnosis and medical history.
// Use polymorphism to handle different patient types and display their billing details dynamically.

interface MedicalRecord {
    void addRecord();
    void viewRecords();
}
abstract class Patient implements MedicalRecord {
    int patientId;
    String name;
    int age;
    Patient(int patientId, String name, int age) {
        this.patientId = patientId;
        this.name = name;
        this.age = age;
    }
    void getPatientDetails() {
        System.out.println("Patient ID: " + patientId);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
    public abstract void calculateBill();
}
class InPatient extends Patient implements MedicalRecord {
    InPatient(int patientId, String name, int age) {
        super(patientId, name, age);
    }
    @Override
    public void calculateBill() {
        System.out.println("Billing for InPatient: Rs. 5000");
    }
    @Override
    public void addRecord() {
        System.out.println("Medical Record Added for InPatient");
    }
    @Override
    public void viewRecords() {
        System.out.println("Medical Record Viewed for InPatient");
    }
}
class OutPatient extends Patient implements MedicalRecord {
    OutPatient(int patientId, String name, int age) {
        super(patientId, name, age);
    }
    @Override
    public void calculateBill() {
        System.out.println("Billing for OutPatient: Rs. 2000");
    }
    @Override
    public void addRecord() {
        System.out.println("Medical Record Added for OutPatient");
    }
    @Override
    public void viewRecords() {
        System.out.println("Medical Record Viewed for OutPatient");
    }
}


public class HospitalPetient {
    public static void main(String[] args) {
        Patient [] patients = new Patient[2];
        patients[0] = new InPatient(162, "Anupam", 25);
        patients[1] = new OutPatient(163, "RajGuru", 29);
        for (Patient patient : patients) {
            patient.getPatientDetails();
            patient.calculateBill();
            patient.addRecord();
            patient.viewRecords();
            System.out.println();
        }
    }
    
}
