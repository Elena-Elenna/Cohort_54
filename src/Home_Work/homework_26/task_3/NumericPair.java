package Home_Work.homework_26.task_3;

public class NumericPair <T extends Number, V extends Number> {
    private T value;
    private V value1;


    public NumericPair(T value, V value1) {
        this.value = value;
        this.value1 = value1;
    }

    public double sum() {
        return value.doubleValue() + value1.doubleValue();
    }

    public T getValue() {
        return this.value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public V getValue1() {
        return this.value1;
    }

    public void setValue1(V value1) {
        this.value1 = value1;
    }


    @Override
    public String toString() {
        return "NumericPair {" +
                "value = " + value +
                "; value1 = " + value1 +
                '}';
    }
}
