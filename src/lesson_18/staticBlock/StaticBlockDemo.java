package lesson_18.staticBlock;

public class StaticBlockDemo {
    static int counter = 5;
    static String[] colors = new String[counter];

    private String title;
    private int capacity = 10; // Инициализация значения

    // Статический блок инициализации.
    // Вызывается этот блок только один раз, в момент загрузки класса JVM
    // Могут быть проинициализированы статические поля (присвоение начальных значений)
    static {
        System.out.println("Static block run!");
        colors = new String[3];
        colors[0] = "red";
        colors[1] = "yellow";
        colors[2] = "green";
        counter = 10;
    }

    static {
        System.out.println("Second static block run!");
        counter = 25;
    }

    // НЕ статическим блоком инициализации
    // Выполняется при каждом создание объекта
    // Вызывается ДО конструктора
    {
        System.out.println("NON-static block run!");
        this.title = "Block Title";
        this.capacity = 50;
    }


    public StaticBlockDemo() {
        System.out.println("Empty Constructor run");
    }

    public StaticBlockDemo(String title) {
        System.out.println("Constructor run");
        this.title = title; // Инициализация (присвоение значения переменной первый раз)
//        this.capacity = 50;
    }

    public String toString() {
        return String.format("Title: %s, capacity: %d, static-counter: %d",
                title, capacity, counter);
    }
}
