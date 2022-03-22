/**
 *
 * @author raekyo
 */
import java.util.Scanner;

public class Part2_2 {
    public static void main(String[] args) {
        boolean count = false;
            
       do{
           try{
           String s = inputString();
           System.out.println("the string is "+s);
           count = false;
           }catch(Exception e){
               System.out.println("the string is invalid");
               count = true;
           }
       }while(count);
    }// end main()
    
    
    public static String inputString() throws Exception{
        String s = "";
        String pattern = "SE[0-9]+";
        Scanner sc = new Scanner(System.in);
           
        System.out.println("input the string: ");
        s = sc.nextLine();
        if(! s.matches(pattern))
            throw new Exception();
        
        
        return s;
    }// end inputString()
}// end Part2_2
