package Consultation.consultation_10;

public class IntToDoubleToInt {
    public static void main(String[] args) {
        int initialIntValue = 10;

        // int -> double (неявное преобразование)
        double doubleValue = initialIntValue;

        System.out.println("Initial int value: " + initialIntValue);
        System.out.println("Double value after conversion: " + doubleValue);

        // double -> int (явное преобразование)
        int finalIntValue = (int) doubleValue;

        System.out.println("Int value after conversion from double: " + finalIntValue);

        // пример с дробной частью:
        int initialIntValue2 = 15;
        double doubleValue2 = initialIntValue2;
        int finalIntValue2 = (int) doubleValue2;

        System.out.println("\nInitial int value: " + initialIntValue2);
        System.out.println("Double value after conversion: " + doubleValue2);
        System.out.println("Int value after conversion from double: " + finalIntValue2);

        //Пример с дробной частью, которая не равна нулю
        int initialIntValue3 = 17;
        double doubleValue3 = 17.75;
        int finalIntValue3 = (int) doubleValue3;

        System.out.println("\nInitial int value: " + initialIntValue3);
        System.out.println("Double value after conversion: " + doubleValue3);
        System.out.println("Int value after conversion from double: " + finalIntValue3); // Дробная часть отбрасывается

    }
}
