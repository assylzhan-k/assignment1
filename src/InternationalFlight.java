public class InternationalFlight extends Flight {

    public InternationalFlight(String flightNumber, String from, String to, int totalSeats) {
        super(flightNumber, from, to, totalSeats);
    }

    @Override
    public double calculatePrice() {
        return 45000;
    }
}