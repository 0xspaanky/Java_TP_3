package tp2_package;
import java.util.Scanner;

public class OddSquares {
    public static void main(String[] args) {
        
    	try(Scanner scanner = new Scanner(System.in))
    	{
    		System.out.print("How many values: ");
    		int n = scanner.nextInt();
    		
    		int[] squares = new int[n];
    		
    		int oddNumber = 1;
    		for (int i = 0; i < n; i++) {
    			squares[i] = oddNumber * oddNumber;
    			oddNumber += 2;
    		}
    		
    		oddNumber = 1;
    		for (int i = 0; i < n; i++) {
    			System.out.println(oddNumber + " has square " + squares[i]);
    			oddNumber += 2;
    		}	
    	}
    }
}
