package homework_43.validator;

public class Validator {

    public static void isEmailValid(String email) throws ValidateException {
        int indexAt = email.indexOf('@');
        if (indexAt == -1 || indexAt != email.lastIndexOf('@'))
            throw new ValidateException("Должна присутствовать '@'");

        if (email.indexOf('.', indexAt + 2) == -1)
            throw new ValidateException("Должна быть точка '.' после '@'");

        if (email.lastIndexOf('.') >= email.length() - 2)
            throw new ValidateException("После последней '.' должно быть минимум два символа");

        for (int i = 0; i < email.length(); i++) {
            char ch = email.charAt(i);
            if (!(Character.isAlphabetic(ch)
                    || Character.isDigit(ch)
                    || ch == '_'
                    || ch == '-'
                    || ch == '.'
                    || ch == '@')) {
                throw new ValidateException("Символ НЕ подходит");
            }
        }

        if (indexAt == 0) throw new ValidateException("До '@' должен быть хотя бы один символ");

        if (!Character.isAlphabetic(email.charAt(0)))
            throw new ValidateException("Первый символ должен быть буквой");
    }



    public static void isPasswordValid(String password) throws ValidateException {

        if (password == null || password.length() < 8) {
            throw new ValidateException("Password должен быть не менее восьми символов");
        }

        boolean isDigit = false;
        boolean isUpperCase = false;
        boolean isLowerCase = false;
        boolean isSpecialSymbol = false;

        String symbols = "! % $ @ & * () [] . , -";

        for (int i = 0; i < password.length(); i++) {
            char ch = password.charAt(i);

            if (Character.isDigit(ch)) isDigit = true;
            if (Character.isUpperCase(ch)) isUpperCase = true;
            if (Character.isLowerCase(ch)) isLowerCase = true; //
            if (symbols.indexOf(ch) >= 0) isSpecialSymbol = true;
        }

        if (!isDigit)
            throw new ValidateException("Password должен содержать хотя бы одну цифру");
        if (!isLowerCase)
            throw new ValidateException("Password должен содержать хотя бы одну строчную букву");
        if (!isUpperCase)
            throw new ValidateException("Password должен содержать хотя бы одну заглавную букву");
        if (!isSpecialSymbol)
            throw new ValidateException("Password должен содержать хотя бы один специальный символ");
    }
}
