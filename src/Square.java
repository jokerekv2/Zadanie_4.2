import static java.lang.Math.pow;

public class Square {
    private double a;

    public Square(double a) {
        this.a = a;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double squareArea(){
        return pow(a, 2);
    }
}
