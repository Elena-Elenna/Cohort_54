package lesson_04;

public class Casting {
    public static void main(String[] args) {
             /*
        Два способа преобразования типов данных:
        1. Неявное преобразование (автоматическое)
        2. Явное преобразование (кастинг)
         */
        // Неявное преобразование происходит автоматически,
        // когда значение меньшего типа данных преобразуется в больший тип данных

        byte byteVar = 123; // -128...127
        int intVal;
        intVal = byteVar; // неявное преобразование типа byte в тип int
        double doubleVar = intVal; // неявное преобразование int в double
        System.out.println(intVal);
        System.out.println(doubleVar);

        double test = 9_000_000_000_000_000_000_000_000_000_000_000_000_000_000_000.00;

        // Явное преобразование
        // Требуется, когда нужно преобразовать значение бОльшего типа данных в значение меньше
        // Небезопасное преобразование. Может привести к потере данных

        double double1 = 42.9;
        int int1 = (int) double1; // Явное преобразование double в int
        System.out.println("double1: " + double1);
        System.out.println("int1: " + int1);

        // Преобразование в вычислениях

        int x = 20;
        int y = 7;
        double result;

        // 2.85....
        // 20 / 7 = 2 (int) -> 2.0 (double)
        result = x / y;
        System.out.println("result: " + result );

        // 20.0 / 7.0 = 2.8571 (double) -> 2.8571 (double)
        result = x / 7.0;

        // Когда в выражении (в формуле) присутствует несколько типов данных, то все значения в выражении
        // автоматически преобразуются к самому большому типу
        // Если в выражения есть хотя бы одно значение с плавающей точкой (float / double),
        // то все целочисленные типы в этом выражении кастируются к типу double

        System.out.println("result: " + result);

        // 20.0f / 7.0f -> 2.85f -> 2.85 (double)
        result = (float) x / y; // Будет произведено обычное деление (не целочисленное)
        System.out.println("result: " + result);

        // 20 -> 20.0 / 7.0 = 2.85 (double) -> 2.85 (double)
        result = x / (double) y;
        System.out.println("result: " + result);

    }
}
