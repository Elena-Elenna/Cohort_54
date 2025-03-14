package Home_Work.homework_38;

/*
  Task 3 Опционально
  Написать метод, возвращающий первый неповторяющийся символ в строке

  public static void main(String[] args) {
  String string = "abcdefj ab,cdf,";
  System.out.println(StrUtil.getFirstUniqueChar(string));
  }

  //Output:
  e
 */

import java.util.*;

public class Task_3 {
    public static void main(String[] args) {
        String string = "abcdefj ab caaadf";
        System.out.println(getFirstUniqueChar(string));
        System.out.println(getFirstUniqueChar1(string));
        System.out.println(getFirstUniqueChar2(string));
    }

    public static String getFirstUniqueChar(String strings) {
        String[] stringArray = strings.split("");
        List<String> list = new ArrayList<>(Arrays.asList(stringArray));
        Set<String> set = new LinkedHashSet(Arrays.asList(stringArray));
        for(String value : set) {
            list.remove(value);
            if (list.remove(value) == false) return value;
        }
        return null;
    }

    private static Character getFirstUniqueChar1(String string) {
        Set<Character> uniqueChars = new LinkedHashSet<>();
        Set<Character> repeatedChars = new HashSet<>();

        //Перебираю буквы в цикле
        for (char ch : string.toCharArray()) {

            // Проверяю, присутствует ли текущий символ в сете повторов
            if (repeatedChars.contains(ch)) {
                continue;
            }
            /*
            1. Проверить, есть ли символ в уникальных
                1.1. Если есть: Убрать из списка уникальных + добавить в список повторов
                1.2. Если нет в уникальных - значит добавить в уникальные
             */

            if (uniqueChars.contains(ch)) {
                uniqueChars.remove(ch); // Убираю символ из уникальных
                repeatedChars.add(ch); // добавляем в повторяющиеся
            } else {
                uniqueChars.add(ch);
            }
        }

        System.out.println("uniqueChars: " + uniqueChars);
        System.out.println("repeatedChars: " + repeatedChars);


        // Берем итератор, один раз вызываем next() - получаем первый элемент
        // Проверяем, сет уникальных на пустоту
        return uniqueChars.isEmpty() ? null : uniqueChars.iterator().next();

    }

    //этот метод всегда не корректно работает
    private static Character getFirstUniqueChar2(String string) {
        Set<Character> uniqueChars = new LinkedHashSet<>();
        /*
        Перебрать все символы в строке.
        Добавить символ в коллекцию уникальных символов.
        Если встретится повторяющийся символ - он не должен быть в коллекции уникальных
         */

        char[] chars = string.toCharArray();
        for (char ch : chars) {
            // true / false

            // Это не работает. Это решение отсекает только дважды встречающиеся символы
            // 3-й повтор символа - записывает его в уникальные

            // Если метод add вернул false, значит добавить символ в set не получилось, т.к. такой символ там уже есть
            if (!uniqueChars.add(ch)) {
                // я только что добавил символ повторно
                uniqueChars.remove(ch);
            }
        }

        System.out.println("uniq" + uniqueChars);

        return null;
    }
}
