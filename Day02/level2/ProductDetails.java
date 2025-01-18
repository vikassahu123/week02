 class product 
{   //instance variable
    private String productName;
    private double price; 

    // class variable 
    private static int totalProducts=0;  

    public product(String productName,double price) 
    {
        this.productName=productName; 
        this.price=price; 

        totalProducts++; 

    } 

    public void displayProductDetails()
    { 
        System.out.println("product name = "+productName+" price "+price);
    }

    public static void displayTotalProduct() 
    { 
        System.out.println("total product is = "+totalProducts); 
    }

}

public class ProductDetails {
    public static void main(String[] args) {
        product p=new product("car", 750000);  
        p.displayProductDetails(); 
        
        product p1=new product("mobile", 18000);  
        p1.displayProductDetails(); 

        product.displayTotalProduct(); // call be class name because it is static method and by this we call static variable

    }
}
