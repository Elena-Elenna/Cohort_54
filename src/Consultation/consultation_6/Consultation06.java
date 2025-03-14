package Consultation.consultation_6;

import consultation_6.utils.MyClass;

public class Consultation06 {
    public static void main(String[] args) {
        int length = 10;
        int width = 15;

        int perimeter = MyClass.getPerimeter(length, width);
        int area = MyClass.getArea(length, width);

        System.out.println("perimeter = " + perimeter);
        System.out.println("area = " + area);
    }
}
