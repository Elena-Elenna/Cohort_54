package homework_42.theacherHW;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * @author Sergey Bugaenko
 * {@code @date} 04.03.2025
 */

/*
Task 4 Опционально
Напишите метод findUserById(int id), который возвращает Optional<User>. Метод принимает List<User> и int id.

Если пользователь с заданным id существует в списке, вернуть Optional с пользователем, иначе вернуть Optional.empty().
 */

public class UserApp {

    public static void main(String[] args) {
        List<User> users = new ArrayList<>(List.of(
                new User(1, "Peter"),
                new User(2, "John"),
                new User(3, "Max"),
                new User(4, "Hanna"),
                new User(1, "Test"),
                new User(5, "Margo")
        ));


        Optional<User> userOptional = findUserById(users, 1);
        System.out.println(userOptional);

        System.out.println("\n ============== ");

        Optional<User> userOptional2 = findUserById2(users, 1);
        System.out.println(userOptional2);


    }

    public static Optional<User> findUserById2(List<User> users, int id) {

        // findFirst() Прекращает обработку потока, когда будет найден первый элемент, удовлетворяющий предикату

       return users.stream()
                .filter(user -> user.getId() == id)
                .peek(System.out::println)
                .findFirst();
//                .collect(Collectors.toList());

    }

    public static Optional<User> findUserById(List<User> users, int id) {
        for (User user : users) {
            if (user.getId() == id) {
                return Optional.of(user);
            }
        }
        return Optional.empty();
    }
}
