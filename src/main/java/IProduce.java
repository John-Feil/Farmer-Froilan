public interface IProduce {
    public void yield();
    ////will implement edible interface later on
    //will check on hasBeenFertilized and hasBeenHarvested values
    void checkFertilized (boolean hasBeenFertilized);
    void checkHarvested (boolean hasBeenHarvested);
}
