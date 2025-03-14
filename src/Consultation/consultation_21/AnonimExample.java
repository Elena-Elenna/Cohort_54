package Consultation.consultation_21;

public class AnonimExample {
    public static void main(String[] args) {
        // Анонимный класс
        MyRanner runnable = new MyRanner() {
            @Override
            public void run() {
                System.out.println("Hello!");
            }
        };
        runnable.run();

        // Аналогично через лямбда-выражение
        MyRanner runnable2 = () -> System.out.println("Hello!");
        runnable2.run();
    }

    @FunctionalInterface
    interface MyRanner {
        void run();
    }
}
