package homework_24.triathlon;
/*
Task 1
Создайте интерфейсы Swimmer и Runner с методами swim() и run() соответственно.
Реализуйте класс Triathlete, который будет реализовывать оба интерфейса.
Убедитесь, что класс Triathlete корректно выполняет действия, связанные с бегом и плаванием.
 */

public class App {
    public static void main(String[] args) {
        Triathlete ben = new Triathlete("Ben", 25);
        ben.swim();
        ben.run();
        System.out.println(ben);

    }
}
