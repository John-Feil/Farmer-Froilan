import java.util.ArrayList;

public class Field extends CropRow{
    //Arraylist of many crop row
    private ArrayList<CropRow> cropRows;

    public void field(ArrayList<CropRow> cropRows){
        this.cropRows = cropRows;
    }
    //getter for Field
    public ArrayList<CropRow> getField(){
        return cropRows;
    }
}
