package Consultation.consultation_2;

public class Test3 {
    public static void main(String[] args) {
        int result;
        int a = 10;
        int b = 20;
        String text = "result(a + b)";

        System.out.println("a = " + a + ", b = " + b);
        result = a + b;
        System.out.println("result = " + result);
        System.out.println();
        // Другой вариант вывода
        System.out.printf("a = %d, b = %d, %s = %d %n", a, b, text, result);

        int num1 = 1;
        int num2 = 2;
        int num3 = 3;

        int resultNum1 = num1 % 2;
        int resultNum2 = num2 % 2;
        int resultNum3 = num3 % 2;
        System.out.println("num1 % 2 = " + resultNum1);
        System.out.println("num2 % 2 = " + resultNum2);
        System.out.println("num3 % 2 = " + resultNum3);

        // 3 / 2 = 1
        // 3 % 2 = 1?

    }
}
