class CarRental{ 
     private String customerName; 
     private String carModel; 
     private int rentalDays;

     public CarRental(String customerName, String carModel,int rentalDays) 
     { 
        this.customerName=customerName; 
        this.carModel=carModel; 
        this.rentalDays=rentalDays; 

     }

     public double totalcost() 
     { 
        double ans=3000*rentalDays; 
        return ans;
     } 

     public void details() 
     { 
        System.out.print("customer name is "+customerName+" & car model is "+carModel+" for "+rentalDays+" Days"); 
        System.out.print(" so total cost is = "+totalcost());  

        System.out.println(); 
     }
}

public class CarRent {
    public static void main(String[] args) {
        CarRental c=new CarRental("naman","c24",20); 
        c.details(); 

         
        CarRental c1=new CarRental("vikky","k11",5); 
        c1.details(); 

    }
}
