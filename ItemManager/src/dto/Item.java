package dto;
import mylib.Validation;
/**
 *
 * @author raekyo
 */
public class Item implements Comparable<Item>{
    //field 
    private int value;
    private String creator;
    
    //constructor
    Item(){
        value=0;
        creator="";
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
            value = Validation.inputPositiveNumber("Input value: ");
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


    @Override
    public String toString() {
        return "Item{" + "value=" + value + ", creator=" + creator + '}';
    }

    @Override
    public int compareTo(Item t) {
        if(value > t.getValue()) return 1;
        else if(value < t.getValue()) return -1;
        return 0;
    }
    
    
}// end Item
