import java.util.Scanner;

/**
 * Created by pesho on 6/5/2017.
 */
public class Fort {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int width = 2 * n;

        int roofTiles = n / 2;
        int roofUnderscores = width - (roofTiles * 2 + 4);


        for (int row = 0; row < n; row++) {

            for (int col = 0; col < width; col++) {

                if (row == 0) {
                    System.out.print("/");
                    for (int roofTile = 0; roofTile < roofTiles; roofTile++) {
                        System.out.print("^");
                    }
                    System.out.print("\\");

                    for (int roofUnderscore = 0; roofUnderscore < roofUnderscores; roofUnderscore++) {
                        System.out.print("_");
                    }

                    System.out.print("/");
                    for (int roofTile = 0; roofTile < roofTiles; roofTile++) {
                        System.out.print("^");
                    }
                    System.out.print("\\");


                    break;
                } else if (row == n - 1) {

                    System.out.print("\\");
                    for (int roofTile = 0; roofTile < roofTiles; roofTile++) {
                        System.out.print("_");
                    }
                    System.out.print("/");

                    // Same number of spaces as the number of roof underscores.
                    for (int roofUnderscore = 0; roofUnderscore < roofUnderscores; roofUnderscore++) {
                        System.out.print(" ");
                    }

                    System.out.print("\\");
                    for (int roofTile = 0; roofTile < roofTiles; roofTile++) {
                        System.out.print("_");
                    }
                    System.out.print("/");

                    System.out.println();
                    break;
                } else if (row == n - 2) {

                    int numSpaces = (width - (roofUnderscores + 2)) / 2;

                    System.out.print("|");
                    for (int space = 0; space < numSpaces; space++) {
                        System.out.print(" ");
                    }

                    for (int numUnderscores = 0; numUnderscores < roofUnderscores; numUnderscores++) {
                        System.out.print("_");
                    }

                    for (int space = 0; space < numSpaces; space++) {
                        System.out.print(" ");
                    }
                    System.out.print("|");

                    break;
                }   else {
                    System.out.print("|");
                    for (int spaces = 0; spaces < width - 2; spaces++) {
                        System.out.print(" ");
                    }
                    System.out.print("|");
                    break;
                }
            }

            System.out.println();


        }


    }


}
