import java.util.Scanner;

/**
 * Created by pesho on 6/3/2017.
 */
public class ChristmasTree {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());


        for (int i = 0; i < n + 1; i++) {
            System.out.print(" ");
        }
        System.out.print("|");
        System.out.println();

        for (int row = 0; row < n; row++) {

            for (int spaces = 0; spaces < n - row - 1; spaces++) {

                System.out.print(" ");

            }

            for (int asterisk = 0; asterisk < row + 1; asterisk++) {
                System.out.print("*");
            }
            
            System.out.print(" | ");

            for (int asterisk = 0; asterisk < row + 1; asterisk++) {
                System.out.print("*");
            }

            System.out.println();
        }

    }
}

