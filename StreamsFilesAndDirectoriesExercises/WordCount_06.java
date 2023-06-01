package StreamsFilesAndDirectoriesExercises;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WordCount_06 {
    public static void main(String[] args) {


        String inPath = "C:\\Users\\imone\\IdeaProjects\\Advance\\src\\StreamsFilesAndDirectoriesExercises\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\words.txt";
        String outPath = "C:\\Users\\imone\\IdeaProjects\\Advance\\src\\StreamsFilesAndDirectoriesExercises\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\text.txt";
        String output = "C:\\Users\\imone\\IdeaProjects\\Advance\\src\\StreamsFilesAndDirectoriesExercises\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\results.txt";

        Map<String, Integer> words = new HashMap<>();

        try (
                BufferedReader readerOne = Files.newBufferedReader(Path.of(inPath));
                BufferedReader readerTwo = Files.newBufferedReader(Path.of(outPath));
                BufferedWriter writer = Files.newBufferedWriter(Path.of(output))
        ) {

            // Четем първия reader
            String line = readerOne.readLine();
            while (line != null) {
                String[] input = line.split("\\s+");
                for (String word : input) {
                    words.put(word, 0);
                }


                line = readerOne.readLine();
            }
            // Четем втория reader
            line = readerTwo.readLine();
            while (line != null) {
                List<String> text = Arrays.stream(line.split("\\s+")).sorted().toList().stream().toList();

                words.forEach((k,v) -> {
                     int count = 0;
                    for (String word : text) {
                        if(word.equals(k)) {
                            count++;
                        }
                    }
                    words.put(k,words.get(k) + count );

                });
                line = readerTwo.readLine();
            }
             words.entrySet()
                     .stream()
                     .sorted((a,b) -> b.getValue().compareTo(a.getValue()))
                     .forEach(entry -> {
                         try {
                             writer.write(String.format("%s - %d%n", entry.getKey(), entry.getValue()));
                         } catch (IOException e) {
                             throw new RuntimeException(e);
                         }
                     });
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
