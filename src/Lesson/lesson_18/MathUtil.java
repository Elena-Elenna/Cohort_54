package Lesson.lesson_18;

public class MathUtil {
    private static int counter = 0;

    public static int sumOfIntegers(int x, int... ints) {
        int sum = x;
        for (int i = 0; i < ints.length; i++) {
            sum += ints[i];
        }
        return sum;
    }

    public static int getCounter() {
        return counter;
    }

    public static void setCounter(int counter) {
        MathUtil.counter = counter;
    }

}
