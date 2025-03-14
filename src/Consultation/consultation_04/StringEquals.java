package Consultation.consultation_04;

public class StringEquals {
    public static void main(String[] args) {
        String s1 = "e";
        String s2 = "E";

        /*
        e.equals -> e
        e.equalsIgnoreCase -> e, E
         */

        System.out.println("s1.equals(s2): " + s1.equals(s2));
        System.out.println("s1.equalsIgnoreCase(s2): " + s1.equalsIgnoreCase(s2));
    }
}
