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
    public void yield() {

    }

    @Override
    public void checkFertilized(boolean hasBeenFertilized) {

    }

    @Override
    public void checkHarvested(boolean hasBeenHarvested) {

    }
}
