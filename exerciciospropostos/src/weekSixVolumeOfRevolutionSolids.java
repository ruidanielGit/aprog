import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Scanner;

public class weekSixVolumeOfRevolutionSolids {
    public static void main(String[] args) {

        DecimalFormat df = new DecimalFormat();
        df.format(2);
        Scanner s = new Scanner(System.in);
        StringBuilder finalResult = new StringBuilder();

        double volume;
        String result = "";
        String solid = s.next();

        while (!solid.equals("end")) {
            if (solid.equals("cone")) {
                double radius = s.nextDouble();
                double height = s.nextDouble();
                volume = Math.PI * Math.pow(radius, 2) * height / 3;
                result = String.format("%.2f", volume);
            }
            if (solid.equals("cylinder")) {
                double radius = s.nextDouble();
                double height = s.nextDouble();
                volume = Math.PI * Math.pow(radius, 2) * height;
                result = String.format("%.2f", volume);
            }
            if (solid.equals("sphere")) {
                double radius = s.nextDouble();
                volume = 4 * Math.PI * Math.pow(radius, 3) / 3;
                result = String.format("%.2f", volume);
            }
            finalResult.append(result).append("\n");
            solid = s.next();
        }
        finalResult = new StringBuilder(finalResult.toString().replace(",", "."));
        if (!finalResult.toString().equals("")) System.out.print(finalResult);
    }
}
