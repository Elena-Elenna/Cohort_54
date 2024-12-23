package homework_19;
/*
Task 2
Неизменяемая переменная
•	Объявите переменную final int MAX_USERS = 100;.
•	Попробуйте изменить значение MAX_USERS в коде после её инициализации.
•	Объясните, что произошло при попытке изменения значения.
 */

public class FinalVariableExample {
    public static void main(String[] args) {
        final int MAX_USERS = 100;
        System.out.println("Инициализация MAX_USERS: " + MAX_USERS);

//       MAX_USERS = 200; // Эта строка вызовет ошибку компиляции (не возможно присвоить значение конечной переменной)

        System.out.println("После попытки изменить MAX_USERS");
    }
}
