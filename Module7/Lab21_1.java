// Smolianova Varvara 115284311
import java.util.ArrayList;
import java.util.Scanner;
public class Lab21_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int int1=0, int2=0, t = 1;
        while (t==1){
            System.out.print("\nEnter two integers: ");
        try {
            int1 = input.nextInt();
            int2 = input.nextInt();
            t=0;
        }
         catch (java.util.InputMismatchException n) {
            System.out.print("You must enter 2 integers!");
             input.nextLine();
        }
        }//while
        System.out.print("\nThe sum is: " +(int1+int2));

        input.close();
    }
}
