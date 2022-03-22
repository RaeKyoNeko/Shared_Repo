package gui;

import dto.*;
import java.util.Scanner;

/**
 *
 * @author raekyo
 */
public class AntiqueShop {

    public static void main(String[] args) {
        Item item = null;
        int choice = 0;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("1. Create a Vase:");
            System.out.println("2. Create a Statue:");
            System.out.println("3. Create a Painting:");
            System.out.println("4. Display the Item:");
            System.out.println("Input a choice:");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    item = new Vase();
//                    ((Vase) item).inputVase(); // Casting item to Vase
                    item.inputItem();
                    break;
                case 2:
                    item = new Statue();
//                    ((Statue) item).inputStatue(); // Casting item to Statue
                    item.inputItem();
                    break;
                case 3:
                    item = new Painting();
//                    ((Painting) item).inputPainting(); // Casting item to Painting
                    item.inputItem();
                    break;
                case 4:
//                    if (item != null) {
//                        if (item instanceof Vase) {
//                            ((Vase) item).outputVase();
//                        } else if (item instanceof Statue) {
//                            ((Statue) item).outputStatue();
//                        } else if (item instanceof Painting) {
//                            ((Painting) item).outputPainting();
//                        }
//                    } else {
//                        System.out.println("You need to create an object");
//                    }

                    
                    if(item != null) item.outputItem();
                    break;
            }
        } while (choice <= 4);
    }// end main()
}// end AntiqueShop
