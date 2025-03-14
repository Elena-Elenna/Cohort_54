package Lesson.lesson_20;

public class InternationalBus extends Bus{
    private String[] countries;


    public InternationalBus(String model, int year, int capacity, String[] countries) {
        super(model, capacity, year);
        this.countries = countries;
    }


    public void goToRoute() {
        for (int i = 0; i < countries.length; i++) {
            System.out.println("Посещаю страну: " + countries[i]);
        }
    }
}
