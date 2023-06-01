package StreamsFilesAndDirectoriesLab;

import java.io.File;

public class ListFiles_07 {
    public static void main(String[] args) {

        File folder = new File("C:\\Users\\imone\\IdeaProjects\\Advance\\src\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\Files-and-Streams\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\Files-and-Streams");

        if(folder.exists()) {
            // Същесвува такъв файл
            if(folder.isDirectory()) {
                // файлът е папка
                File[] files = folder.listFiles();
                for (File file : files) {

                    if(!file.isDirectory()) {
                        System.out.printf("%s: [%s]%n",file.getName(),file.length());
                    }
                }
            }
        }
    }
}
