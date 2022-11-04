import java.util.Scanner;

public class weekSevenTripleSum {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int target = s.nextInt();

        System.out.println(tripleSumv2(target));
    }

    public static int tripleSumv2(int target) {

        boolean flag = false;
        int count = 0;
        StringBuilder result = new StringBuilder();

        while (!flag) {

            for (int i = target; i > 0; i--) {
                for (int j = target; j > 0; j--) {
                    for (int k = target; k > 0; k--) {
                        if (result.toString().contains(i + " + " + j + " + " + k) || result.toString().contains(i + " + " + k + " + " + j) ||
                                result.toString().contains(j + " + " + i + " + " + k) || result.toString().contains(j + " + " + k + " + " + i) ||
                                result.toString().contains(k + " + " + i + " + " + j) || result.toString().contains(k + " + " + j + " + " + i)) {
                        } else {
                            if (i + j + k == target) {
                                result.append(i).append(" + ").append(j).append(" + ").append(k).append("\n");
                                count++;
                            }
                        }
                    }
                }
            }
            flag = true;
        }
        result = new StringBuilder(result.substring(0, result.length() - 1));
        System.out.println(result);
        return count;
    }

    /*public static int tripleSum(int target) {
        int i = 1;
        int j = 1;
        int k = 1;
        int count = 0;
        String result = "";

        while (k <= target) {
            while (j <= target) {
                while (i <= target) {
                    if (i + j + k == target && !result.contains(i + " + " + j + " + " + k) &&
                            !result.contains(i + " + " + k + " + " + j) && !result.contains(j + " + " + i + " + " + k) &&
                            !result.contains(j + " + " + k + " + " + i) && !result.contains(k + " + " + i + " + " + j) &&
                            !result.contains(k + " + " + j + " + " + i)) {
                        result += i + " + " + j + " + " + k + "\n";
                        count++;
                    }
                    i++;
                }
                i = 1;
                j++;
            }
            j = 1;
            k++;
        }

        System.out.println(result.substring(0, result.length() - 1));
        System.out.print("triples=");
        return count;
    }*/
}