import java.util.Scanner;

public class PatternGenerator {

    // Method for Right Angle Pattern
    public static void rightTriangle(char symbol, int rows) {
        System.out.println("\nRight Triangle Pattern:\n");

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(symbol + " ");
            }
            System.out.println();
        }
    }

    // Method for Full Pyramid Pattern
    public static void fullPyramid(char symbol, int rows) {
        System.out.println("\nFull Pyramid Pattern:\n");

        for (int i = 1; i <= rows; i++) {

            // Spaces
            for (int j = i; j < rows; j++) {
                System.out.print(" ");
            }

            // Symbols
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print(symbol);
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Symbol: ");
        char symbol = sc.next().charAt(0);

        System.out.print("Enter Number of Rows: ");
        int rows = sc.nextInt();

        rightTriangle(symbol, rows);
        fullPyramid(symbol, rows);

        sc.close();
    }
}