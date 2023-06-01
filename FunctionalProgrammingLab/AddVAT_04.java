package FunctionalProgrammingLab;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;

public class AddVAT_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Double> prices = Arrays.stream(scanner.nextLine().split(", "))
                .map(Double::parseDouble).collect(Collectors.toList());

        // цената -> трябва да върна цената + 20%

        Function<Double, Double> addVAT = price -> price * 1.2;
        //цената с ДДС -> принт -> %.2f
        Consumer<Double> printFormatPrice = price -> System.out.printf("%.2f%n", price);

        System.out.println("Prices with VAT:");
        for (Double price : prices) {
            Double priceWithVAT = addVAT.apply(price); // цената след добавенето ДДС
            printFormatPrice.accept(priceWithVAT);
        }

    }
}
