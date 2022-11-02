import java.util.Scanner;

public class weekSixArmstrongNumbers {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        for (int i = 0; i < n; i++) {
            if (isArmstrongNumber(i)) {
                System.out.println(i);
            }
        }
    }

    public static boolean isArmstrongNumber(int n) {
        int originalNumber = n;
        int nDigits = digitsOfANumber(n);
        int nLastDigit, sum = 0;

        while (n > 0) {
            nLastDigit = n % 10;
            sum += Math.pow(nLastDigit, nDigits);
            n = n / 10;
        }
        return sum == originalNumber;
    }

    public static int digitsOfANumber(int n) {
        int count = 0;

        while (n > 0) {
            count++;
            n = n / 10;
        }
        return count;
    }
}
