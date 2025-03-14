package Home_Work.homework_20.technique;
/*
Придумать и написать как минимум одну иерархию классов в которой будет один родительский клас и два наследника,
расширяющих его функционал.
У родительского класса должен быть метод создающий строку с информацией об объекте (метод String toString()).
 */

public class ElectronicDevice {
    private String model;
    private int year;


    public ElectronicDevice(String model, int year) {
        this.model = model;
        this.year = year;
    }

    public String toString(){
        return "Model: " + model + "; year: " + year;
    }

    public String getModel() {
        return this.model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return this.year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
