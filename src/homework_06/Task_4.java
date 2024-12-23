package homework_06;
/*
Task 4
Дан следующий код. Вашей задачей является предсказать,
какой вывод будет напечатан в консоли после выполнения программы.
public class BooleanTest {
    public static void main(String[] args) {
        int a = 8;
        int b = 3;
        boolean result;
        result = (a + b) > 10;
        System.out.println("Result 1: " + result);
        result = (a - b) == 5;
        System.out.println("Result 2: " + result);
        result = (a * b) != 24;
        System.out.println("Result 3: " + result);
        result = (a / b) >= 2;
        System.out.println("Result 4: " + result);
        result = !(a % b == 2);
        System.out.println("Result 5: " + result);
Предскажите, что будет выведено на консоль для Result 1 до Result 5. Объясните кратко свой ответ.
 */

public class Task_4 {
    public static void main(String[] args) {
        int a = 8;
        int b = 3;
        boolean result;

        result = (a + b) > 10; //(8+3) = 11>10
        System.out.println("Result 1: " + result); //true

        result = (a - b) == 5; // (8-3) = 5==5
        System.out.println("Result 2: " + result); //true

        result = (a * b) != 24; //(8*3) = 24 != 24
        System.out.println("Result 3: " + result); //false

        result = (a / b) >= 2; //(8/3) = 2 >= 2  (число без остатка)
        System.out.println("Result 4: " + result); //true

        result = !(a % b == 2); //(8 % 3) = 2 == 2 (остаток) - "!" меняет значение типа boolean
        // на противоположное
        System.out.println("Result 5: " + result); // false

    }
}
