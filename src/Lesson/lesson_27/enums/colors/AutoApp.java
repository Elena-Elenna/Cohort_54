package Lesson.lesson_27.enums.colors;

public class AutoApp {
    public static void main(String[] args) {

        Color color = Color.RED; //Обращаемся к константе (сначала берем клас или Enum)

        System.out.println(color);

        Auto auto = new Auto("BMV", Color.BLUE);
        System.out.println(auto);

        auto.setColor(color);
        System.out.println(auto);
        System.out.println("-----------------------");

        // 1. МЕТОД, КОТОРЫЙ ВОЗВРАЩАЕТ МАССИВ ЗНАЧЕНИЙ

        Color[] colors = Color.values();
        for (Color col : colors){
            System.out.println(col);
        }

        // 2. МЕТОД КОТОРЫЙ ВОЗВРАЩАЕТ enum ПО СТРОКОВОМУ ИМЕНИ

        Color color1 = Color.valueOf("RED");
        System.out.println("color1: " + color1);

        // 3. МЕТОД ПОЛУЧИТЬ ИМЯ КОНСТАНТЫ (СТРОКУ)

        String name = Color.GREEN.name();
        System.out.println("name: " + name.toLowerCase());

        // 4. МЕТОД, КОТОРЫЙ МОЖЕТ ПОЛУЧИТЬ ПОРЯДКОВЫЙ НОМЕР КОНСТАНТЫ (начиная с 0)

        int ordinal = Color.BLUE.ordinal();
        System.out.println(ordinal);

        System.out.println("----------------------");

        switch (auto.getColor()){
            case RED:
                System.out.println("Color: RED");
                break;
            case GREEN:
                System.out.println("Color: GREEN");
                break;
            case BLUE:
                System.out.println("Color: BLUE");
            default:
                System.out.println("Color: null");
        }

        System.out.println("----------------------");

        //Enum - безопасно сравнивать на равенство оператором ==

        auto.setColor(Color.BLUE);
        if (auto.getColor() == Color.BLUE){
            System.out.println("Color BLUE");
        } else {
            System.out.println("not BLUE");
        }



    }
}
