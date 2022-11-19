import java.sql.SQLOutput;
import java.util.Scanner;

/**
 * Write a program that reads an integer N (0 <= N <= 100000000) and an integer X (0 <= X <= 100000000) and determines how many of the positive numbers from zero to N (inclusive) have the sum of the factorials of the its digits greater than X.
 * <p>
 * Implement an efficient solution.
 * <p>
 * example: for N=5 and X=10
 * 0 : 0! =1
 * 1 : 1! =1
 * 2 : 2! =2
 * 3 : 3! =6
 * 4 : 4! =24
 * 5 : 5! =120
 * output: 2
 */
public class weekNineFactorialOfDigits {

    public static void main(String[] args) {

        perNumberFactorial();
    }

    public static void perNumberFactorial() {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int x = scanner.nextInt();
        boolean flag = false;
        int i = 0;

        while (i <= n && !flag) {
            if (factorialOfDigits(i) > x) {
                flag = true;
            } else {
                i++;
            }
        }
        System.out.println((n+1) - i);
        System.out.println("i = " + i);
    }

    public static int factorialOfDigits(int number) {
        int sum = 0;
        while (number > 0) {
            int digit = number % 10;
            sum += factorial(digit);
            number /= 10;
        }
        return sum;
    }


    public static int factorial(int number) {
        int factorial = 1;
        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }
        return factorial;
    }


}
