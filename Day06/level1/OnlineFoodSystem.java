
// Online Food Delivery System
// Description: Create an online food delivery system:
// Define an abstract class FoodItem with fields like itemName, price, and quantity.
// Add abstract methods calculateTotalPrice() and concrete methods like getItemDetails().
// Extend it into classes VegItem and NonVegItem, overriding calculateTotalPrice() to include additional charges (e.g., for non-veg items).
// Use an interface Discountable with methods applyDiscount() and getDiscountDetails().
// Demonstrate encapsulation to restrict modifications to order details and use polymorphism to handle different types of food items in a single order-processing method.

interface Discountable {
    void applyDiscount();
    void getDiscountDetails();
}
abstract class FoodItem implements Discountable {
    String itemName;
    double price;
    int quantity;
    FoodItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }
    void getItemDetails() {
        System.out.println("Item Name: " + itemName);
        System.out.println("Price: " + price);
        System.out.println("Quantity: " + quantity);
    }
    public  abstract void calculateTotalPrice() ;

}
class VegItem extends FoodItem implements Discountable {
    VegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
    }
    @Override
    public void calculateTotalPrice() {
        System.out.println("Total Price: " + price * quantity);
    }
    @Override
    public void applyDiscount() {
        System.out.println("Discount Applied: 10%");
    }
    @Override
    public void getDiscountDetails() {
        System.out.println("Discount: 10% off on all veg items");
    }   
}
class NonVegItem extends FoodItem implements Discountable {
    NonVegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
    }
    @Override
   public  void calculateTotalPrice() {
        double totalPrice = price * quantity;
        double additionalCharges = 0.1 * totalPrice;
        System.out.println("Total Price: " + (totalPrice + additionalCharges));
    }
    @Override
    public void applyDiscount() {
        System.out.println("Discount Applied: 5%");
    }
    @Override
    public void getDiscountDetails() {
        System.out.println("Discount: 5% off on all non-veg items");
    }

}
public class OnlineFoodSystem {
    public static void main(String[] args) {
        FoodItem [] items = new FoodItem[2];
         items[0] = new VegItem("Paneer Tikka", 200, 3);
         items[1] = new NonVegItem("Chicken Tikka", 350, 2);
          for(FoodItem item : items) {
            item.getItemDetails();
            item.calculateTotalPrice();
            item.applyDiscount();
            item.getDiscountDetails();
            System.out.println();
    }
}
    
}
