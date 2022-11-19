import java.util.Scanner;

public class weekEightRotateSequence {

    /**
     * Write a modular program to read a sequence of N integers.
     * The value of N is initially entered by the user.
     * Then the program should read the N integers.
     * Finally, the program must accept 3 possible commands: "right", "left" and "exit" whose meaning is:
     * "right" - rotate the sequence 1 position to the right (eg 1 2 3 4 → 4 1 2 3)
     * "left" - rotate the sequence 1 position to the left (eg 1 2 3 4 → 2 3 4 1)
     * "exit" - end the program
     * <p>
     * The program must accept "right" or "left" commands until the "exit" command that terminates the program.
     * Each time the "right" or "left" command is executed, the result of the sequence should be displayed.
     * Each sequence should be displayed on a single line and each element should be displayed in square brackets in the following format:
     * <p>
     * "[a][b]...[n]"
     */

    static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {

        int[] sequence = readAndStoreSequence();
        String command = s.next();

        while (!command.equals("exit")) {
            if (command.equals("right")) {
                sequence = rotateRight(sequence);
                displaySequence(sequence);
            } else if (command.equals("left")) {
                sequence = rotateLeft(sequence);
                displaySequence(sequence);
            }
            command = s.next();
        }
    }

    public static int[] readAndStoreSequence() {

        int n = s.nextInt();
        int[] storeSequence = new int[n];

        for (int i = 0; i < n; i++) {
            storeSequence[i] = s.nextInt();
        }
        return storeSequence;
    }

    public static int[] rotateRight(int[] sequence) {

        int[] rotatedSequence = new int[sequence.length];
        rotatedSequence[0] = sequence[sequence.length - 1];

        for (int i = 1; i < sequence.length; i++) {
            rotatedSequence[i] = sequence[i - 1];
        }
        return rotatedSequence;
    }

    public static int[] rotateLeft(int[] sequence) {

        int[] rotatedSequence = new int[sequence.length];
        rotatedSequence[sequence.length - 1] = sequence[0];

        for (int i = 0; i < sequence.length - 1; i++) {
            rotatedSequence[i] = sequence[i + 1];
        }
        return rotatedSequence;
    }

    public static void displaySequence(int[] sequence) {

        String result = "";
        result = "[";
        for (int i = 0; i < sequence.length; i++) {
            result += sequence[i];
            if (i < sequence.length - 1) {
                result += "][";
            }
        }
        result += "]";

        System.out.println(result);
    }
}
