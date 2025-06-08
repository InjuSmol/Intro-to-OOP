
import java.util.ArrayList;
import java.util.Scanner;
public class Lab17_1 {
    public static void main(String[] args) {
        ArrayList<Character> characters = new ArrayList<Character>();
        characters = toCharacterArray(getStringInput());
        System.out.print("Elements of the Character array list: ");
        for (int i = 0; i < characters.size();i++){
            char chr = characters.get(i);
            System.out.print(chr + " ");
        }
    }
    public static String getStringInput(){
        Scanner input = new Scanner(System.in);
        String str;
        System.out.print("Enter the string: ");
        str = input.nextLine();
        input.close();
        return str;
    }
    public static ArrayList<Character> toCharacterArray(String s) {
        ArrayList<Character> list = new ArrayList<Character>();
        for (int i = 0; i < s.length(); i++) {
            list.add(s.charAt(i));
        }
        return list;
    }
}
