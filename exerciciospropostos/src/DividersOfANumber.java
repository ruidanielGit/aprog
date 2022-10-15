import java.util.Scanner;

public class DividersOfANumber {

    public void dividersOfNumber(int num) {

        int count = 0;

        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                System.out.println(i);
                count++;
            }
        }System.out.println("("+count+")");
    }

    public static void main(String[] args) {

        DividersOfANumber don = new DividersOfANumber();
        Scanner sc = new Scanner(System.in);

        don.dividersOfNumber(sc.nextInt());
    }
}
