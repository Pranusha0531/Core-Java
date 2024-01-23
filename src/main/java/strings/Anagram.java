package strings;

    import java.util.ArrayList;
    import java.util.Arrays;
    import java.util.Scanner;
    public class Anagram {
        public static void main(String[] args) {
           String str1 = "Hello";
           String str2 = "  elloH";}
        public static Boolean equalResult(String str1,String str2){
                if (str1 == null || str2 == null) {
                    return false;
                }
                str1 = str1.toLowerCase();
                str2 = str2.toLowerCase();
                if (str1.length() == str2.length()) {
                    char[] charArr1 = str1.toCharArray();
                    char[] charArr2 = str2.toCharArray();
                    Arrays.sort(charArr1);
                    Arrays.sort(charArr2);
                    boolean result = Arrays.equals(charArr1, charArr2);
                    if (result) {
                        return true;
                    }
                }
                return false;
            }
        }

