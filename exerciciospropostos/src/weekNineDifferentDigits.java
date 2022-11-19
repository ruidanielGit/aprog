import java.util.Scanner;

/**
 * Write a program that reads a set of positive integers and visualizes, for each one, how many different digits make up the number.
 * Reading ends when a negative number is entered.
 * <p>
 * Result elements must be displayed on separate lines, in the following format:
 * <p>
 * <entered number>:<different digits>
 */
public class weekNineDifferentDigits {
    public static void main(String[] args) {

        printDifferentDigits(readArray());
    }

    public static int[] readArray() {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[30];
        int i = 0;
        boolean isNegative = false;

        for (int j = 0; j < array.length; j++) {
            array[j] = -1;
        }

        while (!isNegative && i < array.length) {
            int number = scanner.nextInt();
            if (number < 0) {
                isNegative = true;
            } else {
                if (i == array.length - 1) array = resizeArray(array);
                array[i] = number;
                i++;
            }
        }
        return array;
    }

    public static int differentDigits(int number) {
        int[] digits = new int[10];
        int differentDigits = 0;

        if (number == 0) return 1;
        while (number > 0) {
            int digit = number % 10;

            if (digits[digit] == 0) {
                digits[digit] = 1;
                differentDigits++;
            }
            number /= 10;
        }
        return differentDigits;
    }

    public static void printDifferentDigits(int[] array) {
        boolean isNegative = false;
        int i = 0;

        while (i < array.length && !isNegative) {
            if (array[i] < 0) {
                isNegative = true;
            } else {
                System.out.println(array[i] + ":" + differentDigits(array[i]));
                i++;
            }
        }
    }

    public static int[] resizeArray(int[] array) {
        int[] newArray = new int[array.length + 20];
        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i];
        }
        for (int i = array.length; i < newArray.length; i++) {
            newArray[i] = -1;
        }
        return newArray;
    }
}
