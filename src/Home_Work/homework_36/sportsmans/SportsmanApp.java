package Home_Work.homework_36.sportsmans;
/**
 Task 1
 1. Создайте класс Sportsman с тремя полями: name (имя), age (возраст) и score (рейтинг).
 2. Реализуйте интерфейс Comparable в классе Sportsman, чтобы задать “естественный” порядок сортировки,
 например, по name.
 3. Создайте отдельный класс, реализующий Comparator,
 чтобы сортировать объекты класса Sportsman по другому критерию, например, по score.
 4. В методе main создайте массив из нескольких объектов Sportsman.
 5. Отсортируйте его с использованием:
 - естественного порядка, определенного в Comparable,
 - данного класса Comparator,
 - анонимного класса Comparator для сортировки по третьему полю
 (например, age).
 6. Выведите каждый вариант отсортированного массива в консоль.
 */

import java.util.Arrays;
import java.util.Comparator;

public class SportsmanApp {
    public static void main(String[] args) {

        Sportsman[] sportsmanArray = new Sportsman[6];
        sportsmanArray[0] = new Sportsman("Ivan", 28.75, 28);
        sportsmanArray[1] = new Sportsman("Alex", 90.78, 24);
        sportsmanArray[2] = new Sportsman("Bob", 100.40, 30);
        sportsmanArray[3] = new Sportsman("Tim", 50.03, 30);
        sportsmanArray[4] = new Sportsman("Hanna", 90.50, 26);
        sportsmanArray[5] = new Sportsman("Rom", 75.80, 25);

        Arrays.sort(sportsmanArray);
        for (Sportsman sportsman : sportsmanArray) {
            System.out.println(sportsman);
        }
        System.out.println("\n+++++++++++++++++++++++++++++++");
        Arrays.sort(sportsmanArray, new SportsmanScoreComparator());
        for (Sportsman sportsman : sportsmanArray) {
            System.out.println(sportsman);
        }
        System.out.println("\n+++++++++++++++++++++++++++++++");
        Arrays.sort(sportsmanArray, new Comparator <Sportsman>() {
            @Override
            public int compare(Sportsman s1, Sportsman s2) {
                return Integer.compare(s1.getAge(), s2.getAge());
            }
        });
        for (Sportsman sportsman : sportsmanArray) {
            System.out.println(sportsman);
        }
    }
}
