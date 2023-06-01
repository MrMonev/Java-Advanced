package FunctionalProgrammingExercises;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindTheSmallestElement_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        // Трябва да намерим индека в нашлият лист ( който е с най малка стойност)

        Function<List<Integer>, Integer> findSmallestNumber = list -> Collections.min(list);

        BiFunction<List<Integer>, Integer, Integer> getLastIndexOfMinElement =
                (list, minNum) -> list.lastIndexOf(minNum);

        int smallestNumber = findSmallestNumber.apply(numbers);
        int lastIndex = getLastIndexOfMinElement.apply(numbers, smallestNumber);

        System.out.println(lastIndex);

        //  indexOf -> Първото срещане
//        // LastIndexOf -> Последното срещане
////        System.out.println(numbers.lastIndexOf(smallestNumber));
    }
}
