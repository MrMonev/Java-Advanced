package MultidimensionalArraysExercises;


import java.util.Scanner;

public class MatrixShuffling05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        // nextInt -> Чете първото число от конзолата,
        // след като го извика отново дава следващотият Int(число)

        int rows = Integer.parseInt(input[0]);
        int cols = Integer.parseInt(input[1]);

        String[][] matrix = new String[rows][cols];
        fillMatrix(matrix, scanner);

        String command = scanner.nextLine();
        while (!command.equals("END")) {
            // Валидиране на командата !
            // Невалидна командата:
            if (!validateCommand(command, rows, cols)) {
                System.out.println("Invalid input!");
            }
            // Валидна комоанда"
            else {
                // "swap 0 0 1 1"
                String[] commandParts = command.split(" ");
                int row1 = Integer.parseInt(commandParts[1]);
                int col1 = Integer.parseInt(commandParts[2]);
                int row2 = Integer.parseInt(commandParts[3]);
                int col2 = Integer.parseInt(commandParts[4]);

                String firstElement = matrix[row1][col1];
                String secondElement = matrix[row2][col2];

                matrix[row1][col1] = secondElement;
                matrix[row2][col2] = firstElement;

                printMatrix(matrix, rows, cols);
            }
            command = scanner.nextLine();
        }
    }

    private static void printMatrix(String[][] matrix, int rows, int cols) {
        for (int row = 0; row < rows; row++) { // matrix.length
            for (int col = 0; col < cols; col++) { // matrix[rows].length
                System.out.print(matrix[row][col] + " ");

            }
            System.out.println();
        }
    }

    private static void fillMatrix(String[][] matrix, Scanner scanner) {
        for (int row = 0; row < matrix.length; row++) {
            matrix[row] = scanner.nextLine().split("\\s+");

        }
    }

    private static boolean validateCommand(String command, int rows, int cols) {
        // true -> Ако командата е валидна
        // false -> Ако командата е невалидна
        // command = "swap row1 col1 col2"
        String[] commandParts = command.split("\\s+");
        // "swap 1 2 3 4". split -> ["swap", "1" "2" "3" "4"]

        //1. Проверка дали има определен брой части! -> 5
        if (commandParts.length != 5) {
            return false;
        }
        //2. Проверка дали започва със swap?
        if (!commandParts[0].equals("swap")) {
            return false;
        }
        //3. Проверка дали редовете и колоните са валидни!!!!!!!!!!!!!
        int row1 = Integer.parseInt(commandParts[1]); // row1 >= 0 && < от броя на редовете
        int col1 = Integer.parseInt(commandParts[2]); // row1 >= 0 && < от броя на редовете
        int row2 = Integer.parseInt(commandParts[3]); // row1 >= 0 && < от броя на редовете
        int col2 = Integer.parseInt(commandParts[4]); // row1 >= 0 && < от броя на редовете

        if (row1 < 0 || row1 >= rows || row2 < 0 || row2 >= rows || col1 >= cols || col2 < 0 || col2 >= cols) {
            return false;

        }
        return true;
    }
}
