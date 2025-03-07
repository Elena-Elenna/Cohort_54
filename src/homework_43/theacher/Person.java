package homework_43.theacher;

/**
 * @author Sergey Bugaenko
 * {@code @date} 12.12.2024
 */

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
        } catch (EmailValidateException e) {
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



    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {

        try {
            PersonValidator.validatePassword(password);
            this.password = password;
        } catch (PasswordValidateException e) {
            System.out.println("Вы ввели некорректный password: " + e.getMessage());
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
