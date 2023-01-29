// Varvara Smolianova 115284311
import java.util.Scanner;
public class Lab13_1 {
    public static void main (String [] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int num = input.nextInt();
        int [] scores = new int [num];
        System.out.print("\nEnter students' scores: ");
        int best = 0;
        for (int i = 0; i<num; i++) {
            scores[i] = input.nextInt();
            if (scores[i] > best)  best = scores[i];
        }

        for (int i =0; i<num; i++)
            System.out.print("\nStudent "+ (i+1) +" score is "+ scores[i]+" and grade is "+whatScore(scores[i],best));

      input.close();
    }
    public static char whatScore(int score, int b){
         if (score >= (b-10)) return 'A';
         else if (score >= (b-20)) return 'B';
         else if (score >= (b-30)) return 'C';
         else if (score >= (b-40)) return 'D';
         return 'F';
    }

}
