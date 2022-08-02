import java.util.ArrayList;

public class BusStop {

    private String location;
    private ArrayList <Person> passengers;

    public BusStop (String location){
        this.location = location;
        this.passengers = new ArrayList<>();
    }

    public int getOccupancy() {
        return passengers.size();
    }

    public void addPerson (Person person){
        passengers.add(person);
    }

    public Person removePerson(){
        if(passengers.size() > 0){
            return passengers.remove(0);
        }
        return null;

    }
    public void addPersonToBus(Bus bus){
        Person person = removePerson();
        if (person != null){
            bus.addPerson(person);
        }




    }
}
