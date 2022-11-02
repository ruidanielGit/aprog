import java.util.Scanner;

public class weekSixFibonacci {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        if (isFibonacci(n)) {
            System.out.println("is a Fibonacci number");
        } else {
            System.out.println("is not a Fibonacci number");
        }
    }

    public static boolean isFibonacci(int n) {
        int i = 0, j = 1, k = 0;

        while (k < n) {
            k = i + j;
            i = j;
            j = k;
        }
        return k == n;
    }
}
