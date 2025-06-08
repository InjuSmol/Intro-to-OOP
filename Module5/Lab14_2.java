
import java.util.Scanner;
public class Lab14_2 {
    public static void main (String [] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter values for a, b, and c: ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        QuadraticEquation E1 = new QuadraticEquation(a,b,c);
        double dis = E1.getDiscriminant();
        if(dis <0|| E1.getA() ==0) System.out.print("\nThe equation has no real roots.");
        else if(dis ==0) System.out.printf("\nThe equation has one root: %.6f",E1.getRoot1());
        else if(dis >0) {System.out.printf("\nThe equation has two roots: %.6f",E1.getRoot1()); System.out.printf(" and %.6f",E1.getRoot2());}
        input.close();
    }
}
