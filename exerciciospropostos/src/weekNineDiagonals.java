import java.util.Scanner;

/**
 * Write a program that reads a square matrix of integers and writes the values corresponding to the various diagonals with the same direction of the main diagonal and from right to left.
 * The program should read a value N (1 < N <= 20) corresponding to the dimension of the array. Then it should read N lines each containing N numbers separated by spaces.
 * <p>
 * The elements of each diagonal must be visualized in separate lines and in the following way:
 * <p>
 * [a]...[z]
 */
public class weekNineDiagonals {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        printMatrixDiagonalsRightToLeft(createMatrix());
    }

    private static int[][] createMatrix() {

        int matrixSize;
        do {
            matrixSize = sc.nextInt();
        } while (matrixSize <= 1 || matrixSize > 20);

        int[][] matrix = new int[matrixSize][matrixSize];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        return matrix;
    }

    private static void printMatrixDiagonalsRightToLeft(int[][] matrix) {
        for (int i = matrix.length - 1; i >= 0; i--) {
            int linha = 0;
            for (int j = i; j <= matrix.length - 1; j++) {
                System.out.printf("[%d]", matrix[linha][j]);
                linha++;
            }
            System.out.println();
        }
        for (int i = 1; i < matrix.length; i++) {
            int linha = i;
            for (int j = 0; j < matrix.length - i; j++) {
                System.out.printf("[%d]", matrix[linha][j]);
                linha++;
            }
            System.out.println();
        }
    }
}
