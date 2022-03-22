package mylib;

import java.util.Scanner;

/**
 *
 * @author raekyo
 */
public class Menu {
    /**
     * get choice from user from ranged 1 to the length of Object Inputted
     * @param options: options get object from input to create a base menu GUI on screen
     * @return the Integer value inputted
     */
    public static int getChoice(Object[] options){
        for(int i=0; i<options.length; i++)
            System.out.println(i+1 + ". " + options[i] + ":");
        
        System.out.println("Choice 1.." + options.length + ": ");
        Scanner sc = new Scanner(System.in);
        String choice = sc.nextLine();
        return Integer.parseInt(choice);
    }
}
