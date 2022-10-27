import java.text.DecimalFormat;
import java.util.Scanner;

public class PercentageOfDigitsDivisorsOfNumber {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");

        System.out.println("Quantos?");

        int num = scan.nextInt();
        double percentage;
        double max_percent = 0;
        //conta quantos digitos são divisores
        int digit;
        int num_itself = num;
        int n = num;
        int count = 0;
        int size = 0;


        for (int i = 0; i < n; i++) {
            num = scan.nextInt();
            num_itself = num;
            while (num > 0) {
                //finds the last digit
                digit = num % 10;
                //se o num_itself % digit == 0, contador incrementa
                if (digit != 0 && num_itself % digit == 0) {
                    count++;
                }
                size++;
                num = num / 10;
            }
            percentage = (double) count / size * 100;
            System.out.println(df.format(percentage) + "%");
            if (max_percent < percentage)
                max_percent = percentage;
            count = 0;
            size = 0;
        }
        System.out.println("(" + df.format(max_percent) + "%)");
    }
}
