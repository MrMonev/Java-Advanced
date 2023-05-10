package StacksAndQueuesExercises;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Deque;
import java.util.Scanner;

public class BasicStackOperations02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split("\\s+");

        int countToPush = Integer.parseInt(input[0]);
        int countToPop = Integer.parseInt(input[1]);
        int elementToSearch = Integer.parseInt(input[2]);

        Deque<Integer> stack = new ArrayDeque<>();

        String[] numbersToAdd = scanner.nextLine().split(" ");
        for (int i = 0; i < countToPush; i++) {
            stack.push(Integer.parseInt(numbersToAdd[i]));
        }

        for (int i = 0; i < countToPop ; i++) {
            stack.pop();
        }

        if (stack.isEmpty()) {
            System.out.println("0");
        } else if (stack.contains(elementToSearch)) {
            System.out.println(true);
        } else {
//              int minValue = stack.stream().mapToInt(e->e).min().getAsInt();
//                System.out.println(minValue);

            int minValue = Collections.min(stack);
            System.out.println(minValue);
            }
    }
}
