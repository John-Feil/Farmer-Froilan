import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Farmer Froilan = new Farmer();
        Farm Farm1 = new Farm();


        ArrayList <CropRow> cropRows = new ArrayList<>();
        Field field1 = new Field();
        for (int i = 0; i <= 5;i++ ){
            switch (i) {
                case 1:
                     CropRow corn = new CropRow ();
                     cropRows.add (corn);
                     break;

                case 2:
                    CropRow tomato = new CropRow ();
                    cropRows.add (tomato);
                    break;

                case 3:
                    CropRow pumpkin  = new CropRow ();
                    cropRows.add (pumpkin);
                    break;

                case 4:
                    CropRow watermelon  = new CropRow ();
                    cropRows.add (watermelon);
                    break;

                case 5:
                    CropRow lettuce  = new CropRow ();
                    cropRows.add (lettuce);
                    break;








            }
        }



    }
}
