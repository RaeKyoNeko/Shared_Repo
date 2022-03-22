
import java.util.Scanner;

/**
 *
 * @author raekyo
 */
public class Part3 {
    public static void main(String[] args) {
        String[] studentList = new String[10];
        Scanner sc = new Scanner(System.in);
        
        
        for(int i=0; i<studentList.length; i++){
            System.out.printf("Enter student %d: ",i);
            studentList[i] = sc.nextLine().toUpperCase();
        }
        
        
        System.out.println("Student List:");
        for(String name : studentList)
            System.out.println(name);
        
    }
}
