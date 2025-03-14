package Home_Work.homework_18;
/*
  Task 1
Класс "Калькулятор"
Создайте класс Calculator, который будет предоставлять
базовые арифметические операции: сложение, вычитание, умножение и деление
Класс должен содержать:
Статические методы для каждой математической операции, принимающие два аргумента и возвращающие результат операции.
   */

public class CalculatorApp {
    public static void main(String[] args) {
        int add = Calculator.add(5,5);
        System.out.println("add: " + add);

        int add1 = Calculator.add(5,5,5,5);
        System.out.println("add1: " + add1);

        int subtract = Calculator.subtract(10,5);
        System.out.println("subtract: " + subtract);

        int mult = Calculator.multiply(2,2);
        System.out.println("mult: " + mult);

        int div = Calculator.divide(10,0);
        System.out.println("dividire 0: " + div);

        int divid = Calculator.divide(10,2);
        System.out.println("dividire: " + divid);

        double divid1 = Calculator.divide(10,0);
        System.out.println("dividire: " + divid1);

        System.out.println("==========================");

        double result;
        double x = 10.0;
        result = x / 0;
        //result: Infinity - бесконечность. Бесконечно большое число
        System.out.println("result: " + result);

        double infinity = 1999 / 0.0;
        System.out.println("infinity: " + infinity);

        System.out.println(infinity > result); // false
        System.out.println(infinity == result);// true
        System.out.println(infinity / result); //NaN - значение не определено
        System.out.println(1 / infinity); // 0.0
        System.out.println(infinity + 1555555);
        System.out.println(infinity - 10000);
        System.out.println(infinity - result); //NaN
        double minusInfinity = - 1999 / 0.0;
        System.out.println("minusInfinity: " + minusInfinity); // -Infinity
        System.out.println(infinity > minusInfinity); //true

        double res1 = 1.0 / 5; // 1 -> 1.0
        System.out.println(res1); // 0 -> 0.0

        int res2 = (int) 1.0 / 5; //0.2
        System.out.println(res2);
    }
}
