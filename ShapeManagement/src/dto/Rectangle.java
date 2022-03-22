package dto;

/**
 *
 * @author raekyo
 */
public class Rectangle extends Shape {
    private double width;
    private double length;
    
    public Rectangle(){
        width = 0.0;
        length = 0.0;
    }
    
    public Rectangle(double width, double length){
        this.width = width;
        this.length = length;
    }
    
    public Rectangle(double width, String color, boolean filled){
        super(color,filled);
        this.width = width;
        this.length = width;
    }
    
    public Rectangle(double width, double length, String color, boolean filled){
        super(color,filled);
        this.width = width;
        this.length = length;
    }
    
    public Rectangle(Rectangle r){
        super(r.getColor(), r.isFilled());
        width = r.width;
        length = r.length;
    }
    
    
    //getter & setter
    public double getWidth(){
        return width;
    }
    
    public double getLength(){
        return length;
    }
    
    public void setWidth(double width){
        this.width = width;
    }
    
    public void setLength(double length){
        this.length = length;
    }


    //method
    public double getArea(){
        return  width*length;
    }
    
    public double getPerimeter(){
        return 2*(width + length);
    }
    
    @Override
    public String toString(){
        return super.toString() +
                ";Width: " + width + 
                ";Length: " + length + 
                ";Perimeter: " + getPerimeter() +
                ";Area: " + getArea();
    }
}// end Rectangle
    

