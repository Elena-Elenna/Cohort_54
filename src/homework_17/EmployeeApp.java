package homework_17;
/*
Task 0
Написать класс Employee (Работник)
У него должны быть поля имя, возраст, зарплата
Инкапсулировать класс.
Написать метод info() выводящий информацию о работнике.
 */
public class EmployeeApp {
    public static void main(String[] args) {

        Employee persone = new Employee("Inna",35,5.300);
        persone.info();
    }
}
