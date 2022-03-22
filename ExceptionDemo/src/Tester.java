
import java.io.FileReader;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author raekyo
 */
public class Tester {
	public static void main(String[] args) {
		// WrongFormat , InputMismatchException
//		try {
//			int num;
//			Scanner sc = new Scanner(System.in);
//			System.out.println("Input number: ");
//			num = sc.nextInt();
//			System.out.println("Res: " + num);
//		} catch (InputMismatchException e) {
//			e.printStackTrace();
//		}

		
		
		// IndexOutOfBounderies
//		try {
//			int []ar = {0,3,4,6};
//			for(int i=0; i<5; i++)
//				System.out.print(i);
//		} catch (IndexOutOfBoundsException e) {
//			e.printStackTrace();
//		}
		
		// test infinity
//		try{
//			Scanner sc = new Scanner(System.in);
//			int n = sc.nextInt();
//			System.out.println("res = " + 1/n); // 1.0 -> Infinity
//		}catch(InputMismatchException | ArithmeticException e){
//			System.out.println("Error n = 0");
//		}
		
		
		// NullPointerException
//		Scanner sc = null;
//		try {
//			System.out.println("sc: " + sc.nextInt());
//		} catch (NullPointerException e) {
//			e.getMessage();
//		}
		
		
		// File Exception unreported
//		FileReader file = new FileReader("/home/desktop/hello.txt");
		
		
	}
}
