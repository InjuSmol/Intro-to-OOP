
import java.util.ArrayList;
import java.util.Scanner;
public class Third {
    public static void main(String [] args){
        String [] arr = new String [10];
//ArrayList<Integer> list = new ArrayList<Integer>();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 10 string values: ");

        for (int i = 0; i<arr.length; i++){ //filling the array
            System.out.print("String #"+ (i+1)+": ");
            arr[i] = input.nextLine();
            System.out.println();
        }
        arr = bubbleSort(arr);

        System.out.print("Sorted strings: ");
        for(int i = 0; i<arr.length;i++)
            System.out.print(arr[i] +" ");

        input.close();
    }
    public static String [] bubbleSort(String [] arr){
        String temp;
            for (int i =0 ; i< arr.length; i++){
                for(int j = 0; j < arr.length-1; j++) {
                    if(arr[j].toLowerCase().charAt(0)>arr[j+1].toLowerCase().charAt(0)) {
                        temp = arr[j];
                        arr[j] = arr[j+1];
                        arr[j+1] = temp;
                    }
                    if(arr[j].toLowerCase().charAt(0)==arr[j+1].toLowerCase().charAt(0)){
                        int k =1;
                        while(arr[j].toLowerCase().charAt(k)==arr[j+1].toLowerCase().charAt(k)&&k!=arr[j].length()-1&& k!=arr[j+1].length()-1){
                            k++;
                        }
                        if(arr[j].toLowerCase().charAt(k)>arr[k].toLowerCase().charAt(0)) {
                            temp = arr[j];
                            arr[j] = arr[j + 1];
                            arr[j + 1] = temp;
                        }
                    }
                }
            }
        return arr;
    }
}

