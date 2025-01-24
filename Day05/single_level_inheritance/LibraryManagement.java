// 1: Library Management with Books and Authors
// Description: Model a Book system where Book is the superclass, and Author is a subclass.
// Tasks:
// Define a superclass Book with attributes like title and publicationYear.
// Define a subclass Author with additional attributes like name and bio.
// Create a method displayInfo() to show details of the book and its author.
// Goal: Practice single inheritance by extending the base class and adding more specific details in the subclass.

class Book 
{ 
    String title; 
    int publicationYear; 

    public Book(String title,int publicationYear) 
    { 
        this.title=title; 
        this.publicationYear=publicationYear; 

    }  

    
   

    
} 

class Author extends Book
 { 
    String name;
    String bio;  
    
    public Author(String title,int publicationYear,String name,String bio) 
    {
      super(title, publicationYear); 
      this.name=name;
      this.bio=bio; 

    }  

     
    public void displayInfo() 
    {   System.out.println(" title is "+title +" publication year "+ publicationYear);
        System.out.println(" Book name is "+"\"" +name+"\"" +   " bio "+bio);

    }


 }  



public class LibraryManagement 
{
    public static void main(String[] args) {
        Author a=new Author("Truth of life", 1900, "Sach", "I am an enginner"); 
        a.displayInfo();
    }
}