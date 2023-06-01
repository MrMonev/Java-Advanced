package StreamsFilesAndDirectoriesExercises;

import java.io.*;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class CreateZipArchive_12 {
    public static void main(String[] args) throws IOException {

        // 01. - Това са три различни файла -> Взимаме техните пътища, за да може да ги запишем в Zip.File
        String path1 = "C:\\Users\\imone\\IdeaProjects\\Advance\\src\\StreamsFilesAndDirectoriesExercises\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\input.txt";
        String path2 = "C:\\Users\\imone\\IdeaProjects\\Advance\\src\\StreamsFilesAndDirectoriesExercises\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\inputLineNumbers.txt";
        String path3 = "C:\\Users\\imone\\IdeaProjects\\Advance\\src\\StreamsFilesAndDirectoriesExercises\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\inputOne.txt";

        //02. - Това е крайният outputPath -> Който го създаваме, (празен) и го запълваме със въпросните файлове, като даденият файл е Zip.File
        String outputPath = "C:\\Users\\imone\\IdeaProjects\\Advance\\src\\StreamsFilesAndDirectoriesExercises\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\files.zip";

        // 03. - Създаваме Лист за да може да съберем всичките пътища в едно, за по добра четимост и достъпност
        List<String> files = List.of(path1, path2, path3);

        FileOutputStream fos = new FileOutputStream(outputPath); // Създаваме един FileOutPutStream
        ZipOutputStream zos = new ZipOutputStream(fos); // Създаваме си ZipOutputStream


        for (String pathList : files) { // Обхождаме  всеки един път -> Path1,2,3

            File file = new File(pathList);
            FileInputStream fis = new FileInputStream(file);

            // Създаваме си zimEntry, което entry трябва да се добави към даден архив
            ZipEntry zipEntry = new ZipEntry(file.getName());
            // това entry го слагавме в един (ZipOutputStream) и създаваме един празен Zip.File
            zos.putNextEntry(zipEntry);


            // Наливаме Zip.FIle със данни
            int read = fis.read(); // Четем Byte to Byte
            while (read != -1) {
                zos.write(read);   // Добавяме към OutputStream
                read = fis.read(); // Добавяме към OutputStream
            }
            fis.close(); // Затваряме FileInputStream
        }
        zos.close(); // Затваряме ZipOutputStream
        fos.close(); // Затварме FileOutputStream
    }
}
