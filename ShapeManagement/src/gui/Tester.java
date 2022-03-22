package gui;
import dto.*;
/**
 *
 * @author raekyo
 */
public class Tester {
    public static void main(String[] args) {
        Shape tmp;
        Circle c = new Circle(10.5, "blue", false);
        System.out.println("Circle area: " + c.getArea());
        System.out.println(c.toString());
        
        
        
        Rectangle r = new Rectangle(3.5,"blue",false);
        System.out.println("Rectangle area: " +r.getArea());
        System.out.println(r.toString());
        
        
        
        Square s = new Square(6,"blue",false);
        System.out.println("Square area: " + s.getArea());
        System.out.println(s.toString());
        
        
        
        tmp = s;
        System.out.println("Square area: " + s.getArea());
        System.out.println("Square area: " + ((Square)tmp).getArea());
        System.out.println("Rectangle area: " + ((Rectangle)tmp).getArea());
        
    }
}
