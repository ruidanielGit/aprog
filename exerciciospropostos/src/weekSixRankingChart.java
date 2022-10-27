import java.util.Scanner;

public class weekSixRankingChart {

    public static void main(String[] args) {

        Scanner intS = new Scanner(System.in);
        Scanner stringS = new Scanner(System.in);
        int numStudents = intS.nextInt();
        int numDisc = intS.nextInt();

        for (int i = 0; i < numDisc; i++) {
            String subject = stringS.nextLine();
            int approved = intS.nextInt();
            System.out.println(rankingChart(subject, numStudents, subject, approved));
            if (i == 0) stringS.nextLine();
        }
    }

    public static String rankingChart(String subject, int students, String disc, int numApproved) {

        int numFailed = students - numApproved;
        int i = 0;
        String approved = "", failed = "";

        while (i < numApproved) {
            approved += '*';
            i++;
        }
        i = 0;
        while (i < numFailed) {
            failed += '*';
            i++;
        }


        return "Subject: " + disc + "\n- Approved: " + approved + "\n- Failed: " + failed;
    }
}
