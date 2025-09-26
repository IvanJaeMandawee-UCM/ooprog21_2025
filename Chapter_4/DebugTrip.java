
// A Trip has three constructors
// When one argument is passed,
// it is the trip destination
// When two arguments are passed,
// they are the destination and departure cities
// When three arguments are passed,
// the last one is the mode of transportation for the trip
// Save this as DebugTrip.java in the same directory

public class DebugTrip {
    private String destination;
    private String departureCity;
    private String mode;

    private final String DEFAULT_DEPARTURE = "Unknown";
    private final String DEFAULT_MODE = "Car";

    public DebugTrip(String destination) {
        this.destination = destination;
        this.departureCity = DEFAULT_DEPARTURE;
        this.mode = DEFAULT_MODE;
    }

    public DebugTrip(String destination, String departureCity) {
        this.destination = destination;
        this.departureCity = departureCity;
        this.mode = DEFAULT_MODE;
    }

    public DebugTrip(String destination, String departureCity, String mode) {
        this.destination = destination;
        this.departureCity = departureCity;
        this.mode = mode;
    }

    public String getDestination() {
        return destination;
    }

    public String getDepartureCity() {
        return departureCity;
    }

    public String getMode() {
        return mode;
    }
}
