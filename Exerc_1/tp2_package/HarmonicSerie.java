package tp2_package;

import java.util.Scanner;

public class HarmonicSeries {
    public static void main(String[] args) {
    	try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("How much N term are : ");
            int n = scanner.nextInt();

            double sum_holder = 0.0;
            for (int i = 1; i <= n; i++) {
            	sum_holder += 1.0 / i;
            }

            System.out.println("THe sum of these " + n + " first terms of the harmonical serie are : " + sum_holder);
        }
    }
}
