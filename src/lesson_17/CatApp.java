package lesson_17;

public class CatApp {
    public static void main(String[] args) {
        Cat cat = new Cat("Catty",8,5);

        System.out.println(cat.toString());
//        System.out.println(cat.name);//name не доступно так как помечено private

//        cat.age = -1000; // не доступно так как помечено приват
//        cat.weight = 1500;//доступно только в этом пакете, в другом пакете будет не доступно т.к. помечено protected
//        cat.name = null;

        System.out.println(cat.toString());

        cat.sayMeow();
//        cat.test(); // приватный метод я не могу вызвать
        String catName = cat.getName();
        System.out.println("catName: " + cat.getName());
        System.out.println("catAge: " + cat.getAge());

        cat.setName(null);
        System.out.println("++++++++++++++++++++++");
        cat.setName("Max");
        cat.setAge(15);

        System.out.println(cat.toString());
        cat.eat();
        System.out.println(cat.toString());
    }
}
