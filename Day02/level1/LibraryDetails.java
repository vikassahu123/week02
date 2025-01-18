import java.util.Scanner;

class Book {
    private String title; 
    private String author; 
    private double price;
    private static double availability=10; // it is use till end. 

     public Book()
     {
       title="Rama";
         author="vikas";
        price=500;
        
     }
    public Book(String title, String author,double price) 
    { 
     this.title=title;
     this.author=author;
     this.price=price; 

    }  

    public boolean available() 
    { 
        if(availability>0) 
        {  availability--;
            return true;
        } 
        return false;
    }

    public void displayDetails() 
    { 
     System.out.println("Title is = "+ title +" , author= "+ author+" and price= "+price+" and it is available = "+available());

    }

    
}

public class LibraryDetails {
    public static void main(String[] args) {
        Book b=new Book(); 
        b.displayDetails(); 

        Scanner s=new Scanner(System.in); 
        System.out.println("do you want to borrow a book   (yes/no)" ) ;
        String choice=s.next();
        if(choice.equals("yes")){
             Book b1=new Book("randhira","anand",400); 
             b1.displayDetails(); 

             Book b2=new Book("dhanjay", "m.s kiran", 200); 
             b2.displayDetails();
        }
    } 
   
}
