package StreamsFilesAndDirectoriesExercises;
import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class CountCharacterTypes_04 {
    public static void main(String[] args) {

        String inputPath = "C:\\Users\\imone\\IdeaProjects\\Advance\\src\\StreamsFilesAndDirectoriesExercises\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\input.txt";
        String outPath = "C:\\Users\\imone\\IdeaProjects\\Advance\\src\\StreamsFilesAndDirectoriesExercises\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\outputPath.txt";


        int vowelsCount = 0;
        int otherSymbolsCount = 0;
        int punctuationsCount = 0;

        List<Character> vowels = List.of('a', 'e', 'i', 'o', 'u');
        List<Character> punctuations = List.of('!', ',', '.', '?');


        try (BufferedReader reader = Files.newBufferedReader(Path.of(inputPath))


        ) {
            String line = reader.readLine();
            while (line != null) {
                for (int i = 0; i < line.length(); i++) {
                    char symbol = line.charAt(i);

                    if(vowels.contains(symbol)) {
                        vowelsCount++;
                    } else if (punctuations.contains(symbol)) {
                        punctuationsCount++;
                    } else if(symbol != ' ') {
                        otherSymbolsCount++;
                    }


                }

                line = reader.readLine();
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.printf("Vowels: %d%n" + "Other symbols: %d%n" + "Punctuation: %d%n",
                vowelsCount, otherSymbolsCount, punctuationsCount);
    }
}
