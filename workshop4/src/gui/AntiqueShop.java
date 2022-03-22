package gui;

import dto.*;
import mylib.Menu;
import java.util.Scanner;

/**
 *
 * @author raekyo
 */
public class AntiqueShop {

    public static void main(String[] args) {
        Item item = null;
        int choice = 0;
        String[] options = {"Create a Vase","Create a Statue","Create a Painting","Display Item","Exit"};
        Scanner sc = new Scanner(System.in);
        
        do {
            choice = Menu.getChoice(options);
            switch (choice) {
                case 1:
                    item = new Vase();
                    ((Vase) item).inputVase(); // Casting item to Vase
                    break;
                case 2:
                    item = new Statue();
                    ((Statue) item).inputStatue(); // Casting item to Statue
                    break;
                case 3:
                    item = new Painting();
                    ((Painting) item).inputPainting(); // Casting item to Painting
                    break;
                case 4:
                    if (item != null) {
                        if (item instanceof Vase) {
                            ((Vase) item).outputVase();
                        } else if (item instanceof Statue) {
                            ((Statue) item).outputStatue();
                        } else if (item instanceof Painting) {
                            ((Painting) item).outputPainting();
                        }
                    } else {
                        System.out.println("You need to create an object");
                    }

                    break;
            }
        } while (choice <= 4);
    }// end main()
}// end AntiqueShop
