package StreamsFilesAndDirectoriesLab;

import java.io.*;
import java.util.Scanner;

public class WriteEveryThirdLine_05 {
    public static void main(String[] args) throws IOException {


        String pathRead = "C:\\Users\\imone\\IdeaProjects\\Advance\\src\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\Files-and-Streams\\input.txt";
        String pathWrite = "C:\\Users\\imone\\IdeaProjects\\Advance\\src\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\Files-and-Streams\\WriteEveryThirdLineOutPut.txt";

//
//        FileInputStream inputStream = new FileInputStream(pathRead);
//        FileOutputStream outputStream = new FileOutputStream(pathWrite);
//
//        Scanner reader = new Scanner(inputStream);
//        PrintWriter writer = new PrintWriter(outputStream);


        Scanner reader = new Scanner(new FileReader(pathRead));
        PrintWriter writer = new PrintWriter(new FileWriter(pathWrite));
        // read every line from inPath
        // write every 3d line in outPath

        int counter = 1;
        String line = reader.nextLine();
        while (reader.hasNextLine()) {
            if (counter % 3 == 0) {
                writer.println(line);
            }
            counter++;
            line = reader.nextLine();

        }
        writer.close();
    }
}
