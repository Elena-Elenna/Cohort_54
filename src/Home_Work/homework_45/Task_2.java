package Home_Work.homework_45;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.List;
import java.util.Optional;

/*
Task 2
Написать метод, принимающий список из нескольких дат типа LocalDate
и возвращающий количество дней между самой ранней и поздней датами в этом списке
 */

public class Task_2 {
    public static void main(String[] args) {

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        List <LocalDate> dateList = List.of(
                LocalDate.of(2025, 7, 6),
                LocalDate.of(2022, 3, 21),
                LocalDate.of(2019, 5, 16),
                LocalDate.of(2024, 7, 6),
                LocalDate.of(2025, 2, 12));

        System.out.println("Список дат:");
        for(LocalDate ld : dateList){
            System.out.println(ld.format(formatter));
        }
        System.out.println("Разница между датами: " + getDays(dateList) + " дней");
    }

    public static long getDays(List <LocalDate> dateList){
        Optional <LocalDate> dateMin = dateList.stream()
                .sorted((d1,d2) -> d1.compareTo(d2))
                .findFirst();
        Optional <LocalDate> dateMax = dateList.stream()
                .sorted((d1,d2) -> d2.compareTo(d1))
                .findFirst();
        System.out.println("Самая ранняя дата: " + dateMin.get());
        System.out.println("Самая поздняя дата: " + dateMax.get());
        return dateMax.get().until(dateMin.get(), ChronoUnit.DAYS);
    }
}
