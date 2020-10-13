public class Main {
    public static void main(String[] args) {
        ShapeCalculator calculator = new ShapeCalculator();
        System.out.println(calculator.circleArea(new Circle(5.0)));
        System.out.println(calculator.rectPerimeter(new Rectangle(2.3, 4.0)));
        System.out.println(calculator.squareArea(new Square(3.0)));
        System.out.println(calculator.trianglePerimeter(new Triangle(3.1, 5.0, 9.0)));
    }
}
