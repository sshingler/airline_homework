import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class FlightTest {

    Flight flight;
    Pilot pilot;
    Plane plane;
    CabinCrewMember cabinCrewMember1;
    CabinCrewMember cabinCrewMember2;
    Passenger passenger1;
    Passenger passenger2;


    @Before
    public void Setup() {
        pilot = new Pilot("Sally", Rank.captain, "ABC123");
        plane = new Plane(PlaneType.AIRBUSA380);
        cabinCrewMember1 = new CabinCrewMember("Holly", Rank.flightAttendant);
        cabinCrewMember2 = new CabinCrewMember("George", Rank.flightAttendant);
        passenger1 = new Passenger("Fred", 2);
        passenger2 = new Passenger("Sarah", 3);
        flight = new Flight (plane, "FN123", "DesParis", "DeptInv", "DT0800");

    }

    @Test
    public void canAddPlane (){
        assertEquals(plane, flight.getPlane());
    }
    @Test
    public void canAddFlightNumber(){
        assertEquals("FN123", flight.getFlightNumber());
    }

    @Test
    public void canAddDestination(){
        assertEquals("DesParis", flight.getDestinationAirport());
    }

    @Test
    public void canAddDepartureAirport(){
        assertEquals("DeptInv", flight.getDepartureAirport());
    }

    @Test
    public void canAddDepartureTime(){
        assertEquals("DT0800", flight.getDepartureTime());
    }

    @Test
    public void canAddPilot (){
        flight.setPilot(pilot);
        assertEquals(pilot, flight.getPilot());
    }

    @Test
    public void canAddCrewMembers(){
        ArrayList<CabinCrewMember> expected = new ArrayList<>(Arrays.asList(cabinCrewMember1, cabinCrewMember2));
        flight.addCrew(cabinCrewMember1, cabinCrewMember2);
        assertEquals(expected, flight.getCrew());
    }

    @Test
    public void canAddPassengers(){
        ArrayList<Passenger> expected = new ArrayList<>(Arrays.asList(passenger1, passenger2));
        flight.addPassengers(passenger1, passenger2);
        assertEquals(expected, flight.getPassengers());
    }

    @Test
    public void canGetNumberOfBags(){
        flight.addPassenger(passenger1);
        flight.addPassenger(passenger2);
        assertEquals(5, flight.getNumberOfBags());
    }


}
