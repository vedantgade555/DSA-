package SpecialPatterns;

import java.util.Scanner;

public class Bridge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // First row
        int totalStars = (2 * n) - 1;
        for (int i = 1; i <= totalStars; i++) {
            System.out.print("* ");
        }
        System.out.println();

        int nst = n - 1; // stars on each side
        int nsp = 1;     // spaces in middle

        for (int i = 1; i <= n - 1; i++) {

            // Left stars
            for (int j = 1; j <= nst; j++) {
                System.out.print("* ");
            }

            // Middle spaces
            for (int j = 1; j <= nsp; j++) {
                System.out.print("  ");
            }

            // Right stars
            for (int j = 1; j <= nst; j++) {
                System.out.print("* ");
            }

            // Update values
            nst--;       // stars decrease
            nsp += 2;    // spaces increase

            System.out.println();
        }
    }
}