// E-Commerce Platform
// Description: Develop a simplified e-commerce platform:
// Create an abstract class Product with fields like productId, name, and price, and an abstract method calculateDiscount().
// Extend it into concrete classes: Electronics, Clothing, and Groceries.
// Implement an interface Taxable with methods calculateTax() and getTaxDetails() for applicable product categories.
// Use encapsulation to protect product details, allowing updates only through setter methods.

abstract class Product { 
    private int productId; 
    private String name; 
    private double price; 

    public Product(int productId,String name, double price) 
    { 
        this.productId=productId; 
        this.name=name; 
        this.price=price; 
    } 

    abstract double calculateDiscount(); // abstract method doesn't have body.
     
    public int getProductId() 
     {
            return productId;
     } 

     public void setProductId(int productId) 
     {
        this.productId=productId;
     }

     public String getName() 
     {
            return  name;
     }

     public void setName(String name) 
     {
        this.name=name;
     }

     public double getPrice() 
     {
            return price;
     }  

     public void setPrice(double price) 
     {
        this.price=price;
     } 

     //product details 
     public void displayProductDetails() {
        System.out.println("Product ID: " + productId);
        System.out.println("Name: " + name);
        System.out.println("Price: " + price);
    } 


    
}  

 interface Taxable{                //interface 

    double calculateTax();           // methods of interface
    String getTaxDetails(); 


    
}
class Electronics extends Product implements Taxable{ 
     double discountPercent; 

     public Electronics(int productId,String name,double price,double discountPercent )  
     { 
           super(productId, name, price); 

           this.discountPercent=discountPercent; 
     }

     @Override
    public double calculateDiscount() 
    {     
        return getPrice()*(discountPercent/100);

    }  

    //impliment
    public double calculateTax() 
    { 
        return getPrice()*0.18; // 18% tax on electronics items.
    }

     //implimentation
    public String getTaxDetails()
    { 
        return " 18 % tax on electronics items ";
    }
     
    
} 

class Clothing extends Product implements Taxable{ 
    double flatDiscount; 

    public Clothing(int productId,String name,double price,double flatDiscount )  
    { 
          super(productId, name, price); 
          
          this.flatDiscount=flatDiscount; 
    } 


    @Override // implimentation
   public double calculateDiscount() 
   {     
       return flatDiscount;

   }


    //impliment
    public double calculateTax() 
    { 
        return getPrice()*0.10; // 10% tax on cloths.
    } 

     //implimentation
     public String getTaxDetails()
     { 
         return " 10 % tax on cloths ";
     }
   
}

class Groceries extends Product implements Taxable{ 
    double numberOfProducts; 

    public Groceries(int productId,String name,double price,double numberOfProducts )  
    { 
          super(productId, name, price); 
          
          this.numberOfProducts=numberOfProducts; 
    }

    @Override 
   public double calculateDiscount() 
   {     
       return (numberOfProducts>5)  ?  getPrice()*0.10  :   0;

   }

    //impliment
    public double calculateTax() 
    { 
        return getPrice()*0.05; // 5% tax on groceries item.
    }

     //implimentation
     public String getTaxDetails()
     { 
         return " 5 % tax on groceries item ";
     }
}
public class Ecommerce {
    public static void main(String[] args) {
         Electronics tv=new Electronics(234, "Samsung 24", 36000, 2); 

         Clothing blazer=new Clothing(100, "Blazer", 25000, 4000); 

         Groceries rice=new Groceries(121, "Rice", 4100, 6); 

         Product[] products={tv,blazer,rice}; 
         
         for(Product each:products) 
         {   each.displayProductDetails(); 
             System.out.println("Discount amount is "+each.calculateDiscount()); 
              double afterDiscount=(each.getPrice()-each.calculateDiscount());// price-discount 
             if(each instanceof Taxable) 
             {     Taxable tProduct=(Taxable) each;
               System.out.println("calculated tax is "+tProduct.calculateTax()); 
                 
               System.out.println(tProduct.getTaxDetails());
               
               System.out.println("Final price is "+(afterDiscount+tProduct.calculateTax()));// adding tax on price after discount.
             }
                 
             System.out.println(".............................................");
                   
         }
    }
}
