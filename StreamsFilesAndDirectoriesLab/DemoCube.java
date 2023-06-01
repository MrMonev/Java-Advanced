package StreamsFilesAndDirectoriesLab;

import java.io.*;

public class DemoCube {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        Cube cube = new Cube("blue", 1, 5, 6);

        String pathCubeInfo = "C:\\Users\\imone\\IdeaProjects\\Advance\\src\\StreamsFilesAndDirectoriesLab\\cubeinfo.ser";

        // Записваме обект във Файл(serialization - сериализация)
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(pathCubeInfo));
        oos.writeObject(cube);
        oos.close();

        // прочитаме обект от файл (deserialization - десериализация)
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(pathCubeInfo));
        Cube cube1 =(Cube) ois.readObject();

        System.out.println();
    }
}
