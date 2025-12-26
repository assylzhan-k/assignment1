public class Main {
    public static void main(String[] args) {

        Flight flight1 = new Flight("KC101", "Almaty", "Astana", 3);

        Passenger p1 = new Passenger("Aruzhan", "P123456");
        Passenger p2 = new Passenger("Miras", "P654321");

        AirlineSystem system = new AirlineSystem();

        Reservation r1 = system.createReservation(p1, flight1);
        Reservation r2 = system.createReservation(p2, flight1);

        System.out.println("\n=== All Reservations ===");
        system.showReservations();
    }
}