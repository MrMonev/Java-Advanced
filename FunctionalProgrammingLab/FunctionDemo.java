package FunctionalProgrammingLab;
import java.util.Scanner;
public class FunctionDemo {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);




    }
}

//        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
//        Function<Integer, Integer> function = x -> x + 3;
//        numbers.stream().map(function);
//
//        // Function <Приема, Връща> -> apply
//        Function<String, Integer> textLength = text -> text.length();
//
//        System.out.println(textLength.apply("Ivaylo"));


//        Function<Integer, Double> sqrt = number -> Math.sqrt(number);
//        System.out.println(sqrt.apply(49));

//        Function<List<Integer>, Integer> sum = list -> {
//            int sum1 = 0;
//            for (int number : list) {
//                sum1 += number;
//            }
//            return sum1;
//        };
//        List<Integer> numbers = Arrays.asList(4, 5, 6, 7, 8);
//        System.out.println(sum.apply(numbers));