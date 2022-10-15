import java.util.Scanner;

public class IsPrime {

    public void isPrime(int num) {
        int count = 0;

        for (int i = 1; i <= num; i++) {
            if (num % i == 0) count++;
        }
        if (num <= 1 || count > 2) System.out.println("not prime");
        else System.out.println("prime");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        IsPrime ip = new IsPrime();

        ip.isPrime(sc.nextInt());
    }
}
