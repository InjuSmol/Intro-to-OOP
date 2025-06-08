
public class Lab22_2 {
    public static void main (String []args){
        ComparableCircle c3 = new ComparableCircle(6.8);
        ComparableCircle c1 = new ComparableCircle(5.4);
        ComparableCircle c2 = new ComparableCircle (5.4);
        System.out.println(c1.toString(c2));
        System.out.println(c1.toString(c3));
        System.out.println(c3.toString(c1));
    }
}







