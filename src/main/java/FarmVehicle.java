public class FarmVehicle extends Vehicles{
    //should be able to operate on a farm
//    public Farm farm;
    public void operate(Farm farm){
        System.out.println("Operates");
    }

    @Override
    public String toString() {
        return "FarmVehicle";
    }
}
