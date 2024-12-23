package homework_14;
/*
Task 2
Найти второе по величине число в массиве
Напишите метод, который находит второе по величине число в массиве целых чисел.
 */

public class Task_2_2 {
    public static void main(String[] args) {

        int[] test = {1, 2,3,3,4,5,6,7,8,9,10};
        int second = secondMaxValue(test);
        System.out.println("second max: " + second);
    } //Methods area

    public static int secondMaxValue(int[] array) {
        if (array == null || array.length == 0) {
            return Integer.MIN_VALUE; // минимавльное число типа int
//            Integer.MAX_VALUE максимальное число диапазона int
        }
        int max = array[0];
        int secondMax = array[0];

        for (int i = 0; i < array.length; i++){
            int num = array[i];
            if (num > max){
                secondMax = max;
                max = num;
            } else if (num > secondMax && num != max) {
                secondMax = num;
            }
        }
        return secondMax;
    }
}
