import java.util.ArrayList;

public class FarmHouse {
    private ArrayList<Person> peopleInFarmHouse;

    public ArrayList<Person> getPeopleInFarmHouse(){
        return this.peopleInFarmHouse;
    }
    public void addPersonToFarmHouse(Person person){
        this.peopleInFarmHouse.add(person);
    }
}
