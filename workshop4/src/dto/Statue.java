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
    
    
    public void inputStatue(){
        inputItem();
        try {
            weight = Validation.inputPositiveNUmber("Input weight: ");
            colour = Validation.inputString("Input colour: ");
        } catch (Exception e) {
            System.out.println("Bad input!");
        }
    }
    
    public void outputStatue(){
        outputItem();
        System.out.println("Weight: " + weight);
        System.out.println("Colour: " + colour);
    }
}// end Statue
