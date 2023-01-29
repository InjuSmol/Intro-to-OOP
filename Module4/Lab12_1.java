
import java.util.Scanner;
public class Lab12_1 {

    public static void main(String[] args) {

        int rows, columns;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of rows and columns in the array: ");

        rows = input.nextInt();
        columns = input.nextInt();

        int[] array1;

        double[]
                [] arr = new double[rows]
                [columns];

        System.out.println("Enter the array : ");

        for (int j = 0; j < arr.length; j++) {

            input.nextLine();

            for (int i = 0; i < arr[j]
                    .length; i++)

                arr[j]
                        [i] = input.nextDouble();

        }

        array1 = locateLargest(arr);
        System.out.print("The location of the largest element is at (" + array1[0] + ", " + array1[1] + ")");
        input.close();
    }

    public static int[] locateLargest(double[]
                                              [] a) {

        int[] array2 = new int[]
                {0, 0};
        double max = a[0]
                [0];

        for (int j = 0; j < a.length; j++)

            for (int i = 0; i < a[j]
                    .length; i++)

                if (a[j]
                        [i] > max) {

                    max = a[j]
                            [i];

                    array2[0] = j;
                    array2[1] = i;

                }

        return array2;

    }
}