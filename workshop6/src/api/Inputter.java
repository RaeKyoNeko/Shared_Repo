package api;
/**
 *
 * @author raekyo
 */
import java.util.Scanner;

public class Inputter {
	public static Scanner sc = new Scanner(System.in);

	public static int inputInt(String msg, int min, int max){
		if(min>max){
			int t = min;
			min=max;
			max=t;
		}
		int data;
		do{
			System.out.println(msg);
			data = Integer.parseInt(sc.nextLine());
		}while(data<min || data>max);
		return data;
	}// end input Int	
	

	// get a string with no condition
	public static String inputStr(String msg){
		System.out.println(msg);
		String data = sc.nextLine().trim();
		return data;
	}// end inputStr
	

	// get a non-blank string
	public static String inputNonBlankStr(String msg){
		String data;
		do{
			System.out.println(msg);
			data = sc.nextLine().trim();
		}while(data.length() == 0);
		return data;
	}

	// get a string folowing a pattern
	public static String inputPattern(String msg, String pattern){
		String data;
		do{
			System.out.print(msg);
			data = sc.nextLine().trim();
		}while(!data.matches(pattern));
		return data;
	}	
}// end Inputter
