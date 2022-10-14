import java.util.Scanner;

import static java.lang.Math.pow;

public class ConvertFromBaseEightToTen {

    public void convertFromBaseEightToTen() {
        Scanner sc = new Scanner(System.in);

        int oct, count, dec, sum = 0;

        oct = sc.nextInt();
        while (oct > 0) {
            sum = 0;
            count = 0;
            while (oct > 0) {
                //finds the last digit
                int digit = oct % 10;
                //num decimal = digito x 8 elevado a reversed index
                dec = (int) (digit * pow(8, count));
                sum += dec;
                count++;
                oct = oct / 10;
            }
            System.out.println(sum);
            oct = sc.nextInt();
        }

    }

    public static void main(String[] args) {

        ConvertFromBaseEightToTen conv = new ConvertFromBaseEightToTen();

        conv.convertFromBaseEightToTen();
    }
}
