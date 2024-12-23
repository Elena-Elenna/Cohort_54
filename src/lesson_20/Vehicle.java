package lesson_20;

public class Vehicle {
    protected String model;  //protected - в коде классов-наследниках мы будем иметь прямой доступ к этому полю
    private int year;


    public Vehicle(String model, int year) {
        this.model = model;
        this.year = year;
    }

    public Vehicle(){
        this.model = "Default";
        this.year = 2000;
    }


    public void  start(){
        System.out.println("начинает движение: " + model);
    }

    public void stop(){
        System.out.println("останавливается: " + model);
    }

    public void setYear(int year) {this.year = year;}

    public int getYear() {return year;}

    public void setModel(String model) {this.model = model;}

    public String getModel() {return model;}

    public  String toString(){return model + ", год выпуска: " + year;}
}
