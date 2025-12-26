public class Flight {
    private String flightNumber;
    private String departureCity;
    private String arrivalCity;
    private int totalSeats;
    private int bookedSeats;

    public Flight(String flightNumber, String departureCity, String arrivalCity, int totalSeats) {
        this.flightNumber = flightNumber;
        this.departureCity = departureCity;
        this.arrivalCity = arrivalCity;
        this.totalSeats = totalSeats;
        this.bookedSeats = 0;
    }

    public boolean bookSeat() {
        if (bookedSeats < totalSeats) {
            bookedSeats++;
            return true;
        }
        return false;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    @Override
    public String toString() {
        return "Flight: " + flightNumber +
                " | From: " + departureCity +
                " | To: " + arrivalCity +
                " | Seats: " + bookedSeats + "/" + totalSeats;
    }
}
