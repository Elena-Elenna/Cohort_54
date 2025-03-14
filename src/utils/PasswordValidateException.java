package utils;

public class PasswordValidateException extends Exception {

    public PasswordValidateException(String message) {
        super(message);
    }

    @Override
    public String getMessage() {
        return "Password  проверка исключения | " +  super.getMessage();
    }
}
