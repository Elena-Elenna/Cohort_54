package lesson_22;

public class Animal {
    public void voice() {
        System.out.println("Animal say something");
    }

    // Полиморфизм. Переопределение метода родительского класса - Object
    @Override
    public String toString() {
        return "Animal to String";
    }
}
