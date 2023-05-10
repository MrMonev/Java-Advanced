package StacksAndQueuesLab;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Scanner;

public class HotPotato06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] inputArr = scanner.nextLine().split("\\s+");
        int n = Integer.parseInt(scanner.nextLine());

        ArrayDeque<String> namesDec = new ArrayDeque<>();

        Collections.addAll(namesDec, inputArr);


        while (namesDec.size() > 1) {

            for (int i = 1; i < n; i++) {

                String first = namesDec.poll();
                namesDec.offer(first);

            }
            System.out.printf("Removed %s%n", namesDec.poll());
        }
        System.out.printf("Last is %s",namesDec.pop());
    }
}
