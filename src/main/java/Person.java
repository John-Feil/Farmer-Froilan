public abstract class Person implements IEater, INoiseMaker {
    @Override
    public String makeNoise(){
        return("People sounds!");
    }
    @Override
    public void eat(){
        //Can eat edible object
    }
}
