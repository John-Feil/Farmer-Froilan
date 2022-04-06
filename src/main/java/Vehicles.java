public class Vehicles implements IRideable, INoiseMaker{
    @Override
    public String makeNoise() {
        return "Vroom Vroom";
    }
    //should be rideable
    //should make noise
}
