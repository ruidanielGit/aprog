import java.util.Scanner;

public class SumEvenDigitsVtwo {

    public void sumEvenDigitsVtwo() {

        Scanner sc = new Scanner(System.in);
        int num;
        int sum = 0;
        String s;

        num = sc.nextInt();
        while (num > 0) {
            //System.out.print("Introduza um numero inteiro: ");
            s = String.valueOf(num);
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) % 2 == 0) {
                    sum += Integer.parseInt(String.valueOf(s.charAt(i)));
                }
            }
            System.out.println(sum);
            sum = 0;
            num = sc.nextInt();
        }
    }


    public static void main(String[] args) {

        SumEvenDigitsVtwo stwo = new SumEvenDigitsVtwo();

        stwo.sumEvenDigitsVtwo();
    }
}
