public class CornStalk extends Crop{

    @Override
    public void yield(Edible edible) {
        System.out.println("Yummy Corn");
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
            System.out.println(" Corn is fertilized ");
        }
        else {
            System.out.println("Not fertilized Corn");
        }

    }
}
