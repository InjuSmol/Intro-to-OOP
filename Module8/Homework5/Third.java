
public class Third {
    public static void main (String [] args){
        Circle2D c1 = new Circle2D(2,2,5.5);
        System.out.println("Perimeter of c1: " + c1.getPerimeter());
        System.out.println("Area of c1: " + c1.getArea());
        System.out.println("Contains (3,3)? "+ c1.contains(3, 3));
        System.out.println("Contains circle(4, 5, 10.5)? "+c1.contains (new Circle2D(4, 5, 10.5)));
        System.out.println("Overlaps Circle(3, 5, 2.3)? "+c1.overlaps(new Circle2D(3, 5, 2.3)));

    }
}
