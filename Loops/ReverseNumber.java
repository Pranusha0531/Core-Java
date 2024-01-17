package Loops;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a num: ");
        int num = scanner.nextInt();
        while (num != 0) {
            int rev = 0;
            rev = rev*10+ num % 10;
                  num=num/10;
                  System.out.print(rev );
        }
    }
}
