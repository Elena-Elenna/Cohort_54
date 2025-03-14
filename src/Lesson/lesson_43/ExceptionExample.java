package Lesson.lesson_43;

import java.net.MalformedURLException;
import java.net.URL;



public class ExceptionExample {
    public static void main(String[] args)  {

        /**
        1. Ошибки компиляции - это ошибки, которые возникают на этапе компиляции программы.

        2. Ошибки времени выполнения
        - Время выполнения (runtime) - это время, когда программа выполняется после ее компиляции.

        - Exception (исключение) - представляет собой событие, которое может возникнуть во время выполнения программы и
         нарушить ее нормальное выполнение.

         ----------------------------------------------------
         1.Исключение в Java представляет собой объект определенного класса, который наследуется от класса Throwable.

        - Проверяемые и непроверяемые исключения
        - Непроверяемые исключения не требуют явной обработки.

        - Для обработки исключений используется конструкция try-catch
        - Ключевое слово throws используется в сигнатуре метода для указания,
         что метод может выбросить исключение

        /*
        try {
             // код, который может вызвать исключение
        } catch (ExceptionType ex) {
            // код обработки исключения
        } catch (ExceptionType2 ex2){
            // код обработки другого типа ошибки.
        } finally {
           // код, который выполнится независимо от того, было исключение перехвачено, или нет
        }
         */

        int[] array = {1, 23, 4};
        // array[10] = 10; // java.lang.ArrayIndexOutOfBoundsException

        String str = null;
        // System.out.println(str.length()); // java.lang.NullPointerException

        String str1 = null;
        try {
            array[1] = 10; // Не существующий индекс java.lang.ArrayIndexOutOfBoundsException
            System.out.println("Строка 2 блока try");
            str1 = "null";
            System.out.println(str1.length());
        } catch (NullPointerException aEx) {
            System.out.println("NullPointerException");
            str1 = "Default";
            System.out.println(aEx.getMessage());
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("Что-то не так с индексом: " + ex.getMessage());
        } catch (Exception e) {
            System.out.println("Какая-то другая ошибка!");
        } finally {
            System.out.println("Блок finally");
        }

        System.out.println("Продолжение работы программы");
        System.out.println(str1);

        String result = getUrlString();
        System.out.println(result);

        System.out.println("\n================");

        String url2 = null;
        try {
            url2 = getUrlString2();
        } catch (MalformedURLException e) {
            System.out.println("Неверный формат строки");
            System.out.println(e.toString());
//            e.printStackTrace();
        } finally {
            System.out.println("Блок finally");
        }

        System.out.println("Пытаемся открыть страницу: " + url2);

    }

    // Ключевое слово throws используется в сигнатуре метода для указания, что метод может выбросить исключение
    private static  String getUrlString2() throws MalformedURLException {
        URL myUrl = new URL("htts://example.com");
        return myUrl.toString();
    }

    private static  String getUrlString() {

        URL myUrl = null;
        String defaultString = "https://google.com";


        try {
            myUrl = new URL("htp://example.com");
            System.out.println("Исключение не появилось");
        } catch (MalformedURLException e) {
            System.out.println("Неверный формат URL: " + e.getMessage());
            return defaultString;
        }
        return myUrl.toString();
    }
}
