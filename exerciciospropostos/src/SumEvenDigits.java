import java.util.Scanner;


public class SumEvenDigits {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        SumEvenDigits s = new SumEvenDigits();

        s.sumEvenDigitsTwo(sc.nextInt());

    }

    public void sumEvenDigitsTwo(int n) {

        int digit, sum = 0;

        while (n > 0) {
            //finds the last digit
            digit = n % 10;
            if (digit % 2 == 0) {
                sum += digit;
            }
            n = n / 10;
        }

        System.out.println(sum);
    }
}
