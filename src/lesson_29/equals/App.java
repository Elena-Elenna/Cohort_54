package lesson_29.equals;

import java.util.Objects;

public class App {
    public static void main(String[] args) {

        String s1 = "Java";
        String s2 = "Java";;
        String s3 = new String("Java");

        System.out.println(s1 == s2); //true
        System.out.println(s1 == s3); // false
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));

        System.out.println("\n=================\n");

        Employee employee = new Employee("Max", "Ivanov", 25);
        Employee employee1 = new Employee("max", "Ivanov", 25);
        Employee employee2 = new Employee("Peter", "Petrov", 33);
        Employee employee3 = new Employee("Peter", "Petrov", 55);
        Employee employee4 = new Employee("Max", "Ivanov", 25);

        System.out.println(employee2 == employee1); // false
        System.out.println(employee == employee4); // false

        System.out.println("\n======================\n");

        System.out.println(employee.equals(employee4)); // true
        System.out.println(employee.equals(employee1)); // false
        System.out.println(employee2.equals(employee3)); // false

        System.out.println("\n===================\n");
        Employee nullEmployee = new Employee(null, null, 0);
        Employee nullEmployee1 = new Employee(null, null, 0);
        System.out.println(nullEmployee.equals(nullEmployee1));
        System.out.println(Objects.equals(null, null)); // true
    }
}
