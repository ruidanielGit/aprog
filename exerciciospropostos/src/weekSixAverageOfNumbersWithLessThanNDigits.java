import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Scanner;

public class weekSixAverageOfNumbersWithLessThanNDigits {

    private static int sum = 0;

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int k = s.nextInt(), i = 0;
        int num = s.nextInt();

        while (i < k && digitsOfANumber(num) < k) {
            sum(num);
            num = s.nextInt();
            i++;
        }
        System.out.println(average(sum, i));
    }

    public static int digitsOfANumber(int n) {
        int count = 0;

        while (n > 0) {
            count++;
            n = n / 10;
        }
        return count;
    }

    public static int sum(int n) {
        sum += n;
        return sum;
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
