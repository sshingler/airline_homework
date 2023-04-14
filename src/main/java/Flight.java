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

    public Plane getPlane() {
        return plane;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public String getDestinationAirport() {
        return destination;
    }

    public String getDepartureAirport() {
        return departureAirport;
    }

    public String getDepartureTime(){
        return departureTime;
    }

    public void addCrew(CabinCrewMember...crewMembers) {
        this.cabinCrew.addAll(List.of(crewMembers));
    }

    public ArrayList<CabinCrewMember> getCrew() {
        return cabinCrew;
    }

    public void addPassengers(Passenger...passengers){
        this.passengers.addAll(List.of(passengers));
    }
    public ArrayList<Passenger> getPassengers(){
        return passengers;
    }

    public int getNumberOfPassengers(){
        return this.passengers.size();
    }

    public int getNumberOfBags(){
        int total =0;
        for (Passenger passenger : passengers){
            total += passenger.getNumberOfBags();
        }
        return total;
    }

    public int availableSeats(){
        int capacity = this.plane.getType().getCapacity();
        return capacity - getNumberOfPassengers();
    }

    public void addPassenger (Passenger passenger){
        if(availableSeats() > 0){
            this.passengers.add(passenger);
        }
    }
}
