import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Farmer Froilan = new Farmer();
        Farm Farm1 = new Farm();


        ArrayList<CropRow> cropRows = new ArrayList<>();
        Field field1 = new Field();
        for (int i = 0; i <= 5; i++) {
            switch (i) {
                case 1:
                    CropRow corn = new CropRow();
                    cropRows.add(corn);
                    break;

                case 2:
                    CropRow tomato = new CropRow();
                    cropRows.add(tomato);
                    break;

                case 3:
                    CropRow pumpkin = new CropRow();
                    cropRows.add(pumpkin);
                    break;

                case 4:
                    CropRow watermelon = new CropRow();
                    cropRows.add(watermelon);
                    break;

                case 5:
                    CropRow lettuce = new CropRow();
                    cropRows.add(lettuce);
                    break;
            }
        }
        FarmVehicle farmVehicle1 = new FarmVehicle();
        FarmVehicle farmVehicle2 = new FarmVehicle();

        CropDuster cropDuster1 = new CropDuster();

        Pilot Froilanda = new Pilot();
        Froilanda.usesAircraft(cropDuster1);

        ArrayList<Chicken> chickenCoops = new ArrayList<>();

        for (int i = 0; i <= 4; i++) {
            switch (i) {
                case 1:
                    ChickenCoop chickencoop1 = new ChickenCoop();
                    Chicken chicken1 = new Chicken(), chicken2 = new Chicken(), chicken3 = new Chicken(), chicken4 = new Chicken();
                    chickenCoops.add(chicken1);
                    chickenCoops.add(chicken2);
                    chickenCoops.add(chicken3);
                    chickenCoops.add(chicken4);

                    break;
                case 2:
                    ChickenCoop chickencoop2 = new ChickenCoop();
                    Chicken chicken5 = new Chicken(), chicken6 = new Chicken(), chicken7 = new Chicken(), chicken8 = new Chicken();
                    chickenCoops.add(chicken5);
                    chickenCoops.add(chicken6);
                    chickenCoops.add(chicken7);
                    chickenCoops.add(chicken8);
                    break;

                case 3:
                    ChickenCoop chickencoop3 = new ChickenCoop();
                    Chicken chicken9 = new Chicken(), chicken10 = new Chicken(), chicken11 = new Chicken(), chicken12 = new Chicken();
                    chickenCoops.add(chicken9);
                    chickenCoops.add(chicken10);
                    chickenCoops.add(chicken11);
                    chickenCoops.add(chicken12);
                    break;

                case 4:
                    ChickenCoop chickencoop4 = new ChickenCoop();
                    Chicken chicken13 = new Chicken(), chicken14 = new Chicken(), chicken15 = new Chicken();
                    chickenCoops.add(chicken13);
                    chickenCoops.add(chicken14);
                    chickenCoops.add(chicken15);
                    break;


            }
            ArrayList<Horse> stable = new ArrayList<>();
            for (int x = 0; x <= 3; x++) {
                switch (x) {
                    case 1:
                        Stable stable1 = new Stable();
                        Horse horse1 = new Horse(), horse2 = new Horse(), horse3 = new Horse(), horse4 = new Horse();
                        stable.add(horse1);
                        stable.add(horse2);
                        stable.add(horse3);
                        stable.add(horse4);
                        break;
                    case 2:
                        Stable stable2 = new Stable();
                        Horse horse5 = new Horse(), horse6 = new Horse(), horse7 = new Horse(), horse8 = new Horse();
                        stable.add(horse5);
                        stable.add(horse6);
                        stable.add(horse7);
                        stable.add(horse8);
                        break;
                    case 3:
                        Stable stable3 = new Stable();
                        Horse horse9 = new Horse(), horse10 = new Horse();
                        stable.add(horse9);
                        stable.add(horse10);
                        break;


                }


            }
        }
    }
}