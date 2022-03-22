package dto;

/**
 *
 * @author raekyo
 */
public class Car {

    private String colour;
    private int EnginePower;
    private boolean Convertible;
    private boolean ParkingBrake;

    public Car() {
    }

    public Car(String colour, int EnginePower, boolean Convertible, boolean ParkingBrake) {
        this.colour = colour;
        this.EnginePower = EnginePower;
        this.Convertible = Convertible;
        this.ParkingBrake = ParkingBrake;
    }// end Contructors

    // logic method
    public void pressStartButton() {
        System.out.println("You have pressed the start button");
    }

    ;
    public void pressAcceleratorButton() {
        System.out.println("You have pressed Accelerate button");
    }

    ;
    public void output() {
        System.out.println("Car Information:");
        System.out.println("Color: " + colour);
        System.out.println("EnginePower: " + EnginePower);
        System.out.println("Convertible: " + Convertible);
        System.out.println("ParkingBrake: " + ParkingBrake);
    }

    ;
    
    // setter
    public void setColour(String colour) {
        if (colour == "" || colour.isEmpty()) {
            System.out.println("Colour cannot be \" \" or empty");
        } else {
            this.colour = colour;
        }
    }

    public void setEnginePower(int EnginePower) {
        if (EnginePower == 0) {
            System.out.println("EnginePower cannot be 0");
        } else {
            this.EnginePower = EnginePower;
        }
    }

    public void setConvertible(boolean Convertible) {
        this.Convertible = Convertible;
    }

    public void setParkingBrake(boolean ParkingBrake) {
        this.ParkingBrake = ParkingBrake;
    }

    // getter
    public String getColour() {
        return colour;
    }

    public int getEnginePower() {
        return EnginePower;
    }

    public boolean isConvertible() {
        return Convertible;
    }

    public boolean isParkingBrake() {
        return ParkingBrake;
    }

}// end Car
