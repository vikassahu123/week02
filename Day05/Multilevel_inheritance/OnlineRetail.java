// Sample Problem 1: Online Retail Order Management
// Description: Create a multilevel hierarchy to manage orders, where Order is the base class, ShippedOrder is a subclass, and DeliveredOrder extends ShippedOrder.
// Tasks:
// Define a base class Order with common attributes like orderId and orderDate.
// Create a subclass ShippedOrder with additional attributes like trackingNumber.
// Create another subclass DeliveredOrder extending ShippedOrder, adding a deliveryDate attribute.
// Implement a method getOrderStatus() to return the current order status based on the class level.
// Goal: Explore multilevel inheritance, showing how attributes and methods can be added across a chain of classes.

class Order 
{
    int orderId; 
    String orderDate; 

    public Order(int orderId,String orderDate) 
    {  this.orderId=orderId; 
        this.orderDate=orderDate; 


    }
} 

class ShippedOrder extends Order 
{
    int trackingNumber; 
    public ShippedOrder(int orderId,String orderDate,int trackingNumber) 
    { 
        super(orderId, orderDate); 
        this.trackingNumber=trackingNumber;
    }
} 

class DeliveredOrder extends ShippedOrder 
{
    String deliveryDate; 
    public DeliveredOrder(int orderId,String orderDate,int trackingNumber,String deliveryDate) 
    { 
        super(orderId, orderDate,trackingNumber); 
        this.deliveryDate=deliveryDate;
    } 

    public void getOrderStatus() 
    {
        System.out.println("Order id "+orderId+" order date is "+orderDate); 
        System.out.println("Tracking number is "+trackingNumber+" delivery date is "+deliveryDate);
    }
}
public class OnlineRetail 
{
    public static void main(String[] args) {
        DeliveredOrder d=new DeliveredOrder(123, "02/01/2025", 34567, "24/01/2025"); 
         d.getOrderStatus();

    }
}