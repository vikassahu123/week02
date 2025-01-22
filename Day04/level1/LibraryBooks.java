import java.util.ArrayList ;
class Book {
    private String author ;
    private String title ;

    public Book(String author , String title) {
        this.author = author ;
        this.title = title ;
    }
    public String getAuthor() {
        return author ;
    }
    public String getTitle() {
        return title ;
    }

    public void displayBookDetails() {
        System.out.println("Title: " + title + " Author: " + author);
    }
}
class Library {
    private String libraryName;
    private ArrayList <Book> books; // Aggregation: A library contains multiple books

    // Constructor to initialize a library
    public Library(String libraryName) {
        this.libraryName = libraryName;
        this.books = new ArrayList<>();
    }
    // Method to add a book to the library
    public void addBook(Book book) {
        books.add(book);
        System.out.println(book.getTitle() + " has been added to " + libraryName);
    }

    // Method to display all books in the library
    public void displayLibraryBooks() {
        System.out.println("\nBooks in " + libraryName + ":");
        for (int i = 0; i < books.size(); i++) {
            Book book = books.get(i);
            book.displayBookDetails(); // Display the details of the book
        }
    }

        // Method to get library name
        public String getName() {
            return libraryName;
        }
    }
    // Main class
public class LibraryBooks {
    public static void main(String[] args) {
            // Creating books
            Book book1 = new Book("Paulo Coelho", "The Alchemist");
            Book book2 = new Book("Wings of Fire", "Dr. A.P.J. Abdul Kalam");
            Book book3 = new Book("Chetan Bhagat", "The Girl in Room 105");
           
            // Creating libraries
            Library library1 = new Library("AA Library");
            Library library2 = new Library("Tk Library");

            // Adding books to libraries
            library1.addBook(book1);
            library1.addBook(book2);

            library2.addBook(book3);
            
            // Displaying books in libraries
            library1.displayLibraryBooks();
            library2.displayLibraryBooks();
    }
}