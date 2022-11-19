import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Write a program that reads N integers and displays them in the same order but without repetitions.
 * First, the program must read the value of N. Next, it must read the N numbers of the set.
 * <p>
 * Each element of the result set must be displayed on separate lines.
 */
public class weekNineNoRepetitions {

    public static void main(String[] args) {

        printNoRepetitions();
    }

    public static void printNoRepetitions() {

        int[] d = removeDuplicates(readNIntegers());

        for (int i = 0; i < d.length; i++) {
            if (d[i] > -1) {
                System.out.println(d[i]);
            }
        }
    }

    public static int[] readNIntegers() {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] numbers = new int[n];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextInt();
        }

        return numbers;
    }

    public static int[] removeDuplicates(int[] numbers) {
        int[] d = new int[numbers.length];

        for (int i = 0; i < numbers.length; i++) {
            for (int j = i; j < numbers.length; j++) {
                if (i != j && numbers[i] == numbers[j]) {
                    d[j] = -1;
                }
            }
        }

        for (int i = 0; i < numbers.length; i++)
            if (d[i] != -1)
                d[i] = numbers[i];
        return d;
    }
}