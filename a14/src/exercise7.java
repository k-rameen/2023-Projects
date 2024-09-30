import java.util.Scanner;

public class exercise7 {
    public static boolean palindromeMath(String str) {
        if (str.isEmpty()) {
            return true;
        }
        else if (str.length() == 1) {
            return true;
        }
        else {
            char first = str.charAt(0);
            char last = str.charAt(str.length() - 1);

            if (!Character.isLetterOrDigit(first)) {
                String substring = str.substring(1);
                return palindromeMath(substring);
            }
            else if (!Character.isLetterOrDigit(last)) {
                String substring = str.substring(0, str.length() - 1);
                return palindromeMath(substring);
            }
            else if (Character.toLowerCase(first) == Character.toLowerCase(last)) {
                String substring = str.substring(1, str.length() - 1);
                return palindromeMath(substring);
            }
            else {
                return false;
            }
        }
    }
    public static void main(String[] args) {
        String[] tests = {
                "",
                "a",
                "abba",
                "abcba",
                "Ah! Satan sees Natasha.",
                "Eva, can I see bees in a cave?",
                "Was it a car or a cat I saw?",
                "hello",
                "world",
                "Palindrome",
        };
        for (String test : tests) {
            System.out.println(test + " : " + palindromeMath(test));
        }
    }
}
