import java.text.NumberFormat.Style;

class MobilePhone {
    private String brand; 
    private String modelNumber; 
    private double price; 

    public MobilePhone(String brand, String modelNumber, double price) 
    { 
        this.brand=brand;
        this.modelNumber=modelNumber;
        this.price=price; 

    } 
    public void displayDetails() 
    { 
        System.out.println("brand is "+ brand+ " model number is "+ modelNumber+" price = "+price);
    } 


    
}

public class HandleMobilePhone {
    public static void main(String[] args) {
        MobilePhone mb=new MobilePhone("vivo","v34",19000);  

        mb.displayDetails(); 

        MobilePhone mb1=new MobilePhone("oppo","s14",12600);  

        mb1.displayDetails(); 



    }
}
