package lesson_23.paper;

public class Pencil extends Pen{

    @Override
    public void draw(String figureName) {
        System.out.println("Рисую карандашом " + figureName);
    }
}
