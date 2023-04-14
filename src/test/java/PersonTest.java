import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PersonTest {

    Person person;

    @Before
    public void before() {
        person = new Person ("Pete");
    }

    @Test
    public void hasName(){
        assertEquals("Pete", person.getName());
    }

}
