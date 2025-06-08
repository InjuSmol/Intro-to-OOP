
import java.util.Scanner;
public class Lab18_1 {
    public static void main(String[]args){
        Scanner input = new Scanner (System.in);
        System.out.println("Enter sides of the triangle: ");
        System.out.print("First side: ");
        double side1 = input.nextDouble();
        System.out.print("Second side: ");
        double side2 = input.nextDouble();
        System.out.print("Third side: ");
        double side3 = input.nextDouble();

        System.out.print("Enter the color: ");
        String color = input.next();

        System.out.print("Ia Boolean value to indicate whether the triangle is filled: ");
        boolean filled = input.nextBoolean();

        Triangle triangle1 = new Triangle(side1,side2, side3);

        triangle1.setColor(color);
        triangle1.setFilled(filled);


        System.out.println("\nArea of the triangle: " + triangle1.getArea());
        System.out.println("Perimeter of the triangle: " + triangle1.getPerimeter());
        System.out.println("Color of the triangle: " + triangle1.getColor());
        System.out.println("Is triangle filled: "+ triangle1.isFilled());
        input.close();
    }
}

