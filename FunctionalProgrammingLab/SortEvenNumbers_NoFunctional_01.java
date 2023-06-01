package FunctionalProgrammingLab;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class SortEvenNumbers_NoFunctional_01 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        // 1. Входни данни -> 2.4,3,5......
        String input = scanner.nextLine();// 4, 2, 1, 3, 5, 6, 1, 4, 2, 12
        String[] numbers = input.split(", ");
        List<Integer> num = new ArrayList<>();

        for (String text : numbers) {
            num.add(Integer.parseInt(text));

        }
        // 2. принтирам само четните числа
        printOnlyEvenNumbers(num);

        // 3. Сортираме в нарастваш ред
        Collections.sort(num);

        // 4. Принтираме отново само четните числа
        System.out.println();
        printOnlyEvenNumbers(num);
    }

    private static void printOnlyEvenNumbers(List<Integer> num) {
        for (int number : num) {
            if (number % 2 == 0) {
                System.out.print(number + ", ");
            }
        }
    }
}
