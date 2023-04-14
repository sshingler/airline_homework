import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PassengerTest {

    Passenger passenger;

    @Before
    public void Setup() {
        passenger = new Passenger("Pete", 2);
    }

    @Test
    public void canGetName(){
        assertEquals("Pete", passenger.getName());
    }

    @Test
    public void canGetNumberOfBags(){
        assertEquals(2, passenger.getNumberOfBags());
    }
}
