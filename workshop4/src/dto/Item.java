package dto;
import mylib.Validation;
/**
 *
 * @author raekyo
 */
public class Item {
    //field 
    private int value;
    private String creator;
    
    //constructor
    Item(){
    }
    
    Item(int value, String creator){
        this.value = value;
        this.creator = creator;
    }
    
    
    //getter
    public int getValue() {
        return value;
    }

    public String getCreator() {
        return creator;
    }
    
    
    //setter
    public void setValue(int value) {
        this.value = value;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }
    
    
    //method
    /**
     * Input Value and creator
     */
    public void inputItem(){
        try{
            value = Validation.inputPositiveNUmber("Input value: ");
            creator = Validation.inputString("Input creator: ");
        }catch(Exception e){
            System.out.println("Bad input!");
        }
    }
    
    /**
     * Output Value and Creator
     */
    public void outputItem(){
        System.out.println("Value: " + value);
        System.out.println("Creator: " + creator);
    }
}// end Item
