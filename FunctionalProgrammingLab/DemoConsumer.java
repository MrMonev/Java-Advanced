package FunctionalProgrammingLab;

import java.util.function.Consumer;

public class DemoConsumer {
    public static void main(String[] args) {
        // Consumer<Приема> -> VOID -> accept
        Consumer<String> print = text -> {
            text += " You know what I'm said";
            System.out.println(text + "!");
            System.out.println(text + "?");
            System.out.println(text + ".");
        };

        print.accept("Today is beautifull.");
    }
}
