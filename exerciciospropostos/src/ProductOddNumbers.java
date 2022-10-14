import java.util.Scanner;

public class ProductOddNumbers {

    public void productOddNumbers(int num) {

        String s = String.valueOf(num);
        int product = 1;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) % 2 != 0) {
                product *= Integer.parseInt(String.valueOf(s.charAt(i)));
            }
        }
        if (product > 1) {
            System.out.println(product);
            return;
        }
        System.out.println("no odd digits");

    }


    public static void main(String[] args) {

        ProductOddNumbers pon = new ProductOddNumbers();
        Scanner sc = new Scanner(System.in);

        pon.productOddNumbers(sc.nextInt());
    }
}
