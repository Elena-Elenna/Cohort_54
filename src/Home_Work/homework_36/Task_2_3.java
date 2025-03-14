package Home_Work.homework_36;
/**
               Task 2 * ОПЦИОНАЛЬНО
 Напишите MyComparator, реализующий Comparator с методом сравнения для сортировки массива целых чисел в следующем порядке:
  - Четные целые числа должны идти перед нечетными числами
  Integer[] integers = { 1, 6, 5, 4, 7, 8, 9, 2, 7, 3 };
  Сортировка массива с использованием компаратора
 [2, 4, 6, 8, 1, 3, 5, 7, 7, 9]

              Task 3 * ОПЦИОНАЛЬНО
 Напишите MyComparator2 с методом сравнения для сортировки массива целых чисел в следующем порядке:
 - Четные целые числа должны идти перед нечетными числами в порядке возрастания.
 - Нечетные целые числа должны идти после четных в порядке убывания
 Integer[] integers = { 1, 6, 5, 4, 7, 8, 9, 2, 7, 3 };
 Сортировка массива с использованием компаратора
 [2, 4, 6, 8, 9, 7, 7, 5, 3, 1]
 */
import java.util.Arrays;
import java.util.Comparator;

public class Task_2_3 {
    public static void main(String[] args) {

        Integer[] integers = {1, 6, 5, 4, 7, 8, 9, 2, 7, 3};
        System.out.println(Arrays.toString(integers));
        System.out.println("+++++++++++++++++++++++++++++++++");

        Comparator<Integer> comparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer int1, Integer int2) {
                int firstNumber = int1 % 2;
                int secondNumber = int2 % 2;
                if (firstNumber == 0 && secondNumber != 0) return -1;
                if (firstNumber != 0 && secondNumber == 0) return 1;
                return Integer.compare(int1, int2);
            }
        };
        Arrays.sort(integers, comparator);
        System.out.println(Arrays.toString(integers));
        System.out.println("+++++++++++++++++++++++++++++++++");

        Comparator<Integer> comparator1 = (int1, int2) -> {
            int firstNumber = int1 % 2;
            int secondNumber = int2 % 2;
            if (firstNumber == 0 && secondNumber != 0) return -1;
            if (firstNumber != 0 && secondNumber == 0) return 1;
            if (firstNumber == 0 && secondNumber == 0) return Integer.compare(int1, int2);
            return Integer.compare(int2, int1);
        };
        Arrays.sort(integers, comparator1);
        System.out.println(Arrays.toString(integers));
    }
}

