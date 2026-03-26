class RevPyramid {
    public static void main(String[] args) {
        int n = 4;
        
        // Outer loop counts down from 4 to 1
        for (int i = n; i >= 1; i--) {
            
            // Spaces loop (this was already perfect!)
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            // FIX: Tie the number of stars to the current row 'i'
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            
            System.out.println();
        }
    }
}