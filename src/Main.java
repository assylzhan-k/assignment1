public class Main {

    public static void main(String[] args) {

        AirlineSystem system = new AirlineSystem();

        Flight f1 = new DomesticFlight("KC101", "Almaty", "Astana", 3);
        Flight f2 = new InternationalFlight("KC202", "Almaty", "Dubai", 2);

        system.addFlight(f1);
        system.addFlight(f2);

        Passenger p1 = new Passenger("Aruzhan", "P123");
        Passenger p2 = new Passenger("Miras", "P456");

        system.createReservation(p1, f1);
        system.createReservation(p2, f2);

        System.out.println("=== Flights ===");
        system.showFlights();

        System.out.println("\n=== Search Flight ===");
        System.out.println(system.findFlightByNumber("KC101"));

        System.out.println("\n=== Filter Reservations ===");
        System.out.println(system.filterByPassport("P123"));
    }
}