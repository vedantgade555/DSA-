package SpecialPatterns;

import java.util.Scanner;

public class Diamond {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int nsp = n - 1;
        int nst = 1;

        // Upper half
        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= nsp; j++) {
                System.out.print("  ");
            }

            for (int j = 1; j <= nst; j++) {
                System.out.print("* ");
            }

            nsp--;
            nst += 2;
            System.out.println();
        }

        // Adjust for lower half (start from just below middle)
        nsp = 1;
        nst = nst - 4; // important adjustment

        // Lower half using decrement logic
        for (int i = 1; i <= n - 1; i++) {

            for (int j = 1; j <= nsp; j++) {
                System.out.print("  ");
            }

            for (int j = 1; j <= nst; j++) {
                System.out.print("* ");
            }

            nsp++;      // spaces increase
            nst -= 2;   // stars decrease (this is your "-- logic")
            System.out.println();
        }
    }
}