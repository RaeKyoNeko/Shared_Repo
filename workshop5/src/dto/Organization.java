package dto;

/**
 *
 * @author raekyo
 */
public abstract class Organization {
    protected int size;
    
    public Organization(){}
    
    public Organization(int size){
        this.size = size;
    }
    
    //getter
    public int getSize(){
        return size;
    }
    
    //setter
    public void setSize(int size){
        this.size = size;
    }
    
    
    //method
    public abstract void communicateByTool();
    
    @Override
    public String toString(){
        return "the organization's size is " + size;
    }
}


