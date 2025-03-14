package Home_Work.homework_26.task_3;
/*
Задача 9: Обобщенный класс с ограничениями типов
Описание:
Создайте обобщенный класс NumericPair, который хранит две числовые переменные и имеет метод для вычисления их суммы.
Требования:
•	Класс должен иметь конструктор для инициализации двух чисел.
•	Метод double sum() возвращает сумму этих чисел.

Copy
Пример использования:
NumericPair<Integer> intPair = new NumericPair<>(10, 20);
System.out.println(intPair.sum()); // Вывод: 30.0

NumericPair<Double> doublePair = new NumericPair<>(5.5, 4.5);
System.out.println(doublePair.sum()); // Вывод: 10.0
 */

public class App {
    public static void main(String[] args) {
        NumericPair <Integer,Integer> integerNumericPair = new NumericPair<>(10,20);
        System.out.println(integerNumericPair.sum());

        NumericPair<Double, Integer> summa = new NumericPair<>(1.5, 2);
        System.out.println(summa.sum());

    }
}
