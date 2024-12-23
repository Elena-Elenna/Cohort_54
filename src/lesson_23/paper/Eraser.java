package lesson_23.paper;

public class Eraser extends Pen{
    @Override
    public void draw(String figureName) {
        System.out.println("Стираю " + figureName);
    }
}
