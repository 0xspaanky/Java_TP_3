package tp2_package;
import java.util.Scanner;

public class CenteredStarTriangle  {
    public static void main(String[] args) {
    	
        try (Scanner scanner = new Scanner(System.in))
        {
        	System.out.print("Give the height of the triangle : ");
        	int height = scanner.nextInt();
        	
        	for (int i = 0; i < height; i++) {
                int nbSpaces = height - i - 1;
                int nbStars = 2 * i + 1;

                for (int j = 0; j < nbSpaces; j++) {
                    System.out.print(" ");
                }

                for (int j = 0; j < nbStars; j++) {
                    System.out.print("*");
                }

                System.out.println();
            }	
        }
    }
}
