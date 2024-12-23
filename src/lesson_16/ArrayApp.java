package lesson_16;

public class ArrayApp {
    public static void main(String[] args) {

        MagicArray magicArray = new MagicArray();
        System.out.println(magicArray.toString());
        System.out.println("size: " + magicArray.size());

        magicArray.add(100);
        magicArray.add(200);

        // Получаем строковое представление нашего объекта (массива)
        String info = magicArray.toString();
        System.out.println(info);
        System.out.println("size: " + magicArray.size());

        System.out.println("\n ==================== \n");
        magicArray.addAll(300, 400, 500, 600, 700, 800, 900, 1000, 1100, 2000);

        System.out.println(magicArray.toString());
        System.out.println("size: " + magicArray.size());

        System.out.println("\n ===================== \n");
        System.out.println("magicArray.remove(11): " + magicArray.remove(11));
        System.out.println("magicArray.remove(6): " + magicArray.remove(6));
        System.out.println("size: " + magicArray.size());
        System.out.println(magicArray.toString());


        System.out.println("\n++++++++++++++++++++++\n");
        System.out.println(magicArray.indexOf(40));
        System.out.println(magicArray.get(3));
        System.out.println(magicArray.removeByValue(1100));

    }
}
