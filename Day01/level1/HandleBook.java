 class Book{ 
       private String title; 
       private String author; 
       private double price; 
        
       public Book(String title, String author,double price) 
       { 
        this.title=title;
        this.author=author;
        this.price=price; 

       } 

       public void displayDetails() 
       { 
        System.out.println("Title is = "+ title +" , author= "+ author+" and price= "+price);
       }
}
public class HandleBook {
    public static void main(String[] args) {
        Book b=new Book("To Kill a Mockingbird", "Harper Lee", 200); 
        b.displayDetails();
    }
}
