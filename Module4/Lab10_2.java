import java.util.Scanner;
public class Lab10_2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer: ");

        int num = input.nextInt();

        reverse(num);

        input.close();

    }

    public static void reverse(int number) {

        while (number > 0) {

            System.out.print(
                    (number % 10)
            );

            number /= 10;

        }

    }
}