import java.util.Scanner;

public class exercise6 {
    public static boolean palindrome(String str) {
        if (str.isEmpty()) {
            return true;
        }
        else if (str.length() == 1) {
            return true;
        }
        else {
            char first = str.charAt(0);
            char last = str.charAt(str.length() - 1);

            if (first != last) {
                return false;
            }
            else {
                String substring = str.substring(1, str.length() - 1);
                return palindrome(substring);
            }
        }
    }
    public static void main(String[] args) {

        System.out.println(palindrome(""));

        System.out.println(palindrome("a"));;

        System.out.println(palindrome("abba"));

        System.out.println(palindrome("abcba"));

        System.out.println(palindrome("hello"));

        System.out.println(palindrome("world"));

        System.out.println(palindrome("level"));

        System.out.println(palindrome("racecar"));

    }
}
