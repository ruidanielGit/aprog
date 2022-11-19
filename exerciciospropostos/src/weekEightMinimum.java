import java.util.Scanner;

public class weekEightMinimum {
    /**
     * Write a program to read a set of positive integers (for an array). Number reading ends when a negative number is entered.
     * Then, determine which is the element with minimum value in the set and how many times it has been inserted. The last number (negative) should be avoided.
     * <p>
     * The program should display the number with minimum value and how many times it was inserted, on separate lines and with the following format:
     * <p>
     * min=<lowest number>
     * occurrences=<number of occurrences>
     */

    static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {

        minAndOccurrences(readArray());
    }

    public static void minAndOccurrences(int[] numbers) {
        if (numbers.length - 1 == 0) {
            return;
        }
        int min = numbers[0];
        int ocurrences = 0;

        for (int i = 0; i < numbers.length - 1; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }

        for (int i = 0; i < numbers.length - 1; i++) {
            if (numbers[i] == min) {
                ocurrences++;
            }
        }
        System.out.println("min=" + min + "\noccurrences=" + ocurrences);
    }

    public static int[] readArray() {
        int[] array = new int[1];
        int n = s.nextInt();

        for (int i = 0; n >= 0; i++) {
            array[i] = n;
            n = s.nextInt();
            array = resizeArray(array);
        }
        return array;
    }

    public static int[] resizeArray(int[] array) {
        int newArray[] = new int[array.length + 1];

        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i];
        }
        return newArray;
    }
}
