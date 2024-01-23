package strings;
import java.util.Scanner;
public class StringRotation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter String1");
        String s1 = sc.next();

        System.out.println("Enter String2");
        String s2 = sc.next();
        System.out.println(equalRotate(s1, s2));
    }

    public static boolean equalRotate(String s1, String s2) {
        if (s1 == null || s2 == null) {
            return false;
        }
        s1 = s1.toLowerCase();
        s2 = s2.toLowerCase();
        String concat = s1 + s1;
        return concat.contains(s2);

        }
}


