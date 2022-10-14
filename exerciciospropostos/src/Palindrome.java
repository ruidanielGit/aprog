import java.util.Scanner;

public class Palindrome {
    private void palindrome() {

        Scanner sc = new Scanner(System.in);

        int resto, sum = 0, temp;
        int n = sc.nextInt();

        temp = n;
        while (n > 0) {
            resto = n % 10;
            sum = (sum * 10) + resto;
            n = n / 10;
        }
        if (temp == sum)
            System.out.println("palindrome");
        else
            System.out.println("not palindrome");
    }


    public static void main(String[] args) {

        Palindrome p = new Palindrome();

        p.palindrome();
    }


}
