import java.util.Scanner;

public class weekSixCombinationsAndPermutations {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int m = s.nextInt();
        int n = s.nextInt();

        if (m >= n) {
            System.out.println("C(" + m + "," + n + ")=" + combinations(m, n));
            System.out.println("P(" + m + "," + n + ")=" + permutations(m, n));
        }
    }

    public static int factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    public static int combinations(int m, int n) {
        return factorial(m) / (factorial(n) * factorial(m - n));
    }

    public static int permutations(int m, int n) {
        return factorial(m) / factorial(m - n);
    }
}
