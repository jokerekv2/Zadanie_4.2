public class Main {
    public static void main(String[] args) {
        Square square = new Square(5.0);
        double squareArea = square.squareArea();
        Circle circle = new Circle(3.3);
        double circleArea = circle.circleArea();
        Triangle triangle = new Triangle(3.1, 5.0, 9.0);
        double trianglePerimeter = triangle.trianglePerimeter();
        Rectangle rectangle = new Rectangle(3.5, 6.0);
        double rectanglePerimeter = rectangle.rectPerimeter();

        System.out.println(squareArea + "\n" + circleArea + "\n" + trianglePerimeter + "\n" + rectanglePerimeter);

    }
}
