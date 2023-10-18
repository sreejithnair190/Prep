package OOPs.Properties.Polymorphism;

public class Main {
    public static void main(String[] args) {
        Shape shape = new Shape();
        Circle circle = new Circle();
        Triangle triangle = new Triangle();

        shape.info();
        circle.info();
        triangle.info();
    }

}
