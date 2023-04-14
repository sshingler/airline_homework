import java.util.ArrayList;
import java.util.List;

public class Flight {

    private Pilot pilot;
    private Plane plane;
    private String flightNumber;
    private String destination;
    private String departureAirport;
    private String departureTime;

    private ArrayList<CabinCrewMember> cabinCrew = new ArrayList<>();
    private ArrayList<Passenger> passengers = new ArrayList<>();

    public Flight (Plane plane, String flightNumber, String destination, String departureAirport, String departureTime){
        this.plane = plane;
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.departureAirport = departureAirport;
        this.departureTime = departureTime;
        this.passengers = new ArrayList<>();

    }

    public void setPilot(Pilot pilot) {
        this.pilot = pilot;
    }

    public Pilot getPilot() {
        return pilot;
    }
}
