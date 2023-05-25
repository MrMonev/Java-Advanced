package MultidimensionalArraysExercises;

import java.util.*;

public class CrossFire07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] dimension = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        int rows = dimension[0];
        int cols = dimension[1];


        List<List<Integer>> matrix = new ArrayList<>();
        fillMatrixList(matrix, rows, cols);

        String input = scanner.nextLine();

        while (!input.equals("Nuke it from orbit")) {


            int[] commands = Arrays.stream(input.split("\\s+")).
                    mapToInt(Integer::parseInt).
                    toArray();

            int targetRow = commands[0];
            int targetCol = commands[1];
            int radius = commands[2];

            // destroying along the rows by the given radius
            for (int row = targetRow - radius; row <= targetRow + radius; row++) {
                if (isInside(matrix, row, targetCol)) {
                    matrix.get(row).set(targetCol, 0);
                }
            }

            // destroying along the columns by the given radius
            for (int col = targetCol - radius; col <= targetCol + radius; col++) {
                if (isInside(matrix, targetRow, col)) {
                    matrix.get(targetRow).set(col, 0);
                }
            }
            List<Integer> toRemove = new ArrayList<>();

            toRemove.add(0);
            for (int row = 0; row < matrix.size(); row++) {
                // by removing all zeros on the row all remaining elements are shifter to the lest
                matrix.get(row).removeAll(toRemove);
                // remove the row if there are no elements on it
                if (matrix.get(row).size() == 0) {
                    matrix.remove(row);
                    row--;
                }
            }
            input = scanner.nextLine();

        }
        printMatrix(matrix);
    }

    private static void printMatrix(List<List<Integer>> matrix) {
        for (List<Integer> row : matrix) {
            row.forEach(e -> System.out.print(e + " "));
            System.out.println();
        }
    }

    private static boolean isInside(List<List<Integer>> matrix, int row, int col) {
        return row >= 0 && row < matrix.size() && col >= 0 && col < matrix.get(row).size();
    }

    private static void fillMatrixList(List<List<Integer>> matrix, int rows, int cols) {

        int count = 1;
        for (int row = 0; row < rows; row++) {
            List<Integer> rowList = new ArrayList<>();
            for (int col = 0; col < cols; col++) {
                rowList.add(count++);
            }
            matrix.add(rowList);
        }
    }
}
