package SetsAndMapsAdvancedExercises;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class SetsOfElements02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        int sizeFirstSet = Integer.parseInt(input.split("\\s+")[0]);
        int sizeSecondSet = Integer.parseInt(input.split("\\s+")[1]);


        Set<Integer> firstSet = new LinkedHashSet<>();
        Set<Integer> secondSet = new LinkedHashSet<>();

        //1. Добавяме елементите в двата сета

        for (int i = 1; i <= sizeFirstSet; i++) {
            int number = Integer.parseInt(scanner.nextLine());
            firstSet.add(number);
        }
        for (int i = 1; i <= sizeSecondSet ; i++) {
            int number = Integer.parseInt(scanner.nextLine());
            secondSet.add(number);
        }
        //2. Взиамме елементите, които ги има в двата сета -> Намериаме общите елементи в двата сета

        Set<Integer> duplicateElements = new LinkedHashSet<>(); // Съхраняваме повтарящите се елементи в двата сета

        for (int number: firstSet) {
            if(secondSet.contains(number)) {
                duplicateElements.add(number);
            }
        }
        // Всички елементи, които ги има и във двата сета
        duplicateElements.forEach(e -> System.out.print(e + " "));
    }
}
