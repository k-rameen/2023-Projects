import java.util.Scanner;

public class exercise5 {
    public static boolean ignoreVowels(String str1, String str2) {
        if  (str1.isEmpty() && str2.isEmpty()) {
            return false;
        }
        else if (str1.isEmpty() || str2.isEmpty()) {
            return true;
        }
        else {
            char char1 = Character.toLowerCase(str1.charAt(0));
            char char2 = Character.toLowerCase(str2.charAt(0));

            if(isVowel(char1)) {
                return ignoreVowels(str1.substring(1), str2);
            }
            else if (isVowel(char2)) {
                return ignoreVowels(str1, str2.substring(1));
            }
            else {
                return char1 == char2 && ignoreVowels(str1.substring(1), str2.substring(1));
            }
        }
    }
    private static boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
    public static void main(String[] args) {

        //kangaroo comparisons
        System.out.println(ignoreVowels("kangaroo", "kongeroo"));

        System.out.println(ignoreVowels("kangaroo", "kaangaro"));;

        System.out.println(ignoreVowels("kangaroo", "kngr"));

        //kongeroo comparisons
        System.out.println(ignoreVowels("kongeroo", "kaangaro"));

        System.out.println(ignoreVowels("kongeroo", "kngr"));;

        //kaangaro comparisons
        System.out.println(ignoreVowels("kaangaro", "kngr"));

    }
}
