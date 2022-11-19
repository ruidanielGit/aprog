import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class weekEightGradesFrequency {

    /**
     * Write a program to read the grades that N students obtained on a test, and calculate the absolute frequencies for the grades obtained.
     * It is intended to know for each grade, from zero (0), one (1), ..., up to twenty (20), how many students obtained this grade.
     * Grades are integer values and can range from zero (0) to twenty (20) inclusive.
     * The program should start by reading the value of N, followed by reading the grade of each student.
     * <p>
     * The program must display the scale from zero (0) to twenty (20) and, for each value of the scale, the number of students who obtained this grade, separated by a space. Each scale grade (from zero to twenty) and its frequency should appear on separate lines in the following format:
     * <p>
     * 0 <n. students with grade 0>
     * 1 <n. students with grade 1>
     * ...
     * 20 <n. students with grade 20>
     */
    static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {

        displayFrequencyValues(createRangeOfGrades(readAndStoreGrades()));
    }

    public static int[] readAndStoreGrades() {

        int n = s.nextInt();
        int[] storeGrades = new int[n];

        while (n > 0) {
            storeGrades[n - 1] = s.nextInt();
            n--;
        }
        return storeGrades;
    }

    public static int[][] createRangeOfGrades(int[] storeGrades) {

        int[][] gradeRange = new int[21][21];


        for (int i = 0; i < gradeRange.length; i++) {
            gradeRange[i][0] = i;
        }

        for (int i = 0; i < storeGrades.length; i++) {
            for (int j = 0; j < gradeRange.length; j++) {
                if (storeGrades[i] == gradeRange[j][0]) {
                    gradeRange[j][1]++;
                }
            }
        }
        return gradeRange;
    }

    public static void displayFrequencyValues(int[][] frequencyValues) {

        String frequencyResult = "";
        for (int i = 0; i < frequencyValues.length; i++) {
            frequencyResult += frequencyValues[i][0] + " " + frequencyValues[i][1] + "\n";
        }

        System.out.println(frequencyResult.substring(0, frequencyResult.length() - 1));
    }
}
