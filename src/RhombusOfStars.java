import java.util.Scanner;

/**
 * Created by pesho on 6/3/2017.
 */
public class RhombusOfStars {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        //region Top part
        for (int rows = 0; rows < n; rows++) {

            for (int spaces = 0; spaces < n - rows - 1; spaces++) {
                System.out.print(" ");
            }

            for (int stars = 0; stars < rows + 1; stars++) {
                System.out.print("* ");
            }

            System.out.println();

        }
        //endregion

        //region Bottom part
        for (int rows = 0; rows < n - 1; rows++) {

            for (int spaces = 0; spaces < rows + 1; spaces++) {
                System.out.print(" ");
            }

            for (int stars = 0; stars < n - rows - 1; stars++) {
                System.out.print("* ");
            }

            System.out.println();

        }
        //endregion
        

    }
}
