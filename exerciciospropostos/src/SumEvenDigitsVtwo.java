import java.util.Scanner;

public class SumEvenDigitsVtwo {

    public void sumEvenDigitsVtwo() {

        Scanner sc = new Scanner(System.in);
        int digit, n;

        //lê próximos numeros
        n = sc.nextInt();
        while (n > 0) {
            int sum = 0;
            //faz a soma dos digitos pares
            while (n > 0) {
                //finds the last digit
                digit = n % 10;
                if (digit % 2 == 0) {
                    sum += digit;
                }
                n = n / 10;
            }
            System.out.println(sum);
            n = sc.nextInt();
        }

    }


    public static void main(String[] args) {

        SumEvenDigitsVtwo stwo = new SumEvenDigitsVtwo();

        stwo.sumEvenDigitsVtwo();
    }
}
