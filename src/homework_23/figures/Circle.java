package homework_23.figures;

public class Circle extends Shape {
    private double radius;

    public Circle(String type, double radius) {
        super(type);
        this.radius = radius;
    }


    @Override
    public double area() {
        return Math.PI * radius * radius;
    }

    @Override
    public double perimeter() {
        return 2 * Math.PI * radius;
    }
}
