package dto;

/**
 *
 * @author raekyo
 */
public class BeeColony extends Colony implements Role{
    
    String type;
    
    public BeeColony(){}
    
    public BeeColony(int size, String place, String type){
        super(size,place);
        this.type = type;
    }
    
    
    // getter & setter
    public void setType(String type){
        this.type = type;
    }
    
    public String getType(){
        return type;
    }
    
    
    // method
    @Override
    public String toString(){
        return "the colony type is " + type + ", size is about " + size + ", and place is " +
                place;
    }

    @Override
    public void createWorker() {
        System.out.println("Worker bees perform all the work of the bees");
    }
    
}
