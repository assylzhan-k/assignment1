public abstract class Flight {

    protected String flightNumber;
    protected String from;
    protected String to;
    protected int totalSeats;
    protected int bookedSeats;

    public Flight(String flightNumber, String from, String to, int totalSeats) {
        this.flightNumber = flightNumber;
        this.from = from;
        this.to = to;
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

    public int getAvailableSeats() {
        return totalSeats - bookedSeats;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public abstract double calculatePrice();

    @Override
    public String toString() {
        return flightNumber + " (" + from + " → " + to +
                "), seats: " + bookedSeats + "/" + totalSeats;
    }
}