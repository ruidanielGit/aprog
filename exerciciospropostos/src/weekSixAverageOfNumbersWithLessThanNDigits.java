import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Scanner;


public class weekSixAverageOfNumbersWithLessThanNDigits {

    static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {

        int n = s.nextInt();
        int num = s.nextInt();
        int i = 0, maxread = 5;

        if (digitsOfANumber(num) > n)
            System.out.println("0.00");
        else {
            int sum = num;
            i++;
            while (digitsOfANumber(num) < n && i < maxread) {
                num = s.nextInt();
                if (digitsOfANumber(num) < n) {
                    sum += num; i++;}
            }
            System.out.println(average(sum, i));
        }
    }

    public static int digitsOfANumber(int n) {
        int count = 0;

        while (n > 0) {
            count++;
            n = n / 10;
        }
        return count;
    }

    public static String average(int sum, int n) {
        DecimalFormatSymbols otherSymbol = new DecimalFormatSymbols();
        otherSymbol.setDecimalSeparator('.');
        DecimalFormat df = new DecimalFormat();
        df.setDecimalFormatSymbols(otherSymbol);
        df.setMaximumFractionDigits(2);
        df.setMinimumFractionDigits(2);

        double average = (double) sum / n;

        return df.format(average);
    }
}
