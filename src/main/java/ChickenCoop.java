import java.util.ArrayList;

public class ChickenCoop {
    private ArrayList<Chicken> chickenInCoop;

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

    //connect to chicken
}
