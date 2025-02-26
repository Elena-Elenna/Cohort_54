package lesson_25.generics;
//T - type, E - element, K - key, V - value

public class Generics<T>{
    private T value;


    public Generics(T value) {
        this.value = value;
    }


    public T getValue() {
        return this.value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "GenericBox: {" +
                "value = " + value +
                '}';
    }
}
