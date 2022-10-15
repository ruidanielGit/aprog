import java.util.Scanner;

public class LeastCommonMultiple {

    public void leastCommonMultiple(int first, int second) {

        int n = first * second;
        boolean flag = true;
        int result = 0;
        int i = 1;

        while (n >= i) {
            if (n % first == 0 && n % second == 0) {
                result = n;
            }
            n--;
        }
        System.out.println(result);

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        LeastCommonMultiple lcm = new LeastCommonMultiple();

        lcm.leastCommonMultiple(sc.nextInt(), sc.nextInt());
    }
}
