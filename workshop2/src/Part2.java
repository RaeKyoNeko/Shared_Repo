
import java.util.Scanner;

/**
 *
 * @author raekyo
 */
public class Part2 {

    public static void main(String[] args) {
        String s = "";
        do {
            try {
                String pattern = "SE[0-9]+";
                Scanner sc = new Scanner(System.in);
                System.out.print("Input the string 1:");
                s = sc.nextLine();
                if (!s.matches(pattern))
                    throw new Exception();
                else break;
            } catch (Exception e) {
                System.out.println("The string is invalid");
            }
        } while (true);
        
        
        System.out.println("the string is: " + s);

    }
}
