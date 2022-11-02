import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Scanner;

public class weekSixCalculateAnglesOFTriangle {
    static Double first, second, third;

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");
        DecimalFormatSymbols sym = new DecimalFormatSymbols();
        sym.setDecimalSeparator('.');
        df.setDecimalFormatSymbols(sym);

        first = Double.parseDouble(String.valueOf(s.next()));
        second = Double.parseDouble(String.valueOf(s.next()));
        third = Double.parseDouble(String.valueOf(s.next()));

        int sumAngles = (int) (getAngle(first, second) + getAngle(first, third) + getAngle(second, third));

        if (sumAngles == 180 && getAngle(first, second) > 0 && getAngle(first, third) > 0 && getAngle(second, third) > 0) {
            System.out.println("a=" + df.format(first) + "\nb=" + df.format(second) + "\nc=" + df.format(third));
            System.out.println("ang(a,b)=" + df.format(getAngle(first, second)));
            System.out.println("ang(a,c)=" + df.format(getAngle(first, third)));
            System.out.println("ang(b,c)=" + df.format(getAngle(second, third)));
        } else
            System.out.println("impossible");
    }

    public static double getAngle(double n, double j) {

        double arcos = 0;

        if (n == first && j == second) {
            arcos = Math.acos((Math.pow(first, 2) + Math.pow(second, 2) - Math.pow(third, 2)) / (2 * (first * second)));
        }

        if (n == first && j == third) {
            arcos = Math.acos((Math.pow(first, 2) + Math.pow(third, 2) - Math.pow(second, 2)) / (2 * (first * third)));
        }

        if (n == second && j == third) {
            arcos = Math.acos((Math.pow(second, 2) + Math.pow(third, 2) - Math.pow(first, 2)) / (2 * (second * third)));
        }

        return Math.toDegrees(arcos);
    }
}
