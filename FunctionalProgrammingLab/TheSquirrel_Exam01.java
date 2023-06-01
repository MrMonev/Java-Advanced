package FunctionalProgrammingLab;

import java.util.Scanner;

public class TheSquirrel_Exam01 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int hazelNuts = 0;   // Брой на лешниците -> 3
        boolean isTrap = false; // Дали сме попаднали в капан
        // Размер на квадратната матрица(редове - колони = size)
        int size = Integer.parseInt(scanner.nextLine());

        // "left, right, up, down"
        String[] directions = scanner.nextLine().split(", ");

        char[][] field = createMatrix(size, scanner); // поле за движение

        int squirrelRow = -1; // ред
        int squirrelCol = -1; // колона

        // намираме катерицата
        for (int row = 0; row < size; row++) {
            for (int col = 0; col < size; col++) {
                if (field[row][col] == 's') {
                    squirrelRow = row;
                    squirrelCol = col;
                }
            }
        }
        // Движения на катерицата
        for (String direction : directions) {
            // direction -> Left, Right, up, down
            if ("left".equals(direction)) {// Намаляме колоната с -1
                //1. Проверка дали там където отиваме е вътре в матрицата
                if (isInside(squirrelCol - 1, size)) {
                    // можем да се движим
                    field[squirrelRow][squirrelCol] = '*';
                    squirrelCol -= 1; // местене
                    // проверка на какво поле сме отишли
                    if (field[squirrelRow][squirrelCol] == 't') {
                        // trap
                        isTrap = true;
                        System.out.println("Unfortunately, the squirrel stepped on a trap...");
                        break;
                    } else if (field[squirrelRow][squirrelCol] == 'h') {
                        hazelNuts++;
                        field[squirrelRow][squirrelCol] = 's';
                    }
                } else {
                    // извън матрицата
                    isTrap = true;
                    // проверка на какво поле сме отишли
                    if (field[squirrelRow][squirrelCol] == 't') {
                        // trap
                        isTrap = true;
                        System.out.println("Unfortunately, the squirrel stepped on a trap...");
                        break;
                    } else if (field[squirrelRow][squirrelCol] == 'h') {

                        field[squirrelRow][squirrelCol] = 's';
                    }
                    System.out.println("The squirrel is out of the field.");
                    break;
                }
            } else if ("right".equals(direction)) {// Увеличваме колоната с +1
                if (isInside(squirrelCol + 1, size)) {
                    // можем да се движим -> местим катерицата
                    squirrelCol += 1;
                    // проверка на какво поле сме отишли
                    if (field[squirrelRow][squirrelCol] == 't') {
                        // trap
                        isTrap = true;
                        System.out.println("Unfortunately, the squirrel stepped on a trap...");
                        break;
                    } else if (field[squirrelRow][squirrelCol] == 'h') {
                        hazelNuts++;
                        field[squirrelRow][squirrelCol] = 's';
                    }
                } else {
                    // извън матрицата
                    isTrap = true;
                    System.out.println("The squirrel is out of the field.");
                    break;
                }
            } else if ("up".equals(direction)) {// Намаляме редът -1
                if (isInside(squirrelRow - 1, size)) {
                    // можем да се движим -> местим катерицата
                    squirrelCol -= 1;
                    // проверка на какво поле сме отишли
                    if (field[squirrelRow][squirrelCol] == 't') {
                        // trap
                        isTrap = true;
                        System.out.println("Unfortunately, the squirrel stepped on a trap...");
                        break;
                    } else if (field[squirrelRow][squirrelCol] == 'h') {
                        hazelNuts++;
                        field[squirrelRow][squirrelCol] = 's';
                    }
                } else {
                    // извън матрицата
                    isTrap = true;
                    System.out.println("The squirrel is out of the field.");
                    break;
                }
            } else if ("down".equals(direction)) {// Увеличаваме редът +1
                if (isInside(squirrelRow + 1, size)) {
                    // можем да се движим -> местим катерицата
                    squirrelRow += 1;
                    // проверка на какво поле сме отишли
                    if (field[squirrelRow][squirrelCol] == 't') {
                        // trap
                        isTrap = true;
                        System.out.println("Unfortunately, the squirrel stepped on a trap...");
                        break;
                    } else if (field[squirrelRow][squirrelCol] == 'h') {
                        hazelNuts++;
                        field[squirrelRow][squirrelCol] = 's';
                    }
                } else {
                    // извън матрицата
                    isTrap = true;
                    System.out.println("The squirrel is out of the field.");
                    break;
                }
            }
            if (hazelNuts == 3) {
                System.out.println("Good job! YOu have collected all hazelnuts!");
                break;
            }
        }
        if (hazelNuts >= 3 || isTrap) {
            System.out.println("Hazelnuts collected: " + hazelNuts);
        } else if (!isTrap) {
            // isTrap
            // true -> капан или извън матрицата
            // false -> не сме нито във капан и нито извън матрицата
            // прекъснали цикъла,и сме минаи през всички посоки -> не сме във капан или извън матрицата
            System.out.println("There are more hazelnuts to collect.");
            System.out.println("Hazelnuts collected: " + hazelNuts);

        }
    }

    private static char[][] createMatrix(int size, Scanner scanner) {
        // size -> Размер на матрицата (size = редове - колони)

        //Начин 1: за пълнене на матрица
        char[][] matrix = new char[size][size];
        for (int row = 0; row < size; row++) {
            char[] rowData = scanner.nextLine().toCharArray();

            //Начин 2: за пълнене на матрица
            for (int col = 0; col < size; col++) {
                char currentSymbol = rowData[col];
                matrix[row][col] = currentSymbol;
            }
        }
        return matrix;
    }

    private static boolean isInside(int number, int size) {
        return number >= 0 && number < size;
    }
}
