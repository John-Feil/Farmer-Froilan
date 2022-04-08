import java.util.ArrayList;

public class Stable {
    private ArrayList<Horse> horseInStable;

    public Stable(Horse [] horses){
        for (Horse hors : horses) {
            this.horseInStable.add(hors);
        }
    }

    //getter for Field
    public ArrayList<Horse> getHorse(){
        return this.horseInStable;
    }
    public void addHorseToStable(Horse horse){
        this.horseInStable.add(horse);
    }

    //connect to horse
}
