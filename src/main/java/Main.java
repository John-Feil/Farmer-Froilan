public class Main {
    public static void main(String[] args) {
        Farmer froilan = new Farmer();

        // Creating Crop objects
        Crop corn = new EarCorn(), tomato = new Tomato(),wheat = new ArbitraryVegetation();
        Crop weeds = new ArbitraryVegetation(),melon = new ArbitraryVegetation();

        // Creating cropRows
        CropRow cropRow1 = new CropRow(),cropRow2 = new CropRow(),cropRow3 = new CropRow();
        CropRow cropRow4 = new CropRow(),cropRow5 = new CropRow() ;

        cropRow1.addCropsToCropRow(corn);
        cropRow2.addCropsToCropRow(tomato);
        cropRow3.addCropsToCropRow(wheat);
        cropRow4.addCropsToCropRow(weeds);
        cropRow5.addCropsToCropRow(melon);

        //Creating field
        Field field1 = new Field(cropRow1,cropRow2,cropRow3,cropRow4,cropRow5);

        FarmVehicle farmVehicle1 = new FarmVehicle();
        FarmVehicle farmVehicle2 = new FarmVehicle();

        CropDuster cropDuster1 = new CropDuster();

        Pilot froilanda = new Pilot();
        froilanda.usesAircraft(cropDuster1);

        FarmHouse farmHouse = new FarmHouse();
        farmHouse.addPersonToFarmHouse(froilanda);
        farmHouse.addPersonToFarmHouse(froilan);

        //Creating chicken objects
        Chicken chicken1 = new Chicken(),chicken2 = new Chicken(),chicken3 = new Chicken();
        Chicken chicken4 = new Chicken(),chicken5 = new Chicken(),chicken6 = new Chicken();
        Chicken chicken7 = new Chicken(),chicken8 = new Chicken(),chicken9 = new Chicken();
        Chicken chicken10 = new Chicken(),chicken11 = new Chicken(),chicken12 = new Chicken();
        Chicken chicken13 = new Chicken(),chicken14 = new Chicken(),chicken15 = new Chicken();

        // Making chicken arrays for easier insertion into coop
        Chicken [] chickenCoopArr1 = new Chicken[4], chickenCoopArr2 = new Chicken[4];
        Chicken [] chickenCoopArr3 = new Chicken[4], chickenCoopArr4 = new Chicken[4];

        // Adding chickens to arrays
        chickenCoopArr1[0] = chicken1; chickenCoopArr1[1] = chicken2; chickenCoopArr1[2] = chicken3;
        chickenCoopArr1[3] = chicken4; chickenCoopArr2[0] = chicken5; chickenCoopArr2[1] = chicken6;
        chickenCoopArr2[2] = chicken7; chickenCoopArr2[3] = chicken8; chickenCoopArr3[0] = chicken9;
        chickenCoopArr3[1] = chicken10; chickenCoopArr3[2] = chicken11; chickenCoopArr3[3] = chicken12;
        chickenCoopArr4[0] = chicken13; chickenCoopArr4[1] = chicken14; chickenCoopArr4[2] = chicken15;

        //Making ChickenCoop objects with chickens
        ChickenCoop chickenCoop1 = new ChickenCoop(chickenCoopArr1);
        ChickenCoop chickenCoop2 = new ChickenCoop(chickenCoopArr2);
        ChickenCoop chickenCoop3 = new ChickenCoop(chickenCoopArr3);
        ChickenCoop chickenCoop4 = new ChickenCoop(chickenCoopArr4);

        ChickenCoop[] chickenCoopsArr = new ChickenCoop[4];
        chickenCoopsArr[0] = chickenCoop1;
        chickenCoopsArr[1] = chickenCoop2;
        chickenCoopsArr[2] = chickenCoop3;
        chickenCoopsArr[3] = chickenCoop4;

        //Creating horse objects
        Horse horse1 = new Horse(),horse2 = new Horse(),horse3 = new Horse(),horse4 = new Horse();
        Horse horse5 = new Horse(),horse6 = new Horse(),horse7 = new Horse(),horse8 = new Horse();
        Horse horse9 = new Horse(),horse10 = new Horse();

        //Making arrays to hold horses
        Horse [] horseStable1 = new Horse[4]; Horse [] horseStable2 = new Horse[4];
        Horse [] horseStable3 = new Horse[4];

        //Assigning horses to arrays
        horseStable1[0] = horse1; horseStable1[1] = horse2; horseStable1[2] = horse3; horseStable1[3] = horse4;
        horseStable2[0] = horse5; horseStable2[1] = horse6; horseStable2[2] = horse7; horseStable2[3] = horse8;
        horseStable3[1] = horse9; horseStable3[2] = horse10;

        //Making stables with horses
        Stable Stable1 = new Stable(horseStable1);
        Stable Stable2 = new Stable(horseStable2);
        Stable Stable3 = new Stable(horseStable3);

        Stable [] stablesArr = new Stable[3];
        stablesArr[0] = Stable1;
        stablesArr[1] = Stable2;
        stablesArr[2] = Stable3;

        //Making farm
        Farm Farm1 = new Farm(stablesArr,chickenCoopsArr,farmHouse);
        Farm1.addField(field1);
        Farm1.addVehicle(farmVehicle1);
        Farm1.addVehicle(farmVehicle2);
        Farm1.addVehicle(cropDuster1);
    }
}