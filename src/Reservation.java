public class Reservation {
    private Passenger passenger;
    private Flight flight;
    private String reservationId;

    public Reservation(String reservationId, Passenger passenger, Flight flight) {
        this.reservationId = reservationId;
        this.passenger = passenger;
        this.flight = flight;
    }

    public Passenger getPassenger() {
        return passenger;
    }

    @Override
    public String toString() {
        return "Reservation ID: " + reservationId +
                "\n" + passenger +
                "\n" + flight;
    }
}
