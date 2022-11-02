import java.util.Scanner;

public class weekSixRankingChart {

    static String finalRank = "";

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int numStudents = s.nextInt();
        int numDisc = s.nextInt();

        if (numDisc > 0) {
            for (int i = 0; i < numDisc; i++) {
                String subject = s.next();
                int approved = s.nextInt();
                finalRank += "Subject: " + subject + rankingChart(numStudents, approved);
            }
            System.out.print(finalRank);
        }
    }

    public static String rankingChart(int students, int numApproved) {

        int numFailed = students - numApproved;
        int i = 0;
        String approved = "", failed = "";

        if (numApproved > 0) {
            while (i < numApproved) {
                approved += "*";
                i++;
            }
        }

        i = 0;
        if (numFailed > 0) {
            while (i < numFailed) {
                failed += "*";
                i++;
            }
        }
        if (numApproved == 0) return "\n- Approved: " + "\n- Failed: " + failed + "\n";
        if (numFailed == 0) return "\n- Approved: " + approved + "\n- Failed: " + "\n";

        return "\n- Approved: " + approved + "\n- Failed: " + failed + "\n";
    }
}
