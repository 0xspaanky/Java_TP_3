package ma.exerc_5;

import java.util.*;

public class testMatrixRotation {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size n: ");
        int n = sc.nextInt();

        System.out.print("Enter window size k: ");
        int k = sc.nextInt();

        int[] T = new int[n];

        System.out.println("Enter " + n + " integers:");
        for (int i = 0; i < n; i++) {
            T[i] = sc.nextInt();
        }

        System.out.print("\nArray: [");
        for (int i = 0; i < n; i++) {
            System.out.print(T[i]);
            if (i < n - 1) System.out.print(" ");
        }
        System.out.println("]");

        int MAXV = 100000;
        int[] freq = new int[MAXV + 1];
        int distinct = 0;

        System.out.println("\n--- Sliding Windows ---");

        for (int i = 0; i < k; i++) {
            if (freq[T[i]] == 0) distinct++;
            freq[T[i]]++;
        }

        System.out.println("Window 1: " + formatWindow(T, 0, k) + " -> distinct = " + distinct);

        int w = 2;
        for (int i = k; i < n; i++) {
            int out = T[i - k];
            freq[out]--;
            if (freq[out] == 0) distinct--;

            int in = T[i];
            if (freq[in] == 0) distinct++;
            freq[in]++;

            System.out.println("Window " + w + ": " + formatWindow(T, i - k + 1, k) + " -> distinct = " + distinct);
            w++;
        }

        System.out.print("\nResult: ");
        Arrays.fill(freq, 0);
        distinct = 0;

        for (int i = 0; i < k; i++) {
            if (freq[T[i]] == 0) distinct++;
            freq[T[i]]++;
        }
        System.out.print(distinct);

        for (int i = k; i < n; i++) {
            int out = T[i - k];
            freq[out]--;
            if (freq[out] == 0) distinct--;

            int in = T[i];
            if (freq[in] == 0) distinct++;
            freq[in]++;
            System.out.print(" " + distinct);
        }

        System.out.println();
    }

    static String formatWindow(int[] T, int start, int k) {
        StringBuilder sb = new StringBuilder("[");
        for (int i = start; i < start + k; i++) {
            sb.append(T[i]);
            if (i < start + k - 1) sb.append(" ");
        }
        sb.append("]");
        return sb.toString();
    }
}
