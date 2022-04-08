import java.util.ArrayList;

public class ChickenCoop {
    private ArrayList<Chicken> chickenInCoop;

    public ChickenCoop(Chicken [] chickens){
        for (int i = 0; i < chickens.length; i++){
            this.chickenInCoop.add(chickens[i]);
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
