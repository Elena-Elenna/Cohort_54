package Lesson.lesson_27.enums.days;

public class DaysApp {
    public static void main(String[] args) {

        for (Day day : Day.values()){
            System.out.println("day:" + day);
            System.out.println(" day.getRussianName():" + day.getRussianName());
            System.out.println("day.getDayNumber(): " + day.getDayNumber());
            System.out.println(day.testMethod());
            System.out.println("-------------------------\n");
        }
    }
}
