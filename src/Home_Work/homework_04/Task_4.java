package Home_Work.homework_04;
/*
Task 4 * (Опционально)
Напишите программу на Java, которая преобразует ваше имя,
записанное маленькими буквами, в верхний регистр.
Для каждой буквы имени создайте отдельную переменную типа char,
инициализированную соответствующей буквой в нижнем регистре.
Затем преобразуйте каждую букву в верхний регистр, используя только арифметические операции
(без использования библиотечных функций), и выведите результат.
Пример программы:
        char ch1 = 'h';
        char ch2 = 'a';
        char ch3 = 'n';
        char ch4 = 'n';
        char ch5 = 'a';
        // Ваш код
        Output:HANNA
Пояснение
Переменные ch1, ch2, ch3, ch4 и ch5 должны быть преобразованы из нижнего регистра в верхний
с использованием только арифметических операций.
Вывод результата должен быть в виде строки с именем в верхнем регистре.
*/

public class Task_4 {
    public static void main(String[] args) {

        char e1='e';
        e1 -=32;
        char l='l';
        l -=32;
        char e2='e';
        e2 -=32;
        char n='n';
        n -=32;
        char a1='a';
        a1 -=32;
        System.out.println("Name: " +e1+l+e2+n+a1);


        // ++++++++++++++++++++++++++++++++++++++++
        char a = (char)('e'-32);
        char b = (char)('l'-32);
        char c = (char)('e'-32);
        char d = (char)('n'-32);
        char e = (char)('a'-32);
        System.out.println("Name: " +a+b+c+d+e);
    }
}
