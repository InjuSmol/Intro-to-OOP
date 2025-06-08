
import java.util.Scanner;
public class Complex {  //First
    public static void main(String []args){
        Scanner input = new Scanner(System.in);
        double rp1, ip1, rp2, ip2;
        System.out.print("Enter real part of the first complex number: ");
        rp1 = input.nextDouble();
        System.out.print("\nEnter imaginary part of the first complex number: ");
        ip1 = input.nextDouble();
        System.out.print("\nEnter real part of the second complex number: ");
        rp2 = input.nextDouble();
        System.out.print("\nEnter imaginary part of the second complex number: ");
        ip2 = input.nextDouble();
        Complex complex1 = new Complex(rp1,ip1);
        Complex complex2 = new Complex(rp2,ip2);
        System.out.println("\nFirst complex number is: "+complex1.toString());
        System.out.println("Second complex number is: "+complex2.toString());
        System.out.println("Addition of the complex numbers is: "+complex1.add(complex2).toString());
        System.out.println("Subtraction of the complex numbers is: "+complex1.subtract(complex2).toString());
    }
    private double realPart;
    private double imaginaryPart;

    Complex (){
        this.realPart = 1;
        this.imaginaryPart =1;
    }
    Complex(double realPart, double imaginaryPart){
        this.realPart = realPart;
        this.imaginaryPart = imaginaryPart;
    }
    public double getRealPart(){
        return this.realPart;
    }

    public double getImaginaryPart(){
        return this.imaginaryPart;
    }
    public Complex add(Complex c2){
        Complex c3  = new Complex(this.realPart+c2.realPart,this.imaginaryPart+c2.imaginaryPart);
        return c3;
    }
    public Complex subtract(Complex c2) {
        Complex c3 = new Complex(this.realPart - c2.realPart, this.imaginaryPart - c2.imaginaryPart);
        return c3;
    }

    public String toString(){
        return ("("+this.realPart+", "+this.imaginaryPart+")");
    }
}
