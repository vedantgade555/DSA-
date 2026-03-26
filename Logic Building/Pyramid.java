class Pyramid {
    public static void main(String[] args) {
        int n = 4;
        
        // Changed i<=4 to i<=n as best practice
        for (int i = 1; i <= n; i++) { 
            
            // FIX: Changed condition to j <= n - i
            for (int j = 1; j <= n - i; j++) { 
                System.out.print(" ");
            }

            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}