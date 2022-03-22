
package dto;
import mylib.Validation;
/**
 *
 * @author raekyo
 */
public class Circle {
    private double r; // radius
    Point mid;
    
    public Circle(){
        mid = new Point();
    }

    public Circle(double r, Point mid) {
        this.r = r;
        this.mid = mid;
        mid = new Point();
    }

    // r
    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    
    // midpoint
    public Point getMid() {
        return mid;
    }

    public void setMid(Point mid) {
        this.mid = mid;
    }
    
    
    public void inputCircle(){
        try {
            mid.inputPoint();
            r = Validation.inputPositiveNUmber("Input Radius: ");
        } catch (Exception e) {
        }
    }
    
    public void outputCircle(){
        System.out.println("Mid Point: " + mid.getX() + " , " + mid.getY());
        System.out.println("Radius: " + r);

    }
}
