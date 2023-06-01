package FunctionalProgrammingExercises;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class ReverseAndExclude_05 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        int n = Integer.parseInt(scanner.nextLine());

        Collections.reverse(numbers);
        numbers.removeIf(e -> e % n == 0);
        numbers.forEach(s -> System.out.print(s + " "));


        //Минаваме през всички елементи и проверяваме дали се делят на N
        // Ако се делят без остатък ги запазваме в отделен лист (toRemove)
        // Взимаме от листа с числата за премахване и едно по едно ги премаххваме от List(numbers)

//        List<Integer> toRemove = numbers.stream().filter(e -> e % n == 0).collect(Collectors.toList());
//        System.out.println();
//
//        numbers.removeAll(toRemove);

    }
}
