import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusStopTest {


    BusStop busStop;
    Person person;

    @Before

    public void beforeEach(){
        busStop = new BusStop("Your House");
        person = new Person();
    }
    @Test
    public void startEmpty(){
        assertEquals(0, busStop.getOccupancy());
    }

    @Test
    public void addPerson(){
        busStop.addPerson(person);
        assertEquals(1, busStop.getOccupancy());
    }
    @Test
    public void removePerson(){
        busStop.addPerson(person);
        busStop.addPerson(person);
        busStop.removePerson();
        assertEquals(1, busStop.getOccupancy());
    }


}
