public class Passenger {

    private String name;
    private String passportNumber;
    public Passenger(String name, String passportNumber) {
        this.name = name;
        this.passportNumber = passportNumber;
    }
    public String getPassportNumber() {
        return passportNumber;
    }
    public String getName() {
        return name;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Passenger)) return false;
        Passenger p = (Passenger) o;
        return passportNumber.equals(p.passportNumber);
    }
    @Override
    public int hashCode() {
        return passportNumber.hashCode();
    }
    @Override
    public String toString() {
        return name + " (Passport: " + passportNumber + ")";
    }
}
