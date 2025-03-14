package Lesson.lesson_44.file_io;

import java.io.*;

/**
 * @author Sergey Bugaenko
 * {@code @date} 06.03.2025
 */

public class Task1 {

    public static void main(String[] args) {

        /*
        Выберите какую-то папку (или создайте новую)
        Создайте в папке 10 файлов с именами: test_1.txt, test_2.txt, ... test_10.txt
        В каждый файл запишите соответсвующую строку: Java1, Java2 ... Java10
         */


        File path = new File("src/Lesson/lesson_44/file_io/task_1");
        path.mkdirs();

        for (int i = 1; i < 11; i++) {
            File file = new File(path, "test_" + i + ".txt");

            try (FileWriter writer = new FileWriter(file)){
                file.createNewFile();
                writer.write("Java" + i + "\n");
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        /*
        Нужно найти файл, внутри которого есть строка "Java7"
        Проверьте в директории все файлы (получить список всех файлов в директории, залезть в каждый. Считать строку)
        Вывести имя/имена файлов, содержащих "Java7"
         */

        // Получить список файлов / директорий
        File[] files = path.listFiles();

        for (File file : files) {

            // Проверяю, что работаю с файлом, а не директорией
            if (file.isFile()) {

                // Код чтения из каждого файла

                // открываем поток чтения
                try (FileReader fileReader = new FileReader(file);
                BufferedReader bufferedReader = new BufferedReader(fileReader)) {

                    // считываю строку из файла
                    String line = bufferedReader.readLine();

                    // Проверить содержимое строки
                    if (line != null && line.contains("Java7")) {
                        System.out.println("Файл найден: " + file.getName());
                    }


                } catch (FileNotFoundException e) {
                    throw new RuntimeException(e);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }

        }
    }
}
