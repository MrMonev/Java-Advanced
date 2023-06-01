package StreamsFilesAndDirectoriesLab;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class ExtractIntegers_04 {
    public static void main(String[] args) throws FileNotFoundException {

        String pathRead = "C:\\Users\\imone\\IdeaProjects\\Advance\\src\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\Files-and-Streams\\input.txt";
        String pathWrite = "C:\\Users\\imone\\IdeaProjects\\Advance\\src\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\Files-and-Streams\\ExtractIntegerOutPut.txt";

        FileInputStream inputStream = new FileInputStream(pathRead);


        Scanner scanner = new Scanner(new FileInputStream(pathRead));
        PrintWriter myFileOutPut = new PrintWriter(new FileOutputStream(pathWrite));

        while (scanner.hasNext()) {
            // Връща True: Ако НЕ сме стигнали до края на файла
            // Връща False: Ако сме стигнали до края

            if (scanner.hasNextInt()) { // Ако има int принтрирай го и продължи

                int myNumber = scanner.nextInt();
                // nextInt -> Ни дава следващото цяло число по ред


                myFileOutPut.println(myNumber);
            }
            scanner.next();
        }
        myFileOutPut.close();

    }
}
