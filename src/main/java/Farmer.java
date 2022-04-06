public class Farmer extends Person implements IBotanist, IRider{
    @Override
    public void eat(Edible object) {
        System.out.println("Farmer eats " + object);    }
    @Override
    public String makeNoise() {
        return "Farmer noises!";
    }

    @Override
    public void plant(CropRow cropRow, Crop crop) {
        System.out.println("Planting crop into crop row");
        //plant a crop in a croprow
    }

}
