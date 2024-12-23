package homework_23.figures;

public class TriangleSingle extends Shape{
    private double a;
    private double b;
    private double c;




//    private static TriangleSingle instance;

    private TriangleSingle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    //TODO паттерн Singleton
    public static TriangleSingle getInstance(double a, double b, double c) {
        if (isValidSides(a, b, c)) {
            // Могу составить треугольник
            return new TriangleSingle(a, b, c);
        } else {
            System.out.println("Invalid sides!");
            return null;
        }
    }


    private static boolean isValidSides(double a, double b, double c) {
        return a < b + c && b < a + c && c < a + b;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    @Override
    public String toString() {
        return "TriangleSingle{" +
                "a = " + a +
                ", b = " + b +
                ", c = " + c +
                '}';
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
}
