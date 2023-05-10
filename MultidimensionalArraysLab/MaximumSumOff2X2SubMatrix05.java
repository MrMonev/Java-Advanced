package MultidimensionalArraysLab;

import java.util.Scanner;

public class MaximumSumOff2X2SubMatrix05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] dimensions = scanner.nextLine().split(", ");

        int dimensionRow = Integer.parseInt(dimensions[0]);
        int dimensionCol = Integer.parseInt(dimensions[1]);


        int[][] matrix = new int[dimensionRow][dimensionCol];

        for (int rows = 0; rows < dimensionRow; rows++) {
            String[] row = scanner.nextLine().split(", ");
            for (int cols = 0; cols < dimensionCol; cols++) {
                matrix[rows][cols] = Integer.parseInt(row[cols]);
            }
        }
        int maxSum = Integer.MIN_VALUE;
        int[][] subMatrix = new int[2][2];
        for (int row = 0; row < dimensionRow - 1; row++) {
            for (int col = 0; col < dimensionCol - 1; col++) {
                int sum = matrix[row][col] + matrix[row][col+1] +
                        matrix[row+1][col] + matrix[row+1][col+1];
                if (sum > maxSum) {
                    maxSum = sum;
                    subMatrix[0][0] = matrix[row][col];
                    subMatrix[0][1] = matrix[row][col+1];
                    subMatrix[1][0] = matrix[row+1][col];
                    subMatrix[1][1] = matrix[row+1][col+1];
                }
            }
        }
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(subMatrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println(maxSum);
    }
}
