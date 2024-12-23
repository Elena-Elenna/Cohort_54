package homework_10;
/*
Task 3
Написать метод, принимающий на вход массив целых чисел.
Метод должен вернуть массив, состоящий только из простых чисел, присутствующих в изначальном массиве
вход -> {0, 13, -25, 11, 31, 55, 98, 11, 5} -> выход {13, 11, 31, 11, 5}
 */

import java.util.Arrays;

public class Task_3 {
    public static void main(String[] args) {

        int[] input = {0, 13, -25, 11, 31, 55, 98, 11, 5};
        int[] primes = numberFilter(input);

        for (int i = 0; i < primes.length; i++) {
            System.out.print(primes[i] + ", ");
        }
        // +++++++++++++++++++++++++++++++++++++++++++++
        int[] array = {0, 13, -25, 11, 31, 55, 67, 98, 11, 5, 100003};

        int[] primeArray = getArrayOnlyWithPrime(array);
        System.out.println(Arrays.toString(primeArray));

    }

    public static boolean primeCount(int number) {
        if (number <= 1) return false;
        for (int i = 2; i < number; i++) {  //проверка прост.числа
            if (number % i == 0) return false;
        }
        return true;
    }

    public static int[] numberFilter(int[] array) {

        int counter = 0;
        for (int i = 0; i < array.length; i++) {          // счет прост. чисел
            if (primeCount(array[i])) counter++;
        }


        int[] primes = new int[counter];
        int ind = 0;
        for (int i = 0; i < array.length; i++) {       //заполнение нового массива
            if(primeCount(array[i])) {
                primes[ind] = array[i];
                ind++;
            }
        }
        return primes;
    }

    //+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
    public static int[] getArrayOnlyWithPrime(int[] numbers) {

        int count = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (isPrime(numbers[i])) {
                count++;
            }
        }
        if (count == 0) return new int[0];

        int[] result = new int[count];

        for (int i = 0, idxPrime = 0; i < numbers.length; i++) {
            if (isPrime(numbers[i])) {
                result[idxPrime] = numbers[i];
                idxPrime++;
            }
        }
        return result;
    }

    public static boolean isPrime(int number) {
        if (number <= 1) return false;
        System.out.println("Проверяем: " + number);
        for (int i = 2; i <= Math.sqrt(number); i++) {
            System.out.print(i + ", ");
            if (number % i == 0) return false;
        }
        System.out.println();
        return true;
    }
}
