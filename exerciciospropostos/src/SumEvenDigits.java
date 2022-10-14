import java.util.Scanner;

public class SumEvenDigits {

    public int sumEvenDigits() {
        Scanner sc = new Scanner(System.in);
        int num;
        int sum = 0;
        String s;

        //System.out.print("Introduza um numero inteiro: ");
        num = sc.nextInt();

        s = String.valueOf(num);

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) % 2 == 0) {
                sum += Integer.parseInt(String.valueOf(s.charAt(i)));
            }
        }

        //System.out.print("Soma: ");
        return sum;
    }

    public static void main(String[] args) {

        SumEvenDigits s = new SumEvenDigits();

        System.out.println(s.sumEvenDigits());
    }
}
