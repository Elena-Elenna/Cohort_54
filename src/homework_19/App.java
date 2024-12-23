package homework_19;
/*
  Task 1
Класс "Калькулятор"
Создайте класс Calculator, который будет предоставлять
базовые арифметические операции: сложение, вычитание, умножение и деление
Класс должен содержать:
Статические методы для каждой математической операции, принимающие два аргумента и возвращающие результат операции.
========================================================================================
Дополните Класс "Калькулятор" из предыдущего домашнего задания
Класс Calculator, который будет предоставлять
- Вычисление длины окружности и площади круга по ее радиусу
Класс должен содержать:
- Методы для вычисления длины окружности и площади круга, принимающий радиус и возвращающий результат.
- Константу (число Пи)

   */

public class App {
    public static void main(String[] args) {
        double radius = Calculator_19.circleArea(5);
        System.out.println("Площадь круга: " + radius);

        double radius1 = Calculator_19.circumference(10);
        System.out.println("Длинна окружности: " + radius1);

        System.out.println(Calculator_19.circleArea(5));
        System.out.println(Calculator_19.circumference(10));
    }
}
