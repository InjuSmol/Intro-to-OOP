// Varvara Smolianova 115284311
public class Lab14_1 {
    public static void main (String [] args){
        Rectangle R1 = new Rectangle(4,40);
        Rectangle R2 = new Rectangle(3.5, 35.9);
        System.out.println("\nFirst rectangle: ");
        System.out.println("   width: "+R1.width+"\n   height: "+R1.height+"\n   area: "+R1.getArea()+"\n   perimeter: "+R1.getPerimeter());
        System.out.println("\nSecond rectangle: ");
        System.out.println("   width: "+R2.width+"\n   height: "+R2.height+"\n   area: "+R2.getArea()+"\n   perimeter: "+R2.getPerimeter());

    }
}
