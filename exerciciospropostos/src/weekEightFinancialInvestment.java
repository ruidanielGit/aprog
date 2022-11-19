import java.util.Scanner;

public class weekEightFinancialInvestment {

    /**
     * Write a program to simulate a financial investment after 6 months.
     * The investment consists of an initial bank deposit with capitalizable bank rate for each month, ie, at the end of each month the deposit amount will be increased by the respective bank rate of that month.
     * <p>
     * First, the program must read the bank rates for each of the six months. Second, it must read the amount of the initial deposit. Finally, it must display the amount of the deposit after 6 months, using two decimal places in the following format:
     * <p>
     * "final value=<value>"
     */

    static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {

        displayFinalValue(calculateFinalValue(readAndStoreBankRates(), readInitialDeposit()));
    }

    public static double[] readAndStoreBankRates() {

        double[] bankRates = new double[6];

        for (int i = 0; i < bankRates.length; i++) {
            bankRates[i] = s.nextDouble();
        }
        return bankRates;
    }

    public static double readInitialDeposit() {

        return s.nextDouble();
    }

    public static double calculateFinalValue(double[] bankRates, double initialDeposit) {

        double finalValue = initialDeposit;

        for (int i = 0; i < bankRates.length; i++) {
            finalValue += finalValue * bankRates[i];
        }
        return finalValue;
    }

    public static void displayFinalValue(double finalValue) {

        System.out.printf("final value=%.2f", finalValue);
        System.out.println();
    }
}
