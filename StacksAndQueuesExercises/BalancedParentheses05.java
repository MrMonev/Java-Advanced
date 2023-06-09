package StacksAndQueuesExercises;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class BalancedParentheses05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String brackets = scanner.nextLine();   // '{', '[', '(', ')', ']', '}'

        boolean isBalanced = true;

        Deque<Character> openingBrackets = new ArrayDeque<>();

        for (int i = 0; i < brackets.length(); i++) {

            char currentBracket = brackets.charAt(i);
            // '{', '[', '('
            if (currentBracket == '(' || currentBracket == '[' || currentBracket == '{') {
                openingBrackets.push(currentBracket);
            } else {
                // '}', ']', ')'
                if(openingBrackets.isEmpty()){
                    isBalanced = false;
                    break;
                }

                char lastOpeningBracket  = openingBrackets.pop();
                if(currentBracket == '}' && lastOpeningBracket != '{') {
                   isBalanced = false;
                } else if (currentBracket == ')' && lastOpeningBracket != '(') {
                    isBalanced = false;
                } else if (currentBracket == ']' && lastOpeningBracket != '[') {
                    isBalanced = false;
                }
            }
        }
        if(isBalanced && openingBrackets.isEmpty()) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
