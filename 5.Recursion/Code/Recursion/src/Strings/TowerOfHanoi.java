package Strings;

public class TowerOfHanoi {
    public static void main(String[] args) {
        hanoi(4,"A","B","C");

    }

    private static void hanoi(int n, String a, String b, String c) {
        if(n==0) return;
        // n-1 disk from A TO B Via C
        hanoi(n-1,a,b,c);
        // largest from A to C
        System.out.println(a+"->"+c);
        hanoi(n-1,b,a,c);

    }
}
