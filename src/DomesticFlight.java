public class DomesticFlight extends Flight {

    public DomesticFlight(String flightNumber, String from, String to, int totalSeats) {
        super(flightNumber, from, to, totalSeats);
    }

    @Override
    public double calculatePrice() {
        return 15000;
    }
}