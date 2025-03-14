package Lesson.lesson_18.staticBlock;

import java.util.Arrays;

public class StaticApp {
    public static void main(String[] args) {

        System.out.println(StaticBlock.counter);
        System.out.println(Arrays.toString(StaticBlock.colors));

        StaticBlock demo = new StaticBlock("Title");

//        System.out.println(demo.toString());

        StaticBlock demo1 = new StaticBlock("TestBlock");

        System.out.println(demo1.toString());

        StaticBlock demo2 = new StaticBlock();
        System.out.println(demo2.toString());
    }
}
