package dto;
import mylib.Validation;
/**
 *
 * @author raekyo
 */
public class Painting extends Item{
    private int weight, height;
    private boolean isWatercolour;
    private boolean isFramed;
    
    public Painting(){
        this(0,0,false,false,0,"");
    }
    
    public Painting(int weight, int height, boolean isWatercolour, 
            boolean isFramed, int value, String creator){
        super(value, creator);
        this.weight = weight;
        this.height = height;
        this.isWatercolour = isWatercolour;
        this.isFramed = isFramed;
    }
    
    
    //weight
    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    //height
    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    //isWatercolour
    public boolean isIsWatercolour() {
        return isWatercolour;
    }

    public void setIsWatercolour(boolean isWatercolour) {
        this.isWatercolour = isWatercolour;
    }

    //isFramed
    public boolean isIsFramed() {
        return isFramed;
    }

    public void setIsFramed(boolean isFramed) {
        this.isFramed = isFramed;
    }
    
    
    
    public void inputPainting(){
        inputItem();
        try {
            weight = Validation.inputPositiveNUmber("Input weight: ");
            height = Validation.inputPositiveNUmber("Input height: ");
            isWatercolour = Validation.inputBoolean("Water colour(T/F): ");
            isFramed = Validation.inputBoolean("Framed(T/F): ");
        } catch (Exception e) {
        }
    }
    
    public void outputPainting(){
        outputItem();
        System.out.println("Weight: " + weight);
        System.out.println("Height: " + height);
        System.out.println("Water colour: " + isWatercolour);
        System.out.println("Framed: " + isFramed);
    }
}// end Painting
