package StreamsFilesAndDirectoriesLab;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

public class ReadFile_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String path = "C:\\Users\\imone\\IdeaProjects\\Advance\\src\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\Files-and-Streams\\input.txt";

        try (InputStream in = new FileInputStream(path)) {

            int oneBite = in.read();

            while (oneBite >= 0) {
                System.out.printf("%s ", Integer.toBinaryString(oneBite));
                oneBite = in.read();
            }
        }catch (IOException e ) {
            System.out.println("IO EXCEPTION");
        }
    }
}
