package dto;
import mylib.Validation;
/**
 *
 * @author raekyo
 */
public class Statue extends Item{
    private int weight;
    private String colour;
    
    public Statue(){
        this(0,"BLACK",0,"");
    }
    
    public Statue(int weight, String colour, int value, String creator){
        super(value,creator);
        this.weight = weight;
        this.colour = colour;
    }

    
    //weight
    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    // colour
    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }
    
    // BAD INPUT
//    public void inputStatue(){
//        inputItem();
//        try {
//            weight = Validation.inputPositiveNumber("Input weight: ");
//            colour = Validation.inputString("Input colour: ");
//        } catch (Exception e) {
//            System.out.println("Bad input!");
//        }
//    }
//    
//    public void outputStatue(){
//        outputItem();
//        System.out.println("Weight: " + weight);
//        System.out.println("Colour: " + colour);
//    }

    @Override
    public void outputItem() {
        super.outputItem();
        System.out.println("Weight: " + weight);
        System.out.println("Colour: " + colour);
    }

    @Override
    public void inputItem() {
        try {
            super.inputItem();
            weight = Validation.inputPositiveNumber("Input weight: ");
            colour = Validation.inputString("Input colour: ");
        } catch (Exception e) {
            System.out.println("Bad input!");
        }
    }

    @Override
    public String toString() {
        return "Statue{" + "weight=" + weight + ", colour=" + colour + '}';
    }
    
    
    
    
}// end Statue
