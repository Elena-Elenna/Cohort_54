package homework_20.mathFigures;
/*
Класс Rectangle (Прямоугольник)
• Создайте класс Rectangle, который наследуется от Shape.
• Добавьте поля width и height типа double, которые хранят размеры прямоугольника.
• Создайте метод setDimensions(double width, double height), который устанавливает значения полей width и height.
• Создайте метод calculateArea(), который вычисляет и выводит площадь прямоугольника.
 */

public class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(String name, String color, double width, double height) {
        super(name, color);
        this.width = width;
        this.height = height;
        calculateArea();
    }

    public Rectangle(String name, String color) {
        super(name, color);
    }


    public void setDimensions(double width, double height){
        this.width = width;
        this.height = height;
    }

    public double calculateArea() {
        double area = width * height;
        System.out.println("Площадь: " + area);
        return area;
    }

    public double getWidth() {
        return this.width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return this.height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}
