package lesson_03;

public class MathOperations {
    public static void main(String[] args) {


        int var1 = 20;
        int var2 = 7;
        int result;

        // Сложения "+"

        // Результат вычислений выражения в правой части присваивается в переменную, указанную в левой части.
        result = var1 + var2;
        System.out.println("var1 + var2 = " + result);

        result = 15 + 6 + var1;
        // Закомментировать строку Ctrl + /
        System.out.println("result + : " + result);
        result = 15+6+20+7;
        System.out.println(result);


        // Вычитание "-"
        result = var1 - var2;
        System.out.println("var1 - var2 = " + result);
        result = 20-7;
        System.out.println(result);


        // Умножение "*"
        result = var1 * var2;
        System.out.println("var1 * var2 = " + result);
        result = 20*7;
        System.out.println(result);


        // Целочисленное деление "/"
        result = var1 / var2;
        // 20 / 7 -> 2 целые и в остатке 6
        System.out.println("var1 / var2 = " + result);
        result = 20/7;
        System.out.println(result);


        // Остаток от деления "%"
        int rest = var1 % var2;
        System.out.println("var1 % var2 = " + rest);

        System.out.println("Целочисленное деление 4 / 2: " + (4 / 2)); // 2 остаток
        System.out.println("Остаток от деление 4 % 2: " + (4 % 2)); // 0 остаток

        System.out.println("5 / 10 = " + (5 / 10)); //0 остаток
        System.out.println("5 % 10 = " + (5 % 10)); //5 остаток



        System.out.println(" ===================== \n");
        // Приоритет математических операций

        /*
        1. Сначала выполняется то, что в скобках.
        2. Затем выполняется умножение, деление, остаток от деления
        3. В последнюю очередь выполняется сложение, вычитание.
         */

        result =  2 + 10 / 2; // 7
        result =  (2 + 10) / 2; // 6
        System.out.println(result);


        // Деление "/"
        System.out.println(" =================== \n");
        double x = 20.0d; // d - явно указать, что число записано в формате double
        double y = 7.0; // все числа, записанные в нашем коде с "." считаются числами в формате double
        double resultDouble = x / y;
        System.out.println("resultDouble = " + resultDouble);

        int a = 20;
        int b = 7;
        int res = 20 / 7;

        System.out.println("Результат деления " + a + " на " + b + " равен = " + res);

        /*
        %d - целое число
        %s - текст
        %f - число с плавающей точкой
        %n - символ новой строки
        \n - символ новой строки
         */

        // Форматированный вывод.
        // Мы используем шаблон вывода и список значений, которые будут подставлены в этот шаблон.
        System.out.printf("Результат деления %d на %d равен = %d\n", a, b, res);
        System.out.println("Test");

        System.out.printf("Округленный вывод результата деления %f\n", resultDouble);
        System.out.printf("Округленный вывод результата деления %.4f\n", resultDouble);

        // Проблема с double
        double x1 = 0.1;
        double y1 = 0.2;
        double z = x1 + y1; // 0.30000000000000004
        System.out.println("0.1 + 0.2 = " + z);

    }
}
