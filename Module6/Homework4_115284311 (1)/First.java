// Smolianova Varvara 115284311
import java.util.ArrayList;
import java.util.Scanner;
public class First {
    public static void main(String[] args) {
        int[] arr = new int[10];
        Scanner input = new Scanner(System.in);
        System.out.print("Enter 10 integers: ");
        for (int i = 0; i < arr.length; i++)
            arr[i] = input.nextInt();
        arr = eliminateDuplicate(arr);
        System.out.print("The distinct integers are: ");
        printArray(arr);
        input.close();
    }
    public static int[] eliminateDuplicate(int[] list) {
//Write this method
      int count = 0;
      for (int i = 0; i< list.length; i++){
          for (int j = i+1; j<list.length; j++){
              if (list[i] == list[j]) {
                  list[j]=0;
              }
          }
      }
      for(int i = 0; i<list.length; i++)
          if( list[i] !=0) count++;
      int [] arr = new int[count];
      int j=0;
      for(int i = 0; i<list.length; i++)
          if( list[i] != 0){
              arr[j] = list[i];
              j++;
          }
       return arr;
    }
    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++)
            System.out.print(array[i] + " ");
        System.out.println();
    }
}