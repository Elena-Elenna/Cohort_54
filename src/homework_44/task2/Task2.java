package homework_44.task2;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Task2 {
    public static void main(String[] args) {
        File path = new File("src/homework_44/task2");
        File textFile = new File(path,"text2.txt");
        path.mkdirs();
        File lessFile = new File(path,"less.txt");
        File moreFile = new File(path,"more.txt");
        List<String>[] array = readText(textFile);
        if(array != null) {
            writeText(lessFile,array[0]);
            writeText(moreFile,array[1]);
        }
    }


    private static List<String>[] readText(File textFile){
        List<String>[] array = new List[2];
        array[0] = new ArrayList<>();
        array[1] = new ArrayList<>();

        try(BufferedReader bReader = new BufferedReader(new FileReader(textFile)))
        {
            String line;
            while ((line = bReader.readLine())!= null) {
                String[] strings = line.split(":");
                int temp = Integer.parseInt(strings[1]);
                if(temp < 2000) {
                    array[0].add(line);
                }else {
                    array[1].add(line);

                }
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return array;
    }


    private static void writeText(File file, List<String> textList) {
        if (file.exists()) file.delete();
        try (BufferedWriter bWriter = new BufferedWriter(new FileWriter(file, true)))
        {
            for (String str : textList) {
                bWriter.write(str);
                bWriter.newLine();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
