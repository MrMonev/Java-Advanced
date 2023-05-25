package MultidimensionalArraysExercises;

import java.util.Scanner;

public class FillTheMatrix01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine(); // ->   // ["3", "A"]

        int n = Integer.parseInt(input.split(", ")[0]); // [3] -> Размер
        String pattern = input.split(", ")[1]; // -> Pattern [A]

        int[][] matrix = new int[n][n];

        if (pattern.equals("A")) {
            // Pattern A -> обхождаме по колони !
            fillMatrixPatternA(matrix);


        } else if (pattern.equals("B")) {
            // Pattern B -> ако колоната е честна, -> (редовете от първия към последния),
            // Ако е НЕЧЕТНА ( редовете от последния към първия)
            fillMatrixPatternB(matrix);
        }
        printMatrix(matrix);
    }

    private static void printMatrix(int[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix.length; col++) {
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }
    }

    private static void fillMatrixPatternB(int[][] matrix) {

        // Четна колона -> обхождаме редовете от 0 до последния
        int startNumber = 1;
        for (int col = 0; col < matrix.length; col++) {
            if (col % 2 == 0) {
                for (int row = 0; row < matrix.length; row++) {
                    matrix[row][col] = startNumber;
                    startNumber++;
                }
            } else {
                // Нечетна колона -> От последния към 0
                for (int row = matrix.length - 1; row >= 0; row--) {
                    matrix[row][col] = startNumber;
                    startNumber++;
                }

            }
        }
    }

    private static void fillMatrixPatternA(int[][] matrix) {

        int startNumber = 1;
        for (int col = 0; col < matrix.length; col++) {
            for (int row = 0; row < matrix.length; row++) {
                matrix[row][col] = startNumber;
                startNumber++;
            }
        }
    }
}
