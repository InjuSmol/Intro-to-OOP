import java.util.Scanner;
public class Lab10_1 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter an integer: ");

        int num = input.nextInt();

        displayPattern(num);

        input.close();

    }

    public static void displayPattern(int n) {

        String space = " ";

        int max = n + (n - 9);

//if (n > 9) max = (n-9)*2 +9;

        for (int i = 1; i <= n; i++) {

//if (n >9) max = n-9;

            if (i > 9) {

                for (int j = 0; j < max - i - (i - 9); j++)

                    System.out.print(space);

            }

            if (i <= 9)

                for (int j = 0; j < max - i; j++)

                    System.out.print(space);

            for (int k = i; k >= 1; k--)

                System.out.print(k);

            System.out.println();

        }

    }

}