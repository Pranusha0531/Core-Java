package Loops;
public class Stars {
    public static void main(String[] args) {
        for (int i = 4; i >= 0; i--) {
            // Print '+' characters
            for (int j = 0; j < i; j++) {
                System.out.print("+");
            }

            // Print '-' characters
            for (int k = 0; k < 4 - i; k++) {
                System.out.print("-");
            }

            // Move to the next line after each iteration
            System.out.println();
        }
    }
}


