package lesson_15;

public class Cat {
    // поля класса, описывающие свойства / характеристики
    String name;
    String color;
    int age;

    // Перегрузка конструктора класса
    public Cat(String catName) {
        // Имя (строка) которая будет передана в конструктор
        // будет присвоено полю объекта
        name = catName;
    }

    // Конструктор по умолчанию. Если у нас не написан ни один конструктор в классе
    // То такой конструктор нам добавляется автоматически при компиляции кода
    public Cat() {

    }

    public Cat(String catName, String color) {
        name = catName;
        // Ключевое слово this Используется внутри класса для ссылки на текущий объект
        // this поможет для разрешения конфликта имен между полями класса и параметрами методов / конструкторов
        this.color = color;
    }

    // Ключевое слово this может быть использовано для вызова других конструкторов класса
    public Cat(String name, String color, int age) {
        this(name, color); // вызов другого конструктора. Должен быть первой строкой исполняемого кода
        // Вызывается конструктор класса, принимающий две стринги
        // Соответсвующее поля будут проинициализированы
        // this.name = name;
        // this.color = color;
        this.age = age;
    }

    public void sleep() {
        System.out.println("Я сплю!");
    }

    public void run() {
        System.out.println("Я бегу");
    }

    public void sayMeow() {
        System.out.println("Meow");
    }

    public void info() {
        System.out.printf("Я котик %s, мой возраст: %d, мой окрас: %s\n", name, age, color);
    }

}
