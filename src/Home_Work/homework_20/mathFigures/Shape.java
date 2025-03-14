package Home_Work.homework_20.mathFigures;
/*
Создайте программу, которая демонстрирует наследование с использованием классов геометрических фигур.
Базовый класс Shape:
• Создайте класс Shape.
• Добавьте поле name типа String, которое хранит название фигуры.
• Создайте метод displayInfo(), который выводит на экран значение поля name.
  Добавьте в класс Shape поле color типа String и метод setColor(String color).
• Установите цвет для каждой фигуры и выведите эту информацию в методе displayInfo().
 */

public class Shape {
    private String name;
    private String color;


    public Shape(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public void displayInfo() {
        System.out.println("Фигура: " + name + "; Цвет: " + color);}

    public String getName() {return this.name;}

    public void setName(String name) {this.name = name;}

    public String getColor() {return this.color;}

    public void setColor(String color) {
        this.color = color;
        displayInfo();
    }
}
