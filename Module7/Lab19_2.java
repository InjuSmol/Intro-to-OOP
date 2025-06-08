
import java.util.ArrayList;
import java.util.Scanner;
public class Lab19_2  {
        public static void main(String [] args) {
                Scanner input = new Scanner(System.in);
                int size;
                System.out.print("How many grades do you have? ");
                size = input.nextInt();
                ArrayList<Integer> list= new ArrayList<Integer>();
                System.out.print("\nEnter grades: ");
                for (int i = 0; i< size; i++)
                        list.add(input.nextInt());
                System.out.println("Your converted grades: ");
                printList(convert(list));
                input.close();
        }
        public static ArrayList<Character> convert(ArrayList<Integer> list1){
                ArrayList<Character> list2 = new ArrayList<Character>();
                for (int i = 0; i<list1.size(); i++) {
                        if      (list1.get(i) <= 100 && list1.get(i) >= 90) list2.add('A');
                        else if (list1.get(i) < 90 && list1.get(i) >= 80) list2.add('B');
                        else if (list1.get(i) < 80 && list1.get(i) >= 70) list2.add('C');
                        else if (list1.get(i) < 70 && list1.get(i) >= 60) list2.add('D');
                        else if (list1.get(i) < 60 && list1.get(i) >= 0) list2.add('F');
                        else list2.add('-');
                }
                return list2;
        }
        public static void printList(ArrayList<Character> l){
                System.out.println();
                for (int i = 0; i< l.size(); i++)
                        System.out.println(i+1+": "+ l.get(i));
        }
}
