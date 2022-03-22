package cli_gui;

import java.util.Scanner;
import dto.Point;
/**
 *
 * @author raekyo
 */
public class Tester {
    public static void main(String[] args) {
        int choice = 0;
        Scanner sc = new Scanner(System.in);
        Point p1 = new Point();
        Point p2 = new Point();
        
        do{
            System.out.println("1. Input point");
            System.out.println("2, Output point");
            System.out.println("3. Get Distance");
            System.out.println("4. Exit");
            
            System.out.print("Choice : ");
            choice = sc.nextInt();
            
            switch(choice){
                case 1: 
                    System.out.println("Input point 1:");
                    p1.inputPoint();
                    
                    System.out.println("Input point 2:");
                    p2.inputPoint();
                    break;
                    
                case 2:
                    System.out.println("Point 1:");
                    p1.outputPoint();
                    
                    System.out.println("Point 2:");
                    p2.outputPoint();
                    break;
                    
                case 3:
                    double d = p1.getDistance(p2);
                    System.out.println("Distance= "+d);
                    break;
            }
            
        }while(choice>0 && choice <= 3);
    }
}
