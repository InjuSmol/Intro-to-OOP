// Smolianova Varvara 115284311
import java.util.Scanner;
public class Lab23_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your string: ");
        String str = input.next();
        System.out.print("Reversed String: ");
        reverseDisplay(str);
    }
    private static void reverseDisplay(String value) {
        if (value.length() == 1)
            System.out.println(value);
        else {
            System.out.print(value.charAt(value.length() - 1));
            reverseDisplay(value.substring(0, value.length() - 1));
        }
    }
}