package lesson_43;



public class Person {
    private String email;
    private String password;

    public Person(String email, String password) {
        setEmail(email);
        setPassword(password);
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        try {
            PersonValidator.validateEmail(email);
            System.out.println("Email прошел проверку");
            this.email = email;
        } catch (Email_Password_ValidatorException e) {
            System.out.println("Вы ввели некорректный email: " + e.getMessage());
        }
    }

    /*
    vasya@gmail.com
    @asyagmail.com
    vasya@gmail.com
    vasya@gmail.net.de
    vasy12112a@gmail.net.de
    vasya@gmail.net.de
     */

    /*
    1. Должна присутствовать @ и только одна (done)
    2. Точка после собаки
    3. После последней точки должно быть минимум 2 символа
    4. Алфавит, цифры, '_', '-', '.', '@'
    5. До собаки должен быть хотя бы 1 символ
    5. Первый символ должен быть буквой
     */

    /*
    Требования к паролю
    1. Длина >= 8
    2. Должна быть мин 1 маленькая буква
    3. Должна быть мин 1 большая буква
    4. Должна быть мин 1 цифра
    4. Должен быть мин 1 спец.символ "!%$@&*()[]"
     */

    /*
    4 переменный типа boolean
     boolean isDigit = true;
        boolean isLowerCase = false;
        Запускаю цикл
        И после цикла во всех 4-х должено быть true. - тогда вернуть true
        Иначе пароль проверку не прошел - вернуть false
     */

    private boolean isPasswordValid(String password) {
        if (password == null || password.length() < 8) {
            System.out.println("Password should be at least 8 characters");
            return false;
        }

        boolean isDigit = false;

        String symbols = "!%$@&*()[]";

        // альтернативный способ объявления пременных
        boolean[] result = new boolean[4]; // false, false

        for (int i = 0; i < password.length(); i++) {
            char ch = password.charAt(i);

            if (Character.isDigit(ch)) result[0] = true;
            if (Character.isUpperCase(ch)) result[1] = true;
            if (Character.isLowerCase(ch)) result[2] = true;
            if (symbols.indexOf(ch) >= 0) result[3] = true;
        }

        // Если хотя бы в одной переменной останется значение false,
        // то весь пароль не будет признана валидным = из метода вернется false
        return  result[0] && result[1] && result[2] && result[3];
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        if (isPasswordValid(password)) {
            this.password = password;
        }
    }

    @Override
    public String toString() {
        return "Person{" +
                "email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
