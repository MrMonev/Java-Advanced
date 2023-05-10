package StacksAndQueuesLab;
import java.util.*;


public class SimpleCalculator02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(" ");

        ArrayDeque<String> calculationStack = new ArrayDeque<>();

        Collections.addAll(calculationStack, input);

        while (calculationStack.size() > 1) {
            int firstNum = Integer.parseInt(calculationStack.pop());
            String operator = calculationStack.pop();
            int secondNum = Integer.parseInt(calculationStack.pop());

            int sum = 0;

            if (operator.equals("+")) {
                sum = firstNum + secondNum;
            } else {
                sum = firstNum - secondNum;
            }
            calculationStack.push(String.valueOf(sum));
        }
        System.out.println(calculationStack.peek());
    }
}
