import java.util.Scanner;

import static java.lang.Math.pow;

public class ConvertFromBaseEightToTen {

    public void convertFromBaseEightToTen() {
        Scanner sc = new Scanner(System.in);
        int baseOct;
        int baseDec = 0;
        String s;

        baseOct = sc.nextInt();
        while (baseOct > 0) {
            //System.out.print("Introduza um numero inteiro: ");
            s = String.valueOf(baseOct);
            int count = s.length()-1;
            for (int i = 0; i < s.length(); i++) {
                baseDec += (Integer.parseInt(String.valueOf(s.charAt(i)))) * pow(8, count);
                count--;
            }
            System.out.println(baseDec);
            baseDec = 0;

            baseOct = sc.nextInt();
        }
    }

    public static void main(String[] args) {

        ConvertFromBaseEightToTen conv = new ConvertFromBaseEightToTen();

        conv.convertFromBaseEightToTen();
    }
}
