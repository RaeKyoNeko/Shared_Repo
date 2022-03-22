package dto;

/**
 *
 * @author raekyo
 */
public class Square extends Rectangle {
    
    
    public Square(){
        super();
    }
    
    public Square(double side){
        super(side,side);
    }
    
    public Square(double side, String color, 
            boolean filled){
        super(side,side,color,filled);
    }
    
    
    // getter& setter
    
    // method
    public double getSide(){
        return super.getWidth();
    }
    
    @Override
    public void setWidth(double side){
        super.setWidth(side);
    }
    
    @Override
    public void setLength(double side){
        super.setWidth(side);
    }
    
    // QUESTION:why return type different -> ERROR
    @Override
    public String toString(){
        return "Side: " + super.getWidth();
    }
    
}// end Square
