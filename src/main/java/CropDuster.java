public class CropDuster extends FarmVehicle implements IAircraft{
    @Override
    public void fly() {

    }
    public void fertilize(CropRow cropRow){
        System.out.println("Crop duster fertilizes crop row");
        //should fertilize crop row
    }
}
