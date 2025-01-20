// Sample Program 2: Library Management System
// Create a Book class to manage library books with the following features:
// Static:
// A static variable libraryName shared across all books.
// A static method displayLibraryName() to print the library name.
// This:
// Use this to initialize title, author, and isbn in the constructor.
// Final:
// Use a final variable isbn to ensure the unique identifier of a book cannot be changed.
// Instanceof:
// Verify if an object is an instance of the Book class before displaying its details.


class Book{ 
    static String libraryName="Sahu library";  
     
    private String title; 
    private String author; 
    final int isbn; 

    public static void displayLibraryName() 
    { 
        System.out.println("library name is : "+libraryName);
    } 

    public Book(String title,String author,int isbn) 
    { 
        this.title=title; 
        this.author=author; 
        this.isbn=isbn; 

    } 

    public void display() 
    { 
        System.out.println("Book title is "+title+" , author is "+author+" and isbn number is "+isbn);
    }

}

public class LibrarySystem {
    public static void main(String[] args) {
        
        Book b1=new Book("To Kill a Mockingbird", "Harper Lee", 978-0061); 

        Book b2=new Book("1984", "George Orwell", 978-252); 

        if(b1 instanceof Book) 
        { 
            Book.displayLibraryName();// not use b1 because method is static 
            b1.display(); 
        } 
        if(b2 instanceof Book) 
        { 
            Book.displayLibraryName();// not use b2 because method is static 
            b2.display();
        }

    }
}
