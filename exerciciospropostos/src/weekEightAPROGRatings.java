import java.util.Scanner;

public class weekEightAPROGRatings {

    static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        qualifyGrades(readRatings());
    }

    public static void qualifyGrades(int[] ratings) {
        int sum = 0, failures = 0, i;

        for (i = 0; i < ratings.length; i++) {
            sum += ratings[i];
            if (ratings[i] < 10) {
                failures++;
            }
        }

        System.out.println("average=" +(float) sum / i + "\nfailures=" + failures);
    }

    public static int[] readRatings() {
        int n = s.nextInt();
        int[] ratings = new int[n];
        for (int i = 0; i < n; i++) {
            ratings[i] = s.nextInt();
        }
        return ratings;
    }
}
