package Array;

import java.util.Scanner;
public class ReverseArray {
    public static void main(String args[]) {
            Scanner scanner = new Scanner(System.in);
            int n;

            System.out.println("Enter the size of the Array: ");
            n = scanner.nextInt();

            int[] a = new int[n];

            System.out.println("Enter the Array elements: ");
            for (int i = 0; i < n; i++) {
                a[i] = scanner.nextInt();
            }

            // Reverse the array
            for (int i = 0; i < n / 2; i++) {
                int temp = a[n - 1 - i];
                a[n - 1 - i] = a[i];
                a[i] = temp;
            }

            // Print the reversed array
            System.out.println("Reversed Array:");
            for (int i = 0; i < n; i++) {
                System.out.print(a[i] + " ");
            }
        }
    }
