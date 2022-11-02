import java.util.Scanner;

public class weekSixPalindrome {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int num = Integer.parseInt(s.next());
        int attempts = 5;
        boolean flag = false;

        while (attempts > 0 && !flag) {
            if (isPalindrome(num)) {
                System.out.println("palindrome");
                flag = true;
            } else {
                attempts--;
                if (attempts == 0)
                    System.out.println("attempts exceeded");
                else num = Integer.parseInt(s.next());
            }
        }
    }

    public static boolean isPalindrome(int num) {
        int originalNumber = num;
        int nLastDigit, reverseNumber = 0;

        while (num > 0) {
            nLastDigit = num % 10;
            reverseNumber = reverseNumber * 10 + nLastDigit;
            num = num / 10;
        }
        return reverseNumber == originalNumber;
    }
}
