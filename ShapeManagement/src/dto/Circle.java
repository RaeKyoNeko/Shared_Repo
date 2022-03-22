package dto;

/**
 *
 * @author raekyo
 */
public class Circle extends Shape {
    private double radius;
    
    public Circle(){
        radius = 1.0;
    }
    
    public Circle(double radius){
        this.radius = radius;
    }
    
    public Circle(double radius, String color, boolean filled){
        super(color,filled);
        this.radius = radius;
    }
    
    public Circle(Circle c){
        super(c.getColor(),c.isFilled());
        this.radius = radius;
    }
    
    
    // getter & setter
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    
    
    
    // method
    public double getPerimeter(){
        return (2*Math.PI*radius);
    }
    
    public double getArea(){
        return (Math.PI * radius*radius);
    }
    
    @Override
    public String toString(){
        return super.toString() + 
                ";Radius: " + radius + 
                ";Perimeter: " + getPerimeter() +
                ";Area: " + getArea();
    }
    
}// end Circle
