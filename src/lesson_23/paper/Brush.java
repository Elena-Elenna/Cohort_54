package lesson_23.paper;

public class Brush extends Pen{

    @Override
    public void draw(String figureName) {
        System.out.println("Рисую кистью фигуру " + figureName);
    }
}
