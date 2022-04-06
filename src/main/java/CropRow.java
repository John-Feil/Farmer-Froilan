public class CropRow extends Crop{
    //croprow stores crops
    public Crop[] crops;
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
