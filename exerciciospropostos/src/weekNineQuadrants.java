import java.util.Scanner;

/**
 * Write a program that reads a square matrix of integers and displays the sum of the numbers in each of its quadrants.
 * If we divide a matrix in half vertically and horizontally, we obtain 4 quadrants (q1, q2, q3, q4).
 * <p>
 * The program must read a value N corresponding to the dimension of the array (1 < N <= 20). Then it should read N lines, each containing N numbers separated by spaces.
 * <p>
 * At the end, the value of the 4 quadrants should be visualized as follows:
 * <p>
 * [q2][q1]
 * [q3][q4]
 */
public class weekNineQuadrants {
    public static void main(String[] args) {

//        int[][] matrix = new int[][]{
//                {10, 20, 30},
//                {50, 60, 70},
//                {90, 100, 110},
//        };

//        int[][] matrix = new int[][]{
//                {10, 20, 30, 40},
//                {50, 60, 70, 10},
//                {90, 100, 110, 1},
//                {1, 2, 3, 4}
//        };
        //sumOfEachQuadrant(matrix);


        sumOfEachQuadrant(createMatrix());
    }

    public static int[][] createMatrix() {
        Scanner scanner = new Scanner(System.in);
        int matrixSize;
        do {
            matrixSize = scanner.nextInt();
        } while (matrixSize <= 1 || matrixSize > 20);

        int[][] matrix = new int[matrixSize][matrixSize];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }
        return matrix;
    }

    private static void sumOfEachQuadrant(int[][] matrix) {

        int sumQ1 = 0;
        int sumQ2 = 0;
        int sumQ3 = 0;
        int sumQ4 = 0;

        if (matrix.length % 2 == 0) {
            for (int i = 0; i < matrix.length / 2; i++) {
                for (int j = 0; j < matrix.length / 2; j++) {
                    sumQ1 += matrix[i][j];
                }
            }
            for (int i = 0; i < matrix.length / 2; i++) {
                for (int j = matrix.length / 2; j < matrix.length; j++) {
                    sumQ2 += matrix[i][j];
                }
            }
            for (int i = matrix.length / 2; i < matrix.length; i++) {
                for (int j = 0; j < matrix.length / 2; j++) {
                    sumQ3 += matrix[i][j];
                }
            }
            for (int i = matrix.length / 2; i < matrix.length; i++) {
                for (int j = matrix.length / 2; j < matrix.length; j++) {
                    sumQ4 += matrix[i][j];
                }
            }
        } else {
            for (int i = 0; i < matrix.length / 2; i++) {
                for (int j = 0; j < matrix.length / 2; j++) {
                    sumQ1 += matrix[i][j];
                }
            }
            for (int i = 0; i < matrix.length / 2; i++) {
                for (int j = matrix.length / 2 + 1; j < matrix.length; j++) {
                    sumQ2 += matrix[i][j];
                }
            }
            for (int i = matrix.length / 2 + 1; i < matrix.length; i++) {
                for (int j = 0; j < matrix.length / 2; j++) {
                    sumQ3 += matrix[i][j];
                }
            }
            for (int i = matrix.length / 2 + 1; i < matrix.length; i++) {
                for (int j = matrix.length / 2 + 1; j < matrix.length; j++) {
                    sumQ4 += matrix[i][j];
                }
            }
        }

        System.out.print("[" + sumQ1 + "]" + "[" + sumQ2 + "]" + "\n" + "[" + sumQ3 + "]" + "[" + sumQ4 + "]" + "\n");
    }
}
