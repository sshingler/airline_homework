import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PilotTest {

    Pilot pilot;

    @Before
    public void Setup(){
        pilot = new Pilot ("Sally", Rank.captain, "ABC123");
    }

    @Test
    public void canGetName(){
        assertEquals("Sally", pilot.getName());
    }

    @Test
    public void canGetRank(){
        assertEquals(Rank.captain, pilot.getRank());
    }

    @Test
    public void canGetLicenceNo(){
        assertEquals("ABC123", pilot.getLicenceNo());
    }


}
