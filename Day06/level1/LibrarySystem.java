
// Library Management System
// Description: Develop a library management system:
// Use an abstract class LibraryItem with fields like itemId, title, and author.
// Add an abstract method getLoanDuration() and a concrete method getItemDetails().
// Create subclasses Book, Magazine, and DVD, overriding getLoanDuration() with specific logic.
// Implement an interface Reservable with methods reserveItem() and checkAvailability().
// Apply encapsulation to secure details like the borrower’s personal data.
// Use polymorphism to allow a general LibraryItem reference to manage all items, regardless of type.


abstract class LibraryItem implements Reservable{
    private int itemId;
    private String title;
    private String author;
    public LibraryItem(int itemId,String title,String author){
        this.itemId=itemId;
        this.title=title;
        this.author=author;
    }
    public abstract void getLoanDuration(); 
    
    public void getItemDetails(){
        System.out.println("item id is: "+ itemId);
        System.out.println("item title is: "+ title);
        System.out.println("item author is: "+ author);
    }
}

interface Reservable{
    public void reserveItem();
    public void checkAvailability();
} 

class Book extends LibraryItem implements Reservable{
   
    public Book(int itemId,String title,String author){
        super(itemId, title, author);
    }
    public void getLoanDuration(){
        System.out.println("loan duration for book is 15 days");
    }
    public void reserveItem(){
        System.out.println("you can reserve this book");
    }
    public void checkAvailability(){
        System.out.println("this book is available");
    }
}
class Magazine extends LibraryItem implements Reservable{
    public Magazine(int itemId,String title,String author){
        super(itemId, title, author);
    }
    public void getLoanDuration(){
        System.out.println("loan duration for magazine is 7 days");
    }
    public void reserveItem(){
        System.out.println("you can reserve this magazine");
    }
    public void checkAvailability(){
        System.out.println("this magazine is not for 7 days available");
    }
}
class DVD extends LibraryItem implements Reservable{
    public DVD(int itemId,String title,String author){
        super(itemId, title, author);
    }
    public void getLoanDuration(){
        System.out.println("loan duration for DVD is 3 days");
    }
    public void reserveItem(){
        System.out.println("you can reserve this DVD");
    }
    public void checkAvailability(){
        System.out.println("this DVD is available for only 2 days ");
    }
}
public class LibrarySystem {
    public static void main(String[] args) {
        LibraryItem book=new Book(1, "SitaRam", "Anant");
        book.getItemDetails();
        book.getLoanDuration();
        book.reserveItem();
        book.checkAvailability();
        System.out.println();
        LibraryItem magazine=new Magazine(2, "sports", "Tina");
        magazine.getItemDetails();
        magazine.getLoanDuration();
        magazine.reserveItem();
        magazine.checkAvailability();
        System.out.println();
        LibraryItem dvd=new DVD(3, "movie", "Rahul");
        dvd.getItemDetails();
        dvd.getLoanDuration();
        dvd.reserveItem();
        dvd.checkAvailability();


    }
    
}

