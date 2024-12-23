package lesson_25.generics;

public class SimpleBox {
    private Object value;


    public SimpleBox(Object value) {
        this.value = value;
    }


    public Object getValue() {
        return this.value;
    }

    public void setValue(Object value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "SimpleBox {" +
                "value = " + value +
                '}';
    }
}
