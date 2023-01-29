public class RegularPolygon {
    private int n;
    private double side;
    private double x;
    private double y;
    RegularPolygon() {
        this.side = 1;
        this.x = 0;
        this.y = 0;
        this.n = 3;
    }
    RegularPolygon(int num, double length){
          side = length; n = num; x = 0; y = 0;
    }
    RegularPolygon(int num, double length, double X, double Y){
        side = length; n = num; x = X; y = Y;
    }
    public int getN(){
        return n;
    }
    public void setN(int newN){
        this.n = newN;
    }
    public double getSide(){
        return side;
    }
    public void setSide(double newSide){
        this.side = newSide;
    }
    public double getX(){
        return x;
    }
    public void setX(double newX){
        this.x = newX;
    }
    public double getY(){
        return y;
    }
    public void setY(double newY){
        this.y = newY;
    }
    public double getPerimeter(){
        return n*side;
    }
    public double getArea(){
        return (n*side*side)/4*Math.tan(Math.PI/n);
    }
}
