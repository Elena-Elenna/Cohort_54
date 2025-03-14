package Lesson.lesson_08;

public class While {
    public static void main(String[] args) {


        /*
        while (условие) {
            // Тело цикла
        }
         */

        // Получить и распечатать последовательность чисел от 1 до 10

        int x = 1;

        while (x <= 10) {
            // тело цикла
            System.out.println(x);
            x++; // x = x + 1;
        }

        System.out.println("Х после цикла: " + x);
        System.out.println("Продолжение выполнение программы");

        System.out.println();

        // Распечатать все числа от 100 до 90 в порядке убывания
        int j = 100;
        while (j > 89) {
            System.out.println(j--);
        }

        System.out.println("j: " + j);

        System.out.println("\n===================Сумма чисел");

        // Задача. Найти сумму чисел от 1 до 100.
        /*
        1. Завести переменную для накопления суммы
        2. Перебрать последовательно числа от 1 до 100
        3. Каждое из этих чисел прибавить к текущему значению переменной-аккумулятора.
         */

        int sum = 0; // Переменная аккумулятор с начальным значением 0
        int i = 1;
        while (i <= 100) { // Условие цикла (предикат)
            sum = sum + i; // Добавить текущее значение i к сумме
            i++; // Увеличиваем i на 1
        }

        System.out.println("Сумма чисел от 1 до 100 = " + sum);

        System.out.println("\n ================");
        // Бесконечный цикл

//        i = 1;
//        while (i <= 5) {
//            System.out.println(i);
//        }

        System.out.println("Продолжение программы");

        // Вывести на экран все четные числа в диапазоне от 1 до 21
        /*
        1. Запустить перебор чисел от 1 до 21
        2. Проверить каждое число.
        2.1. Если число четное - распечатать
        2.2. Если не четное - никаких действий не требуется
        3. Берем след. число (изменить счетчик цикла)
         */

        i = 1;
        while (i <= 21) {
            // Проверяем на четность
            if (i % 2 == 0) {
                // Число четное. Надо распечатать
                System.out.print(i + ", ");
            }
            i++; // Увеличиваем счетчик = берем след.число на проверку.
        }
        System.out.println();

        System.out.println("\n ======================= ");
        String hello = "Hello, Java!";

        // Распечатать каждый символ (char) и его десятичный код из строки hello в отдельной строке.
        /*
        Нам нужно перебрать все индексы нашей строки: 0 до (length - 1)
        Взять символ по "текущему" индексу. Распечатать
        Взять след. индекс
         */

        i = 0;
        while (i < hello.length()) {
            char c = hello.charAt(i);
            System.out.println(c + " | " + (int) c);
            i++;
        }

    }
}
