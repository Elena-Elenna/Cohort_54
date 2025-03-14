package Home_Work.homework_44.task1;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {

        File path = new File("src/Home_Work/homework_44/task1/");
        File textFile = new File(path, "text1.txt");
        path.mkdirs();
        File copyFile = new File(path, "copy.txt");
        List<String> text = readText(textFile);
        if (text != null) {
            writeText(copyFile, text);
        }
    }

    private static void writeText(File file, List<String> textList) {
       if (file.exists()) file.delete();
       try (BufferedWriter bWriter = new BufferedWriter(new FileWriter(file, true)))
       {
         for (String string : textList){
             bWriter.write(string);
             bWriter.newLine();
         }
       } catch (IOException e) {
           throw new RuntimeException(e);
       }
    }

    private static List<String> readText(File file) {
        List<String> text = new ArrayList<>();
        try (BufferedReader bReader = new BufferedReader(new FileReader(file)))
        {
            String line;
            while ((line = bReader.readLine()) != null){
                text.add(line);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return text;
    }
}
