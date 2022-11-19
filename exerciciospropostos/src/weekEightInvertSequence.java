import java.util.Scanner;

public class weekEightInvertSequence {

    /**
     * Write a modular program to read a sequence of N integers and display them in the reverse order of insertion. The value of N is initially entered by the user.
     * <p>
     * Each number must be displayed in a separate lines.
     */

    static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {

        displayInvertedSequence(readAndStoreSequence());
    }

    public static int[] readAndStoreSequence() {

        int n = s.nextInt();
        int[] storeSequence = new int[n];

        while (n > 0) {
            storeSequence[n - 1] = s.nextInt();
            n--;
        }
        return storeSequence;
    }

    public static void displayInvertedSequence(int[] invertedSequence) {

        for (int i = 0; i < invertedSequence.length; i++) {
            System.out.println(invertedSequence[i]);
        }
    }
}
