package lesson_19;

public class Constanta {
    public static final double PI = 3.141519; //Constanta
    public static final int[] ints = new int[10]; // Не является константой, т.к. значения в массиве могут быть изменены
    public static final String COUNTRY = "Germani"; //Константа (подписывается большими буквами)
    public static final String[] colors = {"red","blue","yellow"}; // не константа т.к. значения в массиве могут быть изменены


    private final int x;  //не константа, т.к. значения переменных могут быть разными для разных объектов

    public Constanta(int x){
        this.x = x;
        colors[1] = "green";

    }

    public int getX() {
        return x;
    }

    public void showCountry(){
        System.out.println("My country is" + COUNTRY);
    }
}
