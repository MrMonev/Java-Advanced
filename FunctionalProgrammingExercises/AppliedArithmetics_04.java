package FunctionalProgrammingExercises;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;

public class AppliedArithmetics_04 {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        Function<List<Integer>, List<Integer>> addNumber = list -> list.stream()
                .map(num -> num + 1)
                .collect(Collectors.toList());

        Function<List<Integer>, List<Integer>> multiplyNumber = list -> list.stream()
                .map(num -> num * 2)
                .collect(Collectors.toList());

        Function<List<Integer>, List<Integer>> subtractNumber = list -> list.stream()
                .map(num -> num - 1)
                .collect(Collectors.toList());

        Consumer<List<Integer>> print = list -> list.forEach(num -> System.out.print(num + " "));


        String command = scanner.nextLine();

        //Consumer<>
        while (!command.equals("end")) {
            switch (command) {
                // adds 1;
                case "add":
                    numbers = addNumber.apply(numbers);
                    break;

                //multiply by 2
                case "multiply":
                    numbers = multiplyNumber.apply(numbers);
                    break;
                // subtract - 1
                case "subtract":
                    numbers = subtractNumber.apply(numbers);
                    break;


                case "print":
                     print.accept(numbers);
                    System.out.println();
                    break;

            }


            command = scanner.nextLine();
        }
    }
}
