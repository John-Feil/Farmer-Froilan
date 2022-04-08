import java.util.ArrayList;

public class ChickenCoop {
    private ArrayList<Chicken> chickenInCoop = new ArrayList<>();

    public ChickenCoop(Chicken [] chickens){
        for (Chicken chicken : chickens) {
            this.chickenInCoop.add(chicken);
        }
    }

    //getter for Field
    public ArrayList<Chicken> getChicken(){
        return this.chickenInCoop;
    }
    public void addChickenToCoop(Chicken chicken){
        this.chickenInCoop.add(chicken);
    }

    @Override
    public String toString() {
        return "ChickenCoop{" +
                "chickenInCoop=" + chickenInCoop +
                '}';
    }

    //connect to chicken
}
