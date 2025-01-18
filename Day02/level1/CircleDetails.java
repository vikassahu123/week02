class Circle{ 
    private double radius; 
    
    
   public Circle() 
    { 
        this.radius=23; 

    } 

   public Circle(double radius) 
   { 
      this.radius=radius; 

   } 

   public double area() 
   { 
      double pi=3.14; 
      double areaCircle=pi*radius*radius; 
      return areaCircle; 
   } 

   public void details() 
   { 
      System.out.println("Area of a circle is = "+ area());
   }

}

public class CircleDetails {
public static void main(String[] args) {
    Circle c=new Circle(); 
    c.details(); 
    Circle c1=new Circle(45); 
    c1.details(); 

}    
}
