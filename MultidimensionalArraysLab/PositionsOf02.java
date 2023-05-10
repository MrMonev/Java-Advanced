package MultidimensionalArraysLab;

import java.util.Scanner;

public class PositionsOf02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] rowsCols = scanner.nextLine().split(" ");
        int rows = Integer.parseInt(rowsCols[0]);
        int cols = Integer.parseInt(rowsCols[1]);


        int[][] matrix = new int[rows][cols];
        for (int row = 0; row < rows ; row++) {
            String[] rowData = scanner.nextLine().split(" ");
            for (int col = 0; col < cols ; col++) {

                matrix[row][col] = Integer.parseInt(rowData[col]);
            }
        }
       int number = Integer.parseInt(scanner.nextLine());
        boolean weFountIt = false;

        for (int row = 0; row < rows ; row++) {
            for (int col = 0; col < cols ; col++) {
                if(matrix[row][col] == number) {
                    weFountIt = true;
                    System.out.println(row + " " + col);
                }
            }
        }
        if(!weFountIt) {
            System.out.println("not found");
        }
    }
}
