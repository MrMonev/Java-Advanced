package FunctionalProgrammingLab;

import java.util.*;
import java.util.stream.Collectors;

public class FunctionalProgramming {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine()
                        .split(", "))
                .map(Integer::parseInt)
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList());



        printListWithComa(numbers);
        Collections.sort(numbers);

        printListWithComa(numbers);
    }
    private  static  void printListWithComa(List<Integer> numbers) {

        List<String> numbersAsList = new ArrayList<>();
        for (Integer number : numbers) {
            numbersAsList.add(String.valueOf(number));
        }
        System.out.println(String.join(", ", numbersAsList));
    }
}
