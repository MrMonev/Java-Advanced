package StreamsFilesAndDirectoriesLab;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.List;

public class SortLines_06 {
    public static void main(String[] args) throws IOException {


        String pathIn = "C:\\Users\\imone\\IdeaProjects\\Advance\\src\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\Files-and-Streams\\input.txt";
        String pathOut = "C:\\Users\\imone\\IdeaProjects\\Advance\\src\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\Files-and-Streams\\SortLinesOutput.txt";

        Path pathRead = Paths.get(pathIn); // пътят към даденият ни текст
        Path pathWrite = Paths.get(pathOut);

        List<String> lines = Files.readAllLines(pathRead);// Прочети ми всеки един ред -> 283
        Collections.sort(lines);
        Files.write(pathWrite, lines);


    }
}
