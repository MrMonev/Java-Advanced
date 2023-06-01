package StreamsFilesAndDirectoriesExercises;
import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class SumBytes_02 {
    public static void main(String[] args) {

        String path = "C:\\Users\\imone\\IdeaProjects\\Advance\\src\\StreamsFilesAndDirectoriesExercises\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\input.txt";

       try (BufferedReader reader = Files.newBufferedReader(Path.of(path))){
//
//           int read = reader.read();
//           long sum = 0;
//
//           while (read != -1) {
//               sum += read;
//               System.out.print((char) read);
//               read = reader.read();
//           }
//           System.out.println(sum);

           String line = reader.readLine();
           long sum = 0;

           while (line != null) {
               char[] chars = line.toCharArray();

               for (char c : chars) {
                   sum += c;
               }
               line = reader.readLine();
           }
           System.out.println(sum);

       } catch (IOException e) {
           throw new RuntimeException(e);
       }
    }
}
