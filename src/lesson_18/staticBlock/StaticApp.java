package lesson_18.staticBlock;

import java.util.Arrays;

public class StaticApp {
    public static void main(String[] args) {

        System.out.println(StaticBlockDemo.counter);
        System.out.println(Arrays.toString(StaticBlockDemo.colors));

        StaticBlockDemo demo = new StaticBlockDemo("Title");

//        System.out.println(demo.toString());

        StaticBlockDemo demo1 = new StaticBlockDemo("TestBlock");

        System.out.println(demo1.toString());

        StaticBlockDemo demo2 = new StaticBlockDemo();
        System.out.println(demo2.toString());
    }
}
