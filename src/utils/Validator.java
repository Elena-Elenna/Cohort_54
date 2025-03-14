package utils;

public class Validator {

    public static void isEmailValid(String email) throws EmailValidateException {

        int indexAt = email.indexOf('@');
        if (indexAt == -1 || indexAt != email.lastIndexOf('@'))
            throw new EmailValidateException("должна быть '@'");

        if (email.indexOf('.', indexAt + 2) == -1)
            throw new EmailValidateException("должна быть '.' после '@'");

        if (email.lastIndexOf('.') >= email.length() - 2)
            throw new EmailValidateException("После последней точки должно быть минимум 2 символа");

        for (int i = 0; i < email.length(); i++) {
            char ch = email.charAt(i);
            if (!(Character.isAlphabetic(ch)
                    || Character.isDigit(ch)
                    || ch == '_'
                    || ch == '-'
                    || ch == '.'
                    || ch == '@')) {
                throw new EmailValidateException("Символ НЕ подходит");
            }
        }

        if (indexAt == 0) throw new EmailValidateException("До '@' должен быть хотя бы 1 символ");

        if (!Character.isAlphabetic(email.charAt(0)))
            throw new EmailValidateException("Первый символ должен быть буква");
    }


    public static void isPasswordValid(String password) throws PasswordValidateException {

        if (password == null || password.length() < 8) {
            throw new PasswordValidateException("неправильная длина");
        }

        boolean isDigit = false;

        String symbols = "! % $ @ & * () []";

        // альтернативный способ объявления пременных
        boolean[] result = new boolean[4]; // false, false

        for (int i = 0; i < password.length(); i++) {
            char ch = password.charAt(i);

            if (Character.isDigit(ch)) result[0] = true;
            if (Character.isUpperCase(ch)) result[1] = true;
            if (Character.isLowerCase(ch)) result[2] = true;
            if (symbols.indexOf(ch) >= 0) result[3] = true;
        }

        if (!result[0]) throw new PasswordValidateException("password должен содержать хотя бы одну цифру");
        if (!result[1]) throw new PasswordValidateException("password должен содержать хотя бы одну заглавную букву");
        if (!result[2]) throw new PasswordValidateException("password должен содержать хотя бы одну строчную букву");
        if (!result[3]) throw new PasswordValidateException("password должен содержать хотя бы один специальный символ");
    }
}
