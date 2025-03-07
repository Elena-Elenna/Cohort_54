package lesson_44.file_io;

import java.io.*;
import java.util.Arrays;



/**
Java IO (Input/Output) - часть Java Standard Edition, предоставляющая механизмы для работы с вводом-выводом данных,
например, файлы.

java.io
 */


public class FileIoExample {


    public static void main(String[] args) throws InterruptedException {

        /**
         class File - абстракция для работы с файлами и директориями (создание, удаление, проверка свойств и т.р.)
         */


        File pathDir = new File("files");

        /**
         1. boolean mkdir() - создает директорию, если такой еще нет. Может создать только "конечную" директорию.
         */
        System.out.println(pathDir.mkdir());

        File pathDir2 = new File("files/db/v1");
        System.out.println(pathDir.mkdir());

        /**
         2. boolean mkdirs() - создает директорию, включая все необходимые родительские (вложенные) директории
         */
        pathDir = new File("src/lesson_44/file_io/files/example");
        System.out.println(pathDir.mkdirs());

        /**
         3. File(File/String parent, String child) - создает объект file с указанием родительского пути
         */
        File lessonDir = new File("src/lesson_44/file_io");
        File pathDb = new File(lessonDir, "db/v01");
        System.out.println("pathDb.mkdirs(): " + pathDb.mkdirs());

        /**
         4. boolean delete() - удаляет папку или директорию (конечную)
         */
        System.out.println(pathDir.delete());

        System.out.println("Удаление deleteOnExit()");
        /**
         5. deleteOnExit() - удаляет файл или директорию по завершению работы JVM (приложения)
         */
        pathDb.deleteOnExit();

        /**
          6. sleep() - Приостанавливает работу приложения на n миллисекунд
         */
        Thread.sleep(5);

        System.out.println("Программа завершила работу!");

        System.out.println("\n===============");

        /**
         7. boolean createNewFile() - создает новый пустой файл, если файл с таким именем еще не существует
         */
        File file = new File(lessonDir, "text.txt");

        try {
            System.out.println(file.createNewFile()); // бросает проверяемое исключение
        } catch (IOException e) {
            e.printStackTrace();
        }

        /**
         8. exists() - проверяет существует ли такой файл или директория
         */
        System.out.println("file.exists(): " + file.exists() + " | lessonDir.exists(): " + lessonDir.exists());

        /**
         9. isFile, isDirectory - возвращает true если объект File является файлом / директорией
         */
        System.out.println("file.isFile(): " + file.isFile());
        System.out.println("file.isDirectory(): " + file.isDirectory());

        System.out.println("file.length(): " + file.length()); // размер файла в байтах
        System.out.println(file.lastModified()); // время последнего изменения файла

        System.out.println("file.getName(): " + file.getName()); // возвращает имя файла или директории
        System.out.println("file.getPath(): " + file.getPath()); // строковое представление пути к файлу

        /**
         10. String[] list() - список имен файлов и директорий в директории
         */
        String[] names = lessonDir.list();
        System.out.println("names: " + Arrays.toString(names));

        /**
        11. File[] listFiles() - массив объектов
         */
        File[] files = lessonDir.listFiles();
        for (File currentFile : files) {
            System.out.println(currentFile.getName() + " | " + currentFile.getPath() + " | length: " + currentFile.length() + " | isFile: " +
                    currentFile.isFile());

        }

        System.out.println("\n ===================== ");

        try {
            FileWriter fileWriter = new FileWriter(file, false); // флаг определяющий режим дозаписи. false - перезапись. true - дозапись
            fileWriter.write("Hello World!!!");
//            fileWriter.write("\n");
//            fileWriter.write("String 2");

            fileWriter.close(); // закрыть / освободить ресурс
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("\n=============");
//        Почитаем из файла

        // try с ресурсами

        try (FileReader fileReader = new FileReader(file);
             BufferedReader bufferedReader = new BufferedReader(fileReader))
        {
            // Код, который вызвать исключения
            String line;
            line = bufferedReader.readLine();
            System.out.println("Чтение строки завершено: " + line);

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
