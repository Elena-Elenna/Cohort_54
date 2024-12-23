package lesson_23.transport;

public class App {
    public static void main(String[] args) {
        Car car = new Car(new Engine(200, "Petrol"));
        car.startEngine();
        car.startEngine();

        //Нельзя создать объект абстрактного класса
        System.out.println("++++++++++++++++");

        Vechikle vechikle = new Car(new Engine(200, "Electro"));
        Vechikle[] vechikles = new Vechikle[3];
        vechikles[0] = vechikle;
        vechikles[1] = new Bicycle();
        vechikles[2] = new Motorcycle(new Engine(30, "HFR"));

        for (int i = 0; i < vechikles.length; i++){
            vechikles[i].startEngine();
        }

    }
}
