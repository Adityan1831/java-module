package entity;

public class Show {
	 private Movie movie;
	    private String showTime;

	    public Show(Movie movie, String showTime) {
	        this.movie = movie;
	        this.showTime = showTime;
	    }

	    public Movie getMovie() {
	        return movie;
	    }

	    public String getShowTime() {
	        return showTime;
	    }

	    @Override
	    public String toString() {
	        return "Show{" +
	                "movie=" + movie +
	                ", showTime='" + showTime + '\'' +
	                '}';
	    }

}
