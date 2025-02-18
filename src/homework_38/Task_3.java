package homework_38;

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
}
