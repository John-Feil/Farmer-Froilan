import java.util.ArrayList;

public class Stable {
    private ArrayList<Horse> horseInStable;

    public Stable(Horse [] horses){
        for (int i = 0; i < horses.length; i++){
            this.horseInStable.add(horses[i]);
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
