import java.io.IOException;
import java.util.Scanner;

public class weekEightCondominium {

    /**
     * Consider a completely occupied apartment building with 3 entrances and 4 floors.
     * Write a modular program to:
     * -First, read the name of the owner with multiple spaces of each apartment. The reading should be done in order of entrance and floor, ie, for each entrance must be read the owners of each of its floors;
     * -Second, read a particular name and display which entrance and floor it owns, in the following format:
     * <p>
     * "name=<name>"
     * "entrance=<entrance number>"
     * "floor=<floor number> "
     * <p>
     * If there are multiple solutions (multiple owners with the same name), all possibilities should be displayed, in ascending order of entrance and floor.
     * If there is no owner with that name in the building, the message “Do not live in the building” should be displayed.
     * Example:
     * floor
     * <p>
     * <p>
     * 3	Luisa Lima
     * Hercilia Hora	Maria Mota
     * 2	Carla Costa	Gloria Gomes	Luisa Lima
     * 1	Berta Barata	Francisca Fe
     * Joana Jales
     * 0	Ana Anacleta	Elsa Eira	Ines Iris
     * <p>
     * 0	1	2
     * <p>
     * <p>
     * entrance
     */

    static Scanner s = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        String[][] condominium = readAndStoreCondominium();
        String name = s.nextLine();
        displayCondominium(condominium, name);
    }

    public static String[][] readAndStoreCondominium() {

        String[][] storeCondominium = new String[3][4];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                storeCondominium[i][j] = s.nextLine();
            }
        }
        return storeCondominium;
    }

    public static void displayCondominium(String[][] condominium, String name) {

        boolean isName = false;

        for (int i = 0; i < condominium.length; i++) {
            for (int j = 0; j < condominium[i].length; j++) {
                if (condominium[i][j].equals(name)) {
                    System.out.println("name=" + name);
                    System.out.println("entrance=" + i);
                    System.out.println("floor=" + j);
                    isName = true;
                }
            }
        }
        if (!isName) {
            System.out.println("Do not live in the building");
        }
    }
}