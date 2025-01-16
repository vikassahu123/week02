class Items{ 
    private String itemName; 
    private double itemCode; 
    private double price;  
    private double quantity; 
     
    public Items(String itemName ,double itemCode ,double price,double quantity) 
    { 
     this.itemName=itemName; 
     this.itemCode=itemCode; 
     this.price=price;
     this.quantity=quantity; 


    } 

    public void displayDetails() 
    { 
     System.out.println("Item name is = "+ itemName +" , item code is "+ itemCode+" , price is "+price+" , quantity is "+quantity);
    } 
    public double calculate()
    {  double totalCost=price*quantity; // because it access easily all variable.
        return totalCost;
    }
}

public class TrackItems {
    public static void main(String[] args) {
        Items i=new Items("table",22 ,200 , 5); 
        i.displayDetails(); 
        System.out.println("total cost is = "+i.calculate() );
    }
}
