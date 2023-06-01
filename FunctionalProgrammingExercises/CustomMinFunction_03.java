package FunctionalProgrammingExercises;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;

public class CustomMinFunction_03 {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        Integer[] numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .toArray(Integer[]::new);


                            //01. Първи начин:

//        Function<Integer[], Integer> findSmallestNum = arr -> Arrays.stream(arr).
//                mapToInt(e -> e)// има във себе си (min) метода
//                .min() // връща ни най малкият елемент
//                .getAsInt(); // като цяло число
//
//        Integer smallestNum = findSmallestNum.apply(numbers);
//        System.out.println(smallestNum);

 /////////////////////////////////////////////////////////////////////////////////////////////
                            // Втори начин:

//        Function<Integer[], Integer> findSmallestNum = arr -> Arrays.stream(arr)
//                .sorted() // Сортираме от по малкото към по голямото
//                .toArray(Integer[]::new)[0];
        // преобразуваме го на Array от Integers и ми дава 0 елемент което е най малкото число

/////////////////////////////////////////////////////////////////////////////////////////////
                            // Трети начин:

       Function<Integer[], Integer> findSmallestNum = arr -> Collections.min(List.of(arr));
        System.out.println(findSmallestNum.apply(numbers));
    }
}
