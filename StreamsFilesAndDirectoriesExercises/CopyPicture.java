package StreamsFilesAndDirectoriesExercises;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class CopyPicture {
    public static void main(String[] args) {

        String inputPath = "C:\\Users\\imone\\IdeaProjects\\Advance\\src\\StreamsFilesAndDirectoriesExercises\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\picture.jpg";
        String outputPath = "C:\\Users\\imone\\IdeaProjects\\Advance\\src\\StreamsFilesAndDirectoriesExercises\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\picture-copy.jpg";


        try (
                FileInputStream fis = new FileInputStream(inputPath);
                FileOutputStream fos = new FileOutputStream(outputPath);
        ) {

            Files.copy(Path.of(inputPath),fos);

//
//            int readByte = fis.read();
//            while (readByte != -1) {
//                fos.write(readByte);
//                readByte = fis.read();
//            }


        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
