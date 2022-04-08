public class Chicken extends Animal implements IProduce{
    public void name(){}


    @Override
    public void eat(Edible object) {
        System.out.println("Chicken eats");
    }

    @Override
    public String makeNoise() {
        return "Cluck Cluck";
    }

    @Override
    public void yield(Edible edible) {
        System.out.println("Makes an egg");
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
            System.out.println("Got egg ");
        }
        else {
            System.out.println("Not Harvested Egg ");
        }

    }

    @Override
    public String toString() {
        return "Chicken";
    }
}
