package homework_43.theacher;

/**
 * @author Sergey Bugaenko
 * {@code @date} 04.03.2025
 */

public class PersonApp {
    public static void main(String[] args) {


        Person person = new Person("john@email.com", "qwertyQ1%");
        System.out.println(person);

        System.out.println("\n==========");

        Person testPerson = new Person("john.email.com", "qwertyQ!");
        System.out.println(testPerson);

        System.out.println("\n==========");

        testPerson = new Person("john@ema%il.com", "qwerty1%");
        System.out.println(testPerson);

        System.out.println("\n==========");
        testPerson = new Person("@john.email.com", "QWERRYY4@");
    }
}
