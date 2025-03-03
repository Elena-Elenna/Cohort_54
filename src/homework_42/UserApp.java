package homework_42;
/*
Task 4 Опционально
Напишите метод findUserById(int id), который возвращает Optional<User>.
Метод принимает List<User> и int id.
Если пользователь с заданным id существует в списке,
вернуть Optional с пользователем, иначе вернуть Optional.empty().
Подсказка:
Используйте Optional.of(user) или Optional.empty().
 */

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

public class UserApp {
    public static void main(String[] args) {
        List<User> users = Arrays.asList(
                new User(1, "Peter"),
                new User(2, null),
                new User(3, "Max"),
                null,
                new User(4, "Hanna"),
                new User(5, "Bob")
        );
        Optional<User> user = findUserById(users, 5);
        user.ifPresentOrElse(System.out::println, () -> System.out.println("Пользователь не найден"));
    }

    private static Optional<User> findUserById(List<User> users, int id) {
       return users.stream()
               .filter(Objects::nonNull)
               .filter(user -> user.getId() == id)
               .findFirst();
    }
}
