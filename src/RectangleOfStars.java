import java.util.Scanner;

/**
 * Created by pesho on 6/3/2017.
 */
public class RectangleOfStars {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());


        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n; j++) {

                System.out.print("*");

            }

            System.out.println();
        }
    }
}