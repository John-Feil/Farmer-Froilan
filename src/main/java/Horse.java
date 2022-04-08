public class Horse extends Animal implements IRideable{
    @Override
    public void eat(Edible object) {
        System.out.println("Horse eats");
    }

    @Override
    public String makeNoise() {
        return "Nay";
    }

    @Override
    public String toString() {
        return "Horse";
    }
}
