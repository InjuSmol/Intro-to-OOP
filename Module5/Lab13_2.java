
import java.util.Scanner;
public class Lab13_2 {
    public static void main (String [] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = input.nextInt();
        double [][] matrix = new double[n][n];

        for (int row =0; row < n;row++) {
            System.out.print("\nrow " + (row+1) + " : ");
            for (int column = 0; column < n; column++) {
                matrix[row][column] = input.nextDouble();
            }
        }
        System.out.print("Sum of the elements in the major diagonal is "+sumMajorDiagonal(matrix));
        input.close();
    }
    public static double sumMajorDiagonal(double[][] m){
        double sum = 0;
      for(int i = 0, j=0; i <m.length;i++,j++)
              sum += m[i][j];
      return sum;
    }
}
