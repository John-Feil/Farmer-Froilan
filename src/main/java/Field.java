import java.util.ArrayList;

public class Field extends CropRow{
    //Arraylist of many crop row
    private ArrayList<CropRow> cropRowsInField;

    public Field(CropRow cropRows){
        this.cropRowsInField.add(cropRows);
    }
    public Field(CropRow cropRows,CropRow cropRows2,CropRow cropRows3,CropRow cropRows4,CropRow cropRows5){
        this.cropRowsInField.add(cropRows);
        this.cropRowsInField.add(cropRows2);
        this.cropRowsInField.add(cropRows3);
        this.cropRowsInField.add(cropRows4);
        this.cropRowsInField.add(cropRows5);
    }
    //getter for Field
    public ArrayList<CropRow> getField(){
        return this.cropRowsInField;
    }
    public void addCropRowToField(CropRow cropRow){
        this.cropRowsInField.add(cropRow);
    }
}
