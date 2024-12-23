package lesson_23.paper;

public class ColorPencil extends Pencil{

    private String color = "red";

    @Override
    public void draw(String figureName) {
        System.out.println("Рисую цветным карандашом ( цвет: " + color + ") фигуру " + figureName);
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
