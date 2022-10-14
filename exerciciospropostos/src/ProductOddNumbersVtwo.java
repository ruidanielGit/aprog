import java.util.Scanner;

public class ProductOddNumbersVtwo {

    public void productOddNumbersVtwo() {

        Scanner sc = new Scanner(System.in);
        int digit, n, count = 0;

        //lê próximos numeros
        n = sc.nextInt();
        while (n > 0) {
            count = 0;
            int product = 1;
            //faz a soma dos digitos pares
            while (n > 0) {
                //finds the last digit
                digit = n % 10;
                if (digit % 2 != 0) {
                    product *= digit;
                    count++;
                }
                n = n / 10;
            }
            if (count == 0) System.out.println("no odd digits");
            else System.out.println(product);
            n = sc.nextInt();
        }
    }

    public static void main(String[] args) {

        ProductOddNumbersVtwo pont = new ProductOddNumbersVtwo();

        pont.productOddNumbersVtwo();
    }
}
