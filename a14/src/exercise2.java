import java.util.Scanner;

public class exercise2 {
    public static String vowelFalse(String str) {
        if (str.length() == 0) {
            //base case
            return "";
        }
        char firstChar = str.charAt(0);
        String remainingString = str.substring(1);

        if(vowelTrue(firstChar)) {
            return vowelFalse(remainingString);
        }
        else {
            return firstChar + vowelFalse(remainingString);
        }
    }
    public static boolean vowelTrue(char ch) {
        ch = Character.toLowerCase(ch);
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }
    public static void main(String[] args) {
        String phrase1 = "counterrevolutionaries";
        String result1 = vowelFalse(phrase1);

        System.out.println("No vowels: " + result1);

        String phrase2 = "AUDIOBOOK";
        String result2 = vowelFalse(phrase2);

        System.out.println("No vowels: " + result2);
    }
}
