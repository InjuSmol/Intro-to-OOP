import java.util.ArrayList;
import java.util.Arrays;
public class Lab172 {
    public static void main(String[] args) {
        ArrayList<String> lst1 = new ArrayList<>(Arrays.asList("Austin", "Dallas", "San Fransisco"));
        ArrayList<String> lst2 = new ArrayList<>(Arrays.asList("Boston", "Chicago", "Denver", "Seattle"));
        System.out.println(mergeList(lst1, lst2));
    }
    public static ArrayList<String> mergeList(ArrayList<String> lst1, ArrayList<String> lst2) {
        ArrayList<String> list = new ArrayList<String>();

        for(int i =0, j = 0;(i < lst1.size() || j < lst2.size());){
            if (i < lst1.size() && (j >= lst2.size() || lst1.get(i).compareTo(lst2.get(j)) < 0)) {
                list.add(lst1.get(i));
                i++;
            }
            else {
                list.add(lst2.get(j));
                j++;
            }
        }
        return list;
    }
}
