
import java.io.PrintWriter;
import java.io.FileWriter;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
public class Lab22_1 {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(System.in);
            File f = new File("cities.txt");
            FileWriter fw = new FileWriter(f);
            PrintWriter pw = new PrintWriter(fw);
            for(int i = 0; i< 10;i++ )
                pw.println(input.next());
            input.close();
            pw.close();
        } catch (IOException ex) {
             System.out.print("Exception!!!! ");
        }
        try{
            File f1 = new File ("cities.txt");
            File f2 = new File("output.txt");
            FileWriter fw = new FileWriter(f2);
            PrintWriter pw = new PrintWriter(fw);
            Scanner input = new Scanner(f1);
            String [] arr = new String [10];
            int i = 0;
            while(input.hasNext()){
                arr[i] = input.nextLine();
                i++;
            }
            for(int j = 0; j < arr.length; j++){
                pw.println(arr[arr.length-1-j]);
            }
            pw.close();
            input.close();
        }
        catch(IOException ioex){
            System.out.print("Exception!!!! ");
        }
    }
}
