import java.util.Scanner;
public class Lab12_2 {

    public static void main(String[] args) {

        double[]
                [] arr = new double[3]
                [3];

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a 3-by-3 matrix row by row: ");

        for (int i = 0; i < arr.length; i++)

            for (int j = 0; j < arr[i]
                    .length; j++)

                arr[i]
                        [j] = input.nextDouble();

        if (isMarkovMatrix(arr)
        )

            System.out.println("It is a Markov matrix");

        else

            System.out.println("It is not a Markov matrix");

        input.close();

    }

    public static boolean isMarkovMatrix(double[]
                                                 [] m) {

        for (int j = 0; j < m[0]
                .length; j++) {

            double sum = 0;

            for (int i = 0; i < m.length; i++) {

                double that = m[i]
                        [j];

                if (that < 0) return false;

                sum += that;

            }

            if (sum != 1) return false;

        }

        return true;

    }
}