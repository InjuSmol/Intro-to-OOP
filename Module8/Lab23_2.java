
import java.util.Scanner;
public class Lab23_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your integer: ");
        int int1 = input.nextInt();
        System.out.println("Sum of digits of your integer is " + sumDigits(int1));
    }
    public static int sumDigits(int n) {
        return sumDigits(n, 0);
    }
    private static int sumDigits(int n, int sum) {
        if (n == 0)
            return sum;
        else
            return sumDigits(n / 10, sum + (int)(n % 10));
    }
}
