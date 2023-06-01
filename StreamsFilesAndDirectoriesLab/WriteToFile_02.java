package StreamsFilesAndDirectoriesLab;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class WriteToFile_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String pathIn = "C:\\Users\\imone\\IdeaProjects\\Advance\\src\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\Files-and-Streams\\input.txt";
        String pathOut = "C:\\Users\\imone\\IdeaProjects\\Advance\\src\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\Files-and-Streams\\MrMonevOutPut.txt";
        // Проверка дали нашия файл съдържа дадените знаци -> '.' -> ',' -> '!' -> '?'

        Set<Character> forbiddenSymbols = new HashSet<>();
        Collections.addAll(forbiddenSymbols, '.',',','!','?');


        try(FileInputStream in = new FileInputStream(pathIn);
           FileOutputStream out = new FileOutputStream(pathOut)) {

            int oneBite = in.read();
            while (oneBite >= 0) {
                char myBiteAsChar = (char) oneBite;
                if(!forbiddenSymbols.contains(myBiteAsChar)) {
                    out.write(oneBite);
                }
                oneBite = in.read();
            }

        } catch (IOException e) {
        }
    }
}
