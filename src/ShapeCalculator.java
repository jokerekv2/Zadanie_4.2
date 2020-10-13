import static java.lang.Math.*;

public class ShapeCalculator {
    double squareArea(Square square){
        return pow(square.getA(), 2);
    }

    double circleArea(Circle circle) {
        return PI * pow(circle.getR(), 2);
    }

    double trianglePerimeter(Triangle triangle) {
        return triangle.getA() + triangle.getB() + triangle.getC();
    }

    double rectPerimeter(Rectangle rectangle) {
        return rectangle.getA() * rectangle.getB();
    }
}