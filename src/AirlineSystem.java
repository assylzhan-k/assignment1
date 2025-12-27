import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class AirlineSystem {

    private ArrayList<Flight> flights = new ArrayList<>();
    private ArrayList<Reservation> reservations = new ArrayList<>();

    public void addFlight(Flight flight) {
        flights.add(flight);
    }
    public Reservation createReservation(Passenger passenger, Flight flight) {
        if (flight.bookSeat()) {
            String id = "R" + (reservations.size() + 1);
            Reservation r = new Reservation(id, passenger, flight);
            reservations.add(r);
            return r;
        }
        return null;
    }
    public Flight findFlightByNumber(String flightNumber) {
        for (Flight f : flights) {
            if (f.getFlightNumber().equals(flightNumber)) {
                return f;
            }
        }
        return null;
    }
    public ArrayList<Reservation> filterByPassport(String passport) {
        ArrayList<Reservation> result = new ArrayList<>();
        for (Reservation r : reservations) {
            if (r.getPassenger().getPassportNumber().equals(passport)) {
                result.add(r);
            }
        }
        return result;
    }
    public void sortFlightsByAvailableSeats() {
        Collections.sort(flights, Comparator.comparingInt(Flight::getAvailableSeats));
    }
    public void showFlights() {
        for (Flight f : flights) {
            System.out.println(f);
        }
    }
}