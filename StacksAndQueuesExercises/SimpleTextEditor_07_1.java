package StacksAndQueuesExercises;

import java.util.*;

public class SimpleTextEditor_07_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //1. input
        int operations = Integer.parseInt(scanner.nextLine()); // 1 <= N <= 105

        Deque<String> textStack = new ArrayDeque<>();
        String text = "";

        for (int i = 0; i < operations; i++) {
            if (isValid(operations)) {
                String[] command = scanner.nextLine().split("\\s+");


                switch (command[0]) {
                    case "1":
                        textStack.push(command[1]);
                        text += command[1];
                        break;

                    case "2":
                        textStack.push(text);
                        int count = Integer.parseInt(command[1]);
                        text = text.substring(0, text.length() - count);
                        break;

                    case "3":
                        int index = Integer.parseInt(command[1]);
                        System.out.println(text.charAt(index - 1));
                        break;

                    case "4":
                        text = textStack.pop();
                        break;
                }
            }
        }
    }

    public static boolean isValid(int n) {
        if (1 > n || n > 105) {
            return false;
        }
        return true;
    }
}

