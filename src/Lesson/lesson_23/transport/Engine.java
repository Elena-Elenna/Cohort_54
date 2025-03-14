package Lesson.lesson_23.transport;

public class Engine {
    private int power;
    private final  String type;
    private boolean isStarted;


    public Engine(int power, String type) {
        this.power = power;
        this.type = type;
    }


    public void start(){
        if(isStarted){                     //проверить запущен ли двигатель, если нет - тогда запустить
            System.out.println("Двигатель уже работает");
        }else {
            isStarted = true;
            System.out.println("Запускаем двигатель");
        }
    }


    @Override
    public String toString() {
        return "Engine{" +
                "power=" + power +
                ", type='" + type + '\'' +
                ", isStarted=" + isStarted +
                '}';
    }


}
