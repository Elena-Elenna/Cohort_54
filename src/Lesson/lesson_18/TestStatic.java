package Lesson.lesson_18;

public class TestStatic {
    // non-static поле класса
    int x;

    // static поле класса
    static int staticY;

    // Статические метод
    public static void staticMethod() {
        // статические методы видят ТОЛЬКО статические члены (поля и методы) класса:
        // x++; нет доступа к не-статическому полю
        staticY++;
        // Можем вызвать ТОЛЬКО статические методы
        // nonStaticMethod();

        // Ключевое слово this не доступно в статических методах
        // this.x
    }

    // Не-статический метод
    public void nonStaticMethod() {
        // У нестатических методов есть доступ КО ВСЕМ членам класса:
        x++; // не статика доступна
        staticY++; // статика тоже доступна
        // Можем вызывать и Не-статические, и статические методы класса
        staticMethod();
    }

    // Метод main статический. Имеет доступ только к статическому контенту
    public static void main(String[] args) {
        // x = 10; Ошибка компиляции. У статик метода нет доступа к НЕ-статик переменной
        TestStatic.staticMethod(); // можем вызвать статик метод
        // nonStaticMethod(); не могу вызвать не-статический метод без создания объекта

        TestStatic testStatic = new TestStatic();
        // Я могу вызвать не-статик метод, используя ссылку на объект
        testStatic.nonStaticMethod();

        int sum = MathUtil.sumOfIntegers(1, 2, 5, 6, 7, 8);
        System.out.println("sum: " + sum);

        MathUtil.setCounter(10);

        System.out.println(MathUtil.getCounter());


    }
}
