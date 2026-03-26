package Square;

import java.util.Scanner;

class NumSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        // Outer loop for rows
        for (int i = 1; i <= n; i++) {

            // Inner loop for columns
            for (int j = 1; j <= n; j++) {

                // Check if the row is even or odd
                if (i % 2 == 0) {
                    // Even rows: Uppercase letters (B, D, F...)
                    System.out.print((char) (i + 64) + " ");
                } else {
                    // Odd rows: Lowercase letters (a, c, e...)
                    System.out.print((char) (i + 96) + " ");
                }
            }
            // Move to the next line
            System.out.println();
        }

        sc.close();
    }
}