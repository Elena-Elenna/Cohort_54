package homework_17;

import java.util.Arrays;

public class ArrayApp {
    public static void main(String[] args) {
        int [] array = {10,20,30,40,50};
        MagicArrayHW17 magicArray = new MagicArrayHW17(array);
        System.out.println(magicArray.toString());
        System.out.println("magicArray.lastIndexOf: " + magicArray.lastIndexOf(20));
        System.out.println("magicArray.toArray: " + Arrays.toString(magicArray.toArray()));


        //Нельзя выдавать get/set для полей нашего класса.
        // У нас другие методы для изменения состояния этих полей
//        int cursor = magic.getCursor();
//        cursor = 1000;
//
//        magic.setCursor(20);

//        int[] arrayCopy = magic.getArray();
//        arrayCopy[3] = 5000;
//
//        int[]arr = {1, 2, 3};
//        magic.setArray(arr);


        int[] array1 = magicArray.toArray();
        System.out.println("array1.length: " + array1.length);
        System.out.println("array1: " + Arrays.toString(array1));
    }
}
