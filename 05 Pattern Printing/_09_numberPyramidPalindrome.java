public class _09_numberPyramidPalindrome {
    public static void main(String[] args) {
        int rows = 5;
        
        for (int i = 1; i <= rows; i++) {
            // Print spaces
            for (int space = 1; space <= rows - i; space++) {
                System.out.print("  ");
            }

            // Print increasing numbers
            for (int var2 = 1; var2 <= i; var2++) {
                System.out.print(var2 + " ");
            }

            // Print decreasing numbers
            for (int var3 = i - 1; var3 >= 1; var3--) {
                System.out.print(var3 + " ");
            }

            System.out.println();
        }
    }
}
