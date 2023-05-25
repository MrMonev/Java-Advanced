package SetsAndMapsAdvancedExercises;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class UniqueUserNames01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        Set<String> usernames = new LinkedHashSet<>();

        int countUserName = Integer.parseInt(scanner.nextLine());

        for (int count = 1; count <= countUserName ; count++) {
            String userName = scanner.nextLine();
            usernames.add(userName);
        }
        usernames.forEach(System.out::println);
    }
}