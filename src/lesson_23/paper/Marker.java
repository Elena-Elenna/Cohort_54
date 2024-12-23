package lesson_23.paper;

public class Marker extends Pen{

    @Override
    public void draw(String figureName) {
        System.out.println("Рисую маркером фигуру " + figureName);

    }
}
