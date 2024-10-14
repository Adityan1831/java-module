package services;
import dao.ShowDAO;
import entity.Booking;
import entity.Show;

import java.util.ArrayList;
import java.util.List;

public class BookingService {
	private ShowDAO showDAO;
    private List<Booking> bookings = new ArrayList<>();

    public BookingService() {
        showDAO = new ShowDAO();
    }

    public List<Show> getAvailableShows() {
        return showDAO.getAllShows();
    }

    public void bookTicket(int showIndex, String customerName) {
        Show show = showDAO.getShowByIndex(showIndex);
        if (show != null) {
            bookings.add(new Booking(show, customerName));
            System.out.println("Booking successful for " + customerName);
        } else {
            System.out.println("Invalid show selection!");
        }
    }

    public List<Booking> getBookings() {
        return bookings;
    }


}
