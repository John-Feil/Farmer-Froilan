import java.util.ArrayList;

public class CropRow extends Crop{
    //croprow stores crops
    private ArrayList<Crop> cropsInCropRow;

    public CropRow(ArrayList<Crop> crops){
        this.cropsInCropRow = crops;
    }

    public CropRow(){

    }
    //getter for Field
    public ArrayList<Crop> getCropRow(){
        return this.cropsInCropRow;
    }
    public void addCropsToCropRow(Crop crop){
        this.cropsInCropRow.add(crop);
    }

    @Override
    public void yield(Edible edible) {
        System.out.println("Yield Crops");
    }

    @Override
    public void checkFertilized(boolean hasBeenFertilized) {
    if (hasBeenFertilized) {
        System.out.println("Is fertilized ");
    }
    else {
        System.out.println("Not fertilized ");
    }
    }

    @Override
    public void checkHarvested(boolean hasBeenHarvested) {
        if (hasBeenHarvested) {
            System.out.println("Is Harvested ");
        }
        else {
            System.out.println("Not Harvested ");
        }
    }
}
