package lesson_03;

public class Varisbles {
    public static void main(String[] args) {


        int myFirstVariable; // Объявление (декларация) переменной типа int
        myFirstVariable = 1; // Первое присвоение значения переменной называется инициализация.

        int mySecondVariable = 25; // Объявление и инициализация в одной строке
        System.out.println(mySecondVariable);

        // Ctrl + Alt = L | Cmd + Opt + L - выравнивание кода
        mySecondVariable = 50; // присвоение нового значение (переопределение значения переменной)
        System.out.println("Значение переменной mySecondVariable: " + mySecondVariable);


        byte byteVariable = 125; // Объявление и инициализация переменной типа byte
        System.out.println("byteVariable: " + byteVariable);

        // Ctrl + D | Cmd + D - продублировать строчку, в которой находится курсор
        // Shift + Alt + стрелка вверх / вниз | Cmd + Shift + стрелка
        // Ctrl + Y | Cmd + <-  удалить строчку в которой находится курсор

        byteVariable = -100;
        System.out.println("byteVariable: " + byteVariable);



        short shortVariable; // Объявление переменной типа short
        shortVariable = 31000; // Инициализация переменной
        System.out.println("shortVariable: " + shortVariable);


        // Знак _ не влияет на значение переменной. Исключительно для улучшения читаемости кода (значения переменной)
        long longVariable = 2_100_000_000_000_000_000L;
        // L в конце числа - сказать компилятору, что это число в формате long
        System.out.println("longVariable: " + longVariable);


        double doubleVar = 10.5421; // Объявление и инициализация переменной типа double
        System.out.println("doubleVar: " + doubleVar);


        float floatVar = 11.65f; // f - указать, что число в формате float
        System.out.println("floatVar: " + floatVar);

    }
}
