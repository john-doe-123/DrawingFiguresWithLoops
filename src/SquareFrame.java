import java.util.Scanner;

/**
 * Created by pesho on 6/3/2017.
 */
public class SquareFrame {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());


        for (int row = 0; row < n; row++) {

            for (int col = 0; col < n; col++) {

                if ((row == 0 && col == 0) || ((row == 0) && (col == n - 1)) ||
                        (row == n - 1 && col == 0) || (row == n - 1 && col == n - 1)) {

                    System.out.print("+ ");

                } else if ((col == 0 || col == n - 1) && (row > 0 && row < n - 1)) {
                    System.out.print("| ");

                } else {
                    System.out.print("- ");
                }

            }

            System.out.println();

        }


    }
}
