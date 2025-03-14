package Home_Work.homework_23.figures;
/*
 Task 1
Создайте абстрактный класс Shape с абстрактными методами для вычисления площади и периметра.
Реализуйте классы-наследники Circle, Rectangle, и Triangle.
Убедитесь, что все классы правильно вычисляют площадь и периметр.
Создайте массив объектов Shape и вычислите общую площадь и периметр всех фигур в массиве.
 */

abstract class Shape {
    private String type;


    public Shape(String type) {
        this.type = type;
    }

    public Shape() {
    }

    public abstract double area();

    public abstract double perimeter();

    @Override
    public String toString() {
        return  "Type: " + type + "; area: " + area() + ";  perimeter: " + perimeter() + '}';
    }

}
