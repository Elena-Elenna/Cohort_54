package homework_26.task_1;
/*
Task 1
Создайте обобщенный класс Pair, который хранит две переменные одного типа.
Требования:
Класс должен иметь конструктор, принимающий два параметра типа T.
Методы:
T getFirst() — возвращает первый элемент.
T getSecond() — возвращает второй элемент.
void setFirst(T value) — устанавливает значение первого элемента.
void setSecond(T value) — устанавливает значение второго элемента.
void swap() — меняет местами первый и второй элементы.
 */

public class App {
    public static void main(String[] args) {

        Pair<String> stringPair = new Pair<>("Java", "Kotlin");
        System.out.println(stringPair.toString());

        stringPair.swap();
        System.out.println(stringPair);

    }
}
