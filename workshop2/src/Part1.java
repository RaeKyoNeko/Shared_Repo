
import java.util.Scanner;

/**
 *
 * @author raekyo
 */
public class Part1 {

    public static void main(String[] args) {
        int num;
        while (true) {
            try {
                Scanner sc = new Scanner(System.in);

                System.out.print("enter the number:");
                num = sc.nextInt();
                if (num < 1) {
                    throw new Exception();
                } else {
                    break;
                }
            } catch (Exception e) {
                System.out.println("The number is invalid");
            };
        }

        System.out.println("The number is " + num);
    }
}
