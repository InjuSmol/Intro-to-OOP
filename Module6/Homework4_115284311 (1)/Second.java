
import java.util.ArrayList;
import java.util.Scanner;
public class Second {
    public static void main(String [] args){

        ArrayList<Integer> list = new ArrayList<Integer>();
        Scanner input = new Scanner(System.in);

        System.out.print("Enter list1 size and contents: ");
        int size1 = input.nextInt();
        int [] arr1 = new int [size1];
        for(int i =0;i<arr1.length;i++)
            arr1[i] = input.nextInt(); input.nextLine();
        System.out.print("\nEnter list2 size and contents: ");
        int size2 = input.nextInt();
        int [] arr2 = new int [size2];
        for(int i =0;i<arr2.length;i++)
            arr2[i] = input.nextInt(); input.nextLine();
        System.out.println();

        System.out.print("List1 is ");
        printArray(arr1);

        System.out.print("List2 is ");
        printArray(arr2);
        int [] mArr = new int [size1 +size2];
        System.out.print("\n The merged list is ");
        mArr = merge(arr1, arr2);
        printArray(mArr);
        input.close();
    }//main
    public static void sort(int[] arr){
        int temp;
        for (int i = 0; i<arr.length; i++)
            for (int j = 0; j< arr.length-1; j++){
                if(arr[j]> arr[j+1]){
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
    }
    public static int []merge (int[] list1, int []list2){
        int [] arrM = new int [list1.length + list2.length];
        for (int i = 0; i< list1.length; i++)
            arrM[i] = list1[i];
        int j = 0;
        for (int i = list1.length; i <arrM.length;i++){
            arrM[i] = list2[j];
            j++;
        }

            sort(arrM);
        return arrM;
    }
    public static void printArray (int [] array){
        for (int i =0; i <array.length; i++)
            System.out.print(array[i]+ " ");
        System.out.println();
    }
}//class

