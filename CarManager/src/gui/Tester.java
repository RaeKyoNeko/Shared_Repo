package gui;


import dto.Car;

/**
 *
 * @author raekyo
 */
public class Tester {
    public static void main(String[] args) {
	    System.out.println("______Car1 Test:");
        Car c = new Car();
        c.pressStartButton();
        c.pressAcceleratorButton();
        c.output();
        
        
	    System.out.println("_______Car2 Test");
        Car c2 = new Car("red",100,true, true);
        c2.pressAcceleratorButton();
        c2.setColour("black");
        System.out.println("Colour of c2:" + c2.getColour());
        c2.output();
    }
}
