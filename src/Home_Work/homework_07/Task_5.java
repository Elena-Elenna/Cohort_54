package Home_Work.homework_07;
/*
Task 5 * (Опционально)
Используйте оператор switch для решения задачи:
Ваш ребенок принес оценку за контрольную работу по математике.
В школе 12-балльная система. Запишите в переменную случайное число от 0 до 12.
Вы разрешаете ребенку смотреть телевизор не более 60 минут в день.
На сегодня у него осталось 45 минут.
Если оценка от 10 до 12 баллов: скажите ребенку, как вы рады, и добавьте к оставшемуся времени 1 час.
Оценка от 7 до 9 баллов: похвалите ребенка и добавьте 45 минут.
Оценка от 4 до 6 баллов: нейтрально отнеситесь и добавьте 15 минут.
Оценка 3 балла: огорчитесь и вычтите 30 минут.
Оценка меньше 3 баллов: запретите телевизор на сегодня.
Выведите на экран оставшееся время для просмотра ТВ.
P.S. Проконтролируйте, чтобы ребенок не смотрел ТВ больше 60 минут в день.
 */

import java.util.Random;

public class Task_5 {
    public static void main(String[] args) {
        Random random = new Random();
        int note = random.nextInt(13);
        int time = 45;
        System.out.println("Оценка: " + note);
        switch (note){
            case 12:
            case 11:
            case 10:
                time += 60;
                System.out.println("Молодец!");
                break;
            case 9:
            case 8:
            case 7:
                time += 45;
                System.out.println("Умница");
                break;
            case 6:
            case 5:
            case 4:
                time += 15;
                System.out.println("Нормально");
                break;
            case 3:
                time -= 30;
                System.out.println("Старайся");
                break;
            case 2:
            case 1:
            case 0:
                time = 0;
                System.out.println("Плохо");
                break;
            default:
                System.out.println("Таких оценок не бывает!");
        }
        System.out.println("Время для просмотра ТВ: " + time + " минут");
        if (time > 60){time = 60;}
        System.out.println("Оставшееся время для просмотра ТВ: " + time + " минут");
    }
}
