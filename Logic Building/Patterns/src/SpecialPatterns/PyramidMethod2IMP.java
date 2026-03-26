package SpecialPatterns;

import java.util.Scanner;

public class PyramidMethod2IMP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nsp = n-1; // no of spaces
        int nst =1 ; // no of stars

        for (int i = 1; i <= n; i++) {

            // Print spaces
            for (int j = 1; j <=nsp; j++) {
                System.out.print("  ");
            }

            // Print stars (always n)
            for (int j = 1; j <= nst; j++) {
                System.out.print("* ");
            }
            nsp--;
            nst+=2;
            System.out.println();
        }
    }
}
