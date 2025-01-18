class Book {
    public String ISBN;
    protected String title;
    private String author;

    public void setAuthor(String authorName) {
        this.author = authorName;
    }

    public String getAuthor() {
        return author;
    }
}

class EBook extends Book {
    public void displayDetails() {
        System.out.println("ISBN: " + ISBN);
        System.out.println("Title: " + title);
    }
}

 public class BookDetail {
    public static void main(String[] args) {
        Book book = new Book();
        book.ISBN = "123";
        book.title = "Tiny Habit";
        book.setAuthor("Abhay");

        System.out.println("Book Details:");
        System.out.println("ISBN: " + book.ISBN);
        System.out.println("Title: " + book.title);
        System.out.println("Author: " + book.getAuthor());

        EBook ebook = new EBook();
        ebook.ISBN = "456";
        ebook.title = "Tiny Habit";

        System.out.println("\nEBook Details:");
        ebook.displayDetails();
    }
}