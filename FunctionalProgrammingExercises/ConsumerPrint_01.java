package FunctionalProgrammingExercises;
import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Consumer;
public class ConsumerPrint_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        //Consumer<InputParam> -> void -> Use with accept

        String[] strings = scanner.nextLine().split("\\s+");

        Consumer<String> printStrings = word -> System.out.println(word );

//        for (String word : strings) {
//            printStrings.accept(word);
//        }
//        Arrays.stream(strings).forEach(printStrings);
//
//        Arrays.stream(strings).forEach( s-> System.out.println(printStrings));

        Arrays.stream(strings).forEach(printStrings::accept);
    }
}
