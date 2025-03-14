package Lesson.lesson_44.cats;

import java.io.*;
import java.util.ArrayList;
import java.util.List;


public class CatsWriterReader {

    public static void main(String[] args) {

        List<Cat> cats = new ArrayList<>(List.of(
                new Cat("Cat", 9, true),
                new Cat("John", 2, true),
                new Cat("Maria", 7, false),
                new Cat("Boris", 4, true),
                new Cat("Catty", 2, false),
                new Cat("Hanna", 6, false),
                new Cat("Sebastian Junior", 1, true)
        ));


        File path = new File("src/Lesson/lesson_44/cats/files");
        path.mkdirs();

        File file = new File(path, "cats.txt");

        /*
         метод, который запишет список кошек в файл
         */
        writeCatsToFile(cats, file);

        /*
         Считать из файла кошек и вернуть список кошек
         */
        List<Cat> newCats = readCatsFromFile(file);

        System.out.println("\n======== Получили из метода список котов ===============");

        newCats.forEach(System.out::println);

    }

    private static List<Cat> readCatsFromFile(File file) {
        List<Cat> cats = new ArrayList<>();

        try (BufferedReader bReader = new BufferedReader(new FileReader(file))){
            String line;

            /*
             Будем считывать в цикле строки из файла, пока они есть.
             На каждой итерации будем записывать каждую строку в переменную line
             Считывать мы будем пока readLine не вернет null
             */
            while ((line = bReader.readLine()) != null ) {
                // name|9|true
                Cat cat = parseCatFromStringLine(line);
                cats.add(cat);
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return cats;
    }

    private static Cat parseCatFromStringLine(String line) {
//        name|9|true
//        System.out.println("line: " + line);
        String[] parts = line.split("\\|");
//        System.out.println("arrayElemenets: " + Arrays.toString(parts));

        return new Cat(parts[0], Integer.parseInt(parts[1]), Boolean.valueOf(parts[2]));
    }

    private static void writeCatsToFile(List<Cat> cats, File file) {

        // Удалим файл, если он уже есть
        if (file.exists()) file.delete();

        // Создать файл, если его еще нет.
        try {
            file.createNewFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


        // Перебираем котов. Будем каждого записывать отдельной строкой особого формата
        for (Cat cat : cats) {
            // Открываем поток записи. Ставим флаг разрешающий до-запись в файл
            try (BufferedWriter bWriter = new BufferedWriter(new FileWriter(file, true))){

                // name|age|isMale
                String toWrite = cat.getName() + "|" + cat.getAge() + "|" + cat.isMale();
                bWriter.write(toWrite);
                bWriter.newLine(); // перевод каретки

            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        System.out.println("Запись в файл завершена!");

    }
}
















