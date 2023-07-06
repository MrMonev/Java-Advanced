package Scale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        int first = Integer.parseInt(scanner.nextLine());
        int second = Integer.parseInt(scanner.nextLine());

        Scale<Integer> scale = new Scale<>(first,second);


        System.out.println(scale.getHeavier());
    }
}
