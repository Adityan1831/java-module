package operation;

import services.BookingService;
import entity.Booking;
import entity.Show;

import java.util.List;
import java.util.Scanner;

public class CinemaOperations {
	 private BookingService bookingService;
	    private Scanner scanner;

	    public CinemaOperations() {
	        bookingService = new BookingService();
	        scanner = new Scanner(System.in);
	    }

	    public void start() {
	        while (true) {
	            showMenu();
	            int option = scanner.nextInt();
	            switch (option) {
	                case 1:
	                    viewShows();
	                    break;
	                case 2:
	                    bookTicket();
	                    break;
	                case 3:
	                    viewBookings();
	                    break;
	                case 4:
	                    System.out.println("Exiting...");
	                    return;
	                default:
	                    System.out.println("Invalid option. Try again.");
	            }
	        }
	    }

	    private void showMenu() {
	        System.out.println("\n1. View Available Shows");
	        System.out.println("2. Book a Ticket");
	        System.out.println("3. View Bookings");
	        System.out.println("4. Exit");
	        System.out.print("Choose an option: ");
	    }

	    private void viewShows() {
	        List<Show> shows = bookingService.getAvailableShows();
	        for (int i = 0; i < shows.size(); i++) {
	            System.out.println((i + 1) + ". " + shows.get(i));
	        }
	    }

	    private void bookTicket() {
	        viewShows();
	        System.out.print("Select a show (enter the number): ");
	        int showIndex = scanner.nextInt() - 1;
	        scanner.nextLine(); // Consume newline
	        System.out.print("Enter your name: ");
	        String customerName = scanner.nextLine();
	        bookingService.bookTicket(showIndex, customerName);
	    }

	    private void viewBookings() {
	        List<Booking> bookings = bookingService.getBookings();
	        if (bookings.isEmpty()) {
	            System.out.println("No bookings found.");
	        } else {
	            for (Booking booking : bookings) {
	                System.out.println(booking);
	            }
	        }
	    }
	}
	


