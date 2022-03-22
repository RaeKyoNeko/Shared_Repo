package dto;
import mylib.Validation;
/**
 *
 * @author raekyo
 */
public class Vase extends Item{
    //field
    private int height;
    private String material;
    
    //constructor
    public Vase(){
        super(); // Java auto called this constructor
        height=0;
        material="";
    }
    
    public Vase(int value, String creator, int height, String material){
        super(value, creator); // indirect call super constructor
        this.height = height;
        this.material = material;
    }
    
    
    //getter & setter
    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }
    
    
    //method
    public void inputVase(){
        inputItem(); // super.inputItem(); // input value and creator from super()
        try{
            height = Validation.inputPositiveNUmber("Input height: ");
            material = Validation.inputString("Input material: ");
        }catch(Exception e){}
    }
    
    public void outputVase(){
        outputItem();  // output value and creator from super()
        System.out.println("Height: " + height);
        System.out.println("Material: " + material);
    }
}// end Vase
