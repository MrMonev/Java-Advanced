package FunctionalProgrammingExercises;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Consumer;

public class KnightsOfHonor_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Consumer<InputParam> -> void -> Use with accept

        String[] names = scanner.nextLine().split("\\s+");

        Consumer<String> appendSir = name -> System.out.println("Sir " + name);

        Arrays.stream(names).forEach(appendSir);
    }
}
