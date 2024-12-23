package lesson_04;

public class TypChar {
    public static void main(String[] args) {


        char a = 'A'; // Переменная будет хранить букву А латинского алфавита
        char a1 = 65; // Переменная будет хранить букву А латинского алфавита, соответствующую коду 65 в десятичной системе счисления
        char a2 = 0x41; // Присваиваем код в 16-ном формате. Что будет соответствовать все той жу букве А
        a2 = 0x0041; // полная форма записи числа в 16 системе счисления
        char a3 = '\u0041'; // Еще один способ задать значение в 16 формате
        char x = '\u15D7';



        System.out.println("a: " + a);
        System.out.println("a1: " + a1);
        System.out.println("a2: " + a2);
        System.out.println("a3: " + a3);
        System.out.println("x: " + x);

        char digit0 = 48;
        System.out.println("digit0: " + digit0);

        // digit0 = (char) (digit0 + 5);
        digit0 += 5; // digit0 = (char) (digit0 + 5);
        System.out.println("digit0: " + digit0);

        /*
        1. digit0 (char) -> int
        2. сложение двух int -> int
        3. Нужно явно преобразовать int в char
         */


        char letter = 97;
        System.out.println("letter: " + letter);

        letter++;
        System.out.println("letter: " + letter);

        System.out.println("преобразование char -> int даст 10-й код символа: " + (int) letter);
        System.out.println(0 + letter); // так можно, но не нужно.

        /*
        0...9 -> соответствуют кодам 48...57
        a...z -> соответствуют кодам 97...122
        A...Z -> соответствуют кодам 65...90
         */


        // _ 0..9 A..F -> A1C3
        // 189 -> 100 * 1  + 10 * 8 + 1 * 9;
        // 10^ 0; 10 ^ 1; 10 ^ 2
        // 00041 -> 16 ^ 0 * 1 + 16 ^ 1 * 4 + 16 ^ 2 * 0 + 16 ^ 3 * 0 -> 1* 1 + 16 * 4 -> 64 + 1 = 65
        // 01000001 -> 2 ^ 6 + 2 ^ 0 = 65

    }
}
