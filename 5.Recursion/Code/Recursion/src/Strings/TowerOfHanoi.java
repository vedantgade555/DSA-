package Strings;

public class TowerOfHanoi {
    public static void main(String[] args) {
        hanoi(4, "A", "B", "C");
    }

    private static void hanoi(int n, String source, String helper, String destination) {
        if (n == 0) {
            return;
        }

        // Move n-1 disks from source to helper using destination
        hanoi(n - 1, source, destination, helper);

        // Move largest disk from source to destination
        System.out.println(source + " -> " + destination);

        // Move n-1 disks from helper to destination using source
        hanoi(n - 1, helper, source, destination);
    }
}