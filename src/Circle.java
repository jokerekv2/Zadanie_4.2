import static java.lang.Math.PI;
import static java.lang.Math.pow;

public class Circle {
    private double r;

    public Circle(double r) {
        this.r = r;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    public double circleArea() {
        return PI * pow(r, 2);
    }
}
