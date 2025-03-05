package lesson_43;



public class PersonApp {
    public static void main(String[] args) {


        Person person = new Person("john@email.com", "qwerty");
        System.out.println(person);

        System.out.println("\n==========");

        Person testPerson = new Person("john.email.com", "qwerty");
        System.out.println(testPerson);

        System.out.println("\n==========");

        testPerson = new Person("john@ema%il.com", "qwerty");
        System.out.println(testPerson);

        System.out.println("\n==========");
        testPerson = new Person("@john.email.com", "qwerty");
    }
}
