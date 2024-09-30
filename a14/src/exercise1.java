/*
Rameen Khan
June 5, 2023
Assignment 14: Recursion with String
*/
import java.util.Scanner;

public class exercise1 {
    public static int charCount(String str, char ch) {
        if (str.length() == 0) {
            //base case
            return 0;
        }
        else if (str.charAt(0) == ch) {
            //if first char is same as x character
            return 1 + charCount(str.substring(1), ch);
        }
        else {
            //checks rest of char's
            return charCount(str.substring(1), ch);
        }
    }
    public static void main(String[] args) {
        String phrase = "XaaaYaaaZaaaYaaaaY";
        char target = 'Y';
        int recursive = charCount(phrase, target);

        System.out.println("Target: '" + target + "' ");
        System.out.println("Phrase: " + phrase);
        System.out.println("Occurences: " + recursive );
    }
}
