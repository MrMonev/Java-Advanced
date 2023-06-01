package StreamsFilesAndDirectoriesExercises;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class AllCapitals_03 {
    public static void main(String[] args) {


        String inputPath = "C:\\Users\\imone\\IdeaProjects\\Advance\\src\\StreamsFilesAndDirectoriesExercises\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\input.txt";
        String outPath = "C:\\Users\\imone\\IdeaProjects\\Advance\\src\\StreamsFilesAndDirectoriesExercises\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\output.txt";

        try (BufferedReader reader = Files.newBufferedReader(Path.of(inputPath));
             BufferedWriter writer = Files.newBufferedWriter(Path.of(outPath))

//             BufferedWriter writer = new BufferedWriter(new FileWriter(outPath, true))
             // Дефолтната му стойност е false -> ние го правим на true, за да може да не съсздава
             // Нов файл, да го презапише или като (update) на вече създаденият файл
        ) {
            String line = reader.readLine();
            while (line != null) {
                writer.write(line.toUpperCase());
                writer.write(System.lineSeparator());

                line = reader.readLine();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
