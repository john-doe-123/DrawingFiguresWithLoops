import java.util.Scanner;

/**
 * Created by pesho on 6/4/2017.
 */
public class Sunglasses {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());


        //region Top row
        for (int i = 0; i < n * 2; i++) {
            System.out.print("*");
        }
        for (int i = 0; i < n; i++) {
            System.out.print(" ");
        }
        for (int i = 0; i < n * 2; i++) {
            System.out.print("*");
        }
        System.out.println();
        //endregion


        for (int row = 0; row < n - 2; row++) {
            System.out.print("*");
            for (int i = 0; i < n * 2 - 2; i++) {
                System.out.print("/");
            }
            System.out.print("*");


            // Middle frame
            if (row == ((n - 1) / 2) - 1) {

                for (int i = 0; i < n; i++) {
                    System.out.print("|");
                }
                // Empty space middle
            } else {
                for (int i = 0; i < n; i++) {
                    System.out.print(" ");
                }
            }


            System.out.print("*");
            for (int i = 0; i < n * 2 - 2; i++) {
                System.out.print("/");
            }
            System.out.print("*");

            System.out.println();
        }


        //region Bottom row
        for (int i = 0; i < n * 2; i++) {
            System.out.print("*");
        }
        for (int i = 0; i < n; i++) {
            System.out.print(" ");
        }
        for (int i = 0; i < n * 2; i++) {
            System.out.print("*");
        }
        System.out.println();
        //endregion


    }
}
