package Lesson.lesson_24.flyers;

public abstract class Transport {
    protected int capacity;

    public Transport(int capacity) {
        this.capacity = capacity;
    }

    abstract void takePassengers();

    public int countPassengers(){
        return capacity;
    }
}
