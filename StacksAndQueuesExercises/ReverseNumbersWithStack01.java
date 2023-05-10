package StacksAndQueuesExercises;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class ReverseNumbersWithStack01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] num = scanner.nextLine().split("\\s+");

        Deque<String> stack = new ArrayDeque<>();

        for (String number : num) {
            stack.push(number);
        }
        // Add elements in our Stack

        while (!stack.isEmpty()) {
            System.out.printf("%s ", stack.pop());
        }
    }
}
