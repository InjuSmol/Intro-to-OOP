// Smolianova Varvara 115284311
import java.util.Scanner;
public class BinaryToDecimal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a binary number: ");
        String num = input.next();
        System.out.print("Your number’s decimal equivalent: "+ bin2Dec(num));
        input.close();
    }
    public static int bin2Dec(String binaryString) {
        int sum = 0;
        int j = binaryString.length()-1;
        for (int i = 0; i < binaryString.length() ; i++) {
            sum += Integer.parseInt(binaryString.charAt(j) + "") * Math.pow(2, i);
            j--;
        }
        return sum;
    }
}