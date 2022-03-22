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
	public static int inputPositiveNumber(String message) throws Exception{
		Scanner sc = new Scanner(System.in);
		int num = 0;
		
		System.out.print(message);
		num = sc.nextInt();
		if(num <= 0) throw new Exception();
		return num;
	}
        
        
        
        /**
	 * This method accept the input message as the notify the user to input the string character
	 * The string inputted must be non-null, non-empty
	 * @precondition: message must be non-empty and non-null
	 * @postcondition: return the string inputted
	 * @param: message to notify to user to input the number
	 * @throws: Exception if String is null
	 * @return: return the String inputted
	 */
        public static String inputString(String message) throws Exception{
		Scanner sc = new Scanner(System.in);
		String str="";
		
		System.out.print(message);
		str = sc.nextLine();
                if(str.isEmpty() || str == null) throw new Exception();
                return str;
	}
        
        
        /**
         * Input Boolean value
         * @param message to notify to user to input the number
         * @return Boolean value
         * @throws Exception 
         */
        public static boolean inputBoolean(String message) throws Exception{
                Scanner sc = new Scanner(System.in);
                boolean b = false;
                
                System.out.println(message);
                b = sc.nextBoolean();
                //
                return b;
        }
	
}// end Validation
