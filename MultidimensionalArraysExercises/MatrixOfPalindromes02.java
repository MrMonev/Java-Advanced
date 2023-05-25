package MultidimensionalArraysExercises;

import java.util.Scanner;

public class MatrixOfPalindromes02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int rows = scanner.nextInt();
        int cols = scanner.nextInt();

        String[][] matrix = new String[rows][cols];

        char startLatter = 'a';

        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                // (a -> b -> c ) (startLetter + 1) ( )
                String palindrome = "" + startLatter + (char) (startLatter + col) + startLatter;
                matrix[row][col] = palindrome;
            }
            startLatter = (char) (startLatter + 1);
        }
        printMatrix(matrix, rows, cols);
    }
    private static void printMatrix(String[][] matrix, int rows, int cols) {
        for (int row = 0; row < rows; row++) { // matrix.length
            for (int col = 0; col < cols; col++) { // matrix[rows].length
                System.out.print(matrix[row][col] + " ");

            }
            System.out.println();
        }
    }
}
