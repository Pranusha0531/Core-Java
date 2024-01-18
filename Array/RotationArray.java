package Array;
import java.util.Scanner;

public class RotationArray {

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of Array: ");
        int n = scanner.nextInt();
        int[] a = new int[n];

        System.out.println("Enter the Array Elements: ");
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }

        // Rotate the array to the left by 2 positions
        for (int i = 0; i < 2; i++) {
            int temp = a[0];
            for (int j = 0; j < n - 1; j++) {
                a[j] = a[j + 1];
            }
            a[n - 1] = temp;
        }

        System.out.println("Rotated Array:");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
