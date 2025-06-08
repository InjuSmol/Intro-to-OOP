
import java.util.Scanner;
public class Forth {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[][] matrx = new double[3][3];
        System.out.println("Enter 3 × 3 matrix: ");
        for (int i = 0; i < matrx.length; i++)
            for (int j = 0; j < matrx[i].length; j++)
                matrx[i][j] = input.nextDouble();

        System.out.print("\n Sorted matrix: ");
        printMatrx(sortRows(matrx));
        input.close();
    }

    public static double[][] sortRows(double[][] m) {
        double[][] m2 = new double[3][3];
        for(int i = 0; i<m.length; i++)
            for(int j = 0; j<m[i].length; j++)
            m2[i][j] = m[i][j];
        double temp;
        for (int i = 0; i < m2.length; i++)
            for (int j = 0; j < m2[i].length; j++) {
                for (int k = 0; k < m2[i].length - 1; k++) {
                    if (m2[i][k] > m2[i][k + 1]) {
                        temp = m2[i][k];
                        m2[i][k] = m2[i][k + 1];
                        m2[i][k + 1] = temp;
                    }
                }
            }
        return m2;
    }
    public static void printMatrx(double[][] m) {
        for (int i = 0; i < m.length; i++) {
            System.out.println();
            for (int j = 0; j < m[i].length; j++)
                System.out.printf((m[i][j] >= 10) ? "%.2f " : "%.3f ", m[i][j]);
        }
    }
}
