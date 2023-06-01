package StreamsFilesAndDirectoriesExercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class SumLines_01 {
    public static void main(String[] args) {


        String path = "C:\\Users\\imone\\IdeaProjects\\Advance\\src\\StreamsFilesAndDirectoriesExercises\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\input.txt";

        //  Files.newBufferedReader(....)
        //  (Path.of(path)); -> И двата метода работят по един и същ начин
        //  (Paths.get(path) -> И двата метода работят по един и същ начин

        try (BufferedReader reader = Files.newBufferedReader(Paths.get(path))) {


            String line = reader.readLine();

            while (line != null) {
                char[] chars = line.toCharArray();

                long sum = 0;
                for (char c : chars) {
                    sum += c;
                }
                System.out.println(sum);
                line = reader.readLine();
            }


        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
