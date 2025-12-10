package ma.exerc_4;

public class TestDoubleArrayUtils {
    public static void main(String[] args) {
        double[][] matrix1 = {
            {1.0, 2.0, 3.0},
            {4.0, 5.0, 6.0},
            {7.0, 8.0, 9.0}
        };

        double[][] matrix2 = {
            {0.5, 1.5, 2.5},
            {3.5, 4.5, 5.5},
            {6.5, 7.5, 8.5}
        };

        System.out.println("Matrix 1:");
        DoubleArrayUtils.affiche(matrix1);

        System.out.println("\nMatrix 2:");
        DoubleArrayUtils.affiche(matrix2);

        System.out.println("\nIs Matrix 1 regular? " + DoubleArrayUtils.regulier(matrix1));

        System.out.println("\nRow sums of Matrix 1:");
        double[] sums = DoubleArrayUtils.sommeLignes(matrix1);
        for (double sum : sums) {
            System.out.println(sum);
        }

        System.out.println("\nSum of Matrix 1 and Matrix 2:");
        double[][] result = DoubleArrayUtils.somme(matrix1, matrix2);
        if (result != null) {
            DoubleArrayUtils.affiche(result);
        } else {
            System.out.println("The two matrices are not regular or don't have the same dimensions.");
        }
    }
}

