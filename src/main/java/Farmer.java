public class Farmer extends Person implements IBotanist, IRider{
    @Override
    public void eat() {
        //Can eat edible object
    }
    @Override
    public String makeNoise() {
        return "Farmer noises!";
    }

    @Override
    public void plant() {
        //plant a crop in a croprow
    }
}
