package Home_Work.homework_43.theacher;

/**
 * @author Sergey Bugaenko
 * {@code @date} 04.03.2025
 */

// Свой класс исключения можно создать наследуясь
//    - от класса Exception для проверяемого исключения
//    - от класса RuntimeException для непроверяемого исключения

public class EmailValidateException extends RuntimeException {
    /*
    getMessage() - возвращает строку с описанием исключения
    toString() - возвращает строковое представление объекта исключения
    printStackTrace() - выводит трассировку стека исключений
     */

    public EmailValidateException(String message) {
        super(message);
    }

    @Override
    public String getMessage() {
        return "Email validate exception | " +  super.getMessage();
    }
}
