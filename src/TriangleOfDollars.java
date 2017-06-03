import java.util.Scanner;

/**
 * Created by pesho on 6/3/2017.
 */
public class TriangleOfDollars {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int row = 0; row < n; row++) {

            for (int col = 0; col < row + 1; col++) {

                System.out.print("$ ");
            }

            System.out.println();
        }
    }
}
