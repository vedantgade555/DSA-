package SpecialPatterns;

import java.util.Scanner;

import static java.lang.Math.min;

public class Zoom {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <=2*n-1; i++) {
            for (int j = 1; j <= 2*n-1; j++) {
                System.out.print(min(i,j));
            }
            System.out.println();
        }
    }
}
