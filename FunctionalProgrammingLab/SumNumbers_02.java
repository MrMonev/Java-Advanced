package FunctionalProgrammingLab;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;

public class SumNumbers_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //1. Входни данни: 4, 2, 1, 3, 5, 7, 1, 4, 2, 12:
        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(", ")).sorted().
                map(Integer::parseInt).collect(Collectors.toList());


        //2. Броя на числата във въведения списък
        int countNumbers = numbers.size();// Броя на елементите в списъка


        //3. Сума на числата в списъка
        // лист -> сума от числата
        Function<List<Integer>, Integer> sumElementsInList = list -> {
          int sum = 0;// Сума на числата в нашия списък
            for (int number : list) {
                sum += number;
            }
            return sum;
        };
        int sumNumbers = sumElementsInList.apply(numbers);// Сумата на числата в списъка

        //4. принтираме резултатите
        System.out.println("Count = " + countNumbers);
        System.out.println("Sum = " + sumNumbers);

    }
}
