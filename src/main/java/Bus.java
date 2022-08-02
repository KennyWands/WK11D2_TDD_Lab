import java.util.ArrayList;

public class Bus {

    private String destination;
    private int capacity;
    private ArrayList <Person> passengers;

    public Bus (String destination, int capacity){
        this.destination = destination;
        this.capacity = capacity;
        this.passengers = new ArrayList<>();

    }

    public int getOccupancy() {
        return passengers.size();
    }

    public void addPerson(Person person) {
        if(passengers.size() < capacity) {
            passengers.add(person);
        }
    }

    public void removePerson(Person person){
        if(passengers.size() > 0){
            passengers.remove(0);
        }
    }

    public void pickUp(BusStop busStop){
        Person person = busStop.removePerson();
        addPerson(person);
    }


}
