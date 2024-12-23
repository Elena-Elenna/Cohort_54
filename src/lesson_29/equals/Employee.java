package lesson_29.equals;

import java.util.Objects;

public class Employee {
    private String name;
    private String lastName;
    private int age;

    public Employee(String name, String lastName, int age) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
    }

//    @Override
//    public boolean equals(Object obj) {
//        if (this == obj) return true; // Проверка на сравнение с самим собой
//        if (obj == null || this.getClass() != obj.getClass()) return false; // Проверка на совпадение классов (типов объектов)
//        Employee employee = (Employee) obj;
//
//        // Сравнение значимых полей

    ////        if (!this.name.equals(employee.name)) return false;
//        if (!Objects.equals(this.name, employee.name)) return false;
//        if (!Objects.equals(this.lastName, employee.lastName)) return false;
//        return  this.age == employee.age;
//    }

//    @Override
//    public boolean equals(Object o) {
//        if (o == null || getClass() != o.getClass()) return false;
//
//        Employee employee = (Employee) o;
//        return age == employee.age && Objects.equals(name, employee.name) && Objects.equals(lastName, employee.lastName);
//    }

    @Override
    public final boolean equals(Object o) {
        if (!(o instanceof Employee)) return false;

        Employee employee = (Employee) o;
        return age == employee.age && Objects.equals(name, employee.name) && Objects.equals(lastName, employee.lastName);
    }


    @Override
    public int hashCode() {
        int result = Objects.hashCode(name);
        result = 31 * result + Objects.hashCode(lastName);
        result = 31 * result + age;
        return result;
    }


    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                '}';
    }
}
