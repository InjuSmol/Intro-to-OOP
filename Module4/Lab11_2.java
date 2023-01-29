
import java.util.Scanner;
public class Lab11_2 {

    public static void main(String[] args) {

        int[] arr = new int[10];

        Scanner input = new Scanner(System.in);

        System.out.print("Enter 10 numbers: ");

        for (int i = 0; i < arr.length; i++)

            arr[i] = input.nextInt();

        reverse(arr);

        for (int i = 0; i < arr.length; i++) {

            System.out.print(arr[i] + " ");

        }

        input.close();

    }

    public static void reverse(int[] array1) {

        int d;
        int j = array1.length - 1;

        for (int i = 0; i < array1.length / 2; i++) {

            d = array1[i];

            array1[i] = array1[j];

            array1[j] = d;

            j--;

        }

    }
}
