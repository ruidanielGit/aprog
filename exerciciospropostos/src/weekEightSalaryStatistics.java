import java.util.Scanner;

public class weekEightSalaryStatistics {

    /**
     * Write a program to determine some statistics on employee salaries of a company. The number of employees may vary
     * over time, will be at least one, but will never exceed 20.
     * The program must read to each employee their name and salary. Reading ends when the name "end" is entered.
     * <p>
     * The program must display in separate lines the average salary(with 1 decimal place)as well as the name of each
     * employee earning less than the average salary.
     */

    static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {

        displayEmployeesAndSalaries(readAndStoreEmployeesAndSalaries());
    }

    public static Object[] readAndStoreEmployeesAndSalaries() {

        String[] employeeName = new String[20];
        double[] employeeSalary = new double[20];
        double sum = 0;
        int count = 0;
        int n = 0;

        while (n < 20) {
            String name = s.next();
            if (!name.equals("end")) {
                employeeName[n] = name;
                employeeSalary[n] = s.nextDouble();
                sum += employeeSalary[n];
                count++;
                n++;
            } else {
                n = 20;
            }
        }
        return new Object[]{employeeName, employeeSalary, sum / count};
    }

    public static void displayEmployeesAndSalaries(Object[] employeesAndSalaries) {

        String[] employeeName = (String[]) employeesAndSalaries[0];
        double[] employeeSalary = (double[]) employeesAndSalaries[1];
        double averageSalary = (double) employeesAndSalaries[2];
        String result = "";

        for (int i = 0; i < employeeName.length; i++) {
            if (employeeSalary[i] < averageSalary) {
                if (employeeName[i] != null)
                    result += employeeName[i] + "\n";
            }
        }
            System.out.println(averageSalary);
            System.out.print(result);
    }
}