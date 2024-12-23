package lesson_25.generics;

public class GenericApp {
    public static void main(String[] args) {


//    GenericBox<Car> boxCar = new GenericBox<>();

        GenericBox<String> box = new GenericBox<>("Hello");

        String str = box.getValue();

        System.out.println(str);
        System.out.println(str.length());
        System.out.println(str.toUpperCase());

        box.setValue("Test");
        System.out.println(box);

        System.out.println("++++++++++++++");

        //Generics - работают только со ссылочными типами данных, т.е. НЕ работают с примитивами
//        GenericBox<int> boxInt = new GenericBox<int>();


    }
}
