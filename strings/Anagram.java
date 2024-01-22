package strings;

    import java.util.ArrayList;
    import java.util.Arrays;
    import java.util.Scanner;
    public class Anagram {
        public static void main(String[] args) {
            String str1 = new String();
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the String 1");
            str1 = sc.nextLine();
            String str2 = new String();
            System.out.println("Enter the String 2");
            str2 = sc.nextLine();
            str1 = str1.toLowerCase();
            str2 = str2.toLowerCase();
            if (str1.length() == str2.length()) {
                char[] charArr1 = str1.toCharArray();
                char[] charArr2 = str2.toCharArray();
                Arrays.sort(charArr1);
                Arrays.sort(charArr2);
                boolean result = Arrays.equals(charArr1, charArr2);
                if (result) {
                    System.out.println("yes they are anagram");
                } else {
                    System.out.println("No they are not anagram");
                }
            }
        }
    }

