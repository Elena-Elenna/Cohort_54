package Lesson.lesson_16;

public class Dog {
    String name;
    int weight;

    public Dog(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }
    void info() {
        System.out.println("I am dog " + name + ", my weight is " + weight);
    }
    void eat() {
        System.out.println("Я кушаю, ням-ням!");
        weight++;
    }
    void run() {
       /*
       1. Проверить достаточен ли вес собачки для совершения пробежки
       2. Если вес слишком мал - собака должна поесть перед тренировкой
        */
        while (weight < 3) {
            // Вес слишком мал. (После тренировки станет или 0, или отрицательное значение)
            System.out.println("Сорян! Я худая и голодная. Бежать не могу!");
            System.out.println("Надо поесть. Мой вес сейчас: " + weight);
            // Кушаем
            eat();
        }
        System.out.println("Я бегу!");
        weight -= 2; // weight = weight - 2;
        System.out.println("Вес после тренировки: " + weight);
        System.out.println("===================\n");
    }
       /*
       weight = weight + 3; weight += 3;
       weight = weight * 4; weight *= 4;
       weight = weight / 5; weight /= 5;
        */
}
