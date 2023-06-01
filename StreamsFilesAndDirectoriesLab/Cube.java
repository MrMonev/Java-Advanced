package StreamsFilesAndDirectoriesLab;

import java.io.Serializable;

public class Cube implements Serializable {
    // Да може да се сериализира

    private String color;
    private int width;
    private int length;
    private int height;

    public Cube(String color, int height, int width, int length) {
        this.color = color;
        this.height = height;
        this.length = length;
        this.width = width;
    }
}
