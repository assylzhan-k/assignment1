import java.util.ArrayList;

public class AirlineSystem {

    private ArrayList<Reservation> reservations = new ArrayList<>();

    public Reservation createReservation(Passenger passenger, Flight flight) {
        if (flight.bookSeat()) {
            String reservationId = "R" + (reservations.size() + 1);
            Reservation reservation =
                    new Reservation(reservationId, passenger, flight);
            reservations.add(reservation);
            return reservation;
        } else {
            System.out.println("No seats available on this flight!");
            return null;
        }
    }

    public void showReservations() {
        for (Reservation r : reservations) {
            System.out.println(r);
        }
    }
}
