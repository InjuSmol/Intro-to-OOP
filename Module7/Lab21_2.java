// Smolianova Varvara 115284311
public class Lab21_2 {
    public static void main(String[] args) {
        java.util.Scanner input = new java.util.Scanner(System.in);
        int [] arr = new int [100];
        int index;
        for (int i = 0; i < 100;i++){
            arr[i] = (int)(Math.random() * 100) + 1;
        }
        System.out.print("Enter the index of the array: ");
        try{
            index = input.nextInt();
            System.out.print("The corresponding elements value: "+arr[index]);
        }
        catch(ArrayIndexOutOfBoundsException ex){
            System.out.println("The specified index is out of bound");
        }
    }
}

