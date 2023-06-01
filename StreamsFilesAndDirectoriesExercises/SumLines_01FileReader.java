package StreamsFilesAndDirectoriesExercises;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class SumLines_01FileReader {
    public static void main(String[] args) {


        String path = "C:\\Users\\imone\\IdeaProjects\\Advance\\src\\StreamsFilesAndDirectoriesExercises\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\input.txt";


        try (
                FileReader fileReader = new FileReader(path)) {
            Scanner scanner = new Scanner(fileReader);

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();

                char[] chars = line.toCharArray();

                long sum = 0;
                for (char c : chars) {
                    sum += c;
                }

                System.out.println(sum);
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
