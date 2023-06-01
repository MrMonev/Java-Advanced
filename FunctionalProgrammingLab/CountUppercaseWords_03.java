package FunctionalProgrammingLab;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class CountUppercaseWords_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //1. Входни данни
        String input = scanner.nextLine();
        List<String> words = Arrays.stream(input.split("\\s+")).collect(Collectors.toList()); // лист със всички думи в текста

        // дума -> true (ако започва с главна буква) - false( ако не започва с главна буква)

        Predicate<String> isUpperCase = word -> Character.isUpperCase(word.charAt(0));
        words = words.stream().filter(isUpperCase).collect(Collectors.toList());
        //words -> Имаме само думи, които започват с главна буква

        System.out.println(words.size());
        System.out.println(String.join("\n", words));
    }
}
