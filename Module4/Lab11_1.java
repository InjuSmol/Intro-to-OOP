import java.util.Scanner;
public class Lab11_1 {

    public static void main(String[] args) {

        double[] arr = new double[10];

        Scanner input = new Scanner(System.in);

        System.out.println("Enter 10 numbers : ");

        for (int i = 0; i < 10; i++)

            arr[i] = input.nextDouble();

        System.out.println("The mean is " + mean(arr)
        );

        System.out.print("The standard deviation is " + deviation(arr)
        );

        input.close();

    }

    public static double deviation(double[] x) {

        double sum2 = 0;

        double mean = mean(x);

        for (int i = 0; i < x.length; i++)

            sum2 += Math.pow(x[i] - mean, 2);

        return Math.sqrt(sum2 / (x.length - 1)
        );

    }

    public static double mean(double[] x) {

        double sum = 0;

        for (int i = 0; i < x.length; i++) {

            sum += x[i];

        }

        return sum / x.length;

    }

}