package Lesson.lesson_15;

public class CatApp {
    public static void main(String[] args) {

        // Объект создан, но я не могу получить информации о свойствах этого
        // Не могу вызвать методы, так как у меня нет "пульта управления" (переменной, которая хранит ссылку на этот объект)
        // Такой объект будет удален из памяти Сборщиком мусора (Garbage Collector)
        new Cat();

        Cat cat = new Cat(); // создаем объект класса Cat
        // 1. Физически создается объект в памяти
        // 2. Вызывается конструктор класса для инициализации свойств объекта (заполнение полей начальными значениями)


        cat.sayMeow();
        cat.run();
        cat.sleep();

        /*
            При создании объекта (экземпляра класса) все его поля инициализируются значениями по умолчанию:
            Для числовых примитивов (в том числе char) -> 0 / 0.0
            boolean -> false
            Для всех ссылочных типов (в том числе String) -> null
         */

        String catName = cat.name;
        System.out.println("Имя: " + catName);

        int catAge = cat.age;
        System.out.println("Возраст: " + catAge);

        System.out.println("\n ================= \n");

        Cat cat1 = new Cat("Max");

        cat1.sayMeow();
        System.out.println(cat1.name);
        System.out.println(cat1.age);
        System.out.println();
        cat1.info();

        System.out.println("\n ================= \n");
        Cat cat2 = new Cat("Diamond", "red");
        cat2.info();

        System.out.println("\n============\n");
        Cat cat3 = new Cat("Peter", "black", 8);
        cat3.info();

        System.out.println("\n================= \n");
        Cat cat4 = cat3;

        cat4.info();
        cat3.info();

        cat3.age = 11;
        cat3.info();
        cat4.info();

        System.out.println();

        cat4.name = "Mary";
        cat4.info();
        cat3.info();

        System.out.println("\n ======= new Cat 4 ========\n");
        cat4 = new Cat("Barsik", "white", 1);

        cat4.info();
        cat3.info();
    }
}
