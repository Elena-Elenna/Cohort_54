package homework_43.validator;


public class ValidateApp {
    public static void main(String[] args) {

        String email= "test@mail.com";
        try {
            Validator.isEmailValid(email);
            System.out.println("Email валидный");
        } catch (ValidateException e) {
            System.out.println("Email НЕ валидный");
            System.out.println(e.getMessage());
        }

        String password= "145678aV";
        try {
            Validator.isPasswordValid(password);
            System.out.println("Password валидный");
        } catch (ValidateException e) {
            System.out.println("Password НЕ валидный");
            System.out.println(e.getMessage());
        }
    }
}
