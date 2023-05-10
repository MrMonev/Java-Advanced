package StacksAndQueuesExercises;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Deque;
import java.util.Scanner;

public class BasicQueueOperations04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(" ");

        int countOffer = Integer.parseInt(input[0]);
        int countPoll = Integer.parseInt(input[1]);
        int elementToSearch = Integer.parseInt(input[2]);

        Deque<Integer> queue = new ArrayDeque<>();

        String[] numbersToAdd = scanner.nextLine().split(" ");

        for (int i = 0; i < countOffer ; i++) {
            queue.offer(Integer.parseInt(numbersToAdd[i]));
        }
        for (int i = 0; i < countPoll ; i++) {
            queue.poll();
        }
        if(queue.isEmpty()) {
            System.out.println("0");
        } else if (queue.contains(elementToSearch)) {
            System.out.println("true");
        } else {
            int minValue = Collections.min(queue);
            System.out.println(minValue);
        }
    }
}
