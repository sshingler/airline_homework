import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CabinCrewMemberTest {

    CabinCrewMember cabinCrewMember;

    @Before
    public void Setup() {
        cabinCrewMember = new CabinCrewMember("Holly", Rank.flightAttendant);
    }

    @Test
    public void canGetName(){
        assertEquals("Holly", cabinCrewMember.getName());
    }

    @Test
    public void canGetRank(){
        assertEquals(Rank.flightAttendant, cabinCrewMember.getRank());
    }

    @Test
    public void canRelayMessages(){
        assertEquals("Hold on tight!", cabinCrewMember.relayMessage());
    }




}
