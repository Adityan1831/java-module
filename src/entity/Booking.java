package entity;

public class Booking {
	private Show show;
    private String customerName;

    public Booking(Show show, String customerName) {
        this.show = show;
        this.customerName = customerName;
    }

    public Show getShow() {
        return show;
    }

    public String getCustomerName() {
        return customerName;
    }

    @Override
    public String toString() {
        return "Booking{" +
                "show=" + show +
                ", customerName='" + customerName + '\'' +
                '}';
    }

}
