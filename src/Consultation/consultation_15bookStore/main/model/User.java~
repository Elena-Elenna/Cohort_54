package consultation_15bookStore.main.model;

import consultation_15bookStore.main.utils.MyArrayList;
import consultation_15bookStore.main.utils.MyList;

import java.util.Objects;

public class User {
    private String email;
    private String password;
    private int age;
    private Role role;
    private MyList<Book> userBooks;

    public User(String email, String password, int age) {
        this.email = email;
        this.password = password;
        this.age = age;
        this.role = Role.USER;
        this.userBooks = new MyArrayList<>();
        /*
        если роль не была задана при создании объекта,
        то присваиваем ей значение по умолчанию USER.
        this.role = role != null ? role : Role.USER;
         */
    }

    @Override
    public String toString() {
        return "User{" +
                "email = " + email + '\'' +
                ", password='" + password + '\'' +
                ", age = " + age +
                ", role = " + role +
                ", userBooks = " + userBooks +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return age == user.age && Objects.equals(email, user.email) && Objects.equals(password, user.password) && role == user.role && Objects.equals(userBooks, user.userBooks);
    }

    @Override
    public int hashCode() {
        return Objects.hash(email, password, age, role, userBooks);
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public MyList<Book> getUserBooks() {
        return userBooks;
    }
}
