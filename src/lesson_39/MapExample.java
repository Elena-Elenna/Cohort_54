package lesson_39;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.Objects;

public class MapExample {
    public static void main(String[] args) {

        /**
         Map <K, V>
         */

        Map<Integer, String> oldTable = new Hashtable<>(); // Устаревшая, медленная. Не рекомендуется использованию.

        Map<String, String> phoneBook = new HashMap<>();

        /**
         V put(K key, V value) ->
         Добавить пару ключ-значение
         Возвращает старое значение, соответствующее этому ключу
         Если значения не было - вернет null
         */
        System.out.println(phoneBook.put("Hanna", "+49-11111111"));
        phoneBook.put("Max", "+49-22222222");
        phoneBook.put("John", "+49-33333333");

        System.out.println("phoneBook: " + phoneBook);

        String oldValue = phoneBook.put("John", "+49-44444444");
        System.out.println("oldValue: " + oldValue);
        System.out.println("phoneBook: " + phoneBook);

        Map<String, String> book2 = new HashMap<>();
        book2.put("Sebastian", "+49-55555555");
        book2.put("Michael", "+49-66666666");
        System.out.println("book2: " + book2);

        /**
         putAll - принимает карту и копирует все пары ключ-значение из этой карты
         */
        phoneBook.putAll(book2);
        System.out.println("phoneBook.putAll(book2): " + phoneBook);

        phoneBook.put("Test", "+49-66666666");
        System.out.println(phoneBook);

        /**
         boolean containsKey(Object key) - возвращает true, если карта содержит такой ключ
         boolean containsValue(Object value) - возвращает true, если в карте есть хотя бы одно такое значение
         */
        System.out.println("phoneBook.containsKey(\"Michael\"): " + phoneBook.containsKey("Michael"));
        System.out.println("phoneBook.containsKey(\"123\"): " + phoneBook.containsKey("123"));
        System.out.println("phoneBook.containsValue(\"+49-66666666\"): " + phoneBook.containsValue("+49-66666666"));
        System.out.println("phoneBook.containsValue(\"+38-00000\"): " + phoneBook.containsValue("+438-00000"));

        System.out.println("\n======== GET =========\n");

        /**
         Взять значение по ключу
         V get(Object key) - возвращает значение по ключу. Если ключа нет - вернет null
         */
        String value = phoneBook.get("Michael");
        System.out.println("phoneBook.get(\"Michael\"): " + value);
        System.out.println("phoneBook.get(\"KEY\"): " + phoneBook.get("KEY"));

        /**
         getOrDefault(Object key, V defaultValue)
         возвращает значение по ключу. Если ключа нет - вернет значение по умолчанию = defaultValue
         */
        String val2 = phoneBook.getOrDefault("Michael", "DEFAULT");
        System.out.println("phoneBook.getOrDefault(\"Michael\"): " + val2);
        val2 = phoneBook.getOrDefault("KEY", "DEFAULT");
        System.out.println("phoneBook.getOrDefault(\"KEY\"): " + val2);

        System.out.println("\n==================\n");

        System.out.println("Objects.hashCode(null): " + Objects.hashCode(null));

        /**
         Конструкторы
         * Создает пустой список пар ключ-значение 16 корзин. Коэффициент загрузки 0.75
         */
        Map<Integer, String> test = new HashMap<>();
        /**
         * Создает пустой список. 32 корзины. Коэффициент загрузки 0.75
         */
        test = new HashMap<>(32);
        /**
         * Создает пустой список. 32 корзины. Коэффициент загрузки 0.90
         */
        test = new HashMap<>(32, 0.90f);
        Map<Integer, String> otherMap = new HashMap<>();
        otherMap.put(1, "a");
        test = new HashMap<>(otherMap); // скопирует все пары ключ-значения
        System.out.println("test: " + test);

        /**
         V remove (Object key) - удаляет пару ключ-значение. Возвращает значение или null
         */
        System.out.println(phoneBook);
        System.out.println(phoneBook.remove("Test")); // Ключ есть. Удалит пару. Вернет старое значение
        System.out.println(phoneBook);
        System.out.println(phoneBook.remove("Test")); // такого ключа нет - вернет null

        /**
         void clear() - очищает карту
         int size () - возвращает кол-во элементов (пар ключ-значение)
         */
        System.out.println("phoneBook.size(): " + phoneBook.size());
        /**
         boolean isEmpty()
         */
        System.out.println("phoneBook.isEmpty(): " + phoneBook.isEmpty());

        // Todo values, keySet, entrySet. put vs replace, forEach...
    }
}
