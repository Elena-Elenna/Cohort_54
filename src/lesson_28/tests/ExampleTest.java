package lesson_28.tests;

import lesson_27.enums.days.Day;
import lesson_27.persons.Person;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.*;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class ExampleTest {
    // 1. МЕТОДЫ ПРОВЕРКИ УТВЕРЖДЕНИЙ
    @BeforeEach
    void setUp() {
        System.out.println("Test: @BeforeEach");
    }


    @Test
    public void testAddition() {
        System.out.println("Test: testAddition");
        int result = 2 + 2;

        Assertions.assertEquals(4, result);
        assertNotEquals(9, result);
        assertTrue(result >= 4);
        assertFalse(result > 4);
        assertNull(null);
        assertNotNull("String");

    }

    @Disabled
    @Test
    public void emptyTest() {
        System.out.println("Test: emptyTest");
        /*
        пустой тестовый метод считается успешно пройденым, т.к. в нем нет ложного утверждения
         */
    }

    // 2. ПАРАМЕТРЕЗИРОВАННЫЕ МЕТОДЫ
    @ParameterizedTest
    @ValueSource(ints = {1, 5, 9, 11})
    public void testNumbers(int number) {
        System.out.println("number: " + number);
        assertTrue(number > 0);
    }


    @ParameterizedTest
    @ValueSource(strings = {"apple", "banana", "cherry"})
    public void testFruit(String fruit) {
        System.out.println("fruit: " + fruit);
        assertTrue(fruit.length() > 2);
    }


    // CSV - Comma-Separated-Value (apple,1 / banana,1)
    @ParameterizedTest
    @CsvSource({"apple, 1", "banana, 2", "cherry, 3"})
    void testWithCsvSource(String fruit, int rank) {
        System.out.println("fruit: " + fruit + "|" + (rank + 10));
        assertTrue(fruit.length() > 4 && rank > 0);
    }


//    // 2.1. ПАРАМЕТРЕЗИРОВАННЫЕ МЕТОДЫ
//    //Источник данных файл в формате CSV
//    @ParameterizedTest
//    @CsvFileSource(resources = "data.csv")
//    void testWithCsvFileSource(String fruit, int rank, boolean flag) {
//        System.out.println(fruit + "|" + rank + "|" + !flag);
//        assertNotNull(fruit);
//        assertTrue(rank > 0);
//    }


    @ParameterizedTest
    @EnumSource(Day.class)
    void testEnums(Day day){
        System.out.println("day: " + day);
        assertNotNull(day);
    }


    @ParameterizedTest
    @MethodSource("testDataStrings")
    public void testWithMethodSource(String argument){
        System.out.println("argument: " + argument);
        assertNotNull(argument);
    }

    static Stream<String> testDataStrings(){
        return Stream.of("apple","banana","cherry");
    }

    static Stream<Integer> testInteger(){
        return Stream.of(1,2,3,4,5,6);
    }


    @ParameterizedTest
    @MethodSource("testDataArguments")
    void testMethodSource2(int value, int expected, boolean isEquals){
        System.out.println(value + "|" + expected + "|" + isEquals);
        int result = value * value;
        assertEquals(isEquals, result == expected);
    }

    static Stream<Arguments> testDataArguments(){
        return Stream.of(
                Arguments.of(2, 4, true),
                Arguments.of(3, 9, true),
                Arguments.of(4, 15, false)
        );
    }


    @ParameterizedTest
    @MethodSource("testPersonsData")
    void testPersonsData(Person person, String email){
        System.out.println("person: " + person);
        System.out.println("email: " + email);
        System.out.println("___________________\n");
    }

    static Stream<Arguments> testPersonsData(){
        Person person = new Person("test@mail.net", "pass1Q!4");
        return Stream.of(
                Arguments.of(person, "new1234@mail.net"),
                Arguments.of(new Person("email1net", "fdcd!"), "email")
        );
    }

    /*
                   АНОТАЦИИ

   1) @BeforeAll (требует чтобы метод был static) - МЕТОД ВЫПОЛНЯЕТСЯ ТОЛЬКО ОДИН РАЗ,
   ПЕРЕД ВЫПОЛНЕНИЕМ ПЕРВОГО ТЕСТА
   2) @AfterEach (требует чтобы метод был static) - МЕТОД БУДЕТ ВЫПОЛНЯТЬСЯ ПОСЛЕ КАЖДОГО ТЕСТОВОГО МЕТОДА
   3) @AfterAll (требует чтобы метод был static) - МЕТОД ВЫПОЛНИТСЯ ТОЛЬКО ОДИН РАЗ ПОСЛЕ ВЫПОЛНЕНИЯ ПОСЛЕДНЕГО ТЕСТА
   4) @Disabled - УКАЗЫВАЕТ, ЧТО ТЕСТ ОТКЛЮЧЕН И ВЫПОЛНЯТЬ МЕТОД НЕ ТРЕБУЕТСЯ
   5) @Test - указывает, что метод является тестовым.
      Таким образом JUnit5 знает, что этот метод можно запустить во время выполнения тестов.
   6) @BeforeEach - МЕТОД БУДЕТ ВЫПОЛНЯТЬСЯ ПЕРЕД КОЖДЫМ ТЕСТОВЫМ МЕТОДОМ
     */


        /*
                     МЕТОДЫ ПРОВЕРКИ УТВЕРЖДЕНИЙ

       1. Assertions.assertEquals(expected, actual); - МЕТОД ПРОВЕРЯЕТ РАВНЫ ЛИ ДВА ЗНАЧЕНИЯ
       2. Assertions.assertNotEquals(unexpected, actual); - ТЕСТ БУДЕТ ПРОЙДЕН, ЕСЛИ "НЕОЖИДАЕМЫЙ РЕЗУЛЬТАТ"
          НЕ РАВЕН ФАКТИЧЕСКОМУ
       3. Assertions.assertTrue(result >= 4); - ПРОВЕРЯЕТ, ЧТО УСЛОВИЕ ВЕРНО (ВОЗВРАЩАЕТ TRUE)
       4. Assertions.assertFalse(result <= 4);- ПРОВЕРЯЕТ, ЧТО УСЛОВИЕ ЛОЖНО (ВОЗВРАЩАЕТ false)
       5. Assertions.assertNull(null); - ПРОВЕРЯЕТ, ЧТО ОБЪЕКТ РАВЕН null
       6. Assertions.assertNotNull("String"); - ПРОВЕРЯЕТ, ЧТО ОБЪЕКТ НЕ РАВЕН null
         */


}