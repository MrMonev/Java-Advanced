package MultidimensionalArraysExercises;

import java.util.Scanner;

public class DiagonalDifference03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int[][] matrix = new int[n][n]; // Квадратна матрица

        //1. Напълваме матрицата:
        fillMatrix(matrix, scanner);
        //2. Намираме сумата на главния диагонал
        int sumPrimary = getSumPrimaryDiagonal(matrix);
        //3. Намираме сумата на второстепенния диагонал
        int sumSecondary = getSumSecondaryDiagonal(matrix);
        //4. Абсолютната стойност на разликата между сбота от диагоналите
        System.out.println(Math.abs(sumPrimary - sumSecondary));

    }

    private static int getSumSecondaryDiagonal(int[][] matrix) {
        // Всички елементи -> Сумираме само тези, които се намират на второстепенния диагонал
        int sum = 0; // Сумата от елементите на второстепенния диагонал
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix.length; col++) {
                int currentElement = matrix[row][col];
                if(col == matrix.length - row - 1) {
                    sum += currentElement;
                }
            }
        }
        return sum;
    }

    private static int getSumPrimaryDiagonal(int[][] matrix) {
        // Всички елементи -> Сумираме само тези, които се намират на главния диагонал!
        int sum = 0; // Сума на елементите от главния диагонал
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix.length; col++) {
                int currentElement = matrix[row][col];
                // Сумираме ако е на главния диагонал!
                if(row == col) { // Намираме главния диалгонал, ако редовете и колоните са еднакви
                    sum += currentElement; // Сумираме
                }
            }
        }
        return sum;
    }

    private static void fillMatrix(int[][] matrix, Scanner scanner) {
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix.length; col++) {
                matrix[row][col] = scanner.nextInt(); // Взима от конзолата следващото число

            }
        }
    }
}
