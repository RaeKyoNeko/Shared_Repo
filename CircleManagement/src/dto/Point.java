
package dto;

import mylib.Validation;

/**
 *
 * @author raekyo
 */
public class Point {
    private int x,y;
    
    public Point(){}

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    //x
    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    //y
    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
    
    
    public void inputPoint(){
        
        try{
            x = Validation.inputPositiveNUmber("Input X: ");
            y = Validation.inputPositiveNUmber("Input Y: ");
        }catch(Exception e){System.out.println("Bad input!");} 
    }
    
    public void outputPoint(){
        System.out.println("X: " + x);
        System.out.println("Y: " + y);
    }
}// end Point
