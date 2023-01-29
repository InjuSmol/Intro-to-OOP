//DONE
//Third assignment
// Smolianova Varvara 115284311
public class Circle2D {

    private final double PI = 3.14159;
    private double x;
    private double y;

    public double getX(){
        return this.x;
    }
    public double getY(){
        return this.y;
    }
    private double radius;

    public double getRadius(){
        return this.radius;
    }

    Circle2D(){
        this.radius = 1;
        this.x = 0;
        this.y = 0;
    }
    Circle2D(double X, double Y, double R){
        this.radius = R;
        this.x = X;
        this.y = Y;
    }
    public double getArea(){
        return PI*radius*radius;
    }
    public double getPerimeter(){
        return 2*PI*radius;
    }
    public boolean contains(double x, double y){
        return Math.sqrt(Math.pow(x - this.x, 2) +
                Math.pow(y - this.y, 2))
                < radius;
    }
    public boolean contains(Circle2D circle) {
		return Math.sqrt(Math.pow(circle.getX() - x, 2) +
				 Math.pow(circle.getY() - y, 2))
				 <= Math.abs(radius - circle.getRadius());
	}
   public boolean overlaps(Circle2D circle) {
		return Math.sqrt(Math.pow(circle.getX() - x, 2) +
				 Math.pow(circle.getY() - y, 2))
				 <= radius + circle.getRadius();
	}
}
