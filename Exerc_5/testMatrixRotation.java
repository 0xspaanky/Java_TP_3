package ma.exerc_5;

import java.util.Scanner;

public class testMatrixRotation {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("what is the matrix size ? -> ");

        int n = scanner.nextInt();
        int[][] matrix = new int[n][n];
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
            	System.out.print("Enter the Matrix case " + "[" + i + "]" + "[" + j + "] -> ");
                matrix[i][j] = scanner.nextInt();
            }
            System.out.println("");
        }

        matrixRotation.rotate90ClockwiseInPlace(matrix);

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(" | " + matrix[i][j] + " | ");
            }
            System.out.println();
        }

        scanner.close();
    }

}
