package Home_Work.homework_20.mathFigures;
/*
Класс Main
• В методе main создайте объекты классов Rectangle и Circle.
• Установите значения для их полей с помощью соответствующих методов.
• Установите имя фигуры, используя поле name, унаследованное от класса Shape.
• Вызовите метод displayInfo() и методы вычисления площади для каждого объекта,
  чтобы вывести информацию о фигуре и её площади.
 */

public class FiguresApp {
    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle("Прямоугольник", "фиолетовый", 4.0, 6.0);
        rectangle.displayInfo();
        rectangle.calculateArea();
        rectangle.setDimensions(2.0, 4.0);
        rectangle.displayInfo();
        System.out.println("Ширина: " + rectangle.getWidth());
        System.out.println("Высота: " + rectangle.getHeight());
        rectangle.setHeight(7.4);
        System.out.println("Высота: " + rectangle.getHeight());
        rectangle.setWidth(22.13);
        System.out.println("Ширина: " + rectangle.getWidth());

        System.out.println("\n++++++++++++++++++++++++++++\n");

        Circle circle = new Circle("Круг", "Белый", 4.8);
        System.out.println("Name: " + circle.getName());
        System.out.println("Color: " + circle.getColor());
        System.out.println("Radius: " + circle.getRadius());
        circle.setRadius(0.25);
        System.out.println("Radius: " + circle.getRadius());
        circle.calculateArea();
    }
}
