package homework_10;
/*
Task 2
Написать метод, принимающий на вход массив строк.
Метод должен вернуть массив, состоящий из самой короткой и самой длинной строки изначального массива.
 */

import java.util.Arrays;

public class Task_2 {
    public static void main(String[] args) {

        String[] str = {"two", "three", "four","1"};
        String[] leng = arrayString(str);
        System.out.println("Самая короткая строка: " + leng[0]);
        System.out.println("Самая длинная строка: " + leng[1]);

        // +++++++++++++++++++++++++++++++++++++++++++++++++++++++++

        String[] strings = {"One", "Two", "Python", "JS", "Hello"};
        String[] result = getArrayWithSmallestStrings(strings);
        System.out.println(Arrays.toString(result));

        result = null;
        System.out.println("\n ============= testArray = null / length = 0 ================ \n");

        strings = null;
        strings = new String[0];
        result = getArrayWithSmallestStrings(strings);
        System.out.println(Arrays.toString(result));


        System.out.println("\n =================== null in array =============");
        strings = new String[]{"One", "Two", "Python", null, "Hello"};
        result = getArrayWithSmallestStrings(strings);
        System.out.println(Arrays.toString(result));

        System.out.println("\n ================ null in array is First");
        strings = new String[]{null, null, null,  "Python", "JS", null, "Hello"};
        result = getArrayWithSmallestStrings(strings);
        System.out.println(Arrays.toString(result));
    }

    public static String[] arrayString (String[] array) {
        if (array == null || array.length == 0) {
            return new String[]{"", ""};
        }
        String min = array[0];
        String max = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i].length() < min.length()) min = array[i];
            if (array[i].length() > max.length()) max = array[i];
        }
        return new String[]{min, max};
    }
    // +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

    public static String[] getArrayWithSmallestStrings(String[] strings) {
        if (strings == null || strings.length == 0) {
            return new String[0];
        }
        String notNullString = findFirstNotNullValueInArray(strings);
        System.out.println("notNullString: " + notNullString );

        if (notNullString == null) {
            return new String[0];
        }
        String smallestString = notNullString;
        String maximumString = notNullString;
        for (int i = 0; i < strings.length; i++) {

            System.out.print(strings[i] + "; ");

            if (strings[i] != null  &&  strings[i].length() <  smallestString.length()) {
                smallestString = strings[i];
            }
            if (strings[i] != null &&  strings[i].length() > maximumString.length()) {
                maximumString = strings[i];
            }
        }
        System.out.println();
        return new String[] {smallestString, maximumString};
    }

    public static String  findFirstNotNullValueInArray(String[] strings) {
        for (int i = 0; i < strings.length; i++) {
            if (strings[i] != null) return strings[i];
        }
        return null;
    }
}

