
import java.util.Scanner;
public class Forth {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter two 3 × 3 matrices: ");
        double[][] matrx1 = new double[3][3];
        System.out.print("Enter matrix 1: ");
        for (int i = 0; i<matrx1.length; i++)
            for(int j = 0; j < matrx1[i].length; j++)
                matrx1[i][j] = input.nextDouble();
        double[][] matrx2 = new double[3][3];
        System.out.print("\nEnter matrix 2: ");
        for (int i = 0; i<matrx2.length; i++)
            for(int j = 0; j < matrx2[i].length; j++)
                matrx2[i][j] = input.nextDouble();

        System.out.print("\nMultiplication of the matrices is; ");
        printMatrx(multiplyMatrix(matrx1,matrx2));
        input.close();
    }
    public static double[][] multiplyMatrix(double[][] a, double[][] b) {
        double [][] product = new double [3][3];
        for (int i = 0; i<product.length; i++)
            for (int j = 0; j < product[i].length; j++)
                for (int k = 0;k< a.length; k++)
                          product[i][j] += a[i][k]*b[k][j];
     return product;
    }
    public static void printMatrx(double [][] m){
        for (int i = 0; i<m.length; i++) {
            System.out.println();
            for (int j = 0; j < m[i].length; j++)
                System.out.printf((m[i][j]>=10)?"%.1f ":"%.2f ",m[i][j]);
        }
    }

}

