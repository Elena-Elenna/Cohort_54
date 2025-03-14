package Home_Work.homework_36.teacherHW.task_1;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author Sergey Bugaenko
 * {@code @date} 11.02.2025
 */

public class SportsmanApp {
    public static void main(String[] args) {

        Sportsman[] sportsmanArray = new Sportsman[6];
        sportsmanArray[0] = new Sportsman("John", 100.5, 28);
        sportsmanArray[1] = new Sportsman("Alex", 90.78, 24);
        sportsmanArray[2] = new Sportsman("Bob", 100.5, 30);
        sportsmanArray[3] = new Sportsman("Tim", 50, 30);
        sportsmanArray[4] = new Sportsman("Hanna", 90.5, -1_600_000_000);
        sportsmanArray[5] = new Sportsman("Zlatan", 75, 1_400_000_000);

        Arrays.sort(sportsmanArray);

        for (Sportsman sportsman : sportsmanArray) {
            System.out.println(sportsman);
        }

        System.out.println("===================\n");
        Arrays.sort(sportsmanArray, new SportsmanScoreComparator());
        for (Sportsman sportsman : sportsmanArray) {
            System.out.println(sportsman);
        }


        System.out.println((int) (90.75 - 90.50));
        System.out.println(Double.compare(90.75, 90.50));
        System.out.println("===================\n");

        Arrays.sort(sportsmanArray, new Comparator<Sportsman>() {
            @Override
            public int compare(Sportsman s1, Sportsman s2) {
                return Integer.compare(s1.getAge(), s2.getAge());
                // Сравниваем примитивы вычитанием - Может произойти переполнение типа данных
                // и как следствие, некорректный результат операции вычитания
//                return s1.getAge() - s2.getAge();
            }
        });

        for (Sportsman sportsman : sportsmanArray) {
            System.out.println(sportsman);
        }

        int x1 = -1_500_000_000;
        int x2 = 1_400_000_000;
        System.out.println(x1 - x2);
        System.out.println(Integer.compare(x1, x2));


    }
}
