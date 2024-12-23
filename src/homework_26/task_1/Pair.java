package homework_26.task_1;

public class Pair <T> {
    private T first;
    private T second;


    public Pair(T first, T second) {
        this.first = first;
        this.second = second;
    }


    @Override
    public String toString() {
        return "Pair {" +
                "first = " + first +
                "; second = " + second +
                '}';
    }

    public void swap(){
        T temp = first;
        first = second;
        second = temp;
    }

    public T getFirst() {
        return this.first;
    }

    public void setFirst(T first) {
        this.first = first;
    }

    public T getSecond() {
        return this.second;
    }

    public void setSecond(T second) {
        this.second = second;
    }
}
