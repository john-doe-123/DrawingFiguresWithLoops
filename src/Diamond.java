import java.util.Scanner;

/**
 * Created by pesho on 6/4/2017.
 */
public class Diamond {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int rows = n % 2 == 0 ? n - 1 : n;
        int cols = n;

        int numAsterisks = n % 2 == 0 ? 2 : 1;
        int numDashes = (n - numAsterisks) / 2;
        int midDashes = 0;


        //region Top part + middle
        for (int row = 0; row < (rows / 2) + 1; row++) {

            midDashes = cols - (2 * numDashes + 2);

            if (row == 0) {

                for (int dash = 0; dash < numDashes; dash++) {
                    System.out.print("-");
                }
                for (int asterisk = 0; asterisk < numAsterisks; asterisk++) {
                    System.out.print("*");
                }
                for (int dash = 0; dash < numDashes; dash++) {
                    System.out.print("-");
                }
                System.out.println();
            } else {

                for (int dash = 0; dash < numDashes; dash++) {
                    System.out.print("-");
                }

                System.out.print("*");

                for (int midDash = 0; midDash < midDashes; midDash++) {
                    System.out.print("-");
                }

                System.out.print("*");

                for (int dash = 0; dash < numDashes; dash++) {
                    System.out.print("-");
                }

                System.out.println();

            }


            numDashes--;

        }
        //endregion


        //region Bottom part
        numDashes = 1;
        for (int row = 0; row < rows / 2; row++) {

            if (row == (n / 2) - 1) {

                for (int dash = 0; dash < numDashes; dash++) {
                    System.out.print("-");
                }
                for (int asterisk = 0; asterisk < numAsterisks; asterisk++) {
                    System.out.print("*");
                }
                for (int dash = 0; dash < numDashes; dash++) {
                    System.out.print("-");
                }
                System.out.println();


            } else {

                midDashes = cols - (2 * numDashes + 2);

                for (int dash = 0; dash < numDashes; dash++) {
                    System.out.print("-");
                }
                System.out.print("*");

                for (int midDash = 0; midDash < midDashes; midDash++) {
                    System.out.print("-");
                }
                System.out.print("*");

                for (int dash = 0; dash < numDashes; dash++) {
                    System.out.print("-");
                }

                System.out.println();
            }

            numDashes++;
        }
        //endregion

    }
}
