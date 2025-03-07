package homework_43.theacher;

/**
 * @author Sergey Bugaenko
 * {@code @date} 06.03.2025
 */

public class PasswordValidateException extends Exception {

    public PasswordValidateException(String message) {
        super(message);
    }

    @Override
    public String getMessage() {
        return "Password validate exception | " +  super.getMessage();
    }
}
