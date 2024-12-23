package lesson_27.enums.colors;

public class Auto {
    //    public static final String RED;
//    private String color;
    private String model; //ТОЖЕ КОНСТАНТЫ
    private Color color; //ТОЖЕ КОНСТАНТЫ (Enum)


    public Auto( String model, Color color) {
        this.model = model;
        this.color = color;
    }


    @Override
    public String toString() {
        return "Auto {" +
                "model = '" + model + '\'' +
                ", color = " + color +
                '}';
    }

    public String getModel() {
        return this.model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Color getColor() {
        return this.color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
}
