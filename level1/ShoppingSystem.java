// Sample Program 4: Shopping Cart System
// Create a Product class to manage shopping cart items with the following features:
// Static:
// A static variable discount shared by all products.
// A static method updateDiscount() to modify the discount percentage.
// This:
// Use this to initialize productName, price, and quantity in the constructor.
// Final:
// Use a final variable productID to ensure each product has a unique identifier that cannot be changed.
// Instanceof:
// Validate whether an object is an instance of the Product class before processing its details.


class Product{ 
      static double discount=0.20;  

       String productName; 
       int price; 
      public int quantity; // for access in main
      
      final int productID; 

      public static double updateDiscount(double newDiscount) 
      { 
        discount=newDiscount; 
        return discount; 
      }  

      public Product( String productName, int price,int quantity,int productID) 
      { 
        this.productName=productName; 
        this.price=price; 
        this.quantity=quantity; 
        this.productID=productID;
      }  

      public double totalcost() 
      {  double withoutdiscount=price*quantity; 
         double discountInProduct=withoutdiscount*discount;
         double ans=withoutdiscount-discountInProduct; 
        return ans;
      } 

      public void display()
      { 
        System.out.println("product Name is "+productName+ " , price is "+price+ " and total quantity is "+quantity); 

      } 




}


public class ShoppingSystem {
 public static void main(String[] args) {
     Product p1=new Product("chips", 10, 10, 2663); 
     Product p2=new Product("Red bull",250 , 8, 2324); 
     
     if(p1 instanceof Product) 
     {
        p1.display(); 
        if((p1.quantity)>=10) 
        { 
           Product.updateDiscount(0.30);
        } 
        
        System.out.println("total cost after discount is "+ p1.totalcost());
        
     } 
     if(p2 instanceof Product) 
     { 
        p2.display(); 
        if((p2.quantity)>=10) 
        { 
           Product.updateDiscount(0.30);
        } 
        
        System.out.println("total cost after discount is "+ p2.totalcost());
        
     }
 }   
}
