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
    
/**    
 * BAD METHOD: override supper class but can not use
      -> Solution: use overriding
      -> Don't need to Down Casting to use method from derived class b/c of Same name
 
    //method
    public void inputVase(){
        inputItem(); // super.inputItem(); // input value and creator from super()
        try{
            height = Validation.inputPositiveNumber("Input height: ");
            material = Validation.inputString("Input material: ");
        }catch(Exception e){}
    }
    
    public void outputVase(){
        outputItem();  // output value and creator from super()
        System.out.println("Height: " + height);
        System.out.println("Material: " + material);
    }
    * 
*/
    
    // protected: = default + derived class out package also can use
    // private in super class can not be overide
    // default: only use in package
    
    
    @Override
    public void inputItem(){
        try{
            super.inputItem(); // super.inputItem(); // input value and creator from super()
            height = Validation.inputPositiveNumber("Input height: ");
            material = Validation.inputString("Input material: ");
        }catch(Exception e){}
    }
    
    
    
    @Override
    public void outputItem(){
        super.outputItem();  // output value and creator from super()
        System.out.println("Height: " + height);
        System.out.println("Material: " + material);
    }

    @Override
    public String toString() {
        return super.toString() + "Vase{" + "height=" + height + ", material=" + material + '}';
    }
    
    
}// end Vase
