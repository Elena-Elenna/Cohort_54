package lesson_11;
/*
Task 2
Написать метод, принимающий на вход массив строк.
Метод должен вернуть массив, состоящий из самой короткой и самой длинной строки изначального массива.
 */

import java.util.Arrays;

public class Task_2 {
    public static void main(String[] args) {
        String[] strings = {"One", "Two", "Python", "JS", "Hello"};
        String[] result = getArrayWithSmallestStrings(strings);
        System.out.println(Arrays.toString(result));


//        String strVar = null;
//        System.out.println(strVar);
//        // System.out.println(strVar.charAt(1));
//        System.out.println(strVar.length());

        // в этой переменной не хранится ссылка ни какой-то объект
        // null - специальное значение для ссылочных типов данных.
        // По сути указывающее на отсутствие значения
        result = null;
        // System.out.println(result.length); // null.length - аварийное завершение программы

        System.out.println("\n ============= testArray = null / length = 0 ================ \n");

        strings = null;
        // []
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


    public static String[] getArrayWithSmallestStrings(String[] strings) {

        if (strings == null || strings.length == 0) {
            return new String[0];

            // [null, null]
//            return new String[]{null, null}; // Вариант 4
//            return new String[]{"", ""}; // Вариант 3 - худший
//            return new String[0]; // [] Вариант 2
//            return null; // Вариант 1
        }

        // {null, null, null, null, null, "JS"};

        String notNullString = findFirstNotNullValueInArray(strings);
        System.out.println("notNullString: " + notNullString );

        if (notNullString == null) {
            // В массиве нет ни одного "не null" значения
            return new String[0]; // []
        }

        String smallestString = notNullString;
        String maximumString = notNullString;

        for (int i = 0; i < strings.length; i++) {


            // "One", "Two", "Python", null, "Hello"
            System.out.print(strings[i] + "; ");

            // Хорошее решение, но будет работать только с циклами
            // if (strings[i] == null) continue;


            // Рассмотрим более универсальное решение
            //  false && ? => false
            // null != null -> false
            // @2fgf != null -> true
            // true && ? => ?
            if (strings[i] != null  &&  strings[i].length() <  smallestString.length()) {
                smallestString = strings[i];
            }


            if (strings[i] != null &&  strings[i].length() > maximumString.length()) {
                maximumString = strings[i];
            }
        }

        System.out.println();

        // Создаем новый массив, в который будут записаны две строки
        return new String[] {smallestString, maximumString};

//        String[] res = new String[2];
//        res[0] = smallestString;
//        res[1] = maximumString;
//        return res;

    }

    // {null, null, null, null, null, "JS"};
    public static String  findFirstNotNullValueInArray(String[] strings) {
        for (int i = 0; i < strings.length; i++) {
            if (strings[i] != null) return strings[i];
        }
        //Если мы перебрали все элементы массива и не нашли не null значение, возвращаем из метода null
        return null;
    }
}
