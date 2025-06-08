
import java.util.Scanner;
public class Lab16_1 {
    public static void main(String[]args){
        Scanner input = new Scanner (System.in);
        System.out.print("How many rows and columns you have: ");
        int r = input.nextInt(),  c = input.nextInt();
        int[][] array = new int [r][c];

        System.out.println("Enter your 2D array: ");
        for (int i = 0; i < r; i++){
            System.out.print("\nrow "+(i+1)+": ");
            for (int j =0; j< c; j++)
                array[i][j] = input.nextInt();
            }
        System.out.println("Unsorted: ");
        print2dArray(array);
        sort(array);
        System.out.println();
        System.out.println("Sorted: ");
        print2dArray(array);

        input.close();
    }
    public static void sort(int m[][]) {
        int[] arr = new int[2];
        for (int i = 0; i < m.length - 1; i++) {
            arr[0] = m[i][0];
            arr[1] = m[i][1];
            int t = i;
            for (int j = i + 1; j < m.length; j++)
                if (m[i][0] <= arr[0] && (m[i][0] < arr[1] ||
                        m[i][1] < arr[0] || m[i][1] < arr[1])) {
                    arr[0] = m[i][0];
                    arr[1] = m[i][1];
                    t = j;
                }
            if (t != i){
                m[t][0] = m[i][0];
                m[t][1] = m[i][1];
                m[i][0] = arr[0];
                m[i][1] = arr[1];
            }
        }
    }

    public static void print2dArray(int [][] arr) {
        System.out.print("{");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(" {");
            for (int j = 0; j < arr[i].length-1; j++)
                System.out.print(arr[i][j] + ", ");

            System.out.print(arr[i][arr[i].length - 1]);
            System.out.print("},");
        }

        System.out.print("}");
    }

}
