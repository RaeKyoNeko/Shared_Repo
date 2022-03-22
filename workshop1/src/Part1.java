
import java.util.Scanner;

/**
 *
 * @author raekyo
 */
public class Part1 {
    public static void main(String[] args) {
        int rows, cols;
        int matrix[][];
        Scanner sc = new Scanner(System.in);
        
        
        System.out.print("Enter number of rows: ");
        rows = sc.nextInt();
        
        System.out.print("Enter number of cols: ");
        cols = sc.nextInt();
        
        matrix = new int[rows][cols];
        System.out.println("Enter the matrix");
        for(int r=0; r<rows; r++){
            for(int c=0; c<cols; c++){
                System.out.print("m["+r+"]["+c+"]=");
                matrix[r][c] = sc.nextInt();
            }
        }
        
        
        System.out.println("Matrix inputted:");
        for(int r=0; r<rows; r++){
            for(int c=0; c<cols; c++){
                System.out.format("%3d",matrix[r][c]);
            }
            System.out.println("");
        }
   
        
        int sum=0;
        for(int r=0; r<rows; r++){
            for(int c=0; c<cols; c++){
                sum += matrix[r][c];
            }
        }
        System.out.println("Sum: "+sum);
        
        
        float avr=0;
        System.out.println("Averange: "+(float)sum/(rows*cols));
        
        
        String stopScreen = sc.nextLine();
    }// end main
}
