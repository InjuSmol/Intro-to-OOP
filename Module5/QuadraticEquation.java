public class QuadraticEquation {
    private double a=1;
    private double b=1;
    private double c=1;
    public QuadraticEquation(double A,double B,double C){
        a=A; b=B; c=C;
    }

    public double getA(){
        return a;
    }
    public double getB(){
        return a;
    }
    public double getC(){
        return a;
    }
    public double getDiscriminant(){
        double discriminant = b*b - 4*a*c;
        return discriminant;
    }
    public double getRoot1() {
        if(this.getDiscriminant()<0) return 0;
        if(this.a ==0) return 0;
        return (-b+Math.pow(this.getDiscriminant(),0.5))/2*a;
    }
    public double getRoot2(){
        if(this.getDiscriminant() <0) return 0;
        if(this.a ==0) return 0;
        return (-b-Math.pow(this.getDiscriminant(),0.5))/2*a;
    }
}
