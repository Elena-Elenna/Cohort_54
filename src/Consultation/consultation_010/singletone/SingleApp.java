package Consultation.consultation_010.singletone;

public class SingleApp {
    public static void main(String[] args) {

        // Singleton singleton = new Singleton(); // Конструктор приватный. Невозможно создать объект, используя оператор new

        Singleton singleton = Singleton.getInstance();

    }
}
