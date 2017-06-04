import java.util.Scanner;

/**
 * Created by pesho on 6/4/2017.
 */
public class House {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int numAsterisk = n % 2 == 0 ? 2 : 1;

        for (int roofRows = 0; roofRows < (n + 1) / 2; roofRows++) {

            for (int dashes = 0; dashes < (n - numAsterisk) / 2; dashes++) {
                System.out.print("-");
            }

            for (int i = 0; i < numAsterisk; i++) {
                System.out.print("*");
            }

            for (int dashes = 0; dashes < (n - numAsterisk) / 2; dashes++) {
                System.out.print("-");
            }

            System.out.println();

            numAsterisk += 2;

        }

        for (int walls = 0; walls < n / 2; walls++) {

            System.out.print("|");

            for (int middleAsterisk = 0; middleAsterisk < n - 2; middleAsterisk++) {
                System.out.print("*");
            }

            System.out.print("|");

            System.out.println();
        }


    }
}
