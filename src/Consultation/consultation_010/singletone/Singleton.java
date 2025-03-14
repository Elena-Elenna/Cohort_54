package Consultation.consultation_010.singletone;

public class Singleton {
    // Единственный экземпляр класса
    private static Singleton instance;

    // Приватный конструктор
    private Singleton() {

    }

    // Глобальная точка доступа к экземпляру
    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}
