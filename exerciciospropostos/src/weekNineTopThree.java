import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * Write a program to read the name and salary of a company's employees and display the top three (3) highest paid employees.
 * <p>
 * The program should start by reading, continuously, the name and salary of each employee. Reading ends when the name "END" is entered as the name of an employee.
 * <p>
 * Then, the top three (3) highest paid employees must be calculated and displayed. If there are employees with the equal salary, the choice should follow the ascending alphabetical order of the name.
 * <p>
 * Each employee of the top three (if any) should be displayed on separate lines. The name and salary of each employee must be displayed in descending order of salary, in the following format:
 * <p>
 * "#<top order>:<name>:<salary>
 */

public class weekNineTopThree {

    static String[] names = new String[100];
    static int[] salaries = new int[100];

    public static void main(String[] args) throws IOException {

        readEmployesAndSalariesFromInputScanner();
        perAlphaticOrder();
        printTopThreeSalaries();
    }

    //ERROR HERE, CANT FIX IT
    public static void readEmployesAndSalariesFromInputScanner() {
        Scanner input = new Scanner(System.in);
        int i = 0;
        boolean end = true;
        while (end) {
            names[i] = input.nextLine();
            if (names[i].equals("END")) {
                end = false;
            } else {
                salaries[i] = input.nextInt();
                input.nextLine();
                i++;
            }
        }
    }


    public static void perAlphaticOrder() {

        for (int i = 0; i < names.length; i++) {
            for (int j = 0; j < names.length; j++) {
                if (names[i] != null && names[j] != null && names[i].compareTo(names[j]) < 0) {
                    String temp = names[i];
                    names[i] = names[j];
                    names[j] = temp;
                    int salaryTemp = salaries[i];
                    salaries[i] = salaries[j];
                    salaries[j] = salaryTemp;
                }
            }
        }
    }

    public static void printTopThreeSalaries() {

        for (int i = 0; i < salaries.length; i++) {
            for (int j = 0; j < salaries.length; j++) {
                if (salaries[i] > salaries[j]) {
                    String temp = names[i];
                    int salaryTemp = salaries[i];
                    names[i] = names[j];
                    salaries[i] = salaries[j];
                    names[j] = temp;
                    salaries[j] = salaryTemp;
                }
            }
        }

        for (int i = 0; i < 3; i++) {
            System.out.println("#" + (i + 1) + ":" + names[i] + ":" + salaries[i]);
        }
    }
}