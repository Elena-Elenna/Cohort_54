package homework_45;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

/*
Task 1
Получить и вывести на экран:
текущую дату
текущий год, месяц и день
Создать дату, например Ваш день рождения и вывести на экран
Создать две даты и проверить на равенство
Получить и вывести на экран:
текущее время
текущее время + 3 часа
Создать дату:
которая на неделю позже сегодняшней
которая была на год раньше сегодняшней используя метод minus
которая на год позже сегодняшней
tomorrow и yesterday и проверить находятся ли они до или после сегодняшней
 */
public class Task_1 {
    public static void main(String[] args) {

        LocalDate dateNow = LocalDate.now();
        DateTimeFormatter formatterDate = DateTimeFormatter.ofPattern("dd:MM:yyyy");
        System.out.println("Сегодня: " + dateNow.format(formatterDate) + "\nГод: " + dateNow.getYear() +
                "\nМесяц: " + dateNow.getMonthValue() + "\nДень: " + dateNow.getDayOfMonth());

        System.out.println("===============");
        LocalDate birthday = LocalDate.of(1979,9,28);
        System.out.println("День рождения: " + birthday.format(formatterDate));

        System.out.println("===============");
        LocalDate date1 = LocalDate.of(2012,8,24);
        LocalDate date2 = LocalDate.of(2010,3,24);
        System.out.println("Дата: " + date2.format(formatterDate) + " - после даты: " +
                date1.format(formatterDate) + " ?  -> " + date2.isAfter(date1));

        System.out.println("===============");
        DateTimeFormatter formatterTime = DateTimeFormatter.ofPattern("HH:mm:ss");
        LocalTime timeNow = LocalTime.now();
        System.out.println("Сейчас: " + timeNow.format(formatterTime));
        System.out.println("Сейчас + 3 часа: " + timeNow.plusHours(3).format(formatterTime));

        System.out.println("===============");
        System.out.println("Сегодняшняя дата + 1 неделя: " + dateNow.plusWeeks(1).format(formatterDate));
        System.out.println("Сегодняшняя дата - 1 год: " + dateNow.minusYears(1).format(formatterDate));

        System.out.println("===============");
        LocalDate dateTomorrow = LocalDate.now().plusDays(1);
        LocalDate dateYesterday = LocalDate.now().minusDays(1);
        System.out.println("Сегодня: " + dateNow.format(formatterDate) + "; после вчерашней даты: " +
                dateYesterday.format(formatterDate) + "; и перед завтрашней датой: " +
                dateTomorrow.format(formatterDate) + " ?  -> " + (dateYesterday.isBefore(dateNow) &&
                dateTomorrow.isAfter(dateNow)));
    }
}
