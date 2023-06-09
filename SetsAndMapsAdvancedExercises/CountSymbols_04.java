package SetsAndMapsAdvancedExercises;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class CountSymbols_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        Map<Character, Integer> occurrences = new TreeMap<>();
        for (int i = 0; i < input.length(); i++) {
            char symbol = input.charAt(i);
            if(!occurrences.containsKey(symbol)) {
                occurrences.put(symbol, 1);
            } else {
                occurrences.put(symbol,occurrences.get(symbol) + 1);
            }
        }

        occurrences.forEach((k, v) -> System.out.printf("%c: %d time/s\n",k,v));

    }
}
