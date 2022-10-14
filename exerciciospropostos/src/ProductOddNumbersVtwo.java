import java.util.Scanner;

public class ProductOddNumbersVtwo {

    public void productOddNumbersVtwo() {

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int product = 1;

        while (num > 0) {
            String s = String.valueOf(num);
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) % 2 != 0) {
                    product *= Integer.parseInt(String.valueOf(s.charAt(i)));
                }
            }
            if (product > 1) System.out.println(product);
            else {
                System.out.println("no odd digits");
            }
            product = 1;
            num = sc.nextInt();
        }
    }

    public static void main(String[] args) {

        ProductOddNumbersVtwo pont = new ProductOddNumbersVtwo();

        pont.productOddNumbersVtwo();
    }
}
