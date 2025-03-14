package Home_Work.homework_20.mathFigures;
/*
Класс Circle (Круг)
• Создайте класс Circle, который наследуется от Shape.
• Добавьте поле radius типа double, которое хранит радиус круга.
• Создайте метод setRadius(double radius), который устанавливает значение поля radius.
• Создайте метод calculateArea(), который вычисляет и выводит площадь круга.
 */

public class Circle extends Shape{
    private double radius;

    public Circle(String name, String color, double radius) {
        super(name, color);
        this.radius = radius;
        calculateArea();
    }

    public Circle(String name, String color) {
        super(name, color);
    }


    public double calculateArea(){
        double area = Math.PI * radius * radius;
        System.out.println("Площадь круга: " + area);
        return area;
    }

    public double getRadius() {
        return this.radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}
