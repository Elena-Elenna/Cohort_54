package Lesson.lesson_28.persons;

public class Person {
    private String email;
    private String password;


    public Person(String email, String password) {
        setEmail(email);
        setPassword(password);
    }

    @Override
    public String toString() {
        return "Person {" +
                "email = '" + email + '\'' +
                ", password = '" + password + '\'' +
                '}';
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail( String email) {
        if (isEmailValid(email)){
            this.email = email;
        }
    }

    /*
    vasya@gmail.com
    @asyagmail.com
    vasya@gmail.com
    vasya@gmail.net.de
    vasy12112a@gmail.net.de
    vasya@gmail.net.de

    1. Должна присутствовать @ и только одна (done)
    2. Точка после собаки
    3. После последней точки должно быть минимум 2 символа
    4. Алфавит, цифры, '_', '-', '.', '@'
    5. До собаки должен быть хотя бы 1 символ
    5. Первый символ должен быть буквой
     */
    private boolean isEmailValid(String email) {
        //Должна присутствовать @
        int index = email.indexOf('@');
        if (index == -1 || index != email.lastIndexOf('@')) return false;
        // точка после собаки (indexOf) - имеет перегрузку
        if (email.indexOf('.', index + 2) == -1) return false;
        //После последней точки должно быть минимум 2 символа
        if (email.lastIndexOf('.') >= email.length() - 2) return false;
        // Алфавит, цифры, '_', '-', '.', '@'
        for (int i = 0; i < email.length(); i++ ) {
            char ch = email.charAt(i);
            if  (!(Character.isAlphabetic(ch)
                    || Character.isDigit(ch)
                    || ch == '_'
                    || ch == '.'
                    || ch == '@')) return false;
        }
        //До собаки должен быть хотя бы 1 символ
        if (index == 0) return false;
        //Первый символ должен быть буквой
        if (!Character.isAlphabetic(email.charAt(0))) return false;
        return  true;
    }


    private boolean isPassvordValid(String password) {
    /*
    Требования к паролю
    1. Длина >= 8 ++
    2. Должна быть мин 1 маленькая буква ++
    3. Должна быть мин 1 большая буква ++
    4. Должна быть мин 1 цифра ++
    4. Должен быть мин 1 спец.символ "! % $ @ & * () []"  ++
     ++++++++++++++++++++++++++++++++++++++++++++++++++++++
    4 переменные типа boolean  ++
     boolean isDigit = true; ++
     boolean isLowerCase = false; ++
     Запускаю цикл ++
     И после цикла во всех 4-х должено быть true. - тогда вернуть true
     Иначе пароль проверку не прошел - вернуть false
     */
        if (password == null || password.length() < 8) {
            System.out.println("Password should be at least 8 characters");
            return false;
        }

        String symbols = "! % $ @ & * () []";
        boolean[] resalt = new boolean[4]; //false
        for (int i = 0; i < password.length(); i++){
            char ch = password.charAt(i);

            if (Character.isDigit(ch)) resalt[0] = true;
            if (Character.isUpperCase(ch)) resalt[1] = true;
            if (Character.isLowerCase(ch)) resalt[2] = true;
            if (symbols.indexOf(ch) >= 0) resalt[3] = true;
        }
        /*
        Если хотябы в одной переменной останется значение false, то весь пароль не будет признан валидным
        и из метода вернется false.
         */
        return resalt[0] && resalt[1] && resalt[2] && resalt[3];
    }


    public String getPassword() {
        return this.password;
    }

    public void setPassword( String password) {
        if (isPassvordValid(password))
            this.password = password;
    }
}
