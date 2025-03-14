package Home_Work.homework_41.person;
/*
Task 3
Дан список Person с полями name, age, city.
Используйте Stream API для фильтрации людей,
которые старше определенного возраста и проживают в определенном городе,
а затем соберите их в список.
Например, старше 25 лет и проживающих в городе "Berlin"
 */

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class PersonsApp {
    public static void main(String[] args) {
        List<Person> persons = Arrays.asList(new Person("Ivan", 30, "New York"),
                new Person("Petr", 25, "Berlin"),
                null,
                new Person("Vlad", 35, null),
                new Person("Oleg", 28, "Berlin"),
                new Person("Vladimir", 45, "Berlin"),
                new Person(null, 30, "Berlin"));

        System.out.println(personsList(persons));
    }

    private static List<Person> personsList(List<Person> persons) {
        return persons.stream()
                .filter(Objects::nonNull)
                .filter(p -> Objects.nonNull(p.getName()) && Objects.nonNull(p.getCity()))
                .filter(p -> p.getAge() > 25 && p.getCity().equalsIgnoreCase("Berlin"))
                .collect(Collectors.toList());
    }
}
