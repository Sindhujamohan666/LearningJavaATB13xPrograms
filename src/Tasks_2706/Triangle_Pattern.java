package Tasks_2706;

import java.util.Scanner;

public class Triangle_Pattern {
    public static void main(String[] args) {
        int rows = 3; // Number of rows in the pattern

        for (int i = 1; i <= rows; i++) {
            // Print leading spaces
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }

            // Print stars (2*i - 1 stars)
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }

            // Move to the next line
            System.out.println("");
        }
    }
}
