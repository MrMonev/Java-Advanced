package StacksAndQueuesLab;

import java.util.*;

public class DecimalToBinary03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int number = Integer.parseInt(scanner.nextLine());

        Deque<Integer> numberDec = new ArrayDeque<>();

        if(number == 0) {
            System.out.println("0");
        } else {
            while (number != 0) {
                numberDec.push(number % 2);
                number /= 2;
            }
            while (!numberDec.isEmpty()) {
                System.out.print(numberDec.pop());
            }
        }
    }
}
