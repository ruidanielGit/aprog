import java.util.Scanner;

public class Palindrome {

    public String palindrome() {

        Scanner sc = new Scanner(System.in);
        String s = String.valueOf(sc.nextInt());
        int i, j;
        boolean isPalindrome = true;

        for (i = 1; i <= s.length() - 1; i++) {
            if (Integer.parseInt(String.valueOf(s.charAt(i-1))) != Integer.parseInt(String.valueOf(s.charAt(s.length()-i))))
                isPalindrome = false;
        }
        if (isPalindrome) return "palindrome";
        return "not palindrome";
    }

    public static void main(String[] args) {

        Palindrome p = new Palindrome();

        System.out.println(p.palindrome());
    }
}
