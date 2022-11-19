import java.util.Scanner;

/**
 * Write a program to read a set of integers and display all numbers in that set that are larger than their neighbours.
 * A number is larger than its neighbours if it is simultaneously larger than the previous and next number.
 * Reading ends when a negative number is entered. Never more than 30 numbers will be entered.
 * <p>
 * Result elements should be displayed on separate lines.
 */

public class weekNineNeighours {

    public static void main(String[] args) {

        largerThanNeighbours(readArray());
    }

    public static void largerThanNeighbours(int[] array) {
        for (int i = 1; i < array.length - 1; i++) {
            if (array[i] > array[i - 1] && array[i] > array[i + 1]) {
                System.out.println(array[i]);
            }
        }
    }

    public static int[] readArray() {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[30];
        int i = 0;
        boolean isNegative = false;
        while (!isNegative && i < array.length) {
            int number = scanner.nextInt();
            if (number < 0) {
                isNegative = true;
                array[i-1] = -1;
            } else {
                array[i] = number;
                i++;
            }
        }
        return array;
    }
}
