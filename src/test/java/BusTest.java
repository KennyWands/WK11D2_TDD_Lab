import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusTest {
    Bus bus;
    Person person;
    BusStop busStop;

    @Before
    public void beforeEach(){
        bus = new Bus("Train Station", 2);
        busStop = new BusStop("Your House");
        person = new Person();
    }

    @Test
    public void startEmpty(){
        assertEquals(0, bus.getOccupancy());
    }

    @Test
    public void getPassengerNumberUnderCapacity(){
        bus.addPerson(person);
        bus.addPerson(person);
        assertEquals(2, bus.getOccupancy());
    }
    @Test
    public void getPassengerNumberOverCapacity(){
        bus.addPerson(person);
        bus.addPerson(person);
        bus.addPerson(person);
        assertEquals(2, bus.getOccupancy());
    }

    @Test
    public void removePassenger(){
        bus.addPerson(person);
        bus.addPerson(person);
        bus.removePerson(person);
        assertEquals(1, bus.getOccupancy());
    }
    @Test
    public void GetPassengerFromStop(){

    }
}
