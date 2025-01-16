class Circle{ 
    private int radius; 
    
    public Circle(int radius) 
    { 
        this.radius=radius; 
    } 

    public double calculateArea() 
    {    double pi=3.14;
        double area=pi*radius*radius; 
        
        return area;
    }

    public double calculateCircum() 
    {    double pi=3.14;
        
        double circumference=2*pi*radius; 
       return circumference;
    }  
    public void displayDetails() 
    {
        System.out.println( "area is " + calculateArea()); 
        System.out.println("circumference is "+ calculateCircum());
    }
   
}
public class AreaCircle {
    public static void main(String[] args) {
         Circle cr=new Circle(23); 
         
         cr.displayDetails();
    }
}
