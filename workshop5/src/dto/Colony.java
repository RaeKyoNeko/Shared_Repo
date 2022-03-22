package dto;

/**
 *
 * @author raekyo
 */
public class Colony extends Organization {
    protected String place; // ocean-land
    
    public Colony(){}
    
    public Colony(int size, String place){
        super(size);
        if(place.equalsIgnoreCase("ocean") || place.equalsIgnoreCase("land"))
            this.place = place;
    }
    
    public void grow(){
        System.out.println("the annual circle of growth that begins in spring");
    }
    
    public void reproduce(){
        System.out.println("Colony can reproduce itself through a process");
    }
    
    
    @Override
    public void communicateByTool() {
        System.out.println("the colony communicate by sound");
    }
    
    
    @Override
    public String toString(){
        return "the colony size is " + size + ",the colony's place is " + place;
    }
    
    
}
