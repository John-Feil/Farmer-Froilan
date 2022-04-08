import java.util.ArrayList;

public class Farm {
    private Stable[] stable;
    private ChickenCoop[] chickenCoop;
    private FarmHouse farmHouse;
    private Field field;
    private ArrayList<FarmVehicle> vehiclesInFarm;

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

}
