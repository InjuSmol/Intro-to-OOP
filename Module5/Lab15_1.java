
public class Lab15_1 {
    public static void main (String [] args){
        RegularPolygon P1 = new RegularPolygon();
        System.out.println("Polygon 1: ");
        System.out.printf("   area: %.4f",P1.getArea());
        System.out.println("\n   perimeter: "+P1.getPerimeter());
        RegularPolygon P2 = new RegularPolygon(6, 4);
        System.out.println("Polygon 2: ");
        System.out.printf("   area: %.4f",P2.getArea());
        System.out.println("\n   perimeter: "+P2.getPerimeter());
        RegularPolygon P3 = new RegularPolygon(10, 4, 5.6, 7.8);
        System.out.println("Polygon 3: ");
        System.out.printf("   area: %.4f",P3.getArea());
        System.out.println("\n   perimeter: "+P3.getPerimeter());

    }
}
