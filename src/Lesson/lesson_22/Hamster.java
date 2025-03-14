package Lesson.lesson_22;

public class Hamster extends Animal{
    @Override
    public void voice() {
        System.out.println("Hamster voice HRUM-hrum");
    }

    @Override
    public String toString() {
        return super.toString() + " | Hamster. Дополнение реализации родительского метода";
    }
}
