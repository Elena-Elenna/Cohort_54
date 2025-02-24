package homework_39.teacherHW;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/*
Task 1
Частотный словарь слов: Напишите метод, который принимает строку текста и возвращает Map<String, Integer>,
где каждому слову соответствует количество его вхождений в текст.

Task2 (*Опционально):
Напишите метод, возвращающий частотный словарь вхождения символов в строку
 */


public class FrequencyDictionary {
    public static void main(String[] args) {
        String text = "Строка для проверки количества вхождений слов" +
                ".\n Строка для проверки и теста. и количества слов для проверки";

        Map<String, Integer> frequencyMap = frequencyDictionary(text);
        System.out.println("option 1: " + frequencyMap);
        System.out.println("option 2: " + frequencyDictionary2(text));
        System.out.println("option 3: " + frequencyDictionary3(text));
        frequencyMap = frequencyDictionary2(text);
        Map<String, Integer> frequencyMap2 = frequencyDictionary3(text);
        System.out.println("frequencyMap.equals(frequencyMap2): " + frequencyMap.equals(frequencyMap2));
        System.out.println("option 4: " + frequencyDictionary4(text));
        System.out.println("option 5: " + frequencyDictionary5(text));

//        frequencyMap.forEach((key, value) -> System.out.println(key + ": " + value));

//        Map<Character, Integer> frequencyCharsMap = frequencyCharsDictionary(text);
//
//        System.out.println("\nВхождение символов: ");
//        frequencyCharsMap.forEach((k, v) -> System.out.print("'" + k + "': " + v + "; "));
//        System.out.println();
    }

    private static Map<String, Integer> frequencyDictionary(String text) {
        /*
        1. Поместить в какую-то коллекцию слова из текста
        2. Создать карту вхождения лов -> Слово : кол-воВхождений
        3. Перебирать кол-цию слов. Проверять:
            Если слово есть - обновить значение (староеЗначение +1)
            Если слова нет - добавить новую пару: ключ со значением 1
         */

       String[] words = text.replaceAll("[^a-zA-Zа-яА-Я ]", "").split("\\s+");
//        System.out.println(Arrays.toString(words));

        Map<String, Integer> result = new HashMap<>();

        // перебираю слова
        for (String word : words) {

            // Пытаюсь получить значение, ассоциированное ключу "текущее слово"
            Integer amount = result.get(word);

            // Если такого какого ключа нет - вернется null
            if (amount == null) amount = 0;

            // увеличиваю значение amount
            amount = amount + 1;

            // Записать в карту новую или обновленную пару ключ-значение
            result.put(word, amount);
        }

        return result;
    }

    private static Map<String, Integer> frequencyDictionary2(String text) {
             String[] words = text.replaceAll("[^a-zA-Zа-яА-Я ]", "").split("\\s+");

        Map<String, Integer> result = new HashMap<>();

        // перебираю слова
        for (String word : words) {

            // Пытаюсь получить значение, ассоциированное ключу "текущее слово"
            // Если такого какого ключа нет - вернется null
            // увеличиваю значение amount

            Integer amount = result.getOrDefault(word, 0);

            // Записать в карту новую или обновленную пару ключ-значение
            result.put(word, ++amount);
        }

        return result;
    }

    private static Map<String, Integer> frequencyDictionary3(String text) {
        String[] words = text.replaceAll("[^a-zA-Zа-яА-Я ]", "").split("\\s+");

        Map<String, Integer> result = new HashMap<>();

        // перебираю слова
        for (String word : words) {
            /*
            compute(K key, BiFunction<K,V> remappingFunction)
            Метод compute позволяет вычислить новое значение для указанного ключа,
            использую функцию пересчета.
            Новое значение может зависеть от текущего ключа и текущего значения
            Если функция пересчета вернет null, то запись удаляется из карты
             */

            // oldValue = result.get(word)
//            result.compute(word, (key, oldValue) -> oldValue == null ? 1 : null);
            result.compute(word, (key, oldValue) -> oldValue == null ? 1 : oldValue + 1);
//            result.put(word, 1)
//            result.put(word, oldValue + 1)

        }

        return result;
    }

    private static Map<String, Integer> frequencyDictionary4(String text) {
        String[] words = text.replaceAll("[^a-zA-Zа-яА-Я ]", "").split("\\s+");

        Map<String, Integer> result = new HashMap<>();

        // перебираю слова
        for (String word : words) {
            /*
            compute(K key, BiFunction<K,V> remappingFunction)
            Метод compute позволяет вычислить новое значение для указанного ключа,
            использую функцию пересчета.
            Новое значение может зависеть от текущего ключа и текущего значения

             */

            // oldValue = result.get(word)
//            result.compute(word, (key, oldValue) -> oldValue == null ? 1 : oldValue + 1);
//            result.put(word, 1)
//            result.put(word, oldValue + 1)

            // Вычисляет новое значение, ТОЛЬКЛО ЕСЛИ ключу было ассоциировано какое-то не-null значение
            result.computeIfPresent(word, (key, value) -> value + 1);
//            result.computeIfPresent(word, (key, value) -> 1000);

            // Метод вычисляет новое значение для ключа, ТОЛЬКО ЕСЛИ ключ еще не присутствует в карте (или возвращает null)
            result.computeIfAbsent(word, key -> 1);
            // put(word, 1)

        }

        return result;
    }

    private static Map<String, Integer> frequencyDictionary5(String text) {
        String[] words = text.replaceAll("[^a-zA-Zа-яА-Я ]", "").split("\\s+");

        Map<String, Integer> result = new HashMap<>();

        // перебираю слова
        for (String word : words) {
            /*
           merge (K key, V value, BiFunction<K,V> remappingFunction)
           Метод merge используется для объединения значений по ключу
           Как работает:
            - Если ключа не существует (или вернул null), новое значение будет вставляться в карту
            - Если ключ уже существует (вернул не-null) применится функция объединения,
            которая может использовать старое и новое значение
            Если функция вернет null - пара удалится (или не запишется)
             */

            result.merge(word, 1, (oldValue, myValue) -> oldValue + myValue);
//            result.merge(word, 1, Integer::sum);

        }

        return result;
    }
}

















