public abstract class Person implements IEater, INoiseMaker {
    @Override
    public String makeNoise(){
        return("People sounds!");
    }
    @Override
    public void eat(Edible object) {
        System.out.println("Eats " + object);

    }
}
