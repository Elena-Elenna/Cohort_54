package Home_Work.homework_40;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 Task 1
 Пересечение двух карт:
 Реализуйте метод, который принимает две карты Map<String, Integer> и возвращает новую карту,
 содержащую только те записи, ключи которых присутствуют в обеих исходных картах.

 Для совпадающих ключей значение можно брать из любой карты

 Map<String, Integer> map1 = new HashMap<>();
 map1.put("apple", 50);
 map1.put("banana", 20);
 map1.put("cherry", 30);

 Map<String, Integer> map2 = new HashMap<>();
 map2.put("banana", 25);
 map2.put("cherry", 30);
 map2.put("date", 40);

 Map<String, Integer> intersectionMap = intersection(map1, map2);
 intersectionMap.forEach((key, value) -> System.out.println(key + ": " + value));
 Copy
 //Output
 banana: 20
 cherry: 30
 */
public class Task_1 {
    public static void main(String[] args) {
        Map<String, Integer> map1 = new HashMap<>();
        map1.put("apple", 50);
        map1.put("banana", 20);
        map1.put("cherry", 30);

        Map<String, Integer> map2 = new HashMap<>();
        map2.put("banana", 25);
        map2.put("cherry", 30);
        map2.put("date", 40);

        System.out.println("========== key ==================");
        Map<String, Integer> intersectionMap = intersection(map2, map1);
        intersectionMap.forEach((key, value) -> System.out.println(key + ": " + value));
        System.out.println("========= key ==================");
        Map<String, Integer> intersectionMap1 = intersection1(map1, map2);
        intersectionMap1.forEach((key, value) -> System.out.println(key + ": " + value));
        System.out.println("======== value ==================");
        Map<String, Integer> intersectionMap2 = intersection2(map1, map2);
        intersectionMap2.forEach((key, value) -> System.out.println(key + ": " + value));
        System.out.println("========== key; value (entry) ===============");
        Map<String, Integer> intersectionMap3 = intersection3(map1, map2);
        intersectionMap3.forEach((key, value) -> System.out.println(key + ": " + value));
    }

    private static Map<String, Integer> intersection(Map<String, Integer> map2, Map<String, Integer> map1) {
        Map<String, Integer> map = new HashMap<>(map2);
        Set<String> keySet = map.keySet();
        keySet.retainAll(map1.keySet());
        return map;
    }


    public static Map<String, Integer> intersection1 (Map<String, Integer> map1, Map<String, Integer> map2){
        Map<String,Integer> map = new HashMap<>();
        map1.forEach((key,value) -> {
            if (map2.containsKey(key)) map.put(key,value);
        });
        return map;
    }

    private static Map<String, Integer> intersection2(Map<String, Integer> map1, Map<String, Integer> map2) {
        Map<String, Integer> map = new HashMap<>(map1);
        Collection<Integer> values = map.values();
        values.retainAll(map2.values());
        return map;
    }

    private static Map<String, Integer> intersection3(Map<String, Integer> map1, Map<String, Integer> map2) {
        Map<String, Integer> map = new HashMap<>(map1);
        Set<Map.Entry<String, Integer>> entries = map.entrySet();
        entries.retainAll(map2.entrySet());
        return map;
    }
}
