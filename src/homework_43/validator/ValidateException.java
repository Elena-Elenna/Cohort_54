package homework_43.validator;

public class ValidateException extends  Exception {

    public ValidateException(String message) {
        super(message);
    }

    @Override
    public String getMessage() {
        return "Ошибка: " +  super.getMessage();
    }
}
