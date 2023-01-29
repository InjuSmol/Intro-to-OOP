// Smolianova Varvara 115284311
import java.util.Scanner;
public class Anagram {
    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first string: ");
        String str1 = input.nextLine();
        System.out.print("\nEnter the second string: ");
        String str2 =input.nextLine();

        System.out.print("\n" + str1 + " and "+ str2);
        if (isAnagrams(str1,str2)) System.out.print(" are anagrams");
        else if (!isAnagrams(str1,str2)) System.out.print(" are NOT anagrams");
        input.close();
    }
    public static boolean isAnagrams(String first,String second){
       for (int i = 0; i < first.length();i++) {
           if (first.charAt(i) != ' ' && second.toLowerCase().indexOf(first.toLowerCase().charAt(i)) == -1) return false;
           if (second.charAt(i) != ' ' && first.toLowerCase().indexOf(second.toLowerCase().charAt(i)) == -1) return false;
       }
        return true;
    }
}

