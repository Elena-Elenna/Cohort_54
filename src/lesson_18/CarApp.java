package lesson_18;

public class CarApp {
    public static void main(String[] args) {
//        Статическая переменная может быть создана только как поле класса
        // static int x;

        System.out.println("Статическое поле до создания объектов");
        System.out.println(Car.totalCars);

        Car car = new Car("BMW", 200);
        System.out.println("До создания второго авто");
        System.out.println(car.toString());

        Car vw = new Car("VW", 300);

        vw.setPower(330);

        System.out.println(car.toString());
        System.out.println(vw.toString());

        System.out.println("Static var: " + Car.totalCars);


        // Я могу обратиться к статике, от имени конкретного объекта
        // Но это плохая практика. Нам следует обращаться к статике от имени класса
//        System.out.println("static var: " + vw.totalCars);

    }
}
