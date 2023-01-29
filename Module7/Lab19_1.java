import java.util.ArrayList;
import java.util.Scanner;
// Smolianova Varvara 115284311
public class Lab19_1 {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<Integer> (5);
        System.out.print("Enter five numbers: ");
        for (int i = 0; i< 5; i++){
            list.add(input.nextInt());
        }
        sort(list);
        System.out.print("Your numbers in increasing order: ");
        for (int i = 0; i< 5; i++)
            System.out.print(list.get(i)+  " ");

        input.close();
    }
    public static void sort(ArrayList<Integer> list){
        int temp;
        for (int i =0 ; i< list.size(); i++)
            for(int j = 0; j < list.size()-1; j++)
                if(list.get(j)>list.get(j+1)) {
                    temp = list.get(j);
                    list.set(j,list.get(j+1));
                    list.set(j+1,temp);
                }
}
}