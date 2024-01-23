package Loops;

import java.util.Scanner;

public class PersonAge {

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Person Age: ");
        int num = scanner.nextInt();
        int age = 0;
        if (age < 13) {
            System.out.println("Kid");
        } else if (age >= 13 && age <= 19) {
            System.out.println("Teen");
        } else System.out.println("Adult");
        }
    }


