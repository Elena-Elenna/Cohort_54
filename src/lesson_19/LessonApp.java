package lesson_19;

public class LessonApp {
    public static void main(String[] args) {

        ConstantDemo demo = new ConstantDemo(10);
        System.out.println(demo.getX());

        ConstantDemo demo2 = new ConstantDemo(20);
        System.out.println(demo2.getX());
        System.out.println(ConstantDemo.COUNTRY);

        //Constanta - для определения константы необходимо добавить модификаторы static final к полю класса
        // Константа - это статическое финальное поле,содержимое которого неизменно.
        // Константа - переменная которую не может изменить ни один объект(экземпляр) класса
        // Константами могут быть примитивы, строки String какие-то неизменяемые типы данных
        // она создается и инициализируется только один раз для всех объектов, сколько бы их ни было

        final String text = "Hello World";
        String text1 = text.toUpperCase();
        System.out.println(text);
        System.out.println("Новая строка полученная с использованием строки text: " + text1);
    }
}
