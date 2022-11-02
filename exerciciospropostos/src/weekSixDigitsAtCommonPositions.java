import java.util.Scanner;

public class weekSixDigitsAtCommonPositions {
    public static void main(String[] args) {

        Scanner n = new Scanner(System.in);
        int nOfPairs = n.nextInt();
        int num1 = n.nextInt();
        int num2 = n.nextInt();
        int result = 0;
        String resultStringPair = "";

        for (int i = 1; i < nOfPairs; i++) {
            if (result < digitsAtCommonPositions(num1, num2)) {
                resultStringPair = num1 + "/" + num2;
            }
            result = digitsAtCommonPositions(num1, num2);

            num1 = n.nextInt();
            num2 = n.nextInt();
        }

        if (resultStringPair.equals("")) System.out.println("no results");
        else System.out.println(resultStringPair);
    }

    public static int digitsAtCommonPositions(int n1, int n2) {
        int count = 0;
        int n1Digits = digitsOfANumber(n1);
        int n2Digits = digitsOfANumber(n2);
        int n1LastDigit, n2LastDigit;

        if (n1Digits == n2Digits) {
            while (n1 > 0) {
                n1LastDigit = n1 % 10;
                n2LastDigit = n2 % 10;
                if (n1LastDigit == n2LastDigit) count++;
                n1 = n1 / 10;
                n2 = n2 / 10;
            }
        }
        return count;
    }

    public static int digitsOfANumber(int n) {
        int count = 0;

        while (n > 0) {
            count++;
            n = n / 10;
        }
        return count;
    }
}
