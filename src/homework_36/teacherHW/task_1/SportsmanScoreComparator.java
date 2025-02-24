package homework_36.teacherHW.task_1;

import java.util.Comparator;

/**
 * @author Sergey Bugaenko
 * {@code @date} 11.02.2025
 */

public class SportsmanScoreComparator implements Comparator<Sportsman> {

    @Override
    public int compare(Sportsman s1, Sportsman s2) {
        return Double.compare(s1.getScore(), s2.getScore());
        // (int) 0.1 -> 0A
    }
}

// Два спортсмена s1 10.5 vs s2 10.4
// s2, s1
// Такая реализация будет работать не верно, при разнице очков меньше 1
//return (int) (s1.getScore() - s2.getScore());
