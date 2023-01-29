public class Rectangle {
    double width;
    double height;

    public Rectangle(){
        width =1;
        height=1;
    }
    public Rectangle(double w, double h){
        width = w;
        height = h;
    }
    public double getArea(){
        return width*height;
    }
    public double getPerimeter(){
        return (width+height)*2;
    }
}

