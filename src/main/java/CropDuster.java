public class CropDuster extends FarmVehicle implements IAircraft{
    @Override
    public void fly() {
        System.out.println("Crop duster can flyyyyyy");
    }
    public void fertilize(CropRow cropRow){
        System.out.println("Crop duster fertilizes crop row");
        //should fertilize crop row
    }
}
