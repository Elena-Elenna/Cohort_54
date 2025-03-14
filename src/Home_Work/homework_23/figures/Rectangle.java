package Home_Work.homework_23.figures;

public class Rectangle extends Shape {
    private double a;
    private double b;


    public Rectangle(String type, double a, double b) {
        super(type);
        this.a = a;
        this.b = b;
    }


    @Override
    public double area() {
        return a * b;
    }

    @Override
    public double perimeter() {
        return (a + b) * 2;
    }
}
