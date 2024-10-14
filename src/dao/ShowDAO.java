package dao;
import entity.Movie;
import entity.Show;

import java.util.ArrayList;
import java.util.List;
public class ShowDAO {
	private List<Show> shows = new ArrayList<>();

    public ShowDAO() {
        shows.add(new Show(new Movie("Avengers: Endgame", "Action"), "12:00 PM"));
        shows.add(new Show(new Movie("Inception", "Sci-Fi"), "03:00 PM"));
        shows.add(new Show(new Movie("Interstellar", "Sci-Fi"), "06:00 PM"));
    }

    public List<Show> getAllShows() {
        return shows;
    }

    public Show getShowByIndex(int index) {
        if (index >= 0 && index < shows.size()) {
            return shows.get(index);
        }
        return null;
    }

}
