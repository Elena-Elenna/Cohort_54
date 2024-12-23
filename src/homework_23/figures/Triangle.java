package homework_23.figures;

public class Triangle extends Shape{
    private double a;
    private double b;
    private double c;


    public Triangle(String type, double a, double b, double c) {
        super(type);
        this.a = a;
        this.b = b;
        this.c = c;

        if (!isValidSides()) { // невозможно составить треугольник?
            System.out.println("Invalid sides");
            this.a = 3;
            this.b = 4;
            this.c = 5;
        }
    }


    private boolean isValidSides(){
        return a < b + c && b < a + c && c < a + b;
    }

    @Override
    public double area() {
        double s = perimeter() / 2;
        return  Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

    @Override
    public double perimeter() {
        return a + b + c;
    }

    @Override
    public String toString() {
        return "Triangle {" +
                "a: " + a +
                ", b: " + b +
                ", c: " + c +
                '}';
    }
}
