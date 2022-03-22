
import java.util.Scanner;

/**
 *
 * @author raekyo
 */
public class Part2 {
    public static void main(String[] args) {
        String op;
        float num1, num2;
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Input the number 1: ");
        num1= sc.nextFloat();
        
        System.out.print("Input the number 2: ");
        num2= sc.nextFloat();
        
        sc = new Scanner(System.in);
        
        System.out.print("Input the operator: ");
        op = sc.nextLine();
        
        switch(op){
            case "+": System.out.println("the result of "+ num1 + op + num2 + "="+(num1+num2)); break;
            case "-": System.out.println("the result of "+ num1 + op + num2 + "="+(num1-num2)); break;
            case "*": System.out.println("the result of "+ num1 + op + num2 + "="+(num1*num2)); break;
            case "/": System.out.println("the result of "+ num1 + op + num2 + "="+(num1/num2)); break;
            default: System.out.println("the operator is not supportive!"); break;
        }
        
    }
}
