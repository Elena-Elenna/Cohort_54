package Home_Work.homework_36.sportsmans;

import java.util.Comparator;

public class SportsmanScoreComparator implements Comparator <Sportsman> {

    @Override
    public int compare(Sportsman s1, Sportsman s2) {return Double.compare(s1.getScore(), s2.getScore());}
}
