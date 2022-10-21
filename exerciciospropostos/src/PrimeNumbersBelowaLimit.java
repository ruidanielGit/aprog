import java.util.Scanner;

public class PrimeNumbersBelowaLimit {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int target = s.nextInt();
        int i = 1;

        while (i <= target) {
            int count = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) count++;
            }
            if(count==2)
                System.out.println(i);
            i++;
        }
    }
}
