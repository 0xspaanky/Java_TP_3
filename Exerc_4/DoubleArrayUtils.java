package ma.exerc_4;

public class DoubleArrayUtils {

    public static void affiche(double t[][])
    {
        for (int i = 0; i < t.length; i++) {
            for (int j = 0; j < t[i].length; j++) {
                System.out.print(t[i][j] + " ");
            }
            System.out.println();
        }
    }
    
    public static boolean regulier(double t[][])
    {
        if(t.length == 0)
            return true;
        int nbLignes = t[0].length;
        for(int i = 1; i < t.length; i++)
            if(t[i].length != nbLignes)
                return false;
        return true;
    }

    public static double[] sommeLignes(double t[][])
    {
        double[] sum = new double[t[0].length];
        for(int i = 0; i < sum.length; i++)
            for(int j = 0; j < t[i].length; j++)
                sum[i] += t[i][j];
        return sum;
    }

    public static double[][] somme(double[][] t1, double[][] t2)
    {
        if(!regulier(t1) || !regulier(t2) || t1.length != t2.length)
            return null;
        double[][] sum = new double[t1.length][t1[0].length];
        for(int i = 0; i < t1.length; i++)
            for(int j = 0; j < t1[i].length; j++)
                sum[i][j] = t1[i][j] + t2[i][j];
        return sum;
    }

}

