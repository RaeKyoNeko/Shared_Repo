package dto;

/**
 *
 * @author raekyo
 */
public class Shape {
    private String color;
    private boolean filled;
    
    public Shape(){
        color = "red";
        filled = true;
    }
    
    public Shape(String color, boolean isFilled){
        this.color = color;
        this.filled = isFilled;
    }
    
    public Shape(Shape s){
        this.color = s.color;
        this.filled = s.filled;
    }
    
    //getter & setter
    public String getColor(){
        return color;
    }
    
    public void setColor(String s){
        this.color = s;
    }
    
    public boolean isFilled(){
        return filled;
    }
    
    public void setFilled(boolean filled){
        this.filled = filled;
    }
    
    
    //method
    @Override
    public String toString(){
        return "Color: " + color + 
                ";Filled: " + filled;
    }
    
    
}// end Shape
