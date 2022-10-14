import java.util.Scanner;

public class ProductOddNumbers {

    public void productOddNumbers(int n) {

        int digit, product = 1, count = 0;

        while (n > 0) {
            //finds the last digit
            digit = n % 10;
            if (digit % 2 != 0) {
                product *= digit;
                count++;
            }
            n = n / 10;
        }
        if (count != 0) System.out.println(product);
        else System.out.println("no odd digits");

    }

    public static void main(String[] args) {

        ProductOddNumbers pon = new ProductOddNumbers();
        Scanner sc = new Scanner(System.in);

        pon.productOddNumbers(sc.nextInt());
    }
}
