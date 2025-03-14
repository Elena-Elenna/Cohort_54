package Home_Work.homework_28;

import Lesson.lesson_27.persons.Person;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.stream.Stream;

public class PersonTest {
    Person person;
    String startEmail = "john@test.com";
    String startPassword = "qwerty1Q$";


    @BeforeEach
    void setUp(){
        person = new Person(startEmail, startPassword);
    }


    @ParameterizedTest
    @ValueSource(strings = {"qqqqqq1Q!", "1AAAAAAAa$", "sss%Ddd0", "Parole4%"})
    void testValidPasswortSet(String validPasswort){
        person.setPassword(validPasswort);
        Assertions.assertNotEquals(startPassword, person.getPassword());
        Assertions.assertEquals(validPasswort, person.getPassword());
        Assertions.assertNotNull(person.getPassword());
    }


    @ParameterizedTest
    @MethodSource("invalidPaswortData")
    void testInvalidPasswordSet(String invalidPassword){
        person.setPassword(invalidPassword);
        Assertions.assertNotEquals(invalidPassword, person.getPassword());
        Assertions.assertEquals(startPassword, person.getPassword());
    }
    static Stream<String> invalidPaswortData(){
        return Stream.of(
                "aaa!1Q",
                "aaaaa1%aa",
                "AAAAAA@1",
                "ffffTR@!gg",
                "rrrrRRR121");
    }


    @Test
    void testValidEmailSet(){
        String validEmail = "valid@test.com";
        person.setEmail(validEmail);
        Assertions.assertEquals(validEmail, person.getEmail());
        Assertions.assertNotEquals(startEmail, person.getEmail());
    }


    /*
    1. Берем не валидный email
    2. Устанавливаем его сеттером person
    3. Ожидаемый результат: invalidEmail установлен не будет
    */
    @ParameterizedTest
    @MethodSource("invalidEmailData")
    void testInvalidEmailSet(String invalidEmail){
        person.setEmail(invalidEmail);
        Assertions.assertNotEquals(invalidEmail, person.getEmail());
        Assertions.assertEquals(startEmail, person.getEmail());
    }
    static Stream<String> invalidEmailData(){
        return Stream.of(
                "testmail.net",
                "test@@mail.net",
                "test@mai@l.net",
                "test@mailnet",
                "test@mail.ne.t",
                "test@mail.net.",
                "test@mailne.t",
                "test@ mail.net",
                "test@ma!il.net",
                "t#est@mail.net",
                "test@mail.?net",
                "@testmail.net",
                "1test@mail.net",
                "_test@mail.net",
                "-t@mail.net",
                ".est@mail.net",
                "test+1@mail.net");
    }
}
