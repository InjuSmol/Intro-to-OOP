// Varvara Smolianova 115284311
import java.util.Scanner;
public class Lab15_2 {
    public static void main (String [] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Solution for a 2 × 2 system of linear equations:"+
                          "\n   ax + by = e"+
                          "\n   cx + dy = f");
        System.out.println("Enter a, b, c, d, e, f: ");
        double a,b,c,d,e,f;
        a = input.nextDouble();
        b = input.nextDouble();
        c = input.nextDouble();
        d = input.nextDouble();
        e = input.nextDouble();
        f = input.nextDouble();
        LinearEquation LE = new LinearEquation(a,b,c,d,e,f);
        if (!LE.isSolvable()) System.out.print ("The equation has no solution.");

        else System.out.print ("X is "+LE.getX()+" and "+LE.getY()+" is 3.0");
        input.close();
    }
}