package SetsAndMapsAdvancedExercises;

import java.util.*;

public class PeriodicTable_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Set<String> uniqueElements = new TreeSet<>();
        int n = Integer.parseInt(scanner.nextLine());

        for (int row = 0; row < n; row++) {
            String[] chemicalElements = scanner.nextLine().split("\\s+");

//            // Начин 1:
//            for (String element: chemicalElements) {
//                uniqueElements.add(element);
//            }

//            // Начин 2:
//            Collections.addAll(Arrays.asList(chemicalElements, uniqueElements);

            // Начин 3:
            uniqueElements.addAll(Arrays.asList(chemicalElements));
        }
        // Сет със всички химични елементи, които се срещат по 1 -път
        uniqueElements.forEach(element -> System.out.print(element + " "));
    }
}
