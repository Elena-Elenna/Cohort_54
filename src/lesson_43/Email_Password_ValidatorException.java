package lesson_43;


/**
 Свой класс исключения можно создать наследуясь
    - от класса Exception - для проверяемого исключения
    - от класса RuntimeException - для непроверяемого исключения
 */

public class Email_Password_ValidatorException extends Exception {
    /**
    getMessage() - возвращает строку с описанием исключения
    toString() - возвращает строковое представление объекта исключения
    printStackTrace() - выводит трассировку стека исключений
     */

    public Email_Password_ValidatorException(String message) {
        super(message);
    }

    @Override
    public String getMessage() {
        return "Email validate exception | " +  super.getMessage();
    }
}
