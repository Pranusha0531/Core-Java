package strings;

import java.util.Scanner;
public class NumberOfVowels {
    public static void main(String[] args) {
        String str = new String();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String: ");
        str = sc.nextLine();
        str = str.toLowerCase();

        int length = str.length();
        int count = 0;
        for (int i = 0; i < length; i++) {
            char alpha = str.charAt(i);
            if (alpha == 'a' || alpha == 'e' || alpha == 'i' || alpha == 'o' || alpha == 'u') {
                count++;
            }
        }
        System.out.println("The number of vowels are " + count);
    }
}

