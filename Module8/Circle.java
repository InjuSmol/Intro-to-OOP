public class Circle {
    private double radius;

    Circle() {
        this.radius = 1;
    }

    Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return this.radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    public void setRadius(double rad) {
        this.radius = rad;
    }

    public String toString() {
        return ("Radius: " + this.radius + "\nArea: " + this.getArea() + "\nPerimeter: " + getPerimeter());
    }

}

class ComparableCircle extends Circle implements Comparable<Circle> {
    ComparableCircle(double radius){
        super(radius);
    }
    public int compareTo(Circle c) {
        if (getArea() > c.getArea())
            return 1;
        else if (getArea() < c.getArea())
            return -1;
        else
            return 0;
    }
    public String toString(Circle c){
        return ("The result of comparison: "+ this.compareTo(c));
    }

}
