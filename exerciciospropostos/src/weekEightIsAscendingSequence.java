import java.util.Scanner;

public class weekEightIsAscendingSequence {

    /**
     * Write a program to verify if a sequence of numbers entered by the user is always ascending.
     * The program should prompt the user for the amount of numbers to enter and then read them.
     * At the end, the program should display one of the following messages: "always ascending = true" or "always ascending = false" if the sequence of numbers entered is always ascending or not, respectively.
     * <p>
     * For this purpose implement:
     * a) A method to read and store in an array the numbers entered by the user.
     * b) A method to check if the array sequence is ascending. The method must return true or false if the sequence is always ascending or not, respectively.
     */

    static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {

        int[] numbers = readArray();
        System.out.println("always ascending = " + isAscendingSequence(numbers));
    }

    private static int[] readArray() {
        int n = s.nextInt();
        int[] array = new int[n];
        int i = 0;

        while (i < n) {
            array[i] = s.nextInt();
            i++;
        }

        return array;
    }


    public static boolean isAscendingSequence(int[] numbers) {
        boolean flag = true;
        for (int i = 0; i < numbers.length - 1; i++) {
            if (numbers[i] > numbers[i + 1] || numbers[i] == numbers[i + 1]) {
                flag = false;
            }
        }
        return flag;
    }


}
