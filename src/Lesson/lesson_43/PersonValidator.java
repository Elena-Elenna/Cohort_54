package Lesson.lesson_43;



public class PersonValidator {

    public static void validateEmail(String email) throws Email_Password_ValidatorException {
        // 1. Должна присутствовать @
        int indexAt = email.indexOf('@');
        if (indexAt == -1 || indexAt != email.lastIndexOf('@')) throw new Email_Password_ValidatorException("@ error");

        // 2. Точка после собаки
        if (email.indexOf('.', indexAt + 2) == -1) throw new Email_Password_ValidatorException(". after @ error");

        // 3. После последней точки должно быть минимум 2 символа
        if (email.lastIndexOf('.') >= email.length() - 2) throw new Email_Password_ValidatorException("last . error");

        for (int i = 0; i < email.length(); i++) {
            char ch = email.charAt(i);
            if (!(Character.isAlphabetic(ch)
                    || Character.isDigit(ch)
                    || ch == '_'
                    || ch == '-'
                    || ch == '.'
                    || ch == '@')) { // Символ НЕ подходит
                throw new Email_Password_ValidatorException("illegal symbol");
            }
        }

        // 5. До собаки должен быть хотя бы 1 символ
        if (indexAt == 0) throw new Email_Password_ValidatorException("@ should not be first");

        if (!Character.isAlphabetic(email.charAt(0))) throw new Email_Password_ValidatorException("first symbol should be letter");

    }

}
