import java.util.Scanner;
 class MovieTicket {
    private String movieName;
    private String seatNumber;
    private double price;

    // for new ticket with default values
    public MovieTicket() {
        this.movieName = "";
        this.seatNumber = "";
        this.price = 0.0;
    }

    
    public void bookTicket(String movieName, String seatNumber, double price) {
        this.movieName = movieName;
        this.seatNumber = seatNumber;
        this.price = price;
        System.out.println("Ticket successfully booked!");
    }

    
    public void displayTicketDetails() {
        if (movieName.isEmpty() || seatNumber.isEmpty()) {
            System.out.println("No ticket has been booked yet.");
        } else {
            System.out.println("Movie Name: " + movieName);
            System.out.println("Seat Number: " + seatNumber);
            System.out.println("Price: $" + price);
        }
    }
} 
public class TicketBooking { 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MovieTicket ticket = new MovieTicket();

        // before booking
        ticket.displayTicketDetails();

        // book a ticket
        System.out.println("Enter the movie name: ");
        String movieName = scanner.nextLine();

        System.out.println("Enter the seat number: ");
        String seatNumber = scanner.nextLine();

        System.out.println("Enter the ticket price: ");
        double price = scanner.nextDouble();

        
        ticket.bookTicket(movieName, seatNumber, price);

        // after booking
        ticket.displayTicketDetails(); 
    }
}
  

