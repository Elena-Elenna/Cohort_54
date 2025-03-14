package Home_Work.homework_44.theacherHW.task_2;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Sergey Bugaenko
 * {@code @date} 11.03.2025
 */

/*
Дан файл с историей поступлений денег на счета пользователей за некий период времени:


Данные в виде: <имяПользователя>:<суммаПоступления>.

Ваше задание прочитать данные из файла и обработать их.

Результат обработки должен быть записан в два файла:

less.txt список тех, кому в сумме перечисленно меньше 2000
more.txt список тех, кому в сумме перечисленно 2000 и больше

 */

public class Task2UsersMap {

    private static final int LIMIT = 2000;


    private static final File PATH = new File("src/Home_Work/homework_44/task_2");
    private static final String DATA_FILE = "data.txt";
    private static final String LESS_FILE = "less.txt";
    private static final String MORE_FILE = "more.txt";

    public static void main(String[] args) {

        List<String> records = readData();
        records.forEach(System.out::println);

        System.out.println("\n=================");

        Map<String, Integer> users = listToMap(records);
        System.out.println(users);

        writeFiles(users);

    }

    private static void writeFiles(Map<String, Integer> users) {
        try (BufferedWriter less = new BufferedWriter(new FileWriter(new File(PATH, LESS_FILE)));
             BufferedWriter more = new BufferedWriter(new FileWriter(new File(PATH, MORE_FILE)))
        ) {
            for (Map.Entry<String, Integer> entry : users.entrySet()) {

                String data = entry.getKey() + ":" + entry.getValue();

                BufferedWriter writer = entry.getValue() < LIMIT ? less : more;

                writer.write(data);
                writer.newLine();

                // Option2
//                BufferedWriter writer;
//                if (entry.getValue() < LIMIT) {
//                    writer = less;
//                } else {
//                    writer = more;
//                }


                //Option 1
//                if (entry.getValue() < LIMIT) {
//                    less.write(data);
//                    less.newLine();
//                } else {
//                    more.write(data);
//                    more.newLine();
//                }

            }


        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static Map<String, Integer> listToMap(List<String> records) {
        Map<String, Integer> users = new HashMap<>();

        for (String record : records) {
            // user1:2050
            String[] data = record.split(":");

            String name = data[0];
            Integer amount = Integer.valueOf(data[1]);
            // put(name, amount) : put(name, value + amount)
            users.compute(name, (key, value) -> value == null ? amount : value + amount);
        }

        return users;
    }

    private static List<String> readData() {
        List<String> result = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(new File(PATH, DATA_FILE)))) {
            String line;
            while ((line = reader.readLine()) != null) {
                result.add(line);
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        return result;
    }
}
