package Consultation.consultation_13.generic;

public class Generic <T>{
    private T value;

    public void setValue(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }
}
