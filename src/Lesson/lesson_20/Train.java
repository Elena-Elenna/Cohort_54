package Lesson.lesson_20;

public class Train extends Vehicle{

    private int capacity;
    private int countPassengers;
    private int countWagons;
    private final int wagonCapacity;


    public Train(String model, int year, int countWagons, int wagonCapacity){
        //Когда используется механизм наследования - перед созданием объекта класса-потомка.
        //Мы должны вызвать конструктор родителя.
        //Если нет явного вызова конструктора родительского класса,
        // то автоматически добавляется вызов конструктора по умолчанию (конструктор без параметров).
        super(model,year); // вызов конструктора должен быть первой строчкой!!!!!
        this.countWagons = countWagons;
        this.wagonCapacity = wagonCapacity;
        calculateCapacity();
    }


    private void calculateCapacity(){
        this.capacity = countWagons * wagonCapacity;
    }

    public int getCountWagons() {
        return countWagons;
    }

    public void setCountWagons(int countWagons) {
        this.countWagons = countWagons; //т.к. кол-во вагонов изменилось - изменилась и общая вместительность поезда
        calculateCapacity();
    }

    public int getCapacity() {
        return capacity;
    }

    public int getCountPassengers() {
        return countPassengers;
    }

    public int getWagonCapacity() {
        return wagonCapacity;
    }
}
