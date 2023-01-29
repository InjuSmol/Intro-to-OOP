// Smolianova Varvara 115284311
import java.util.Scanner;
public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a decimal number: ");
        int num = input.nextInt();
        System.out.print("Your number’s binary equivalent: " + dec2Bin(num));
        input.close();
    }
    public static String dec2Bin(int value) {
        String bin = "";
        while (value >= 2) {
            bin += value % 2;
            value /= 2;
        }
        bin += 1;
        bin = ""+reverseString(bin);

        return bin;
    }
    public static String reverseString(String str){
        String string = "";
        for (int i = str.length()-1; i>=0; i--){
            string += str.charAt(i);
        }
  return string;
    }
}

