package SpecialPatterns;

import java.util.Scanner;

public class FlowOfWater {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {

            // Print spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }

            // Print stars (always n)
            for (int j = 1; j <= n; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }
}