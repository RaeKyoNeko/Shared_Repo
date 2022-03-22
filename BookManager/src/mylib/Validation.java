package mylib;

import java.util.Scanner;

/**
 *
 * @author raekyo
 */
public class Validation {
	/**
	 * This method accept the input message as the notify the user to input the number
	 * The number inputted must be greater than 0
	 * @precondition: message must be non-empty and non-null
	 * @postcondition: return the positive number
	 * @param: message to notify to user to input the number
	 * @throws: Exception if number <= 0 
	 * @return: return the number inputted
	 */
	public static int inputPositiveNUmber(String message) throws Exception{
		Scanner sc = new Scanner(System.in);
		int num = 0;
		
		System.out.print(message);
		num = sc.nextInt();
		if(num <= 0) throw new Exception();
		return num;
	}
	
}// end Validation
