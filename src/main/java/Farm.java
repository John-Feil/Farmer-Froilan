import java.util.ArrayList;
import java.util.Arrays;

public class Farm {
    private Stable[] stable;
    private ChickenCoop[] chickenCoop;
    private FarmHouse farmHouse;
    private Field field;
    private ArrayList<FarmVehicle> vehiclesInFarm = new ArrayList<>();

    public Farm(Stable [] stables, ChickenCoop [] chickenCoop, FarmHouse farmHouse ){
        this.stable = stables;
        this.chickenCoop = chickenCoop;
        this.farmHouse = farmHouse;
    }
    public void addField(Field field){
        this.field = field;
    }
    public void addVehicle (FarmVehicle vehicle){
        this.vehiclesInFarm.add(vehicle);
    }

    @Override
    public String toString() {
        return "Farm{" +
                "stable=" + Arrays.toString(stable) + '\n' +
                " chickenCoop=" + Arrays.toString(chickenCoop) + '\n' +
                " farmHouse=" + farmHouse + '\n' +
                " field=" + field + '\n' +
                " vehiclesInFarm=" + vehiclesInFarm;
    }
}
