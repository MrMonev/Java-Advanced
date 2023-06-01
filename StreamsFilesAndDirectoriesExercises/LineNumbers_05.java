package StreamsFilesAndDirectoriesExercises;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class LineNumbers_05 {
    public static void main(String[] args) {


        String inPath = "C:\\Users\\imone\\IdeaProjects\\Advance\\src\\StreamsFilesAndDirectoriesExercises\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\inputLineNumbers.txt";
        String outPath = "C:\\Users\\imone\\IdeaProjects\\Advance\\src\\StreamsFilesAndDirectoriesExercises\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\output.txt";


        try (BufferedReader reader = Files.newBufferedReader(Path.of(inPath));
             BufferedWriter writer = Files.newBufferedWriter(Path.of(outPath));
        ){

            String line = reader.readLine();
            int count = 1;
            while (line != null) {
                writer.write(count + ". " + line);
                writer.write(System.lineSeparator());
                count++;
                line = reader.readLine();
            }



        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
